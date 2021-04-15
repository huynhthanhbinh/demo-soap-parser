package com.bht.demo;

import com.bht.demo.model.BambooSeatConfig;
import com.bht.demo.model.BambooSeatResponse;
import com.bht.demo.parser.SOAPParser;
import com.bht.demo.util.SeatMapUtil;
import lombok.extern.log4j.Log4j2;
import org.bamboo.model.flightport.*;

import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author binhhuynh1
 */
@Log4j2
public class DemoSOAPParserMain {

    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) throws JAXBException {
        String currency = "VND";
        String aircraftModel = "787a";
        String cabinFilter = "ECONOMY";
        boolean canSaleRestrictedSeat = false;
        InputStream inputStream = DemoSOAPParserMain.class.getClassLoader()
                .getResourceAsStream("bamboo_seat_" + aircraftModel + "_res.xml");
        String xmlString = new BufferedReader(new InputStreamReader(Objects
                .requireNonNull(inputStream), StandardCharsets.UTF_8))
                .lines().collect(Collectors.joining("\n"))
                .replaceAll("\\s*[\\r\\n]+\\s*", "");

        log.info("Start execute...");
        BambooSeatResponse bambooSeatResponse = new BambooSeatResponse();
        ShowSeatMapRS showSeatMapRS = SOAPParser.toObject(xmlString, ShowSeatMapRS.class);
        SeatMapInformation seatMapInformation = Objects.requireNonNull(showSeatMapRS).getSeatMapInformation();
        SeatMapDetailsType seatMapDetails = seatMapInformation.getSeatMapdetails();
        DeckDetailsType deckDetailsType = seatMapDetails.getDeckDetails().get(0);
        deckDetailsType.getCabinDetails().stream()
                .filter(cabin -> cabinFilter.equalsIgnoreCase(cabin.getCabinName())).findFirst()
                .ifPresent(cabin -> {
                    BambooSeatConfig seatConfig = new BambooSeatConfig();
                    seatConfig.setCabinName(cabin.getCabinName());
                    List<CompartmentDetailsType> compartmentDetailsTypes = cabin.getCompartmentDetails();
                    compartmentDetailsTypes.stream()
                            .max(Comparator.comparingInt(compartment -> compartment.getInternalSeatConfiguration().length())) // biggest compartment
                            .ifPresent(compartment -> {
                                String seatConfiguration = compartment.getSeatConfiguration(); // A-B-C-D-E-G-H-J-K
                                String internalSeatConfiguration = compartment.getInternalSeatConfiguration(); // 3-3-3
                                seatConfig.setColsConfig(SeatMapUtil.buildColMatrix(seatConfiguration, internalSeatConfiguration));
                                seatConfig.setSeatMatrix(SeatMapUtil.buildFullSeatMatrix(seatConfig.getColsConfig()));
                            });
                    String colsConfig = seatConfig.getColsConfig();
                    String noneSeatMatrix = SeatMapUtil.buildNoneSeatMatrix(colsConfig);
                    Map<String, Integer> colIndexMap = new HashMap<>();
                    Arrays.asList(colsConfig.replace("-", "").split(""))
                            .forEach(colId -> colIndexMap.put(colId, colsConfig.indexOf(colId)));
                    seatConfig.setCompartments(compartmentDetailsTypes.stream()
                            .map(SeatMapUtil.toBambooCompartment(noneSeatMatrix, colIndexMap))
                            .collect(Collectors.toList()));
                    List<SeatDetailsType> seatDetailsTypeList = compartmentDetailsTypes.stream()
                            .map(CompartmentDetailsType::getSeatDetails).flatMap(Collection::stream)
                            .filter(seat -> !"0".equals(seat.getExternalColumnName()))
                            .collect(Collectors.toList());

                    bambooSeatResponse.setSeatConfig(seatConfig);
                    bambooSeatResponse.setSsrConfig(seatDetailsTypeList.stream()
                            .flatMap(seat -> seat.getSeatAssignMentFee().stream().filter(fee -> currency.equals(fee.getCurrency())))
                            .collect(Collectors.toMap(SeatAssignMentFeeType::getSsrcode, SeatMapUtil::toSsrDetailJO, (s1, s2) -> s1)));
                    bambooSeatResponse.setSeatDetails(seatDetailsTypeList.stream()
                            .sorted(Comparator.comparing(SeatDetailsType::getSeatNumber))
                            .collect(Collectors.toMap(SeatDetailsType::getSeatNumber,
                                    seatDetails -> SeatMapUtil.toSeatDetail(seatDetails, currency, canSaleRestrictedSeat).toJson(),
                                    (s1, s2) -> s1,
                                    LinkedHashMap::new)));
                });
        log.info("End execute...");
        log.info(bambooSeatResponse);
    }
}