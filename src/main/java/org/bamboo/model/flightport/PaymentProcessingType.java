
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentProcessingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentProcessingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormOfPayment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WriteOffCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}WriteOffCodeType" minOccurs="0"/>
 *         &lt;element name="WriteOffReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CardType" minOccurs="0"/>
 *         &lt;element name="PaymentProcessingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvenienceStoreCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvenienceStoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvenienceStoreType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecieptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiptPrintURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsableCVSCompanycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaskedCreditcardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalCreditCardInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AdditionalCreditCardInfo" minOccurs="0"/>
 *         &lt;element name="CashReceiptType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalAuthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentProcessingType", propOrder = {
    "formOfPayment",
    "paymentTypeNumber",
    "writeOffCode",
    "writeOffReason",
    "cardHolderName",
    "cardType",
    "paymentProcessingStatus",
    "expirationMonth",
    "expirationYear",
    "paymentDescription",
    "errorCode",
    "errorDescription",
    "convenienceStoreCode",
    "convenienceStoreName",
    "convenienceStoreType",
    "customerFirstName",
    "customerLastName",
    "customerPhoneNumber",
    "recieptNumber",
    "receiptPrintURL",
    "usableCVSCompanycode",
    "maskedCreditcardNumber",
    "additionalCreditCardInfo",
    "cashReceiptType",
    "originalAuthDate",
    "originalAuthCode"
})
public class PaymentProcessingType {

    @XmlElement(name = "FormOfPayment", required = true)
    protected String formOfPayment;
    @XmlElement(name = "PaymentTypeNumber")
    protected String paymentTypeNumber;
    @XmlElement(name = "WriteOffCode")
    @XmlSchemaType(name = "string")
    protected WriteOffCodeType writeOffCode;
    @XmlElement(name = "WriteOffReason")
    protected String writeOffReason;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "CardType")
    @XmlSchemaType(name = "string")
    protected CardType cardType;
    @XmlElement(name = "PaymentProcessingStatus")
    protected String paymentProcessingStatus;
    @XmlElement(name = "ExpirationMonth")
    protected String expirationMonth;
    @XmlElement(name = "ExpirationYear")
    protected String expirationYear;
    @XmlElement(name = "PaymentDescription")
    protected String paymentDescription;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "ConvenienceStoreCode")
    protected String convenienceStoreCode;
    @XmlElement(name = "ConvenienceStoreName")
    protected String convenienceStoreName;
    @XmlElement(name = "ConvenienceStoreType")
    protected String convenienceStoreType;
    @XmlElement(name = "CustomerFirstName")
    protected String customerFirstName;
    @XmlElement(name = "CustomerLastName")
    protected String customerLastName;
    @XmlElement(name = "CustomerPhoneNumber")
    protected String customerPhoneNumber;
    @XmlElement(name = "RecieptNumber")
    protected String recieptNumber;
    @XmlElement(name = "ReceiptPrintURL")
    protected String receiptPrintURL;
    @XmlElement(name = "UsableCVSCompanycode")
    protected String usableCVSCompanycode;
    @XmlElement(name = "MaskedCreditcardNumber")
    protected String maskedCreditcardNumber;
    @XmlElement(name = "AdditionalCreditCardInfo")
    protected AdditionalCreditCardInfo additionalCreditCardInfo;
    @XmlElement(name = "CashReceiptType")
    protected String cashReceiptType;
    @XmlElement(name = "OriginalAuthDate")
    protected String originalAuthDate;
    @XmlElement(name = "OriginalAuthCode")
    protected String originalAuthCode;

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfPayment(String value) {
        this.formOfPayment = value;
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
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CardType }
     *     
     */
    public CardType getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType }
     *     
     */
    public void setCardType(CardType value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the paymentProcessingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentProcessingStatus() {
        return paymentProcessingStatus;
    }

    /**
     * Sets the value of the paymentProcessingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentProcessingStatus(String value) {
        this.paymentProcessingStatus = value;
    }

    /**
     * Gets the value of the expirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the value of the expirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationMonth(String value) {
        this.expirationMonth = value;
    }

    /**
     * Gets the value of the expirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the value of the expirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationYear(String value) {
        this.expirationYear = value;
    }

    /**
     * Gets the value of the paymentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * Sets the value of the paymentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the convenienceStoreCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenienceStoreCode() {
        return convenienceStoreCode;
    }

    /**
     * Sets the value of the convenienceStoreCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenienceStoreCode(String value) {
        this.convenienceStoreCode = value;
    }

    /**
     * Gets the value of the convenienceStoreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenienceStoreName() {
        return convenienceStoreName;
    }

    /**
     * Sets the value of the convenienceStoreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenienceStoreName(String value) {
        this.convenienceStoreName = value;
    }

    /**
     * Gets the value of the convenienceStoreType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenienceStoreType() {
        return convenienceStoreType;
    }

    /**
     * Sets the value of the convenienceStoreType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenienceStoreType(String value) {
        this.convenienceStoreType = value;
    }

    /**
     * Gets the value of the customerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the value of the customerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstName(String value) {
        this.customerFirstName = value;
    }

    /**
     * Gets the value of the customerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the value of the customerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastName(String value) {
        this.customerLastName = value;
    }

    /**
     * Gets the value of the customerPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    /**
     * Sets the value of the customerPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhoneNumber(String value) {
        this.customerPhoneNumber = value;
    }

    /**
     * Gets the value of the recieptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieptNumber() {
        return recieptNumber;
    }

    /**
     * Sets the value of the recieptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieptNumber(String value) {
        this.recieptNumber = value;
    }

    /**
     * Gets the value of the receiptPrintURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptPrintURL() {
        return receiptPrintURL;
    }

    /**
     * Sets the value of the receiptPrintURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptPrintURL(String value) {
        this.receiptPrintURL = value;
    }

    /**
     * Gets the value of the usableCVSCompanycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsableCVSCompanycode() {
        return usableCVSCompanycode;
    }

    /**
     * Sets the value of the usableCVSCompanycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsableCVSCompanycode(String value) {
        this.usableCVSCompanycode = value;
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
     * Gets the value of the additionalCreditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCreditCardInfo }
     *     
     */
    public AdditionalCreditCardInfo getAdditionalCreditCardInfo() {
        return additionalCreditCardInfo;
    }

    /**
     * Sets the value of the additionalCreditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCreditCardInfo }
     *     
     */
    public void setAdditionalCreditCardInfo(AdditionalCreditCardInfo value) {
        this.additionalCreditCardInfo = value;
    }

    /**
     * Gets the value of the cashReceiptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashReceiptType() {
        return cashReceiptType;
    }

    /**
     * Sets the value of the cashReceiptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashReceiptType(String value) {
        this.cashReceiptType = value;
    }

    /**
     * Gets the value of the originalAuthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAuthDate() {
        return originalAuthDate;
    }

    /**
     * Sets the value of the originalAuthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAuthDate(String value) {
        this.originalAuthDate = value;
    }

    /**
     * Gets the value of the originalAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAuthCode() {
        return originalAuthCode;
    }

    /**
     * Sets the value of the originalAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAuthCode(String value) {
        this.originalAuthCode = value;
    }

}
