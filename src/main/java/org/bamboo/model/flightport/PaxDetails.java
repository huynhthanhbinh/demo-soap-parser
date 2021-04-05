
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BagTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckinStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FFPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfantIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="McoNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxDetails", propOrder = {
    "passengerName",
    "seatNumber",
    "ssrDetails",
    "bagTags",
    "checkinStatus",
    "ticketNumber",
    "couponNumber",
    "paxType",
    "ffpNumber",
    "infantIndicator",
    "mcoNumbers"
})
public class PaxDetails {

    @XmlElement(name = "PassengerName", required = true)
    protected String passengerName;
    @XmlElement(name = "SeatNumber")
    protected String seatNumber;
    @XmlElement(name = "SSRDetails")
    protected List<SSRDetails> ssrDetails;
    @XmlElement(name = "BagTags")
    protected String bagTags;
    @XmlElement(name = "CheckinStatus")
    protected String checkinStatus;
    @XmlElement(name = "TicketNumber")
    protected String ticketNumber;
    @XmlElement(name = "CouponNumber")
    protected Integer couponNumber;
    @XmlElement(name = "PaxType", required = true)
    protected String paxType;
    @XmlElement(name = "FFPNumber")
    protected String ffpNumber;
    @XmlElement(name = "InfantIndicator", required = true)
    protected String infantIndicator;
    @XmlElement(name = "McoNumbers")
    protected String mcoNumbers;

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
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
     * Gets the value of the ssrDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRDetails }
     * 
     * 
     */
    public List<SSRDetails> getSSRDetails() {
        if (ssrDetails == null) {
            ssrDetails = new ArrayList<SSRDetails>();
        }
        return this.ssrDetails;
    }

    /**
     * Gets the value of the bagTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagTags() {
        return bagTags;
    }

    /**
     * Sets the value of the bagTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagTags(String value) {
        this.bagTags = value;
    }

    /**
     * Gets the value of the checkinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckinStatus() {
        return checkinStatus;
    }

    /**
     * Sets the value of the checkinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckinStatus(String value) {
        this.checkinStatus = value;
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
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCouponNumber(Integer value) {
        this.couponNumber = value;
    }

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

    /**
     * Gets the value of the ffpNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFPNumber() {
        return ffpNumber;
    }

    /**
     * Sets the value of the ffpNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFPNumber(String value) {
        this.ffpNumber = value;
    }

    /**
     * Gets the value of the infantIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /**
     * Sets the value of the infantIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantIndicator(String value) {
        this.infantIndicator = value;
    }

    /**
     * Gets the value of the mcoNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcoNumbers() {
        return mcoNumbers;
    }

    /**
     * Sets the value of the mcoNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcoNumbers(String value) {
        this.mcoNumbers = value;
    }

}
