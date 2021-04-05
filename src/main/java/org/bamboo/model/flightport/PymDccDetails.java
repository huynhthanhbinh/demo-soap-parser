
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PymDccDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PymDccDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isDCCOffered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dccMerchantID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dccAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dccCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dccExchangeRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hasUserAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PymDccDetails", propOrder = {
    "isDCCOffered",
    "dccMerchantID",
    "dccAmount",
    "dccCurrency",
    "dccExchangeRate",
    "status",
    "hasUserAccepted"
})
public class PymDccDetails {

    protected boolean isDCCOffered;
    @XmlElement(required = true)
    protected String dccMerchantID;
    protected double dccAmount;
    @XmlElement(required = true)
    protected String dccCurrency;
    protected double dccExchangeRate;
    @XmlElement(required = true)
    protected String status;
    protected boolean hasUserAccepted;

    /**
     * Gets the value of the isDCCOffered property.
     * 
     */
    public boolean isIsDCCOffered() {
        return isDCCOffered;
    }

    /**
     * Sets the value of the isDCCOffered property.
     * 
     */
    public void setIsDCCOffered(boolean value) {
        this.isDCCOffered = value;
    }

    /**
     * Gets the value of the dccMerchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccMerchantID() {
        return dccMerchantID;
    }

    /**
     * Sets the value of the dccMerchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccMerchantID(String value) {
        this.dccMerchantID = value;
    }

    /**
     * Gets the value of the dccAmount property.
     * 
     */
    public double getDccAmount() {
        return dccAmount;
    }

    /**
     * Sets the value of the dccAmount property.
     * 
     */
    public void setDccAmount(double value) {
        this.dccAmount = value;
    }

    /**
     * Gets the value of the dccCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccCurrency() {
        return dccCurrency;
    }

    /**
     * Sets the value of the dccCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccCurrency(String value) {
        this.dccCurrency = value;
    }

    /**
     * Gets the value of the dccExchangeRate property.
     * 
     */
    public double getDccExchangeRate() {
        return dccExchangeRate;
    }

    /**
     * Sets the value of the dccExchangeRate property.
     * 
     */
    public void setDccExchangeRate(double value) {
        this.dccExchangeRate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the hasUserAccepted property.
     * 
     */
    public boolean isHasUserAccepted() {
        return hasUserAccepted;
    }

    /**
     * Sets the value of the hasUserAccepted property.
     * 
     */
    public void setHasUserAccepted(boolean value) {
        this.hasUserAccepted = value;
    }

}
