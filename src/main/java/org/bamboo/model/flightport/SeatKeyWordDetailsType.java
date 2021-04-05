
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatKeyWordDetails_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeatKeyWordDetails_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NSSA"/>
 *     &lt;enumeration value="NSSW"/>
 *     &lt;enumeration value="NSSB"/>
 *     &lt;enumeration value="NSSR"/>
 *     &lt;enumeration value="NSST"/>
 *     &lt;enumeration value="SMSA"/>
 *     &lt;enumeration value="SMSW"/>
 *     &lt;enumeration value="SMSB"/>
 *     &lt;enumeration value="SMSR"/>
 *     &lt;enumeration value="SMST"/>
 *     &lt;enumeration value="WINDOW"/>
 *     &lt;enumeration value="AISLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeatKeyWordDetails_Type")
@XmlEnum
public enum SeatKeyWordDetailsType {

    NSSA,
    NSSW,
    NSSB,
    NSSR,
    NSST,
    SMSA,
    SMSW,
    SMSB,
    SMSR,
    SMST,
    WINDOW,
    AISLE;

    public String value() {
        return name();
    }

    public static SeatKeyWordDetailsType fromValue(String v) {
        return valueOf(v);
    }

}
