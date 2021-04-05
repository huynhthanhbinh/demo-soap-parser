
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepriceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepriceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancellationFee" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="FormOfRefund" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="CreditFileNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="CreditFileExpirtyDate" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepriceDetails", propOrder = {
    "cancellationFee",
    "formOfRefund",
    "refundAmount",
    "creditCardNumber",
    "creditFileNumber",
    "creditFileExpirtyDate"
})
public class RepriceDetails {

    @XmlElement(name = "CancellationFee", required = true)
    protected Object cancellationFee;
    @XmlElement(name = "FormOfRefund", required = true)
    protected Object formOfRefund;
    @XmlElement(name = "RefundAmount", required = true)
    protected Object refundAmount;
    @XmlElement(name = "CreditCardNumber", required = true)
    protected Object creditCardNumber;
    @XmlElement(name = "CreditFileNumber", required = true)
    protected Object creditFileNumber;
    @XmlElement(name = "CreditFileExpirtyDate", required = true)
    protected Object creditFileExpirtyDate;

    /**
     * Gets the value of the cancellationFee property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCancellationFee() {
        return cancellationFee;
    }

    /**
     * Sets the value of the cancellationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCancellationFee(Object value) {
        this.cancellationFee = value;
    }

    /**
     * Gets the value of the formOfRefund property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFormOfRefund() {
        return formOfRefund;
    }

    /**
     * Sets the value of the formOfRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFormOfRefund(Object value) {
        this.formOfRefund = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRefundAmount(Object value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreditCardNumber(Object value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreditFileNumber() {
        return creditFileNumber;
    }

    /**
     * Sets the value of the creditFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreditFileNumber(Object value) {
        this.creditFileNumber = value;
    }

    /**
     * Gets the value of the creditFileExpirtyDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreditFileExpirtyDate() {
        return creditFileExpirtyDate;
    }

    /**
     * Sets the value of the creditFileExpirtyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreditFileExpirtyDate(Object value) {
        this.creditFileExpirtyDate = value;
    }

}
