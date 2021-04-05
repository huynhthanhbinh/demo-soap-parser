
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckinStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckinStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDBY"/>
 *     &lt;enumeration value="WAITLIST"/>
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="OFFLOADED"/>
 *     &lt;enumeration value="BOARDED"/>
 *     &lt;enumeration value="DEBOARDED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="STANDBY CLEARED"/>
 *     &lt;enumeration value="STANDBY BOARDED"/>
 *     &lt;enumeration value="SUBJECT AVAILABILITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckinStatusType")
@XmlEnum
public enum CheckinStatusType {

    STANDBY("STANDBY"),
    WAITLIST("WAITLIST"),
    CONFIRMED("CONFIRMED"),
    OFFLOADED("OFFLOADED"),
    BOARDED("BOARDED"),
    DEBOARDED("DEBOARDED"),
    CANCELLED("CANCELLED"),
    @XmlEnumValue("STANDBY CLEARED")
    STANDBY_CLEARED("STANDBY CLEARED"),
    @XmlEnumValue("STANDBY BOARDED")
    STANDBY_BOARDED("STANDBY BOARDED"),
    @XmlEnumValue("SUBJECT AVAILABILITY")
    SUBJECT_AVAILABILITY("SUBJECT AVAILABILITY");
    private final String value;

    CheckinStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckinStatusType fromValue(String v) {
        for (CheckinStatusType c: CheckinStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
