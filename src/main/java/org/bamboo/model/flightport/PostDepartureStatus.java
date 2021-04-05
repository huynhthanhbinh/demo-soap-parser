
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostDepartureStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostDepartureStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HAS_FLOWN"/>
 *     &lt;enumeration value="FINALISED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PostDepartureStatus")
@XmlEnum
public enum PostDepartureStatus {

    HAS_FLOWN,
    FINALISED;

    public String value() {
        return name();
    }

    public static PostDepartureStatus fromValue(String v) {
        return valueOf(v);
    }

}
