
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentSubTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommentSubTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AIRLINE"/>
 *     &lt;enumeration value="AGENCY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommentSubTypeCode")
@XmlEnum
public enum CommentSubTypeCode {

    AIRLINE,
    AGENCY;

    public String value() {
        return name();
    }

    public static CommentSubTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
