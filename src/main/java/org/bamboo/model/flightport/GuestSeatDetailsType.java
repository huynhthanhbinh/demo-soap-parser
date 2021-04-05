
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestSeatDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestSeatDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatKeyword" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatKeyWordDetails_Type" minOccurs="0"/>
 *         &lt;element name="SeatNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignmentStatus_Type" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SeatMarkingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestSeatDetailsType", propOrder = {
    "seatKeyword",
    "seatNumbers",
    "seatId",
    "status",
    "guestId",
    "seatMarkingId"
})
public class GuestSeatDetailsType {

    @XmlElement(name = "SeatKeyword")
    @XmlSchemaType(name = "string")
    protected SeatKeyWordDetailsType seatKeyword;
    @XmlElement(name = "SeatNumbers")
    protected String seatNumbers;
    @XmlElement(name = "SeatId")
    protected Long seatId;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected SeatAssignmentStatusType status;
    @XmlElement(name = "GuestId", required = true)
    protected String guestId;
    @XmlElement(name = "SeatMarkingId")
    protected Long seatMarkingId;

    /**
     * Gets the value of the seatKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link SeatKeyWordDetailsType }
     *     
     */
    public SeatKeyWordDetailsType getSeatKeyword() {
        return seatKeyword;
    }

    /**
     * Sets the value of the seatKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatKeyWordDetailsType }
     *     
     */
    public void setSeatKeyword(SeatKeyWordDetailsType value) {
        this.seatKeyword = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAssignmentStatusType }
     *     
     */
    public SeatAssignmentStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAssignmentStatusType }
     *     
     */
    public void setStatus(SeatAssignmentStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestId(String value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the seatMarkingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeatMarkingId() {
        return seatMarkingId;
    }

    /**
     * Sets the value of the seatMarkingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeatMarkingId(Long value) {
        this.seatMarkingId = value;
    }

}
