package com.bht.demo.model;

import io.vertx.core.json.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author binhhuynh1
 */
@Getter
@Setter
public class BambooSeatResponse extends AbstractModel {

    private BambooSeatConfig seatConfig;
    private Map<String, Object> ssrConfig = new HashMap<>();
    private Map<String, Object> seatDetails = new HashMap<>();

    public static class FieldName {
        private FieldName() {
        }

        public static final String SSR_CONFIG = "ssrConfig";
        public static final String SEAT_CONFIG = "seatConfig";
        public static final String SEAT_DETAILS = "seatDetails";
    }

    @Override
    public JsonObject toJson() {
        return new JsonObject()
                .put(FieldName.SEAT_CONFIG, seatConfig != null ? seatConfig.toJson() : null)
                .put(FieldName.SSR_CONFIG, new JsonObject(ssrConfig))
                .put(FieldName.SEAT_DETAILS, new JsonObject(seatDetails));
    }
}