
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyPaymentFOPType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgencyPaymentFOPType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgencyPaymentFOPType")
@XmlEnum
public enum AgencyPaymentFOPType {

    CA,
    CK;

    public String value() {
        return name();
    }

    public static AgencyPaymentFOPType fromValue(String v) {
        return valueOf(v);
    }

}
