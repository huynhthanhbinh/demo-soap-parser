
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeApplicationDetails_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeApplicationDetails_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="PER PAX PER PNR"/>
 *     &lt;enumeration value="PAX/OandD"/>
 *     &lt;enumeration value="PAX/SEGMENT"/>
 *     &lt;enumeration value="PER PNR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeeApplicationDetails_Type")
@XmlEnum
public enum FeeApplicationDetailsType {

    DEFAULT("DEFAULT"),
    @XmlEnumValue("PER PAX PER PNR")
    PER_PAX_PER_PNR("PER PAX PER PNR"),
    @XmlEnumValue("PAX/OandD")
    PAX_OAND_D("PAX/OandD"),
    @XmlEnumValue("PAX/SEGMENT")
    PAX_SEGMENT("PAX/SEGMENT"),
    @XmlEnumValue("PER PNR")
    PER_PNR("PER PNR");
    private final String value;

    FeeApplicationDetailsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeApplicationDetailsType fromValue(String v) {
        for (FeeApplicationDetailsType c: FeeApplicationDetailsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
