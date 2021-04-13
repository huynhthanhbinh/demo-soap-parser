package com.bht.demo.model;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bht
 */
@Getter
@Setter
public class BambooCompartment extends AbstractModel {

    private String matrixConfig = "";
    private List<String> rowIds = new ArrayList<>();
    private List<String> colIds = new ArrayList<>();

    public static class FieldName {
        private FieldName() {
        }

        public static final String MATRIX_CONFIG = "matrixConfig";
        public static final String ROW_IDS = "rowIds";
        public static final String COL_IDS = "colIds";
    }

    @Override
    public JsonObject toJson() {
        return new JsonObject()
                .put(FieldName.MATRIX_CONFIG, matrixConfig)
                .put(FieldName.ROW_IDS, new JsonArray(rowIds))
                .put(FieldName.COL_IDS, new JsonArray(colIds));
    }
}