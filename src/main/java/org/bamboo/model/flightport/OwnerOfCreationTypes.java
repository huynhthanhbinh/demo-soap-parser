
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerOfCreationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnerOfCreationTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AIRLINE"/>
 *     &lt;enumeration value="VPP"/>
 *     &lt;enumeration value="TRAVEL_AGENT"/>
 *     &lt;enumeration value="PASSENGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnerOfCreationTypes")
@XmlEnum
public enum OwnerOfCreationTypes {

    AIRLINE,
    VPP,
    TRAVEL_AGENT,
    PASSENGER;

    public String value() {
        return name();
    }

    public static OwnerOfCreationTypes fromValue(String v) {
        return valueOf(v);
    }

}
