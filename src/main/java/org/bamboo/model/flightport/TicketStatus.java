
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TICKETED"/>
 *     &lt;enumeration value="NONTICKETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketStatus")
@XmlEnum
public enum TicketStatus {

    TICKETED,
    NONTICKETED;

    public String value() {
        return name();
    }

    public static TicketStatus fromValue(String v) {
        return valueOf(v);
    }

}
