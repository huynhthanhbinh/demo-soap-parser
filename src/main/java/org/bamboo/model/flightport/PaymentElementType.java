
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This contains the element information to which the payment has done
 * 
 * <p>Java class for PaymentElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElementId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ElementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ElementSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentElementType", propOrder = {
    "elementId",
    "elementType",
    "elementSubType",
    "amount",
    "currency",
    "exchangeRate"
})
public class PaymentElementType {

    @XmlElement(name = "ElementId")
    protected long elementId;
    @XmlElement(name = "ElementType", required = true)
    protected String elementType;
    @XmlElement(name = "ElementSubType", required = true)
    protected String elementSubType;
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "ExchangeRate")
    protected Double exchangeRate;

    /**
     * Gets the value of the elementId property.
     * 
     */
    public long getElementId() {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     */
    public void setElementId(long value) {
        this.elementId = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementType(String value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the elementSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementSubType() {
        return elementSubType;
    }

    /**
     * Sets the value of the elementSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementSubType(String value) {
        this.elementSubType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
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
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchangeRate(Double value) {
        this.exchangeRate = value;
    }

}
