package com.bht.demo.model;

import io.vertx.core.json.JsonObject;

/**
 * @author bht
 */
public abstract class AbstractModel {

    public abstract JsonObject toJson();

    @Override
    public final String toString() {
        return toJson().toString();
    }
}