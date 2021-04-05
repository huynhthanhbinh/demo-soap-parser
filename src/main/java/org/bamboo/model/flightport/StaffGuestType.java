
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaffGuestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StaffGuestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EM"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="DP"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="ZED"/>
 *     &lt;enumeration value="ZEA"/>
 *     &lt;enumeration value="ZEC"/>
 *     &lt;enumeration value="ZEI"/>
 *     &lt;enumeration value="ZSP"/>
 *     &lt;enumeration value="ZCS"/>
 *     &lt;enumeration value="ZSO"/>
 *     &lt;enumeration value="ZSS"/>
 *     &lt;enumeration value="ZCO"/>
 *     &lt;enumeration value="ZEP"/>
 *     &lt;enumeration value="ZPS"/>
 *     &lt;enumeration value="ZPM"/>
 *     &lt;enumeration value="ZES"/>
 *     &lt;enumeration value="ZSA"/>
 *     &lt;enumeration value="ZMA"/>
 *     &lt;enumeration value="ZEF"/>
 *     &lt;enumeration value="ZPC"/>
 *     &lt;enumeration value="ZPA"/>
 *     &lt;enumeration value="ZWA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StaffGuestType")
@XmlEnum
public enum StaffGuestType {

    EM,
    SP,
    DP,
    TC,
    PA,
    CH,
    FR,
    ZED,
    ZEA,
    ZEC,
    ZEI,
    ZSP,
    ZCS,
    ZSO,
    ZSS,
    ZCO,
    ZEP,
    ZPS,
    ZPM,
    ZES,
    ZSA,
    ZMA,
    ZEF,
    ZPC,
    ZPA,
    ZWA;

    public String value() {
        return name();
    }

    public static StaffGuestType fromValue(String v) {
        return valueOf(v);
    }

}
