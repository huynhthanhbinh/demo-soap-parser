
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationStatusDetails_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationStatusDetails_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOLDING_SOLD"/>
 *     &lt;enumeration value="WAITLISTED"/>
 *     &lt;enumeration value="STANDBY"/>
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="TIME_CHANGE"/>
 *     &lt;enumeration value="TIME_CHANGE_FROM_CONFIRMED"/>
 *     &lt;enumeration value="TIME_CHANGE_FROM_WAITLIST"/>
 *     &lt;enumeration value="TIME_CHANGE_FROM_STANDBY"/>
 *     &lt;enumeration value="EARLY_SHOW"/>
 *     &lt;enumeration value="LATE_SHOW"/>
 *     &lt;enumeration value="WAS_CONFIRMED"/>
 *     &lt;enumeration value="WAS_WAITLISTED"/>
 *     &lt;enumeration value="WAS_STANDBY"/>
 *     &lt;enumeration value="SCHEDULE_CHANGE"/>
 *     &lt;enumeration value="CONFIRMED_FROM_WAITLIST"/>
 *     &lt;enumeration value="UNABLE_CLOSED"/>
 *     &lt;enumeration value="NO_ACTION_TAKEN"/>
 *     &lt;enumeration value="UNABLE_FLIGHT_NON_OPERATING"/>
 *     &lt;enumeration value="HOLDING_NEEDED"/>
 *     &lt;enumeration value="TP_CONFIRMED"/>
 *     &lt;enumeration value="WAS_REQUESTED"/>
 *     &lt;enumeration value="REQUESTED"/>
 *     &lt;enumeration value="WAS_HOLDING_NEEDED"/>
 *     &lt;enumeration value="CONFIRMED VERBALLY"/>
 *     &lt;enumeration value="TIME_CHANGE_FROM_HOLDING_NEEDED"/>
 *     &lt;enumeration value="WAS_TP_CONFIRMED"/>
 *     &lt;enumeration value="CANCELLED VERBALLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReservationStatusDetails_Type")
@XmlEnum
public enum ReservationStatusDetailsType {

    HOLDING_SOLD("HOLDING_SOLD"),
    WAITLISTED("WAITLISTED"),
    STANDBY("STANDBY"),
    CONFIRMED("CONFIRMED"),
    CANCELLED("CANCELLED"),
    TIME_CHANGE("TIME_CHANGE"),
    TIME_CHANGE_FROM_CONFIRMED("TIME_CHANGE_FROM_CONFIRMED"),
    TIME_CHANGE_FROM_WAITLIST("TIME_CHANGE_FROM_WAITLIST"),
    TIME_CHANGE_FROM_STANDBY("TIME_CHANGE_FROM_STANDBY"),
    EARLY_SHOW("EARLY_SHOW"),
    LATE_SHOW("LATE_SHOW"),
    WAS_CONFIRMED("WAS_CONFIRMED"),
    WAS_WAITLISTED("WAS_WAITLISTED"),
    WAS_STANDBY("WAS_STANDBY"),
    SCHEDULE_CHANGE("SCHEDULE_CHANGE"),
    CONFIRMED_FROM_WAITLIST("CONFIRMED_FROM_WAITLIST"),
    UNABLE_CLOSED("UNABLE_CLOSED"),
    NO_ACTION_TAKEN("NO_ACTION_TAKEN"),
    UNABLE_FLIGHT_NON_OPERATING("UNABLE_FLIGHT_NON_OPERATING"),
    HOLDING_NEEDED("HOLDING_NEEDED"),
    TP_CONFIRMED("TP_CONFIRMED"),
    WAS_REQUESTED("WAS_REQUESTED"),
    REQUESTED("REQUESTED"),
    WAS_HOLDING_NEEDED("WAS_HOLDING_NEEDED"),
    @XmlEnumValue("CONFIRMED VERBALLY")
    CONFIRMED_VERBALLY("CONFIRMED VERBALLY"),
    TIME_CHANGE_FROM_HOLDING_NEEDED("TIME_CHANGE_FROM_HOLDING_NEEDED"),
    WAS_TP_CONFIRMED("WAS_TP_CONFIRMED"),
    @XmlEnumValue("CANCELLED VERBALLY")
    CANCELLED_VERBALLY("CANCELLED VERBALLY");
    private final String value;

    ReservationStatusDetailsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservationStatusDetailsType fromValue(String v) {
        for (ReservationStatusDetailsType c: ReservationStatusDetailsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
