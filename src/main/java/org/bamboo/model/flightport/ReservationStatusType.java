
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationStatusType">
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
 *     &lt;enumeration value="TIME_CHANGE_FROM_HOLDING_NEEDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReservationStatusType")
@XmlEnum
public enum ReservationStatusType {

    HOLDING_SOLD,
    WAITLISTED,
    STANDBY,
    CONFIRMED,
    CANCELLED,
    TIME_CHANGE,
    TIME_CHANGE_FROM_CONFIRMED,
    TIME_CHANGE_FROM_WAITLIST,
    TIME_CHANGE_FROM_STANDBY,
    EARLY_SHOW,
    LATE_SHOW,
    WAS_CONFIRMED,
    WAS_WAITLISTED,
    WAS_STANDBY,
    SCHEDULE_CHANGE,
    CONFIRMED_FROM_WAITLIST,
    UNABLE_CLOSED,
    NO_ACTION_TAKEN,
    UNABLE_FLIGHT_NON_OPERATING,
    HOLDING_NEEDED,
    TIME_CHANGE_FROM_HOLDING_NEEDED;

    public String value() {
        return name();
    }

    public static ReservationStatusType fromValue(String v) {
        return valueOf(v);
    }

}
