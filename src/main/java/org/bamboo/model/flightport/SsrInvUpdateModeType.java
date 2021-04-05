
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsrInvUpdateModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SsrInvUpdateModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLOCK"/>
 *     &lt;enumeration value="UNBLOCK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SsrInvUpdateModeType")
@XmlEnum
public enum SsrInvUpdateModeType {

    BLOCK,
    UNBLOCK;

    public String value() {
        return name();
    }

    public static SsrInvUpdateModeType fromValue(String v) {
        return valueOf(v);
    }

}
