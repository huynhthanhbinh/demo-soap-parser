
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckInStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckInStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="CHECKED IN"/>
 *     &lt;enumeration value="BOARDED"/>
 *     &lt;enumeration value="OFFLOADED"/>
 *     &lt;enumeration value="DEBOARDED"/>
 *     &lt;enumeration value="STANDBY"/>
 *     &lt;enumeration value="STANDBY BOARDED"/>
 *     &lt;enumeration value="STANDBY DEBOARDED"/>
 *     &lt;enumeration value="STANDBY CLEARED"/>
 *     &lt;enumeration value="NO_SHOW"/>
 *     &lt;enumeration value="FLOWN"/>
 *     &lt;enumeration value="DENIED BOARDING"/>
 *     &lt;enumeration value="SECURITY CLEARANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckInStatus")
@XmlEnum
public enum CheckInStatus {

    CONFIRMED("CONFIRMED"),
    @XmlEnumValue("CHECKED IN")
    CHECKED_IN("CHECKED IN"),
    BOARDED("BOARDED"),
    OFFLOADED("OFFLOADED"),
    DEBOARDED("DEBOARDED"),
    STANDBY("STANDBY"),
    @XmlEnumValue("STANDBY BOARDED")
    STANDBY_BOARDED("STANDBY BOARDED"),
    @XmlEnumValue("STANDBY DEBOARDED")
    STANDBY_DEBOARDED("STANDBY DEBOARDED"),
    @XmlEnumValue("STANDBY CLEARED")
    STANDBY_CLEARED("STANDBY CLEARED"),
    NO_SHOW("NO_SHOW"),
    FLOWN("FLOWN"),
    @XmlEnumValue("DENIED BOARDING")
    DENIED_BOARDING("DENIED BOARDING"),
    @XmlEnumValue("SECURITY CLEARANCE")
    SECURITY_CLEARANCE("SECURITY CLEARANCE");
    private final String value;

    CheckInStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckInStatus fromValue(String v) {
        for (CheckInStatus c: CheckInStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
