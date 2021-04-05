
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyNumberDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyNumberDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TierLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TierLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerLoyaltyDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerLoyaltyDetails" minOccurs="0"/>
 *         &lt;element name="LoyaltyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyNumberDetails", propOrder = {
    "airlineCode",
    "tierLevelCode",
    "tierLevelName",
    "points",
    "accountStatus",
    "customerLoyaltyDetails",
    "loyaltyNumber"
})
public class LoyaltyNumberDetails {

    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "TierLevelCode")
    protected String tierLevelCode;
    @XmlElement(name = "TierLevelName")
    protected String tierLevelName;
    @XmlElement(name = "Points")
    protected Long points;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "CustomerLoyaltyDetails")
    protected CustomerLoyaltyDetails customerLoyaltyDetails;
    @XmlElement(name = "LoyaltyNumber")
    protected String loyaltyNumber;

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the tierLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierLevelCode() {
        return tierLevelCode;
    }

    /**
     * Sets the value of the tierLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierLevelCode(String value) {
        this.tierLevelCode = value;
    }

    /**
     * Gets the value of the tierLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierLevelName() {
        return tierLevelName;
    }

    /**
     * Sets the value of the tierLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierLevelName(String value) {
        this.tierLevelName = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoints(Long value) {
        this.points = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the customerLoyaltyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerLoyaltyDetails }
     *     
     */
    public CustomerLoyaltyDetails getCustomerLoyaltyDetails() {
        return customerLoyaltyDetails;
    }

    /**
     * Sets the value of the customerLoyaltyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerLoyaltyDetails }
     *     
     */
    public void setCustomerLoyaltyDetails(CustomerLoyaltyDetails value) {
        this.customerLoyaltyDetails = value;
    }

    /**
     * Gets the value of the loyaltyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyNumber() {
        return loyaltyNumber;
    }

    /**
     * Sets the value of the loyaltyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyNumber(String value) {
        this.loyaltyNumber = value;
    }

}
