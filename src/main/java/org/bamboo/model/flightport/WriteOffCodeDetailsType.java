
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WriteOffCodeDetails_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WriteOffCodeDetails_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSCC"/>
 *     &lt;enumeration value="ABSGUEST"/>
 *     &lt;enumeration value="ABSTA"/>
 *     &lt;enumeration value="MIG"/>
 *     &lt;enumeration value="ABBPAY"/>
 *     &lt;enumeration value="VNPAYCAC"/>
 *     &lt;enumeration value="NAPASCAC"/>
 *     &lt;enumeration value="VIETTELCAC"/>
 *     &lt;enumeration value="VNPOSTCAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WriteOffCodeDetails_Type")
@XmlEnum
public enum WriteOffCodeDetailsType {

    ABSCC,
    ABSGUEST,
    ABSTA,
    MIG,
    ABBPAY,
    VNPAYCAC,
    NAPASCAC,
    VIETTELCAC,
    VNPOSTCAC;

    public String value() {
        return name();
    }

    public static WriteOffCodeDetailsType fromValue(String v) {
        return valueOf(v);
    }

}
