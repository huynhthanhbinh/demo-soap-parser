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
    private Double fee = 0.0D;
    private String currency = "VND";

    public static class FieldName {
        private FieldName() {
        }

        public static final String CODE = "code";
        public static final String DESC = "desc";
        public static final String COLOR = "color";
        public static final String FEE = "fee";
        public static final String CURRENCY = "currency";
    }

    @Override
    public JsonObject toJson() {
        return new JsonObject()
                .put(FieldName.CODE, code)
                .put(FieldName.DESC, desc)
                .put(FieldName.COLOR, color)
                .put(FieldName.FEE, fee)
                .put(FieldName.CURRENCY, currency);
    }
}