
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OldSeatAllocationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OldSeatAllocationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChildBoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChildOffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SeatAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExstCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SeatStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "OldSeatAllocationDetails", propOrder = {
    "guestID",
    "childBoardPoint",
    "childOffPoint",
    "seatNumber",
    "boardPoint",
    "offPoint",
    "seatAttribute",
    "exstCount",
    "segmentId",
    "seatStatus",
    "seatId"
})
public class OldSeatAllocationDetails {

    @XmlElement(name = "GuestID", required = true)
    protected String guestID;
    @XmlElement(name = "ChildBoardPoint", required = true)
    protected String childBoardPoint;
    @XmlElement(name = "ChildOffPoint", required = true)
    protected String childOffPoint;
    @XmlElement(name = "SeatNumber")
    protected String seatNumber;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected String offPoint;
    @XmlElement(name = "SeatAttribute")
    protected String seatAttribute;
    @XmlElement(name = "ExstCount")
    protected Integer exstCount;
    @XmlElement(name = "SegmentId")
    protected long segmentId;
    @XmlElement(name = "SeatStatus")
    protected String seatStatus;
    @XmlElement(name = "SeatId")
    protected Long seatId;

    /**
     * Gets the value of the guestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestID() {
        return guestID;
    }

    /**
     * Sets the value of the guestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestID(String value) {
        this.guestID = value;
    }

    /**
     * Gets the value of the childBoardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildBoardPoint() {
        return childBoardPoint;
    }

    /**
     * Sets the value of the childBoardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildBoardPoint(String value) {
        this.childBoardPoint = value;
    }

    /**
     * Gets the value of the childOffPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildOffPoint() {
        return childOffPoint;
    }

    /**
     * Sets the value of the childOffPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildOffPoint(String value) {
        this.childOffPoint = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the boardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * Sets the value of the boardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * Gets the value of the offPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * Gets the value of the seatAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatAttribute() {
        return seatAttribute;
    }

    /**
     * Sets the value of the seatAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatAttribute(String value) {
        this.seatAttribute = value;
    }

    /**
     * Gets the value of the exstCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExstCount() {
        return exstCount;
    }

    /**
     * Sets the value of the exstCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExstCount(Integer value) {
        this.exstCount = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     */
    public long getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     */
    public void setSegmentId(long value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the seatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatStatus() {
        return seatStatus;
    }

    /**
     * Sets the value of the seatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatStatus(String value) {
        this.seatStatus = value;
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
