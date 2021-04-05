
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
 * <p>Java class for CustomerLoyaltyDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerLoyaltyDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromoTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoyaltyReferer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightFrequencyDomestic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightFrequencyInternational" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoOfTripsDomestic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoOfTripsInternational" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MostCommonDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}InterestDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountLockStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}AccountLockStatus" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActivateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LoginCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoginFailCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AllowMarketing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowSurvey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AustralianTaxResident" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LoginPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerLoyaltyDetails", propOrder = {
    "pin",
    "securityQuestion",
    "securityAnswer",
    "currencyCode",
    "activationCode",
    "statementType",
    "promoTrackingNumber",
    "loyaltyReferer",
    "flightFrequencyDomestic",
    "flightFrequencyInternational",
    "noOfTripsDomestic",
    "noOfTripsInternational",
    "mostCommonDestination",
    "interestDetails",
    "creditPassword",
    "accountLockStatus",
    "createDate",
    "activateDate",
    "updateDate",
    "lastLoginDate",
    "loginCount",
    "loginFailCount",
    "allowMarketing",
    "allowSurvey",
    "australianTaxResident",
    "loginPassword",
    "countryOfResidence"
})
public class CustomerLoyaltyDetails {

    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "SecurityQuestion")
    protected String securityQuestion;
    @XmlElement(name = "SecurityAnswer")
    protected String securityAnswer;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "ActivationCode")
    protected String activationCode;
    @XmlElement(name = "StatementType")
    protected String statementType;
    @XmlElement(name = "PromoTrackingNumber")
    protected String promoTrackingNumber;
    @XmlElement(name = "LoyaltyReferer")
    protected String loyaltyReferer;
    @XmlElement(name = "FlightFrequencyDomestic")
    protected Integer flightFrequencyDomestic;
    @XmlElement(name = "FlightFrequencyInternational")
    protected Integer flightFrequencyInternational;
    @XmlElement(name = "NoOfTripsDomestic")
    protected Integer noOfTripsDomestic;
    @XmlElement(name = "NoOfTripsInternational")
    protected Integer noOfTripsInternational;
    @XmlElement(name = "MostCommonDestination")
    protected String mostCommonDestination;
    @XmlElement(name = "InterestDetails")
    protected List<InterestDetails> interestDetails;
    @XmlElement(name = "CreditPassword")
    protected String creditPassword;
    @XmlElement(name = "AccountLockStatus")
    @XmlSchemaType(name = "string")
    protected AccountLockStatus accountLockStatus;
    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "ActivateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activateDate;
    @XmlElement(name = "UpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(name = "LastLoginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginDate;
    @XmlElement(name = "LoginCount")
    protected Integer loginCount;
    @XmlElement(name = "LoginFailCount")
    protected Integer loginFailCount;
    @XmlElement(name = "AllowMarketing")
    protected Boolean allowMarketing;
    @XmlElement(name = "AllowSurvey")
    protected Boolean allowSurvey;
    @XmlElement(name = "AustralianTaxResident")
    protected Boolean australianTaxResident;
    @XmlElement(name = "LoginPassword")
    protected String loginPassword;
    @XmlElement(name = "CountryOfResidence")
    protected String countryOfResidence;

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the securityQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    /**
     * Sets the value of the securityQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityQuestion(String value) {
        this.securityQuestion = value;
    }

    /**
     * Gets the value of the securityAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityAnswer() {
        return securityAnswer;
    }

    /**
     * Sets the value of the securityAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityAnswer(String value) {
        this.securityAnswer = value;
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
     * Gets the value of the activationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * Sets the value of the activationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationCode(String value) {
        this.activationCode = value;
    }

    /**
     * Gets the value of the statementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementType() {
        return statementType;
    }

    /**
     * Sets the value of the statementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementType(String value) {
        this.statementType = value;
    }

    /**
     * Gets the value of the promoTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoTrackingNumber() {
        return promoTrackingNumber;
    }

    /**
     * Sets the value of the promoTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoTrackingNumber(String value) {
        this.promoTrackingNumber = value;
    }

    /**
     * Gets the value of the loyaltyReferer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyReferer() {
        return loyaltyReferer;
    }

    /**
     * Sets the value of the loyaltyReferer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyReferer(String value) {
        this.loyaltyReferer = value;
    }

    /**
     * Gets the value of the flightFrequencyDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightFrequencyDomestic() {
        return flightFrequencyDomestic;
    }

    /**
     * Sets the value of the flightFrequencyDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightFrequencyDomestic(Integer value) {
        this.flightFrequencyDomestic = value;
    }

    /**
     * Gets the value of the flightFrequencyInternational property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightFrequencyInternational() {
        return flightFrequencyInternational;
    }

    /**
     * Sets the value of the flightFrequencyInternational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightFrequencyInternational(Integer value) {
        this.flightFrequencyInternational = value;
    }

    /**
     * Gets the value of the noOfTripsDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfTripsDomestic() {
        return noOfTripsDomestic;
    }

    /**
     * Sets the value of the noOfTripsDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfTripsDomestic(Integer value) {
        this.noOfTripsDomestic = value;
    }

    /**
     * Gets the value of the noOfTripsInternational property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfTripsInternational() {
        return noOfTripsInternational;
    }

    /**
     * Sets the value of the noOfTripsInternational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfTripsInternational(Integer value) {
        this.noOfTripsInternational = value;
    }

    /**
     * Gets the value of the mostCommonDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMostCommonDestination() {
        return mostCommonDestination;
    }

    /**
     * Sets the value of the mostCommonDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMostCommonDestination(String value) {
        this.mostCommonDestination = value;
    }

    /**
     * Gets the value of the interestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestDetails }
     * 
     * 
     */
    public List<InterestDetails> getInterestDetails() {
        if (interestDetails == null) {
            interestDetails = new ArrayList<InterestDetails>();
        }
        return this.interestDetails;
    }

    /**
     * Gets the value of the creditPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditPassword() {
        return creditPassword;
    }

    /**
     * Sets the value of the creditPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditPassword(String value) {
        this.creditPassword = value;
    }

    /**
     * Gets the value of the accountLockStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLockStatus }
     *     
     */
    public AccountLockStatus getAccountLockStatus() {
        return accountLockStatus;
    }

    /**
     * Sets the value of the accountLockStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLockStatus }
     *     
     */
    public void setAccountLockStatus(AccountLockStatus value) {
        this.accountLockStatus = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the activateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivateDate() {
        return activateDate;
    }

    /**
     * Sets the value of the activateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivateDate(XMLGregorianCalendar value) {
        this.activateDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the lastLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Sets the value of the lastLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginDate(XMLGregorianCalendar value) {
        this.lastLoginDate = value;
    }

    /**
     * Gets the value of the loginCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * Sets the value of the loginCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginCount(Integer value) {
        this.loginCount = value;
    }

    /**
     * Gets the value of the loginFailCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginFailCount() {
        return loginFailCount;
    }

    /**
     * Sets the value of the loginFailCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginFailCount(Integer value) {
        this.loginFailCount = value;
    }

    /**
     * Gets the value of the allowMarketing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMarketing() {
        return allowMarketing;
    }

    /**
     * Sets the value of the allowMarketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMarketing(Boolean value) {
        this.allowMarketing = value;
    }

    /**
     * Gets the value of the allowSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowSurvey() {
        return allowSurvey;
    }

    /**
     * Sets the value of the allowSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowSurvey(Boolean value) {
        this.allowSurvey = value;
    }

    /**
     * Gets the value of the australianTaxResident property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAustralianTaxResident() {
        return australianTaxResident;
    }

    /**
     * Sets the value of the australianTaxResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAustralianTaxResident(Boolean value) {
        this.australianTaxResident = value;
    }

    /**
     * Gets the value of the loginPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * Sets the value of the loginPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginPassword(String value) {
        this.loginPassword = value;
    }

    /**
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

}
