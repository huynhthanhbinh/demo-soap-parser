
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ancillary_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Ancillary_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SSR"/>
 *     &lt;enumeration value="AUX"/>
 *     &lt;enumeration value="FEE"/>
 *     &lt;enumeration value="SEAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Ancillary_Type")
@XmlEnum
public enum AncillaryType {

    SSR,
    AUX,
    FEE,
    SEAT;

    public String value() {
        return name();
    }

    public static AncillaryType fromValue(String v) {
        return valueOf(v);
    }

}
