
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="Excel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentFormatType")
@XmlEnum
public enum AttachmentFormatType {

    PDF("PDF"),
    @XmlEnumValue("Excel")
    EXCEL("Excel");
    private final String value;

    AttachmentFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentFormatType fromValue(String v) {
        for (AttachmentFormatType c: AttachmentFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
