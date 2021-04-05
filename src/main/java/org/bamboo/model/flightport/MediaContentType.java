
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="GRAPHICS"/>
 *     &lt;enumeration value="PLAIN TEXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediaContentType")
@XmlEnum
public enum MediaContentType {

    IMAGE("IMAGE"),
    VIDEO("VIDEO"),
    GRAPHICS("GRAPHICS"),
    @XmlEnumValue("PLAIN TEXT")
    PLAIN_TEXT("PLAIN TEXT");
    private final String value;

    MediaContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaContentType fromValue(String v) {
        for (MediaContentType c: MediaContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
