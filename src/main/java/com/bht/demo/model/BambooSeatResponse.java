package com.bht.demo.model;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
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
    private String seatMatrix = ""; // 11101110111
    private String colsConfig = ""; // A-B-C-D-E-G-H-J-K
    private Map<String, Object> ssrConfig = new HashMap<>();
    private List<BambooCompartment> compartments = new ArrayList<>();

    public static class FieldName {
        private FieldName() {
        }

        public static final String CABIN_NAME = "cabinName";
        public static final String SSR_CONFIG = "ssrConfig";
        public static final String COLS_CONFIG = "colsConfig";
        public static final String SEAT_MATRIX = "seatMatrix";
        public static final String COMPARTMENTS = "compartments";
    }

    @Override
    public JsonObject toJson() {
        List<Object> compartmentJOs = compartments.stream().map(BambooCompartment::toJson).collect(Collectors.toList());
        return new JsonObject()
                .put(FieldName.CABIN_NAME, cabinName)
                .put(FieldName.SEAT_MATRIX, seatMatrix)
                .put(FieldName.COLS_CONFIG, colsConfig)
                .put(FieldName.SSR_CONFIG, new JsonObject(ssrConfig))
                .put(FieldName.COMPARTMENTS, new JsonArray(compartmentJOs));
    }
}