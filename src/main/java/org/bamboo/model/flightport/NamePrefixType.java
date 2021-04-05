
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamePrefixType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NamePrefixType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MRS"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MISS"/>
 *     &lt;enumeration value="MSTR"/>
 *     &lt;enumeration value="HH"/>
 *     &lt;enumeration value="HE"/>
 *     &lt;enumeration value="SH"/>
 *     &lt;enumeration value="SHA"/>
 *     &lt;enumeration value="DR"/>
 *     &lt;enumeration value="MME"/>
 *     &lt;enumeration value="MLLE"/>
 *     &lt;enumeration value="ME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamePrefixType")
@XmlEnum
public enum NamePrefixType {

    M,
    MR,
    MRS,
    MS,
    MISS,
    MSTR,
    HH,
    HE,
    SH,
    SHA,
    DR,
    MME,
    MLLE,
    ME;

    public String value() {
        return name();
    }

    public static NamePrefixType fromValue(String v) {
        return valueOf(v);
    }

}
