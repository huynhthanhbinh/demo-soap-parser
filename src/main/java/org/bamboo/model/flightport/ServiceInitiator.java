
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInitiator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceInitiator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CNR"/>
 *     &lt;enumeration value="PNR"/>
 *     &lt;enumeration value="ENR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceInitiator")
@XmlEnum
public enum ServiceInitiator {

    CNR,
    PNR,
    ENR;

    public String value() {
        return name();
    }

    public static ServiceInitiator fromValue(String v) {
        return valueOf(v);
    }

}
