
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditFileStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditFileStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="REFUNDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditFileStatusType")
@XmlEnum
public enum CreditFileStatusType {

    USED,
    EXPIRED,
    ACTIVE,
    REFUNDED;

    public String value() {
        return name();
    }

    public static CreditFileStatusType fromValue(String v) {
        return valueOf(v);
    }

}
