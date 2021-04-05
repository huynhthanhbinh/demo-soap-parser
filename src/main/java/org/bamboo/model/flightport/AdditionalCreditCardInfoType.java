
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalCreditCardInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalCreditCardInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstallmentPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuthenticationDetailsType" minOccurs="0"/>
 *         &lt;element name="CardPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoodsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GoodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThreeDNotificationURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSSURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentPageTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalCreditCardInfoType", propOrder = {
    "registrationNumber",
    "authType",
    "installmentPeriod",
    "authenticationType",
    "cardPassword",
    "goodsCount",
    "goodsName",
    "customerUserID",
    "threeDNotificationURL",
    "cssurl",
    "paymentPageTemplate",
    "posMessage",
    "timeStamp",
    "signature",
    "bankId",
    "bankName",
    "cardBin"
})
public class AdditionalCreditCardInfoType {

    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "AuthType")
    protected String authType;
    @XmlElement(name = "InstallmentPeriod")
    protected String installmentPeriod;
    @XmlElement(name = "AuthenticationType")
    @XmlSchemaType(name = "string")
    protected AuthenticationDetailsType authenticationType;
    @XmlElement(name = "CardPassword")
    protected String cardPassword;
    @XmlElement(name = "GoodsCount")
    protected Integer goodsCount;
    @XmlElement(name = "GoodsName")
    protected String goodsName;
    @XmlElement(name = "CustomerUserID")
    protected String customerUserID;
    @XmlElement(name = "ThreeDNotificationURL")
    protected String threeDNotificationURL;
    @XmlElement(name = "CSSURL")
    protected String cssurl;
    @XmlElement(name = "PaymentPageTemplate")
    protected String paymentPageTemplate;
    @XmlElement(name = "PosMessage")
    protected String posMessage;
    @XmlElement(name = "TimeStamp")
    protected String timeStamp;
    @XmlElement(name = "Signature")
    protected String signature;
    @XmlElement(name = "BankId")
    protected String bankId;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "CardBin")
    protected String cardBin;

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the authType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * Sets the value of the authType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * Gets the value of the installmentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentPeriod() {
        return installmentPeriod;
    }

    /**
     * Sets the value of the installmentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentPeriod(String value) {
        this.installmentPeriod = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationDetailsType }
     *     
     */
    public AuthenticationDetailsType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationDetailsType }
     *     
     */
    public void setAuthenticationType(AuthenticationDetailsType value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the cardPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPassword() {
        return cardPassword;
    }

    /**
     * Sets the value of the cardPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPassword(String value) {
        this.cardPassword = value;
    }

    /**
     * Gets the value of the goodsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoodsCount() {
        return goodsCount;
    }

    /**
     * Sets the value of the goodsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoodsCount(Integer value) {
        this.goodsCount = value;
    }

    /**
     * Gets the value of the goodsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * Sets the value of the goodsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsName(String value) {
        this.goodsName = value;
    }

    /**
     * Gets the value of the customerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUserID() {
        return customerUserID;
    }

    /**
     * Sets the value of the customerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUserID(String value) {
        this.customerUserID = value;
    }

    /**
     * Gets the value of the threeDNotificationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDNotificationURL() {
        return threeDNotificationURL;
    }

    /**
     * Sets the value of the threeDNotificationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDNotificationURL(String value) {
        this.threeDNotificationURL = value;
    }

    /**
     * Gets the value of the cssurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSSURL() {
        return cssurl;
    }

    /**
     * Sets the value of the cssurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSSURL(String value) {
        this.cssurl = value;
    }

    /**
     * Gets the value of the paymentPageTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPageTemplate() {
        return paymentPageTemplate;
    }

    /**
     * Sets the value of the paymentPageTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPageTemplate(String value) {
        this.paymentPageTemplate = value;
    }

    /**
     * Gets the value of the posMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosMessage() {
        return posMessage;
    }

    /**
     * Sets the value of the posMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosMessage(String value) {
        this.posMessage = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the cardBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBin() {
        return cardBin;
    }

    /**
     * Sets the value of the cardBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBin(String value) {
        this.cardBin = value;
    }

}
