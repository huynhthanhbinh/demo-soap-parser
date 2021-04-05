
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaiveOrOverride.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WaiveOrOverride">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WAIVE"/>
 *     &lt;enumeration value="OVERRIDE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WaiveOrOverride")
@XmlEnum
public enum WaiveOrOverride {

    WAIVE,
    OVERRIDE;

    public String value() {
        return name();
    }

    public static WaiveOrOverride fromValue(String v) {
        return valueOf(v);
    }

}
