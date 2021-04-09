package com.bht.demo;

import com.bht.demo.parser.SOAPParser;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.bamboo.model.flightport.*;

import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.*;
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
    @SuppressWarnings({"unused", "java:S1481", "java:S106", "java:S125"})
    public static void main(String[] args) throws JAXBException {
        String aircraftModel = "a321";
        InputStream inputStream = DemoSOAPParserMain.class.getClassLoader()
                .getResourceAsStream("bamboo_seat_" + aircraftModel + "_res.xml");
        String xmlString = new BufferedReader(new InputStreamReader(Objects
                .requireNonNull(inputStream), StandardCharsets.UTF_8))
                .lines().collect(Collectors.joining("\n"))
                .replaceAll("\\s*[\\r\\n]+\\s*", "");

        ShowSeatMapRS showSeatMapRS = SOAPParser.toObject(xmlString, ShowSeatMapRS.class);
        SeatMapInformation seatMapInformation = Objects.requireNonNull(showSeatMapRS).getSeatMapInformation();
        List<String> attachedSsr = seatMapInformation.getAttachedSsr();
        List<String> zoneAttributes = seatMapInformation.getZoneAttributes();
        List<String> facilityAttributes = seatMapInformation.getFacilityAttributes();
        /*
         *  'W': window seat
         *  'A': aisle seat
         *  'E': exit seat
         *  'O': ?
         *  'K': ?
         *  'I': ?
         */
        List<String> locationAttribute = seatMapInformation.getLocationAttribute();
        List<String> seatPriorityAttributes = seatMapInformation.getSeatPriorityAttributes();
        BigInteger maxInfantsPerUnit = seatMapInformation.getMaximumInfantsPerUnit();
        SeatMapDetailsType seatMapdetails = seatMapInformation.getSeatMapdetails();
        DeckDetailsType deckDetailsType = seatMapdetails.getDeckDetails().get(0);
        Integer totalSeats = deckDetailsType.getTotalSeats();
        List<SeatAttributesPositionType> seatAttributesPositionTypes = deckDetailsType.getSeatAttributesPosition();

        // 2D array => map.get(rowIndex).get(colIndex)
        Map<Integer, Map<Integer, Object>> seatNumberMap = new HashMap<>();
        Map<Integer, Map<Integer, Object>> seatStatusMap = new HashMap<>();
        Map<Integer, Map<Integer, Object>> seatAssignmentFeeMap = new HashMap<>();
        Map<Integer, Map<Integer, Object>> seatLocationAttributeMap = new HashMap<>();
        Map<Integer, Map<Integer, Object>> seatPriorityAttributeMap = new HashMap<>();
        Map<Integer, Map<Integer, Object>> seatZoneAttributeMap = new HashMap<>();
        Map<Integer, Map<Integer, Object>> seatFacilityAttributeMap = new HashMap<>();
        Map<Integer, Map<Integer, Object>> seatAttachedSsrMap = new HashMap<>();

        List<CabinDetailsType> cabinDetailsTypes = deckDetailsType.getCabinDetails();

        List<Character> seatConfigurationCharacters = Arrays.stream(cabinDetailsTypes.stream()
                .map(CabinDetailsType::getCompartmentDetails).flatMap(Collection::stream)
                .map(CompartmentDetailsType::getInternalSeatConfiguration)
                .max(Comparator.comparing(String::length)).orElse("")
                .split("-")).map(str -> str.charAt(0)).collect(Collectors.toList());

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
                    int externalRowIndex = Integer.parseInt(seat.getExternalRowNumber());
                    char externalColIndex = seat.getExternalColumnName().charAt(0);
                    String seatNumber = seat.getSeatNumber();
                    String seatStatus = seat.getControlAttribute(); // AVAILABLE, RESTRICTED, BLOCKED
                    List<String> seatLocationAttribute = seat.getLocationAttribute();
                    List<String> seatPriorityAttribute = seat.getSeatPriorityAttribute();
                    List<String> seatFacilityAttribute = seat.getFacilityAttribute();
                    List<String> seatZoneAttribute = seat.getZoneAttribute();
                    List<String> seatAttachedSsr = seat.getAttachedSsr();
                    List<SeatAssignMentFeeType> seatAssignMentFees = seat.getSeatAssignMentFee();

                    seatAssignMentFees.stream()
                            .filter(seatAssignmentFeeType -> "VND".equals(seatAssignmentFeeType.getCurrency()))
                            .findFirst()
                            .ifPresent(seatAssignmentFeeType -> seatAssignmentFeeMap.computeIfAbsent(externalRowIndex, HashMap::new)
                                    .put(seatConfigurationCharacters.indexOf(externalColIndex), buildFeeDetailsString(seatAssignmentFeeType)));

                    seatNumberMap.computeIfAbsent(externalRowIndex, HashMap::new).put(seatConfigurationCharacters.indexOf(externalColIndex), seatNumber);
                    seatStatusMap.computeIfAbsent(externalRowIndex, HashMap::new).put(seatConfigurationCharacters.indexOf(externalColIndex), seatStatus);
                    seatAttachedSsrMap.computeIfAbsent(externalRowIndex, HashMap::new).put(seatConfigurationCharacters.indexOf(externalColIndex), seatAttachedSsr);
                    seatZoneAttributeMap.computeIfAbsent(externalRowIndex, HashMap::new).put(seatConfigurationCharacters.indexOf(externalColIndex), seatZoneAttribute);
                    seatFacilityAttributeMap.computeIfAbsent(externalRowIndex, HashMap::new).put(seatConfigurationCharacters.indexOf(externalColIndex), seatFacilityAttribute);
                    seatLocationAttributeMap.computeIfAbsent(externalRowIndex, HashMap::new).put(seatConfigurationCharacters.indexOf(externalColIndex), seatLocationAttribute);
                    seatPriorityAttributeMap.computeIfAbsent(externalRowIndex, HashMap::new).put(seatConfigurationCharacters.indexOf(externalColIndex), seatPriorityAttribute);
                });
            });
        });
        System.out.println(seatNumberMap);
        System.out.println(seatStatusMap);
        System.out.println(seatAttachedSsrMap);
        System.out.println(seatZoneAttributeMap);
        System.out.println(seatFacilityAttributeMap);
        System.out.println(seatLocationAttributeMap);
        System.out.println(seatPriorityAttributeMap);

        // Java: try-with-resources
        try (HSSFWorkbook workbook = new HSSFWorkbook()) {
            exportToSheet(workbook, "seat number", seatNumberMap);
            exportToSheet(workbook, "seat status", seatStatusMap);
            exportToSheet(workbook, "seat assignment fee", seatAssignmentFeeMap);
            exportToSheet(workbook, "seat ssr", seatAttachedSsrMap);
            exportToSheet(workbook, "seat zone", seatZoneAttributeMap);
            exportToSheet(workbook, "seat facility", seatFacilityAttributeMap);
            exportToSheet(workbook, "seat location", seatLocationAttributeMap);
            exportToSheet(workbook, "seat priority", seatPriorityAttributeMap);
            workbook.write(new FileOutputStream("bamboo_seat_statistics_" + aircraftModel + ".xls"));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static String buildFeeDetailsString(SeatAssignMentFeeType seatAssignMentFeeType) {
        return MessageFormat.format("{0} {1} ({2}) | {3}",
                seatAssignMentFeeType.getAmount(),
                seatAssignMentFeeType.getCurrency(),
                seatAssignMentFeeType.getSsrcode(),
                seatAssignMentFeeType.getPaxtype());
    }

    private static void exportToSheet(HSSFWorkbook workbook, String sheetName, Map<Integer, Map<Integer, Object>> statisticsMap) {
        HSSFSheet sheet = workbook.createSheet(sheetName);
        statisticsMap.forEach((rowIndex, seatRowValues) -> {
            Row row = sheet.createRow(rowIndex - 1);
            seatRowValues.forEach((colIndex, value) -> {
                if (colIndex != -1) {
                    Cell cell = row.createCell(colIndex);
                    cell.setCellValue(value.toString());
                }
            });
        });
    }
}