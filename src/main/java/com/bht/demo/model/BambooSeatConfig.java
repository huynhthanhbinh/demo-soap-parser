package com.bht.demo.model;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author binhhuynh1
 */
@Getter
@Setter
public class BambooSeatConfig extends AbstractModel {

    private String cabinName = "";  // ECONOMY
    private String seatMatrix = ""; // 11101110111
    private String colsConfig = ""; // A-B-C-D-E-G-H-J-K
    private List<BambooCompartment> compartments = new ArrayList<>();

    public static class FieldName {
        private FieldName() {
        }

        public static final String CABIN_NAME = "cabinName";
        public static final String COLS_CONFIG = "colsConfig";
        public static final String SEAT_MATRIX = "seatMatrix";
        public static final String COMPARTMENTS = "compartments";
    }

    @Override
    public JsonObject toJson() {
        List<JsonObject> compartmentJOs = compartments.stream()
                .map(BambooCompartment::toJson)
                .collect(Collectors.toList());
        return new JsonObject()
                .put(FieldName.CABIN_NAME, cabinName)
                .put(FieldName.SEAT_MATRIX, seatMatrix)
                .put(FieldName.COLS_CONFIG, colsConfig)
                .put(FieldName.COMPARTMENTS, new JsonArray(compartmentJOs));
    }
}