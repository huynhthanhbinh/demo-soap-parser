
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalutationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalutationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dr"/>
 *     &lt;enumeration value="Engg"/>
 *     &lt;enumeration value="Sr"/>
 *     &lt;enumeration value="Jr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalutationType")
@XmlEnum
public enum SalutationType {

    @XmlEnumValue("Dr")
    DR("Dr"),
    @XmlEnumValue("Engg")
    ENGG("Engg"),
    @XmlEnumValue("Sr")
    SR("Sr"),
    @XmlEnumValue("Jr")
    JR("Jr");
    private final String value;

    SalutationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalutationType fromValue(String v) {
        for (SalutationType c: SalutationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
