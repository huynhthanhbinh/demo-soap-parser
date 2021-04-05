
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoucherDeliveryMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoucherDeliveryMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="MAIL"/>
 *     &lt;enumeration value="PICKUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VoucherDeliveryMode")
@XmlEnum
public enum VoucherDeliveryMode {

    NONE,
    EMAIL,
    FAX,
    MAIL,
    PICKUP;

    public String value() {
        return name();
    }

    public static VoucherDeliveryMode fromValue(String v) {
        return valueOf(v);
    }

}
