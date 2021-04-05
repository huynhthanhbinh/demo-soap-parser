
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuxStatusDetails_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuxStatusDetails_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="PENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuxStatusDetails_Type")
@XmlEnum
public enum AuxStatusDetailsType {

    CONFIRMED,
    PENDING;

    public String value() {
        return name();
    }

    public static AuxStatusDetailsType fromValue(String v) {
        return valueOf(v);
    }

}
