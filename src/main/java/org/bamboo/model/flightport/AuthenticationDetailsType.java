
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationDetailsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationDetailsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JJ"/>
 *     &lt;enumeration value="BB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationDetailsType")
@XmlEnum
public enum AuthenticationDetailsType {

    JJ,
    BB;

    public String value() {
        return name();
    }

    public static AuthenticationDetailsType fromValue(String v) {
        return valueOf(v);
    }

}
