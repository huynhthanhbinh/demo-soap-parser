
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInitiatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceInitiatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PNR"/>
 *     &lt;enumeration value="CNR"/>
 *     &lt;enumeration value="GC"/>
 *     &lt;enumeration value="GA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceInitiatorType")
@XmlEnum
public enum ServiceInitiatorType {

    PNR,
    CNR,
    GC,
    GA;

    public String value() {
        return name();
    }

    public static ServiceInitiatorType fromValue(String v) {
        return valueOf(v);
    }

}
