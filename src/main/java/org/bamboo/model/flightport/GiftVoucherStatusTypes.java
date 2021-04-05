
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftVoucherStatusTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GiftVoucherStatusTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="ISSUED"/>
 *     &lt;enumeration value="REFUNDED"/>
 *     &lt;enumeration value="VOID"/>
 *     &lt;enumeration value="USED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GiftVoucherStatusTypes")
@XmlEnum
public enum GiftVoucherStatusTypes {

    CREATED,
    EXPIRED,
    ISSUED,
    REFUNDED,
    VOID,
    USED;

    public String value() {
        return name();
    }

    public static GiftVoucherStatusTypes fromValue(String v) {
        return valueOf(v);
    }

}
