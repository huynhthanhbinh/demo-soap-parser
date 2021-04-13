package com.bht.demo.util;

import com.bht.demo.model.BambooCompartment;
import com.bht.demo.model.BambooSeatDetail;
import com.bht.demo.model.BambooSeatSsrDetail;
import io.vertx.core.json.JsonObject;
import org.bamboo.model.flightport.CompartmentDetailsType;
import org.bamboo.model.flightport.SeatAssignMentFeeType;
import org.bamboo.model.flightport.SeatDetailsType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
 * ++ Compartment1: 1-0-1 (DEC: A  -  K), from row 11 to row 11 (1 row) => 101
 * ++ Compartment2: 1-2-1 (DEC: A-D-G-K), from row 12 to row 12 (1 row) => 101101
 * ++ Compartment3: 1-2-1 (DEC: A-D-G-K), from row 15 to row 19 (5 rows) => 101101
 * <p>
 * - ECONOMY: from row 31 to row 63 (33 rows) => Cabin2
 * ++ Compartment1: 2-3-2 (DEC: A - C-D-E-G-H - K), from row 31 to row 33 (3 rows)  => 101-111-101
 * ++ Compartment2: 3-3-3 (DEC: A-B-C-D-E-G-H-J-K), from row 34 to row 45 (12 rows) => 111-111-111
 * ++ Compartment3: 3-3-0 (DEC: A-B-C-D-E-G      ), from row 46 to row 46 (1 row)   => 111-111-000
 * ++ Compartment4: 3-0-0 (DEC: A-B-C            ), from row 47 to row 47 (1 row)   => 111-000-000
 * ++ Compartment5: 3-3-3 (DEC: A-B-C-D-E-G-H-J-K), from row 48 to row 60 (13 rows) => 111-111-111
 * ++ Compartment6: 2-3-2 (DEC: A - C-D-E-G-H - K), from row 61 to row 61 (1 row)   => 101-111-101
 * ++ Compartment7: 0-3-0 (DEC:       D-E-G      ), from row 62 to row 63 (2 rows)  => 000-111-000
 *
 * @author binhhuynh1
 */
public class SeatMapUtil {

    private SeatMapUtil() {
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

    public static JsonObject toSsrDetailJO(SeatAssignMentFeeType seatAssignmentFee) {
        String ssrCode = seatAssignmentFee.getSsrcode();
        JsonObject ssrAdminConfig = new JsonObject(); // will be get from admin later
        JsonObject config = ssrAdminConfig.getJsonObject(ssrCode, new JsonObject());
        BambooSeatSsrDetail ssrDetail = new BambooSeatSsrDetail();
        ssrDetail.setCode(ssrCode);
        ssrDetail.setCurrency(seatAssignmentFee.getCurrency());
        ssrDetail.setFee(seatAssignmentFee.getAmount());
        ssrDetail.setDesc(config.getString("desc", ""));
        ssrDetail.setColor(config.getString("color", ""));
        return ssrDetail.toJson();
    }

    public static Function<CompartmentDetailsType, BambooCompartment> toBambooCompartment(String noneSeatMatrix, Map<String, Integer> colIndexMap) {
        return compartment -> {
            List<SeatDetailsType> seatDetailsTypes = compartment.getSeatDetails().stream()
                    .filter(seat -> !"0".equals(seat.getExternalColumnName())) // not a JumpSeat !!!
                    .collect(Collectors.toList());
            BambooCompartment bambooCompartment = new BambooCompartment();
            bambooCompartment.setColIds(Arrays.asList(compartment.getInternalSeatConfiguration().split("-")));
            bambooCompartment.setRowIds(seatDetailsTypes.stream().map(SeatDetailsType::getExternalRowNumber).distinct().collect(Collectors.toList()));
            bambooCompartment.setMatrixConfig(buildCompartmentConfig(bambooCompartment.getColIds(), noneSeatMatrix, colIndexMap));
            return bambooCompartment;
        };
    }

    public static BambooSeatDetail toSeatDetail(SeatDetailsType seatDetailsType, String currency, boolean canSaleRestrictedSeat) {
        String controlAttribute = seatDetailsType.getControlAttribute();
        BambooSeatDetail seatDetail = new BambooSeatDetail();
        seatDetail.setRowId(seatDetailsType.getExternalRowNumber());
        seatDetail.setColId(seatDetailsType.getExternalColumnName());
        seatDetailsType.getSeatAssignMentFee().stream()
                .filter(fee -> currency.equals(fee.getCurrency())).findFirst()
                .ifPresent(fee -> seatDetail.setSsrCode(fee.getSsrcode()));
        seatDetail.setNearExit(seatDetailsType.getLocationAttribute().contains("E"));
        seatDetail.setCanSale("Available".equalsIgnoreCase(controlAttribute) || ("Restricted".equalsIgnoreCase(controlAttribute) && canSaleRestrictedSeat));
        return seatDetail;
    }

    /**
     * @param seatConfiguration         3-3-3
     * @param internalSeatConfiguration A-B-C-D-E-F-G-H-K
     * @return ABC-DEG-HJK
     */
    public static String buildColMatrix(String seatConfiguration, String internalSeatConfiguration) {
        if (!StringUtil.isEmpty(seatConfiguration) && !StringUtil.isEmpty(internalSeatConfiguration)) {
            StringBuilder stringBuilder = new StringBuilder(internalSeatConfiguration.replace("-", ""));
            List<Integer> nSeatPerColumn = Arrays.stream(seatConfiguration.split("-")).map(Integer::valueOf).collect(Collectors.toList());
            int sumPrev = 0;
            for (int i = 0; i < nSeatPerColumn.size(); i++) {
                int nSeat = nSeatPerColumn.get(i);
                int offset = sumPrev + nSeat + i;
                stringBuilder.insert(offset, '-');
                sumPrev += nSeat;
            }
            return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
        }
        return "";
    }

    /**
     * @param colIds         [A,C,D,E,F,G,K]
     * @param noneSeatMatrix 000-000-000
     * @param colIndexMap    { A:0, B:1, C:2, D:4, E:5, F:6, G:8, H:9, K:10 }
     * @return 101-111-101
     */
    public static String buildCompartmentConfig(List<String> colIds, String noneSeatMatrix, Map<String, Integer> colIndexMap) {
        if (!colIds.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder(noneSeatMatrix);
            colIds.forEach(existedCol -> stringBuilder.setCharAt(colIndexMap.get(existedCol), '1'));
            return stringBuilder.toString();
        }
        return noneSeatMatrix;
    }

    /**
     * @param colMatrix ABC-DEF-GHK
     * @return 000-000-000
     */
    public static String buildNoneSeatMatrix(String colMatrix) {
        return (StringUtil.isEmpty(colMatrix)) ? "" : colMatrix.replaceAll("[A-Z]", "0");
    }

    /**
     * @param colMatrix ABC-DEF-GHK
     * @return 111-111-111
     */
    public static String buildFullSeatMatrix(String colMatrix) {
        return (StringUtil.isEmpty(colMatrix)) ? "" : colMatrix.replaceAll("[A-Z]", "1");
    }
}