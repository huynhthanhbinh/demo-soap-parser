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
 * @author binhhuynh1
 */
@Getter
@Setter
public class BambooSeatResponse extends AbstractModel {

    private BambooSeatConfig seatConfig;
    private Map<String, Object> ssrConfig = new HashMap<>();
    private List<BambooSeatDetail> seatDetails = new ArrayList<>();

    public static class FieldName {
        private FieldName() {
        }

        public static final String SSR_CONFIG = "ssrConfig";
        public static final String SEAT_CONFIG = "seatConfig";
        public static final String SEAT_DETAILS = "seatDetails";
    }

    @Override
    public JsonObject toJson() {
        List<JsonObject> seatDetailJOs = seatDetails.stream().map(BambooSeatDetail::toJson).collect(Collectors.toList());
        return new JsonObject()
                .put(FieldName.SEAT_CONFIG, seatConfig != null ? seatConfig.toJson() : null)
                .put(FieldName.SSR_CONFIG, new JsonObject(ssrConfig))
                .put(FieldName.SEAT_DETAILS, new JsonArray(seatDetailJOs));
    }
}