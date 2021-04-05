
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BANK TRANSFER"/>
 *     &lt;enumeration value="IDEAL"/>
 *     &lt;enumeration value="RAZORPAY"/>
 *     &lt;enumeration value="VNPAY"/>
 *     &lt;enumeration value="CREDITCARD"/>
 *     &lt;enumeration value="ALEPAY"/>
 *     &lt;enumeration value="EGHLANY"/>
 *     &lt;enumeration value="EGHLCC"/>
 *     &lt;enumeration value="EGHLDD"/>
 *     &lt;enumeration value="EGHLWA"/>
 *     &lt;enumeration value="EGHLOTC"/>
 *     &lt;enumeration value="MOMO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentCode")
@XmlEnum
public enum PaymentCode {

    @XmlEnumValue("BANK TRANSFER")
    BANK_TRANSFER("BANK TRANSFER"),
    IDEAL("IDEAL"),
    RAZORPAY("RAZORPAY"),
    VNPAY("VNPAY"),
    CREDITCARD("CREDITCARD"),
    ALEPAY("ALEPAY"),
    EGHLANY("EGHLANY"),
    EGHLCC("EGHLCC"),
    EGHLDD("EGHLDD"),
    EGHLWA("EGHLWA"),
    EGHLOTC("EGHLOTC"),
    MOMO("MOMO");
    private final String value;

    PaymentCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentCode fromValue(String v) {
        for (PaymentCode c: PaymentCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
