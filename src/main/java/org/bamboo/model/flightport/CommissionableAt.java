
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionableAt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommissionableAt">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATION"/>
 *     &lt;enumeration value="USAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommissionableAt")
@XmlEnum
public enum CommissionableAt {

    CREATION,
    USAGE;

    public String value() {
        return name();
    }

    public static CommissionableAt fromValue(String v) {
        return valueOf(v);
    }

}
