package com.bht.demo.model;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bht
 */
@Getter
@Setter
public class BambooCompartment extends AbstractModel {

    private String matrixConfig = "";
    private List<Integer> rowIds = new ArrayList<>();
    private List<String> colIds = new ArrayList<>();
    private List<BambooSeatDetail> seatDetails = new ArrayList<>();

    public static class FieldName {
        private FieldName() {
        }

        public static final String MATRIX_CONFIG = "matrixConfig";
        public static final String ROW_IDS = "rowIds";
        public static final String COL_IDS = "colIds";
        public static final String SEAT_DETAILS = "seatDetails";
    }

    @Override
    public JsonObject toJson() {
        List<Object> seatDetailJOs = seatDetails.stream().map(BambooSeatDetail::toJson).collect(Collectors.toList());
        return new JsonObject()
                .put(FieldName.MATRIX_CONFIG, matrixConfig)
                .put(FieldName.ROW_IDS, new JsonArray(rowIds))
                .put(FieldName.COL_IDS, new JsonArray(colIds))
                .put(FieldName.SEAT_DETAILS, new JsonArray(seatDetailJOs));
    }
}