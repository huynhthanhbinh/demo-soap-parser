
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgencyCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOUR OPERATOR"/>
 *     &lt;enumeration value="CORPORATE"/>
 *     &lt;enumeration value="TRAVEL AGENCY"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgencyCategoryType")
@XmlEnum
public enum AgencyCategoryType {

    @XmlEnumValue("TOUR OPERATOR")
    TOUR_OPERATOR("TOUR OPERATOR"),
    CORPORATE("CORPORATE"),
    @XmlEnumValue("TRAVEL AGENCY")
    TRAVEL_AGENCY("TRAVEL AGENCY"),
    ALL("ALL");
    private final String value;

    AgencyCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgencyCategoryType fromValue(String v) {
        for (AgencyCategoryType c: AgencyCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
