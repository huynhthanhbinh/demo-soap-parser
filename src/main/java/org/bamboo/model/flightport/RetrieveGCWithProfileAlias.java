
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RetrieveGCWithProfileAlias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveGCWithProfileAlias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GiftVoucherType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiftCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BulkOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftCertificateCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GiftCertificateBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GiftCertificateStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiftCertificateExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="OwnerOfCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaserDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PurchaserDetailsType" minOccurs="0"/>
 *         &lt;element name="RecepientDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}RecipientDetailsType" minOccurs="0"/>
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/>
 *         &lt;element name="ConvertToCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="GiftCertificateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveGCWithProfileAlias", propOrder = {
    "giftVoucherType",
    "giftCertificateNumber",
    "bulkOrderNumber",
    "giftCertificateCurrencyCode",
    "originalAmount",
    "giftCertificateBalanceAmount",
    "giftCertificateStatus",
    "giftCertificateExpiryDate",
    "ownerOfCreation",
    "purchaserDetails",
    "recepientDetails",
    "errorType",
    "convertToCurrency",
    "convertedAmount",
    "giftCertificateType"
})
public class RetrieveGCWithProfileAlias {

    @XmlElement(name = "GiftVoucherType", required = true)
    protected String giftVoucherType;
    @XmlElement(name = "GiftCertificateNumber", required = true)
    protected String giftCertificateNumber;
    @XmlElement(name = "BulkOrderNumber")
    protected String bulkOrderNumber;
    @XmlElement(name = "GiftCertificateCurrencyCode", required = true)
    protected String giftCertificateCurrencyCode;
    @XmlElement(name = "OriginalAmount")
    protected Double originalAmount;
    @XmlElement(name = "GiftCertificateBalanceAmount")
    protected Double giftCertificateBalanceAmount;
    @XmlElement(name = "GiftCertificateStatus", required = true)
    protected String giftCertificateStatus;
    @XmlElement(name = "GiftCertificateExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar giftCertificateExpiryDate;
    @XmlElement(name = "OwnerOfCreation")
    protected String ownerOfCreation;
    @XmlElement(name = "PurchaserDetails")
    protected PurchaserDetailsType purchaserDetails;
    @XmlElement(name = "RecepientDetails")
    protected RecipientDetailsType recepientDetails;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "ConvertToCurrency")
    protected String convertToCurrency;
    @XmlElement(name = "ConvertedAmount")
    protected double convertedAmount;
    @XmlElement(name = "GiftCertificateType")
    protected String giftCertificateType;

    /**
     * Gets the value of the giftVoucherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherType() {
        return giftVoucherType;
    }

    /**
     * Sets the value of the giftVoucherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherType(String value) {
        this.giftVoucherType = value;
    }

    /**
     * Gets the value of the giftCertificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateNumber() {
        return giftCertificateNumber;
    }

    /**
     * Sets the value of the giftCertificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateNumber(String value) {
        this.giftCertificateNumber = value;
    }

    /**
     * Gets the value of the bulkOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkOrderNumber() {
        return bulkOrderNumber;
    }

    /**
     * Sets the value of the bulkOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkOrderNumber(String value) {
        this.bulkOrderNumber = value;
    }

    /**
     * Gets the value of the giftCertificateCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateCurrencyCode() {
        return giftCertificateCurrencyCode;
    }

    /**
     * Sets the value of the giftCertificateCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateCurrencyCode(String value) {
        this.giftCertificateCurrencyCode = value;
    }

    /**
     * Gets the value of the originalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOriginalAmount(Double value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the giftCertificateBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGiftCertificateBalanceAmount() {
        return giftCertificateBalanceAmount;
    }

    /**
     * Sets the value of the giftCertificateBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGiftCertificateBalanceAmount(Double value) {
        this.giftCertificateBalanceAmount = value;
    }

    /**
     * Gets the value of the giftCertificateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateStatus() {
        return giftCertificateStatus;
    }

    /**
     * Sets the value of the giftCertificateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateStatus(String value) {
        this.giftCertificateStatus = value;
    }

    /**
     * Gets the value of the giftCertificateExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGiftCertificateExpiryDate() {
        return giftCertificateExpiryDate;
    }

    /**
     * Sets the value of the giftCertificateExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGiftCertificateExpiryDate(XMLGregorianCalendar value) {
        this.giftCertificateExpiryDate = value;
    }

    /**
     * Gets the value of the ownerOfCreation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerOfCreation() {
        return ownerOfCreation;
    }

    /**
     * Sets the value of the ownerOfCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerOfCreation(String value) {
        this.ownerOfCreation = value;
    }

    /**
     * Gets the value of the purchaserDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDetailsType }
     *     
     */
    public PurchaserDetailsType getPurchaserDetails() {
        return purchaserDetails;
    }

    /**
     * Sets the value of the purchaserDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDetailsType }
     *     
     */
    public void setPurchaserDetails(PurchaserDetailsType value) {
        this.purchaserDetails = value;
    }

    /**
     * Gets the value of the recepientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientDetailsType }
     *     
     */
    public RecipientDetailsType getRecepientDetails() {
        return recepientDetails;
    }

    /**
     * Sets the value of the recepientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientDetailsType }
     *     
     */
    public void setRecepientDetails(RecipientDetailsType value) {
        this.recepientDetails = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setErrorType(ErrorType value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the convertToCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertToCurrency() {
        return convertToCurrency;
    }

    /**
     * Sets the value of the convertToCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertToCurrency(String value) {
        this.convertToCurrency = value;
    }

    /**
     * Gets the value of the convertedAmount property.
     * 
     */
    public double getConvertedAmount() {
        return convertedAmount;
    }

    /**
     * Sets the value of the convertedAmount property.
     * 
     */
    public void setConvertedAmount(double value) {
        this.convertedAmount = value;
    }

    /**
     * Gets the value of the giftCertificateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateType() {
        return giftCertificateType;
    }

    /**
     * Sets the value of the giftCertificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateType(String value) {
        this.giftCertificateType = value;
    }

}
