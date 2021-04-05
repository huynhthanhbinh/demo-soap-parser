
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OANDD"/>
 *     &lt;enumeration value="SEGMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferenceType")
@XmlEnum
public enum ReferenceType {

    OANDD,
    SEGMENT;

    public String value() {
        return name();
    }

    public static ReferenceType fromValue(String v) {
        return valueOf(v);
    }

}
