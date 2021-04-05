
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionsForSession.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionsForSession">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STOP_SESSION"/>
 *     &lt;enumeration value="POLL_SESSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionsForSession")
@XmlEnum
public enum ActionsForSession {

    STOP_SESSION,
    POLL_SESSION;

    public String value() {
        return name();
    }

    public static ActionsForSession fromValue(String v) {
        return valueOf(v);
    }

}
