
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hasWaiveAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasOverrideAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasWaived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeTax", propOrder = {
    "feeCode",
    "feeAmount",
    "currency",
    "tax",
    "hasWaiveAccess",
    "hasOverrideAccess",
    "hasWaived",
    "hasOverridden",
    "isDefault",
    "precision"
})
public class FeeTax {

    @XmlElement(required = true)
    protected String feeCode;
    protected double feeAmount;
    @XmlElement(required = true)
    protected String currency;
    protected double tax;
    protected boolean hasWaiveAccess;
    protected boolean hasOverrideAccess;
    protected boolean hasWaived;
    protected boolean hasOverridden;
    protected boolean isDefault;
    protected boolean precision;

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
     * Gets the value of the tax property.
     * 
     */
    public double getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     */
    public void setTax(double value) {
        this.tax = value;
    }

    /**
     * Gets the value of the hasWaiveAccess property.
     * 
     */
    public boolean isHasWaiveAccess() {
        return hasWaiveAccess;
    }

    /**
     * Sets the value of the hasWaiveAccess property.
     * 
     */
    public void setHasWaiveAccess(boolean value) {
        this.hasWaiveAccess = value;
    }

    /**
     * Gets the value of the hasOverrideAccess property.
     * 
     */
    public boolean isHasOverrideAccess() {
        return hasOverrideAccess;
    }

    /**
     * Sets the value of the hasOverrideAccess property.
     * 
     */
    public void setHasOverrideAccess(boolean value) {
        this.hasOverrideAccess = value;
    }

    /**
     * Gets the value of the hasWaived property.
     * 
     */
    public boolean isHasWaived() {
        return hasWaived;
    }

    /**
     * Sets the value of the hasWaived property.
     * 
     */
    public void setHasWaived(boolean value) {
        this.hasWaived = value;
    }

    /**
     * Gets the value of the hasOverridden property.
     * 
     */
    public boolean isHasOverridden() {
        return hasOverridden;
    }

    /**
     * Sets the value of the hasOverridden property.
     * 
     */
    public void setHasOverridden(boolean value) {
        this.hasOverridden = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     */
    public boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     */
    public void setIsDefault(boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     */
    public boolean isPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     */
    public void setPrecision(boolean value) {
        this.precision = value;
    }

}
