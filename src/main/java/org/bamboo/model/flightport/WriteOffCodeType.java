
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WriteOffCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WriteOffCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSCC"/>
 *     &lt;enumeration value="ABSGUEST"/>
 *     &lt;enumeration value="ABSTA"/>
 *     &lt;enumeration value="ABBPAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WriteOffCodeType")
@XmlEnum
public enum WriteOffCodeType {

    ABSCC,
    ABSGUEST,
    ABSTA,
    ABBPAY;

    public String value() {
        return name();
    }

    public static WriteOffCodeType fromValue(String v) {
        return valueOf(v);
    }

}
