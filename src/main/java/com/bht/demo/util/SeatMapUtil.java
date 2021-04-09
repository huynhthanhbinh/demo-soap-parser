package com.bht.demo.util;

import java.util.Arrays;

/**
 * @author bht
 */
public class SeatMapUtil {

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