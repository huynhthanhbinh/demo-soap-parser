package com.bht.demo;

import com.bht.demo.model.BambooSeatResponse;
import com.bht.demo.parser.SOAPParser;
import com.bht.demo.util.SeatMapUtil;
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

        long start = System.currentTimeMillis();
        BambooSeatResponse bambooSeatResponse = new BambooSeatResponse();
        ShowSeatMapRS showSeatMapRS = SOAPParser.toObject(xmlString, ShowSeatMapRS.class);
        SeatMapInformation seatMapInformation = Objects.requireNonNull(showSeatMapRS).getSeatMapInformation();
        SeatMapDetailsType seatMapDetails = seatMapInformation.getSeatMapdetails();
        DeckDetailsType deckDetailsType = seatMapDetails.getDeckDetails().get(0);
        List<CabinDetailsType> cabinDetailsTypes = deckDetailsType.getCabinDetails();
        cabinDetailsTypes.stream().filter(cabin -> cabinFilter.equalsIgnoreCase(cabin.getCabinName())).findFirst()
                .ifPresent(cabin -> {
                    bambooSeatResponse.setCabinName(cabin.getCabinName());
                    List<CompartmentDetailsType> compartmentDetailsTypes = cabin.getCompartmentDetails();
                    compartmentDetailsTypes.stream()
                            .max(Comparator.comparingInt(compartment -> compartment.getInternalSeatConfiguration().length())) // biggest compartment
                            .ifPresent(compartment -> {
                                String seatConfiguration = compartment.getSeatConfiguration(); // A-B-C-D-E-G-H-J-K
                                String internalSeatConfiguration = compartment.getInternalSeatConfiguration(); // 3-3-3
                                bambooSeatResponse.setColsConfig(SeatMapUtil.buildColMatrix(seatConfiguration, internalSeatConfiguration));
                                bambooSeatResponse.setSeatMatrix(SeatMapUtil.buildFullSeatMatrix(bambooSeatResponse.getColsConfig()));
                            });
                    String noneSeatMatrix = SeatMapUtil.buildNoneSeatMatrix(bambooSeatResponse.getColsConfig());
                    Map<String, Integer> colIndexMap = new HashMap<>();
                    Arrays.asList(bambooSeatResponse.getColsConfig().replace("-", "").split(""))
                            .forEach(colId -> colIndexMap.put(colId, bambooSeatResponse.getColsConfig().indexOf(colId)));
                    bambooSeatResponse.setSsrConfig(compartmentDetailsTypes.stream()
                            .map(CompartmentDetailsType::getSeatDetails).flatMap(Collection::stream)
                            .flatMap(seat -> seat.getSeatAssignMentFee().stream().filter(fee -> currency.equals(fee.getCurrency())))
                            .collect(Collectors.toMap(SeatAssignMentFeeType::getSsrcode, SeatMapUtil::toSsrDetailJO, (s1, s2) -> s1)));
                    bambooSeatResponse.setCompartments(compartmentDetailsTypes.stream()
                            .map(SeatMapUtil.toBambooCompartment(noneSeatMatrix, colIndexMap, canSaleRestrictedSeat, currency))
                            .collect(Collectors.toList()));
                });
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(bambooSeatResponse);
    }
}