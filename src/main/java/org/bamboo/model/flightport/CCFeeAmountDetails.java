
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCFeeAmountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCFeeAmountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaxPercentageAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isTaxIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ActualFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FeeAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FeeTypeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PercentageValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCFeeAmountDetails", propOrder = {
    "applicationType",
    "maxPercentageAmount",
    "feeAmount",
    "currency",
    "isTaxIncluded",
    "actualFeeAmount",
    "feeAction",
    "reason",
    "feeCode",
    "creditCardType",
    "guestId",
    "feeTypeIndicator",
    "percentageValue"
})
public class CCFeeAmountDetails {

    @XmlElement(name = "ApplicationType", required = true)
    protected String applicationType;
    @XmlElement(name = "MaxPercentageAmount")
    protected Double maxPercentageAmount;
    @XmlElement(name = "FeeAmount")
    protected double feeAmount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    protected boolean isTaxIncluded;
    @XmlElement(name = "ActualFeeAmount")
    protected Double actualFeeAmount;
    @XmlElement(name = "FeeAction")
    protected String feeAction;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "FeeCode", required = true)
    protected String feeCode;
    @XmlElement(name = "CreditCardType", required = true)
    protected String creditCardType;
    @XmlElement(name = "GuestId")
    protected Integer guestId;
    @XmlElement(name = "FeeTypeIndicator")
    protected String feeTypeIndicator;
    @XmlElement(name = "PercentageValue")
    protected Double percentageValue;

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationType(String value) {
        this.applicationType = value;
    }

    /**
     * Gets the value of the maxPercentageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxPercentageAmount() {
        return maxPercentageAmount;
    }

    /**
     * Sets the value of the maxPercentageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxPercentageAmount(Double value) {
        this.maxPercentageAmount = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     */
    public double getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     */
    public void setFeeAmount(double value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the isTaxIncluded property.
     * 
     */
    public boolean isIsTaxIncluded() {
        return isTaxIncluded;
    }

    /**
     * Sets the value of the isTaxIncluded property.
     * 
     */
    public void setIsTaxIncluded(boolean value) {
        this.isTaxIncluded = value;
    }

    /**
     * Gets the value of the actualFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualFeeAmount() {
        return actualFeeAmount;
    }

    /**
     * Sets the value of the actualFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualFeeAmount(Double value) {
        this.actualFeeAmount = value;
    }

    /**
     * Gets the value of the feeAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeAction() {
        return feeAction;
    }

    /**
     * Sets the value of the feeAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeAction(String value) {
        this.feeAction = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the feeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestId(Integer value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the feeTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeTypeIndicator() {
        return feeTypeIndicator;
    }

    /**
     * Sets the value of the feeTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeTypeIndicator(String value) {
        this.feeTypeIndicator = value;
    }

    /**
     * Gets the value of the percentageValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentageValue() {
        return percentageValue;
    }

    /**
     * Sets the value of the percentageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentageValue(Double value) {
        this.percentageValue = value;
    }

}
