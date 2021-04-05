
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GuestPaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestPaymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FormOfPaymentCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}Payment_Type"/>
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WriteOffCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}WriteOffCodeDetails_Type" minOccurs="0"/>
 *         &lt;element name="WriteOffReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CardDetails_Type" minOccurs="0"/>
 *         &lt;element name="paymentTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationTxnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="membershipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DccDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}DccPaymentDetailsType" minOccurs="0"/>
 *         &lt;element name="cvv2Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorisationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorisationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransactionTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}BillingAddressType" minOccurs="0"/>
 *         &lt;element name="TrackOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentElementType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaymentElementDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThreeDSecurityDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ThreeDSecurityDtlsType" minOccurs="0"/>
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
 *         &lt;element name="AdditionalCreditCardInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AdditionalCreditCardInfoType" minOccurs="0"/>
 *         &lt;element name="CashReceiptType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CashReceiptDetailsType" minOccurs="0"/>
 *         &lt;element name="OriginalAuthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RedirectionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localeCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LandingPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPreAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CartDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ShopingCartDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="txnTimeInAgentOfficeTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CustomerProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomFieldList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomFieldListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestPaymentInfoType", propOrder = {
    "guestId",
    "formOfPaymentCode",
    "paymentAmount",
    "exchangeRate",
    "writeOffCode",
    "writeOffReason",
    "cardType",
    "paymentTypeNumber",
    "authenticationTxnId",
    "membershipNumber",
    "expirationMonth",
    "expirationYear",
    "dccDetailsType",
    "cvv2Number",
    "agentID",
    "password",
    "validationRequired",
    "cardHolderName",
    "authorisationCode",
    "authorisationDate",
    "paymentCurrency",
    "paymentId",
    "paymentStatus",
    "transactionTime",
    "transactionTimeZone",
    "ipAddress",
    "emailID",
    "billingAddress",
    "trackOne",
    "trackTwo",
    "paymentDescription",
    "paymentElementType",
    "errorCode",
    "errorDescription",
    "transactionID",
    "threeDSecurityDetails",
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
    "originalAuthCode",
    "customerId",
    "procReturnCode",
    "paymentMethod",
    "transactionKey",
    "requestURL",
    "redirectionURL",
    "gatewayName",
    "localeCountryCode",
    "landingPage",
    "isPreAuthorized",
    "cartDetailsType",
    "iban",
    "bic",
    "accountHolderName",
    "signedDate",
    "txnTimeInAgentOfficeTimeZone",
    "customerProfileId",
    "agencyCode",
    "customFieldList",
    "paymentCode",
    "authorizationSequenceNumber"
})
public class GuestPaymentInfoType {

    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "FormOfPaymentCode", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentType formOfPaymentCode;
    @XmlElement(name = "PaymentAmount")
    protected double paymentAmount;
    @XmlElement(name = "ExchangeRate")
    protected Double exchangeRate;
    @XmlElement(name = "WriteOffCode")
    @XmlSchemaType(name = "string")
    protected WriteOffCodeDetailsType writeOffCode;
    @XmlElement(name = "WriteOffReason")
    protected String writeOffReason;
    @XmlElement(name = "CardType")
    @XmlSchemaType(name = "string")
    protected CardDetailsType cardType;
    protected String paymentTypeNumber;
    protected String authenticationTxnId;
    protected String membershipNumber;
    @XmlElement(name = "ExpirationMonth")
    protected String expirationMonth;
    @XmlElement(name = "ExpirationYear")
    protected String expirationYear;
    @XmlElement(name = "DccDetailsType")
    protected DccPaymentDetailsType dccDetailsType;
    protected String cvv2Number;
    protected String agentID;
    protected String password;
    protected String validationRequired;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "AuthorisationCode")
    protected String authorisationCode;
    @XmlElement(name = "AuthorisationDate")
    protected String authorisationDate;
    @XmlElement(name = "PaymentCurrency", required = true)
    protected String paymentCurrency;
    @XmlElement(name = "PaymentId")
    protected String paymentId;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "TransactionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTime;
    @XmlElement(name = "TransactionTimeZone")
    protected String transactionTimeZone;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "EmailID")
    protected String emailID;
    @XmlElement(name = "BillingAddress")
    protected BillingAddressType billingAddress;
    @XmlElement(name = "TrackOne")
    protected String trackOne;
    @XmlElement(name = "TrackTwo")
    protected String trackTwo;
    @XmlElement(name = "PaymentDescription")
    protected String paymentDescription;
    @XmlElement(name = "PaymentElementType")
    protected List<PaymentElementDetailsType> paymentElementType;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "ThreeDSecurityDetails")
    protected ThreeDSecurityDtlsType threeDSecurityDetails;
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
    protected AdditionalCreditCardInfoType additionalCreditCardInfo;
    @XmlElement(name = "CashReceiptType")
    protected String cashReceiptType;
    @XmlElement(name = "OriginalAuthDate")
    protected String originalAuthDate;
    @XmlElement(name = "OriginalAuthCode")
    protected String originalAuthCode;
    protected String customerId;
    @XmlElement(name = "ProcReturnCode")
    protected String procReturnCode;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "TransactionKey")
    protected String transactionKey;
    @XmlElement(name = "RequestURL")
    protected String requestURL;
    @XmlElement(name = "RedirectionURL")
    protected String redirectionURL;
    @XmlElement(name = "GatewayName")
    protected String gatewayName;
    protected String localeCountryCode;
    @XmlElement(name = "LandingPage")
    protected String landingPage;
    protected Boolean isPreAuthorized;
    @XmlElement(name = "CartDetailsType")
    protected List<ShopingCartDetailsType> cartDetailsType;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "AccountHolderName")
    protected String accountHolderName;
    @XmlElement(name = "SignedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txnTimeInAgentOfficeTimeZone;
    @XmlElement(name = "CustomerProfileId")
    protected String customerProfileId;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "CustomFieldList")
    protected List<CustomFieldListType> customFieldList;
    @XmlElement(name = "PaymentCode")
    protected String paymentCode;
    @XmlElement(name = "AuthorizationSequenceNumber")
    protected String authorizationSequenceNumber;

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the formOfPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getFormOfPaymentCode() {
        return formOfPaymentCode;
    }

    /**
     * Sets the value of the formOfPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setFormOfPaymentCode(PaymentType value) {
        this.formOfPaymentCode = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     */
    public double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     */
    public void setPaymentAmount(double value) {
        this.paymentAmount = value;
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

    /**
     * Gets the value of the writeOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link WriteOffCodeDetailsType }
     *     
     */
    public WriteOffCodeDetailsType getWriteOffCode() {
        return writeOffCode;
    }

    /**
     * Sets the value of the writeOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteOffCodeDetailsType }
     *     
     */
    public void setWriteOffCode(WriteOffCodeDetailsType value) {
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
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CardDetailsType }
     *     
     */
    public CardDetailsType getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDetailsType }
     *     
     */
    public void setCardType(CardDetailsType value) {
        this.cardType = value;
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
     * Gets the value of the authenticationTxnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTxnId() {
        return authenticationTxnId;
    }

    /**
     * Sets the value of the authenticationTxnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTxnId(String value) {
        this.authenticationTxnId = value;
    }

    /**
     * Gets the value of the membershipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipNumber() {
        return membershipNumber;
    }

    /**
     * Sets the value of the membershipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipNumber(String value) {
        this.membershipNumber = value;
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
     * Gets the value of the dccDetailsType property.
     * 
     * @return
     *     possible object is
     *     {@link DccPaymentDetailsType }
     *     
     */
    public DccPaymentDetailsType getDccDetailsType() {
        return dccDetailsType;
    }

    /**
     * Sets the value of the dccDetailsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DccPaymentDetailsType }
     *     
     */
    public void setDccDetailsType(DccPaymentDetailsType value) {
        this.dccDetailsType = value;
    }

    /**
     * Gets the value of the cvv2Number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv2Number() {
        return cvv2Number;
    }

    /**
     * Sets the value of the cvv2Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv2Number(String value) {
        this.cvv2Number = value;
    }

    /**
     * Gets the value of the agentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * Sets the value of the agentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the validationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationRequired() {
        return validationRequired;
    }

    /**
     * Sets the value of the validationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationRequired(String value) {
        this.validationRequired = value;
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
     * Gets the value of the authorisationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationCode() {
        return authorisationCode;
    }

    /**
     * Sets the value of the authorisationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorisationCode(String value) {
        this.authorisationCode = value;
    }

    /**
     * Gets the value of the authorisationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationDate() {
        return authorisationDate;
    }

    /**
     * Sets the value of the authorisationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorisationDate(String value) {
        this.authorisationDate = value;
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
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the transactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionTime(XMLGregorianCalendar value) {
        this.transactionTime = value;
    }

    /**
     * Gets the value of the transactionTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTimeZone() {
        return transactionTimeZone;
    }

    /**
     * Sets the value of the transactionTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTimeZone(String value) {
        this.transactionTimeZone = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the emailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * Sets the value of the emailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailID(String value) {
        this.emailID = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAddressType }
     *     
     */
    public BillingAddressType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAddressType }
     *     
     */
    public void setBillingAddress(BillingAddressType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the trackOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackOne() {
        return trackOne;
    }

    /**
     * Sets the value of the trackOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackOne(String value) {
        this.trackOne = value;
    }

    /**
     * Gets the value of the trackTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackTwo() {
        return trackTwo;
    }

    /**
     * Sets the value of the trackTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackTwo(String value) {
        this.trackTwo = value;
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
     * Gets the value of the paymentElementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentElementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentElementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentElementDetailsType }
     * 
     * 
     */
    public List<PaymentElementDetailsType> getPaymentElementType() {
        if (paymentElementType == null) {
            paymentElementType = new ArrayList<PaymentElementDetailsType>();
        }
        return this.paymentElementType;
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
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the threeDSecurityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSecurityDtlsType }
     *     
     */
    public ThreeDSecurityDtlsType getThreeDSecurityDetails() {
        return threeDSecurityDetails;
    }

    /**
     * Sets the value of the threeDSecurityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSecurityDtlsType }
     *     
     */
    public void setThreeDSecurityDetails(ThreeDSecurityDtlsType value) {
        this.threeDSecurityDetails = value;
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
     *     {@link AdditionalCreditCardInfoType }
     *     
     */
    public AdditionalCreditCardInfoType getAdditionalCreditCardInfo() {
        return additionalCreditCardInfo;
    }

    /**
     * Sets the value of the additionalCreditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCreditCardInfoType }
     *     
     */
    public void setAdditionalCreditCardInfo(AdditionalCreditCardInfoType value) {
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

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the procReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcReturnCode() {
        return procReturnCode;
    }

    /**
     * Sets the value of the procReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcReturnCode(String value) {
        this.procReturnCode = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the transactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionKey() {
        return transactionKey;
    }

    /**
     * Sets the value of the transactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionKey(String value) {
        this.transactionKey = value;
    }

    /**
     * Gets the value of the requestURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestURL() {
        return requestURL;
    }

    /**
     * Sets the value of the requestURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestURL(String value) {
        this.requestURL = value;
    }

    /**
     * Gets the value of the redirectionURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectionURL() {
        return redirectionURL;
    }

    /**
     * Sets the value of the redirectionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectionURL(String value) {
        this.redirectionURL = value;
    }

    /**
     * Gets the value of the gatewayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayName() {
        return gatewayName;
    }

    /**
     * Sets the value of the gatewayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayName(String value) {
        this.gatewayName = value;
    }

    /**
     * Gets the value of the localeCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleCountryCode() {
        return localeCountryCode;
    }

    /**
     * Sets the value of the localeCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleCountryCode(String value) {
        this.localeCountryCode = value;
    }

    /**
     * Gets the value of the landingPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandingPage() {
        return landingPage;
    }

    /**
     * Sets the value of the landingPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandingPage(String value) {
        this.landingPage = value;
    }

    /**
     * Gets the value of the isPreAuthorized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPreAuthorized() {
        return isPreAuthorized;
    }

    /**
     * Sets the value of the isPreAuthorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPreAuthorized(Boolean value) {
        this.isPreAuthorized = value;
    }

    /**
     * Gets the value of the cartDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShopingCartDetailsType }
     * 
     * 
     */
    public List<ShopingCartDetailsType> getCartDetailsType() {
        if (cartDetailsType == null) {
            cartDetailsType = new ArrayList<ShopingCartDetailsType>();
        }
        return this.cartDetailsType;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the accountHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the value of the accountHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderName(String value) {
        this.accountHolderName = value;
    }

    /**
     * Gets the value of the signedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignedDate() {
        return signedDate;
    }

    /**
     * Sets the value of the signedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignedDate(XMLGregorianCalendar value) {
        this.signedDate = value;
    }

    /**
     * Gets the value of the txnTimeInAgentOfficeTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxnTimeInAgentOfficeTimeZone() {
        return txnTimeInAgentOfficeTimeZone;
    }

    /**
     * Sets the value of the txnTimeInAgentOfficeTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxnTimeInAgentOfficeTimeZone(XMLGregorianCalendar value) {
        this.txnTimeInAgentOfficeTimeZone = value;
    }

    /**
     * Gets the value of the customerProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProfileId() {
        return customerProfileId;
    }

    /**
     * Sets the value of the customerProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProfileId(String value) {
        this.customerProfileId = value;
    }

    /**
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomFieldListType }
     * 
     * 
     */
    public List<CustomFieldListType> getCustomFieldList() {
        if (customFieldList == null) {
            customFieldList = new ArrayList<CustomFieldListType>();
        }
        return this.customFieldList;
    }

    /**
     * Gets the value of the paymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * Sets the value of the paymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCode(String value) {
        this.paymentCode = value;
    }

    /**
     * Gets the value of the authorizationSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationSequenceNumber() {
        return authorizationSequenceNumber;
    }

    /**
     * Sets the value of the authorizationSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationSequenceNumber(String value) {
        this.authorizationSequenceNumber = value;
    }

}
