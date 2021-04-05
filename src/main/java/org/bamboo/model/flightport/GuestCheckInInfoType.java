
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestCheckInInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestCheckInInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckInStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckInStatusDetails_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestCheckInInfoType", propOrder = {
    "segmentId",
    "checkInStatus"
})
public class GuestCheckInInfoType {

    @XmlElement(name = "SegmentId")
    protected String segmentId;
    @XmlElement(name = "CheckInStatus")
    @XmlSchemaType(name = "string")
    protected CheckInStatusDetailsType checkInStatus;

    /**
     * Gets the value of the segmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the checkInStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInStatusDetailsType }
     *     
     */
    public CheckInStatusDetailsType getCheckInStatus() {
        return checkInStatus;
    }

    /**
     * Sets the value of the checkInStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInStatusDetailsType }
     *     
     */
    public void setCheckInStatus(CheckInStatusDetailsType value) {
        this.checkInStatus = value;
    }

}
