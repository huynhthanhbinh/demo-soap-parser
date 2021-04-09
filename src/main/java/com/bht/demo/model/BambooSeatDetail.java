package com.bht.demo.model;

import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

/**
 * @author bht
 */
@Getter
@Setter
public class BambooSeatDetail extends AbstractModel {

    private Integer rowId = 0;
    private String colId = "";
    private String ssrCode = "";
    private boolean nearExit = false;
    private boolean canSale = true;

    public static class FieldName {
        private FieldName() {
        }

        public static final String ROW_ID = "rowId";
        public static final String COL_ID = "colId";
        public static final String SSR_CODE = "ssrCode";
        public static final String NEAR_EXIT = "nearExit";
        public static final String CAN_SALE = "canSale";
    }

    @Override
    public JsonObject toJson() {
        return new JsonObject()
                .put(FieldName.ROW_ID, rowId)
                .put(FieldName.COL_ID, colId)
                .put(FieldName.SSR_CODE, ssrCode)
                .put(FieldName.NEAR_EXIT, nearExit)
                .put(FieldName.CAN_SALE, canSale);
    }
}