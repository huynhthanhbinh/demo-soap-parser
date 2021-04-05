
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnrActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PnrActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="MODIFY"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="CHANGE_FLIGHT"/>
 *     &lt;enumeration value="ACCEPT_TC"/>
 *     &lt;enumeration value="REJECT_TC"/>
 *     &lt;enumeration value="ACCEPT_SC"/>
 *     &lt;enumeration value="REJECT_SC"/>
 *     &lt;enumeration value="ACCEPT_TL"/>
 *     &lt;enumeration value="REJECT_TL"/>
 *     &lt;enumeration value="REJECT_WL"/>
 *     &lt;enumeration value="ACCEPT_WL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PnrActionType")
@XmlEnum
public enum PnrActionType {

    ADD,
    MODIFY,
    DELETE,
    CHANGE_FLIGHT,
    ACCEPT_TC,
    REJECT_TC,
    ACCEPT_SC,
    REJECT_SC,
    ACCEPT_TL,
    REJECT_TL,
    REJECT_WL,
    ACCEPT_WL;

    public String value() {
        return name();
    }

    public static PnrActionType fromValue(String v) {
        return valueOf(v);
    }

}
