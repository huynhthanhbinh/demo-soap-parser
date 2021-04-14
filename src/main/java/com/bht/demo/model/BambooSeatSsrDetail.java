package com.bht.demo.model;

import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

/**
 * @author bht
 */
@Getter
@Setter
public class BambooSeatSsrDetail extends AbstractModel {

    private String code = "";
    private String desc = "";
    private String color = "";
    private Double fareBase = 0.0D;
    private Double fareTax = 0.0D;
    private Double totalFare = 0.0D;
    private String currency = "VND";

    public static class FieldName {
        private FieldName() {
        }

        public static final String CODE = "code";
        public static final String DESC = "desc";
        public static final String COLOR = "color";
        public static final String FARE_BASE = "fareBase";
        public static final String FARE_TAX = "fareTax";
        public static final String TOTAL_FARE = "totalFare";
        public static final String CURRENCY = "currency";
    }

    @Override
    public JsonObject toJson() {
        return new JsonObject()
                .put(FieldName.CODE, code)
                .put(FieldName.DESC, desc)
                .put(FieldName.COLOR, color)
                .put(FieldName.FARE_BASE, fareBase)
                .put(FieldName.FARE_TAX, fareTax)
                .put(FieldName.TOTAL_FARE, totalFare)
                .put(FieldName.CURRENCY, currency);
    }
}