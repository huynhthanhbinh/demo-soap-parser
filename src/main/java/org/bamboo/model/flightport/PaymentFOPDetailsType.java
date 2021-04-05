
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentFOPDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentFOPDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormOfPaymentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType"/>
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstallationPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardApprovalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeneralRemark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountingRemark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarkUpAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFOPDetailsType", propOrder = {
    "formOfPaymentCode",
    "paymentAmount",
    "paymentCurrency",
    "cardNumber",
    "cardTransactionType",
    "installationPeriod",
    "cardApprovalNumber",
    "giftCertificateNumber",
    "generalRemark",
    "accountingRemark",
    "billingIndicator",
    "markUpAmount"
})
public class PaymentFOPDetailsType {

    @XmlElement(name = "FormOfPaymentCode", required = true)
    protected String formOfPaymentCode;
    @XmlElement(name = "PaymentAmount", required = true)
    protected AmountType paymentAmount;
    @XmlElement(name = "PaymentCurrency", required = true)
    protected String paymentCurrency;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "CardTransactionType")
    protected String cardTransactionType;
    @XmlElement(name = "InstallationPeriod")
    protected String installationPeriod;
    @XmlElement(name = "CardApprovalNumber")
    protected String cardApprovalNumber;
    @XmlElement(name = "GiftCertificateNumber")
    protected String giftCertificateNumber;
    @XmlElement(name = "GeneralRemark", required = true)
    protected String generalRemark;
    @XmlElement(name = "AccountingRemark", required = true)
    protected String accountingRemark;
    @XmlElement(name = "BillingIndicator", required = true)
    protected String billingIndicator;
    @XmlElement(name = "MarkUpAmount", required = true)
    protected String markUpAmount;

    /**
     * Gets the value of the formOfPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPaymentCode() {
        return formOfPaymentCode;
    }

    /**
     * Sets the value of the formOfPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfPaymentCode(String value) {
        this.formOfPaymentCode = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentAmount(AmountType value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * Sets the value of the paymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCurrency(String value) {
        this.paymentCurrency = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTransactionType() {
        return cardTransactionType;
    }

    /**
     * Sets the value of the cardTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTransactionType(String value) {
        this.cardTransactionType = value;
    }

    /**
     * Gets the value of the installationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationPeriod() {
        return installationPeriod;
    }

    /**
     * Sets the value of the installationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationPeriod(String value) {
        this.installationPeriod = value;
    }

    /**
     * Gets the value of the cardApprovalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardApprovalNumber() {
        return cardApprovalNumber;
    }

    /**
     * Sets the value of the cardApprovalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardApprovalNumber(String value) {
        this.cardApprovalNumber = value;
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
     * Gets the value of the generalRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralRemark() {
        return generalRemark;
    }

    /**
     * Sets the value of the generalRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralRemark(String value) {
        this.generalRemark = value;
    }

    /**
     * Gets the value of the accountingRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingRemark() {
        return accountingRemark;
    }

    /**
     * Sets the value of the accountingRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingRemark(String value) {
        this.accountingRemark = value;
    }

    /**
     * Gets the value of the billingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingIndicator() {
        return billingIndicator;
    }

    /**
     * Sets the value of the billingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingIndicator(String value) {
        this.billingIndicator = value;
    }

    /**
     * Gets the value of the markUpAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkUpAmount() {
        return markUpAmount;
    }

    /**
     * Sets the value of the markUpAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkUpAmount(String value) {
        this.markUpAmount = value;
    }

}
