package com.bht.demo;

import com.bht.demo.parser.SOAPParser;
import org.bamboo.model.flightport.*;

import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author binhhuynh1
 */
public class DemoSOAPParserMain {

    /**
     * Seat indexes: EXTERNAL (customer view) vs INTERNAL (airline view)
     * For example: Seat 11A, 1st row, cabin BUSINESS, Aircraft Boeing A787 (Bamboo Airline)
     * ++ SeatNumber: 11A
     * ++ ExternalRowNumber: 11
     * ++ ExternalColumnName: A
     * ++ InternalRowNumber: 1
     * ++ InternalColNumber: 1
     * <p>
     * SeatMapConfiguration: X - Y - X ('-' stands for the aisle), DEC stands for DEC alphabets (InternalConfiguration)
     * For Example:
     * <p>
     * BOEING A320 (29 rows / 2 cabins)
     * <p>
     * - BUSINESS: from row 1 to row 2 (2 rows) => Cabin1
     * ++ Compartment1: 2-0-2 (DEC: A - C-D - F), from row 1 to row 2 (2 rows)
     * <p>
     * - ECONOMY: from row 3 to row 29 (27 rows) => Cabin2
     * ++ Compartment1: 3-0-3 (DEC: A-B-C-D-E-F), from row 3 to row 29 (27 rows)
     * <p>
     * BOEING A787 (40 rows / 2 cabins)
     * <p>
     * - BUSINESS: from row 11 to row 19 (7 rows) : (ignore row 13 and row 14) => Cabin1
     * ++ Compartment1: 1-0-1 (DEC: A  -  K), from row 11 to row 11 (1 row)
     * ++ Compartment2: 1-2-1 (DEC: A-D-G-K), from row 12 to row 12 (1 row)
     * ++ Compartment3: 1-2-1 (DEC: A-D-G-K), from row 15 to row 19 (5 rows)
     * <p>
     * - ECONOMY: from row 31 to row 63 (33 rows) => Cabin2
     * ++ Compartment1: 2-3-2 (DEC: A - C-D-E-G-H - K), from row 31 to row 33 (3 rows)
     * ++ Compartment2: 3-3-3 (DEC: A-B-C-D-E-G-H-J-K), from row 34 to row 45 (12 rows)
     * ++ Compartment3: 3-3-0 (DEC: A-B-C-D-E-G      ), from row 46 to row 46 (1 row)
     * ++ Compartment4: 3-0-0 (DEC: A-B-C            ), from row 47 to row 47 (1 row)
     * ++ Compartment5: 3-3-3 (DEC: A-B-C-D-E-G-H-J-K), from row 48 to row 60 (13 rows)
     * ++ Compartment6: 2-3-2 (DEC: A - C-D-E-G-H - K), from row 61 to row 61 (1 row)
     * ++ Compartment7: 0-3-0 (DEC:       D-E-G      ), from row 62 to row 63 (2 rows)
     */
    public static void main(String[] args) throws JAXBException {
        InputStream inputStream = DemoSOAPParserMain.class.getClassLoader()
                .getResourceAsStream("bamboo_seat_res.xml");
        String xmlString = new BufferedReader(new InputStreamReader(Objects
                .requireNonNull(inputStream), StandardCharsets.UTF_8))
                .lines().collect(Collectors.joining("\n"))
                .replaceAll("\\s*[\\r\\n]+\\s*", "");

        ShowSeatMapRS showSeatMapRS = SOAPParser.toObject(xmlString, ShowSeatMapRS.class);
        SeatMapInformation seatMapInformation = Objects.requireNonNull(showSeatMapRS).getSeatMapInformation();
        List<String> attachedSsr = seatMapInformation.getAttachedSsr();
        List<String> zoneAttributes = seatMapInformation.getZoneAttributes();
        /*
         *  'W': window seat
         *  'A': aisle seat
         */
        List<String> locationAttribute = seatMapInformation.getLocationAttribute();
        List<String> seatPriorityAttributes = seatMapInformation.getSeatPriorityAttributes();
        BigInteger maxInfantsPerUnit = seatMapInformation.getMaximumInfantsPerUnit();
        SeatMapDetailsType seatMapdetails = seatMapInformation.getSeatMapdetails();
        DeckDetailsType deckDetailsType = seatMapdetails.getDeckDetails().get(0);
        Integer totalSeats = deckDetailsType.getTotalSeats();
        List<SeatAttributesPositionType> seatAttributesPositionTypes = deckDetailsType.getSeatAttributesPosition();

        List<CabinDetailsType> cabinDetailsTypes = deckDetailsType.getCabinDetails();
        cabinDetailsTypes.forEach(cabin -> {
            String cabinId = cabin.getCabinId();
            String cabinName = cabin.getCabinName();
            BigInteger cabinTotalSeats = cabin.getTotalSeats();
            String cabinExternalStartRow = cabin.getStartRow();
            String cabinExternalEndRow = cabin.getEndRow();

            List<CompartmentDetailsType> compartmentDetailsTypes = cabin.getCompartmentDetails();
            compartmentDetailsTypes.forEach(compartment -> {
                String compartmentExternalStartRow = compartment.getStartRow();
                String compartmentExternalEndRow = compartment.getEndRow();
                String seatConfiguration = compartment.getSeatConfiguration();
                String internalSeatConfiguration = compartment.getInternalSeatConfiguration();

                List<SeatDetailsType> seatDetailsTypes = compartment.getSeatDetails();
                seatDetailsTypes.forEach(seat -> {
                    int rowIndex = Integer.parseInt(seat.getInternalRowNumber());
                    int colIndex = Integer.parseInt(seat.getInternalColumnNumber());
                    String status = seat.getControlAttribute(); // AVAILABLE, RESTRICTED, BLOCKED
                    List<String> seatLocationAttribute = seat.getLocationAttribute();
                    List<String> seatPriorityAttribute = seat.getSeatPriorityAttribute();
                    List<String> facilityAttribute = seat.getFacilityAttribute();
                    List<String> seatZoneAttribute = seat.getZoneAttribute();
                    List<String> seatAttachedSsr = seat.getAttachedSsr();
                });
            });
        });
        System.out.println(cabinDetailsTypes);
    }
}