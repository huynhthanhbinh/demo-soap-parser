package com.bht.demo.util;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.bamboo.model.flightport.*;

import java.io.FileOutputStream;
import java.math.BigInteger;
import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author bht
 */
public class StatisticUtil {

    private StatisticUtil() {
    }

    @SuppressWarnings({"unused", "java:S1481", "DuplicatedCode", "java:S106"})
    public static void doStatistic(SeatMapInformation seatMapInformation) {
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
                String seatMatrix = buildMatrixConfig(compartment.getSeatConfiguration());
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
            workbook.write(new FileOutputStream("statistics/bamboo_seat_statistics_" + seatMapdetails.getSMTCode() + ".xls"));
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

    public static String buildMatrixConfig(String seatConfig) {
        if (seatConfig != null && !seatConfig.isEmpty()) {
            StringBuilder matrixBuilder = new StringBuilder();
            Arrays.stream(seatConfig
                    .replace("-0-", "-")
                    .split("-"))
                    .forEach(number -> {
                        int value = Integer.parseInt(number);
                        for (int i = 0; i < value; i++) {
                            matrixBuilder.append('1');
                        }
                        matrixBuilder.append('0');
                    });
            return matrixBuilder.deleteCharAt(matrixBuilder.length() - 1).toString();
        }
        return "";
    }
}