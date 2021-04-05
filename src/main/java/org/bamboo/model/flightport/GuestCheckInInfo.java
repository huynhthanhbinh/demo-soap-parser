
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestCheckInInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestCheckInInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckInStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckInStatus" minOccurs="0"/>
 *         &lt;element name="SeatId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestCheckInInfo", propOrder = {
    "segmentId",
    "seatNumbers",
    "checkInStatus",
    "seatId"
})
public class GuestCheckInInfo {

    @XmlElement(name = "SegmentId")
    protected String segmentId;
    @XmlElement(name = "SeatNumbers")
    protected String seatNumbers;
    @XmlElement(name = "CheckInStatus")
    @XmlSchemaType(name = "string")
    protected CheckInStatus checkInStatus;
    @XmlElement(name = "SeatId")
    protected Long seatId;

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
     * Gets the value of the seatNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumbers() {
        return seatNumbers;
    }

    /**
     * Sets the value of the seatNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumbers(String value) {
        this.seatNumbers = value;
    }

    /**
     * Gets the value of the checkInStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInStatus }
     *     
     */
    public CheckInStatus getCheckInStatus() {
        return checkInStatus;
    }

    /**
     * Sets the value of the checkInStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInStatus }
     *     
     */
    public void setCheckInStatus(CheckInStatus value) {
        this.checkInStatus = value;
    }

    /**
     * Gets the value of the seatId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeatId() {
        return seatId;
    }

    /**
     * Sets the value of the seatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeatId(Long value) {
        this.seatId = value;
    }

}
