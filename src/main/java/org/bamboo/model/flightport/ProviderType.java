
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProviderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProviderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GOOGLE"/>
 *     &lt;enumeration value="FACEBOOK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProviderType")
@XmlEnum
public enum ProviderType {

    GOOGLE,
    FACEBOOK;

    public String value() {
        return name();
    }

    public static ProviderType fromValue(String v) {
        return valueOf(v);
    }

}
