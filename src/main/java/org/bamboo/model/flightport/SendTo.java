
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendTo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sendTo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PURCHASER"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="BOTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sendTo")
@XmlEnum
public enum SendTo {

    PURCHASER,
    RECIPIENT,
    BOTH;

    public String value() {
        return name();
    }

    public static SendTo fromValue(String v) {
        return valueOf(v);
    }

}
