
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactDetails_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactDetails_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="PS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactDetails_Type")
@XmlEnum
public enum ContactDetailsType {

    H,
    B,
    AG,
    AL,
    L,
    E,
    PS;

    public String value() {
        return name();
    }

    public static ContactDetailsType fromValue(String v) {
        return valueOf(v);
    }

}
