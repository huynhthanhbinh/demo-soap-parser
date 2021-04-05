
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostDepartureStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostDepartureStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HAS_FLOWN"/>
 *     &lt;enumeration value="FINALISED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PostDepartureStatusType")
@XmlEnum
public enum PostDepartureStatusType {

    HAS_FLOWN,
    FINALISED;

    public String value() {
        return name();
    }

    public static PostDepartureStatusType fromValue(String v) {
        return valueOf(v);
    }

}
