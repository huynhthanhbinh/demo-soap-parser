
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommentTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREE_FORM_COMMENT"/>
 *     &lt;enumeration value="MANIFEST_COMMENT"/>
 *     &lt;enumeration value="INVOICE_COMMENT"/>
 *     &lt;enumeration value="CONFIDENTIAL_COMMENT"/>
 *     &lt;enumeration value="SECURITY_COMMENT"/>
 *     &lt;enumeration value="CRS HISTORY"/>
 *     &lt;enumeration value="OPERATIONAL_COMMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommentTypeCode")
@XmlEnum
public enum CommentTypeCode {

    FREE_FORM_COMMENT("FREE_FORM_COMMENT"),
    MANIFEST_COMMENT("MANIFEST_COMMENT"),
    INVOICE_COMMENT("INVOICE_COMMENT"),
    CONFIDENTIAL_COMMENT("CONFIDENTIAL_COMMENT"),
    SECURITY_COMMENT("SECURITY_COMMENT"),
    @XmlEnumValue("CRS HISTORY")
    CRS_HISTORY("CRS HISTORY"),
    OPERATIONAL_COMMENT("OPERATIONAL_COMMENT");
    private final String value;

    CommentTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentTypeCode fromValue(String v) {
        for (CommentTypeCode c: CommentTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
