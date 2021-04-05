
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightStatusDetails_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightStatusDetails_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPEN FOR CHECKIN"/>
 *     &lt;enumeration value="CLOSED FOR CHECKIN"/>
 *     &lt;enumeration value="OPEN FOR EDIT"/>
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="OPEN FOR CONNECTION CHECKIN"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="DEPARTED"/>
 *     &lt;enumeration value="CLOSEDFORSALES"/>
 *     &lt;enumeration value="HOLDING_SOLD"/>
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="WAITLISTED"/>
 *     &lt;enumeration value="STANDBY"/>
 *     &lt;enumeration value="HOLDING_NEEDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightStatusDetails_Type")
@XmlEnum
public enum FlightStatusDetailsType {

    @XmlEnumValue("OPEN FOR CHECKIN")
    OPEN_FOR_CHECKIN("OPEN FOR CHECKIN"),
    @XmlEnumValue("CLOSED FOR CHECKIN")
    CLOSED_FOR_CHECKIN("CLOSED FOR CHECKIN"),
    @XmlEnumValue("OPEN FOR EDIT")
    OPEN_FOR_EDIT("OPEN FOR EDIT"),
    CLOSED("CLOSED"),
    CANCELLED("CANCELLED"),
    AVAILABLE("AVAILABLE"),
    @XmlEnumValue("OPEN FOR CONNECTION CHECKIN")
    OPEN_FOR_CONNECTION_CHECKIN("OPEN FOR CONNECTION CHECKIN"),
    OPEN("OPEN"),
    DEPARTED("DEPARTED"),
    CLOSEDFORSALES("CLOSEDFORSALES"),
    HOLDING_SOLD("HOLDING_SOLD"),
    CONFIRMED("CONFIRMED"),
    WAITLISTED("WAITLISTED"),
    STANDBY("STANDBY"),
    HOLDING_NEEDED("HOLDING_NEEDED");
    private final String value;

    FlightStatusDetailsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightStatusDetailsType fromValue(String v) {
        for (FlightStatusDetailsType c: FlightStatusDetailsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
