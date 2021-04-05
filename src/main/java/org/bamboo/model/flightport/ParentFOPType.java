
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentFOPType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParentFOPType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="CK"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="EP"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="DB"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="LP"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="DD"/>
 *     &lt;enumeration value="PP"/>
 *     &lt;enumeration value="WA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParentFOPType")
@XmlEnum
public enum ParentFOPType {

    AG,
    CA,
    CC,
    CF,
    CK,
    EC,
    EP,
    ET,
    DB,
    PA,
    LP,
    LT,
    CO,
    DD,
    PP,
    WA;

    public String value() {
        return name();
    }

    public static ParentFOPType fromValue(String v) {
        return valueOf(v);
    }

}
