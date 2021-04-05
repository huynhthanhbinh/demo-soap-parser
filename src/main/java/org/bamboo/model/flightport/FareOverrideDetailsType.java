
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareOverrideDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareOverrideDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareComponentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OverriddenFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OverrideReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareOverrideDetailsType", propOrder = {
    "fareComponentId",
    "guestId",
    "overriddenFare",
    "overrideReason",
    "currencyCode"
})
public class FareOverrideDetailsType {

    @XmlElement(name = "FareComponentId")
    protected Long fareComponentId;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "OverriddenFare")
    protected double overriddenFare;
    @XmlElement(name = "OverrideReason", required = true)
    protected String overrideReason;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;

    /**
     * Gets the value of the fareComponentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFareComponentId() {
        return fareComponentId;
    }

    /**
     * Sets the value of the fareComponentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFareComponentId(Long value) {
        this.fareComponentId = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the overriddenFare property.
     * 
     */
    public double getOverriddenFare() {
        return overriddenFare;
    }

    /**
     * Sets the value of the overriddenFare property.
     * 
     */
    public void setOverriddenFare(double value) {
        this.overriddenFare = value;
    }

    /**
     * Gets the value of the overrideReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideReason() {
        return overrideReason;
    }

    /**
     * Sets the value of the overrideReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideReason(String value) {
        this.overrideReason = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

}
