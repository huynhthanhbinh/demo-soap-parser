
package org.bamboo.model.flightport;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyCreditDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyCreditDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isPrepaidCreditAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AvailableCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UsedCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyCreditDetails", propOrder = {
    "isPrepaidCreditAllowed",
    "currencyCode",
    "creditLimit",
    "availableCredit",
    "usedCredit"
})
public class AgencyCreditDetails {

    protected Boolean isPrepaidCreditAllowed;
    @XmlElement(required = true)
    protected String currencyCode;
    @XmlElement(required = true)
    protected BigDecimal creditLimit;
    @XmlElement(name = "AvailableCredit", required = true)
    protected BigDecimal availableCredit;
    @XmlElement(name = "UsedCredit", required = true)
    protected BigDecimal usedCredit;

    /**
     * Gets the value of the isPrepaidCreditAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrepaidCreditAllowed() {
        return isPrepaidCreditAllowed;
    }

    /**
     * Sets the value of the isPrepaidCreditAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrepaidCreditAllowed(Boolean value) {
        this.isPrepaidCreditAllowed = value;
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

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimit(BigDecimal value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the availableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableCredit() {
        return availableCredit;
    }

    /**
     * Sets the value of the availableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableCredit(BigDecimal value) {
        this.availableCredit = value;
    }

    /**
     * Gets the value of the usedCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedCredit() {
        return usedCredit;
    }

    /**
     * Sets the value of the usedCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedCredit(BigDecimal value) {
        this.usedCredit = value;
    }

}
