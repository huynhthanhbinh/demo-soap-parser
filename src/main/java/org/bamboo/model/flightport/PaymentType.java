
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payment_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Payment_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CK"/>
 *     &lt;enumeration value="DB"/>
 *     &lt;enumeration value="WO"/>
 *     &lt;enumeration value="GV"/>
 *     &lt;enumeration value="GC"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="LP"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="DD"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="PP"/>
 *     &lt;enumeration value="ED"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="EP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Payment_Type")
@XmlEnum
public enum PaymentType {

    AG,
    CC,
    CF,
    CS,
    PA,
    CA,
    CK,
    DB,
    WO,
    GV,
    GC,
    GS,
    LP,
    LT,
    TK,
    DD,
    CO,
    CR,
    PT,
    ET,
    IN,
    PP,
    ED,
    WA,
    CI,
    EP;

    public String value() {
        return name();
    }

    public static PaymentType fromValue(String v) {
        return valueOf(v);
    }

}
