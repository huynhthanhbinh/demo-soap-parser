
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatAssignmentStatus_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeatAssignmentStatus_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeatAssignmentStatus_Type")
@XmlEnum
public enum SeatAssignmentStatusType {

    SUCCESS,
    FAIL;

    public String value() {
        return name();
    }

    public static SeatAssignmentStatusType fromValue(String v) {
        return valueOf(v);
    }

}
