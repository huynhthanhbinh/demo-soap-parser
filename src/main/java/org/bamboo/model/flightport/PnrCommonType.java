
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnrCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrCommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrginalCaller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/>
 *         &lt;element name="LastModified" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateAndTimeType" minOccurs="0"/>
 *         &lt;element name="AgentOrChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelAgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrCommonType", propOrder = {
    "confirmationNumber",
    "orginalCaller",
    "bookingDate",
    "lastModified",
    "agentOrChannel",
    "travelAgentName"
})
public class PnrCommonType {

    @XmlElement(name = "ConfirmationNumber")
    protected String confirmationNumber;
    @XmlElement(name = "OrginalCaller")
    protected String orginalCaller;
    @XmlElement(name = "BookingDate")
    protected DateOnlyType bookingDate;
    @XmlElement(name = "LastModified")
    protected DateAndTimeType lastModified;
    @XmlElement(name = "AgentOrChannel")
    protected String agentOrChannel;
    @XmlElement(name = "TravelAgentName")
    protected String travelAgentName;

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the orginalCaller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrginalCaller() {
        return orginalCaller;
    }

    /**
     * Sets the value of the orginalCaller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrginalCaller(String value) {
        this.orginalCaller = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setBookingDate(DateOnlyType value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setLastModified(DateAndTimeType value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the agentOrChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentOrChannel() {
        return agentOrChannel;
    }

    /**
     * Sets the value of the agentOrChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentOrChannel(String value) {
        this.agentOrChannel = value;
    }

    /**
     * Gets the value of the travelAgentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgentName() {
        return travelAgentName;
    }

    /**
     * Sets the value of the travelAgentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgentName(String value) {
        this.travelAgentName = value;
    }

}
