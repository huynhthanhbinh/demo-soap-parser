
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommentCode_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREE_FORM_COMMENT"/>
 *     &lt;enumeration value="MANIFEST_COMMENT"/>
 *     &lt;enumeration value="INVOICE_COMMENT"/>
 *     &lt;enumeration value="CONFIDENTIAL_COMMENT"/>
 *     &lt;enumeration value="SECURITY_COMMENT"/>
 *     &lt;enumeration value="CRS HISTORY"/>
 *     &lt;enumeration value="OPERATIONAL_COMMENT"/>
 *     &lt;enumeration value="HISTORY"/>
 *     &lt;enumeration value="ALL_COMMENTS"/>
 *     &lt;enumeration value="REPRINTBP_COMMENT"/>
 *     &lt;enumeration value="APPS_COMMENT"/>
 *     &lt;enumeration value="ROLLOVER_COMMENT"/>
 *     &lt;enumeration value="CAPPS_COMMENT"/>
 *     &lt;enumeration value="CAPPS EXEMPTION"/>
 *     &lt;enumeration value="PRINT_OA_BP_COMMENT"/>
 *     &lt;enumeration value="ROLLBACK_COMMENT"/>
 *     &lt;enumeration value="PNR VIEW"/>
 *     &lt;enumeration value="GATE_PASS_WATCH_COMMENT"/>
 *     &lt;enumeration value="ENDORSE_COMMENT"/>
 *     &lt;enumeration value="REPRINTBT_COMMENT"/>
 *     &lt;enumeration value="PRINTBT_COMMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommentCode_Type")
@XmlEnum
public enum CommentCodeType {

    FREE_FORM_COMMENT("FREE_FORM_COMMENT"),
    MANIFEST_COMMENT("MANIFEST_COMMENT"),
    INVOICE_COMMENT("INVOICE_COMMENT"),
    CONFIDENTIAL_COMMENT("CONFIDENTIAL_COMMENT"),
    SECURITY_COMMENT("SECURITY_COMMENT"),
    @XmlEnumValue("CRS HISTORY")
    CRS_HISTORY("CRS HISTORY"),
    OPERATIONAL_COMMENT("OPERATIONAL_COMMENT"),
    HISTORY("HISTORY"),
    ALL_COMMENTS("ALL_COMMENTS"),
    REPRINTBP_COMMENT("REPRINTBP_COMMENT"),
    APPS_COMMENT("APPS_COMMENT"),
    ROLLOVER_COMMENT("ROLLOVER_COMMENT"),
    CAPPS_COMMENT("CAPPS_COMMENT"),
    @XmlEnumValue("CAPPS EXEMPTION")
    CAPPS_EXEMPTION("CAPPS EXEMPTION"),
    PRINT_OA_BP_COMMENT("PRINT_OA_BP_COMMENT"),
    ROLLBACK_COMMENT("ROLLBACK_COMMENT"),
    @XmlEnumValue("PNR VIEW")
    PNR_VIEW("PNR VIEW"),
    GATE_PASS_WATCH_COMMENT("GATE_PASS_WATCH_COMMENT"),
    ENDORSE_COMMENT("ENDORSE_COMMENT"),
    REPRINTBT_COMMENT("REPRINTBT_COMMENT"),
    PRINTBT_COMMENT("PRINTBT_COMMENT");
    private final String value;

    CommentCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentCodeType fromValue(String v) {
        for (CommentCodeType c: CommentCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
