
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OTHERS"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="LOYALTYNO"/>
 *     &lt;enumeration value="CUSTNO"/>
 *     &lt;enumeration value="PHONENO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserType")
@XmlEnum
public enum UserType {

    OTHERS,
    EMAIL,
    LOYALTYNO,
    CUSTNO,
    PHONENO;

    public String value() {
        return name();
    }

    public static UserType fromValue(String v) {
        return valueOf(v);
    }

}
