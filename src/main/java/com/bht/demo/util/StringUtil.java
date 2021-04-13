package com.bht.demo.util;

/**
 * @author bht
 */
public class StringUtil {

    private StringUtil() {
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}