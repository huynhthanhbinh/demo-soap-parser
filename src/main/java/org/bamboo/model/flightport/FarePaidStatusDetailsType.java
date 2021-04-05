
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FarePaidStatusDetails_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FarePaidStatusDetails_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZERO"/>
 *     &lt;enumeration value="FULL"/>
 *     &lt;enumeration value="PARTIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FarePaidStatusDetails_Type")
@XmlEnum
public enum FarePaidStatusDetailsType {

    ZERO,
    FULL,
    PARTIAL;

    public String value() {
        return name();
    }

    public static FarePaidStatusDetailsType fromValue(String v) {
        return valueOf(v);
    }

}
