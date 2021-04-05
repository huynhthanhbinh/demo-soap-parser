
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryReceivingModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItineraryReceivingModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAIL"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="FAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItineraryReceivingModeType")
@XmlEnum
public enum ItineraryReceivingModeType {

    MAIL,
    EMAIL,
    FAX;

    public String value() {
        return name();
    }

    public static ItineraryReceivingModeType fromValue(String v) {
        return valueOf(v);
    }

}
