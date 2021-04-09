package com.bht.demo.model;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author bht
 */
@Getter
@Setter
public class BambooSeatResponse extends AbstractModel {

    private String cabinName = "";
    private List<BambooSeatSsrDetail> ssrConfig = new ArrayList<>();
    private List<BambooCompartment> compartments = new ArrayList<>();

    public static class FieldName {
        private FieldName() {
        }

        public static final String CABIN_NAME = "cabinName";
        public static final String SSR_CONFIG = "ssrConfig";
        public static final String COMPARTMENTS = "compartments";
    }

    @Override
    public JsonObject toJson() {
        Map<String, Object> seatSsrDetailMap = ssrConfig.stream()
                .collect(Collectors.toMap(BambooSeatSsrDetail::getCode, BambooSeatSsrDetail::toJson));
        List<Object> compartmentJOs = compartments.stream().map(BambooCompartment::toJson).collect(Collectors.toList());
        return new JsonObject()
                .put(FieldName.CABIN_NAME, cabinName)
                .put(FieldName.SSR_CONFIG, new JsonObject(seatSsrDetailMap))
                .put(FieldName.COMPARTMENTS, new JsonArray(compartmentJOs));
    }
}