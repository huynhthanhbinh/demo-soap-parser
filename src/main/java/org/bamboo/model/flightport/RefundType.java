
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormOfRefund" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WriteOffCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}WriteOffCodeType" minOccurs="0"/>
 *         &lt;element name="WriteOffReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditFileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditFileExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FeeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation" minOccurs="0"/>
 *         &lt;element name="PaymentTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardExpiryMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardExpiryYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaskedCreditcardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundType", propOrder = {
    "formOfRefund",
    "writeOffCode",
    "writeOffReason",
    "creditFileNumber",
    "creditFileExpiryDate",
    "refundAmount",
    "feeType",
    "paymentTypeNumber",
    "creditCardExpiryMonth",
    "paymentSubType",
    "cardExpiryYear",
    "currency",
    "maskedCreditcardNumber",
    "profileID"
})
public class RefundType {

    @XmlElement(name = "FormOfRefund", required = true)
    protected String formOfRefund;
    @XmlElement(name = "WriteOffCode")
    @XmlSchemaType(name = "string")
    protected WriteOffCodeType writeOffCode;
    @XmlElement(name = "WriteOffReason")
    protected String writeOffReason;
    @XmlElement(name = "CreditFileNumber")
    protected String creditFileNumber;
    @XmlElement(name = "CreditFileExpiryDate")
    protected String creditFileExpiryDate;
    @XmlElement(name = "RefundAmount")
    protected double refundAmount;
    @XmlElement(name = "FeeType")
    protected FeeInformation feeType;
    @XmlElement(name = "PaymentTypeNumber")
    protected String paymentTypeNumber;
    @XmlElement(name = "CreditCardExpiryMonth")
    protected String creditCardExpiryMonth;
    @XmlElement(name = "PaymentSubType")
    protected String paymentSubType;
    @XmlElement(name = "CardExpiryYear")
    protected String cardExpiryYear;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "MaskedCreditcardNumber")
    protected String maskedCreditcardNumber;
    @XmlElement(name = "ProfileID")
    protected String profileID;

    /**
     * Gets the value of the formOfRefund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfRefund() {
        return formOfRefund;
    }

    /**
     * Sets the value of the formOfRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfRefund(String value) {
        this.formOfRefund = value;
    }

    /**
     * Gets the value of the writeOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link WriteOffCodeType }
     *     
     */
    public WriteOffCodeType getWriteOffCode() {
        return writeOffCode;
    }

    /**
     * Sets the value of the writeOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteOffCodeType }
     *     
     */
    public void setWriteOffCode(WriteOffCodeType value) {
        this.writeOffCode = value;
    }

    /**
     * Gets the value of the writeOffReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteOffReason() {
        return writeOffReason;
    }

    /**
     * Sets the value of the writeOffReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteOffReason(String value) {
        this.writeOffReason = value;
    }

    /**
     * Gets the value of the creditFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditFileNumber() {
        return creditFileNumber;
    }

    /**
     * Sets the value of the creditFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditFileNumber(String value) {
        this.creditFileNumber = value;
    }

    /**
     * Gets the value of the creditFileExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditFileExpiryDate() {
        return creditFileExpiryDate;
    }

    /**
     * Sets the value of the creditFileExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditFileExpiryDate(String value) {
        this.creditFileExpiryDate = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     */
    public double getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     */
    public void setRefundAmount(double value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link FeeInformation }
     *     
     */
    public FeeInformation getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInformation }
     *     
     */
    public void setFeeType(FeeInformation value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the paymentTypeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeNumber() {
        return paymentTypeNumber;
    }

    /**
     * Sets the value of the paymentTypeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeNumber(String value) {
        this.paymentTypeNumber = value;
    }

    /**
     * Gets the value of the creditCardExpiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpiryMonth() {
        return creditCardExpiryMonth;
    }

    /**
     * Sets the value of the creditCardExpiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpiryMonth(String value) {
        this.creditCardExpiryMonth = value;
    }

    /**
     * Gets the value of the paymentSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSubType() {
        return paymentSubType;
    }

    /**
     * Sets the value of the paymentSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSubType(String value) {
        this.paymentSubType = value;
    }

    /**
     * Gets the value of the cardExpiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    /**
     * Sets the value of the cardExpiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiryYear(String value) {
        this.cardExpiryYear = value;
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
     * Gets the value of the maskedCreditcardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCreditcardNumber() {
        return maskedCreditcardNumber;
    }

    /**
     * Sets the value of the maskedCreditcardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCreditcardNumber(String value) {
        this.maskedCreditcardNumber = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

}
