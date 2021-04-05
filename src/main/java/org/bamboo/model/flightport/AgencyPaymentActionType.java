
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyPaymentActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgencyPaymentActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="APPROVE"/>
 *     &lt;enumeration value="ADD_AND_APPROVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgencyPaymentActionType")
@XmlEnum
public enum AgencyPaymentActionType {

    ADD,
    APPROVE,
    ADD_AND_APPROVE;

    public String value() {
        return name();
    }

    public static AgencyPaymentActionType fromValue(String v) {
        return valueOf(v);
    }

}
