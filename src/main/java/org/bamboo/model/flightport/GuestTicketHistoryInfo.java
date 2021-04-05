
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestTicketHistoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestTicketHistoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElementAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestTicketHistoryInfo", propOrder = {
    "elementAction",
    "ticketNumber",
    "guestId",
    "segmentId",
    "couponNumber"
})
public class GuestTicketHistoryInfo {

    @XmlElement(name = "ElementAction")
    protected String elementAction;
    @XmlElement(name = "TicketNumber", required = true)
    protected String ticketNumber;
    @XmlElement(name = "GuestId")
    protected long guestId;
    @XmlElement(name = "SegmentId")
    protected long segmentId;
    @XmlElement(name = "CouponNumber")
    protected int couponNumber;

    /**
     * Gets the value of the elementAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementAction() {
        return elementAction;
    }

    /**
     * Sets the value of the elementAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementAction(String value) {
        this.elementAction = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     */
    public long getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     */
    public void setGuestId(long value) {
        this.guestId = value;
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
     * Gets the value of the couponNumber property.
     * 
     */
    public int getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     */
    public void setCouponNumber(int value) {
        this.couponNumber = value;
    }

}
