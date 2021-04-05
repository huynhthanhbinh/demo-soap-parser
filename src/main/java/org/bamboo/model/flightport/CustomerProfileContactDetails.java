
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProfileContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileContactDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrefferedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellphoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternatePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendItineraryToEmailId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AlternateEmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendItineraryToAltEmailId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessPhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternatePhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmartPhoneMailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmartPhoneSendItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProfileGuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendItineraryToSMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileContactDetails", propOrder = {
    "addressType",
    "prefferedIndicator",
    "phoneNumber",
    "cellphoneNumber",
    "businessPhoneNumber",
    "alternatePhoneNumber",
    "extensionNumber",
    "mailingAddress",
    "addressOne",
    "addressTwo",
    "province",
    "zipCode",
    "city",
    "country",
    "fax",
    "emailId",
    "sendItineraryToEmailId",
    "alternateEmailId",
    "sendItineraryToAltEmailId",
    "phoneNumberCountryCode",
    "businessPhoneNumberCountryCode",
    "cellNumberCountryCode",
    "alternatePhoneNumberCountryCode",
    "smartPhoneMailId",
    "smartPhoneSendItinerary",
    "profileGuestId",
    "sendItineraryToSMS"
})
public class CustomerProfileContactDetails {

    @XmlElement(name = "AddressType", required = true)
    protected String addressType;
    @XmlElement(name = "PrefferedIndicator")
    protected boolean prefferedIndicator;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "CellphoneNumber")
    protected String cellphoneNumber;
    @XmlElement(name = "BusinessPhoneNumber")
    protected String businessPhoneNumber;
    @XmlElement(name = "AlternatePhoneNumber")
    protected String alternatePhoneNumber;
    @XmlElement(name = "ExtensionNumber")
    protected String extensionNumber;
    @XmlElement(name = "MailingAddress")
    protected String mailingAddress;
    @XmlElement(name = "AddressOne")
    protected String addressOne;
    @XmlElement(name = "AddressTwo")
    protected String addressTwo;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "EmailId")
    protected String emailId;
    @XmlElement(name = "SendItineraryToEmailId")
    protected Boolean sendItineraryToEmailId;
    @XmlElement(name = "AlternateEmailId")
    protected String alternateEmailId;
    @XmlElement(name = "SendItineraryToAltEmailId")
    protected Boolean sendItineraryToAltEmailId;
    @XmlElement(name = "PhoneNumberCountryCode")
    protected String phoneNumberCountryCode;
    @XmlElement(name = "BusinessPhoneNumberCountryCode")
    protected String businessPhoneNumberCountryCode;
    @XmlElement(name = "CellNumberCountryCode")
    protected String cellNumberCountryCode;
    @XmlElement(name = "AlternatePhoneNumberCountryCode")
    protected String alternatePhoneNumberCountryCode;
    @XmlElement(name = "SmartPhoneMailId")
    protected String smartPhoneMailId;
    @XmlElement(name = "SmartPhoneSendItinerary")
    protected Boolean smartPhoneSendItinerary;
    @XmlElement(name = "ProfileGuestId")
    protected String profileGuestId;
    @XmlElement(name = "SendItineraryToSMS")
    protected Boolean sendItineraryToSMS;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the prefferedIndicator property.
     * 
     */
    public boolean isPrefferedIndicator() {
        return prefferedIndicator;
    }

    /**
     * Sets the value of the prefferedIndicator property.
     * 
     */
    public void setPrefferedIndicator(boolean value) {
        this.prefferedIndicator = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the cellphoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    /**
     * Sets the value of the cellphoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellphoneNumber(String value) {
        this.cellphoneNumber = value;
    }

    /**
     * Gets the value of the businessPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    /**
     * Sets the value of the businessPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPhoneNumber(String value) {
        this.businessPhoneNumber = value;
    }

    /**
     * Gets the value of the alternatePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePhoneNumber() {
        return alternatePhoneNumber;
    }

    /**
     * Sets the value of the alternatePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePhoneNumber(String value) {
        this.alternatePhoneNumber = value;
    }

    /**
     * Gets the value of the extensionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * Sets the value of the extensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionNumber(String value) {
        this.extensionNumber = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingAddress(String value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the addressOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOne() {
        return addressOne;
    }

    /**
     * Sets the value of the addressOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOne(String value) {
        this.addressOne = value;
    }

    /**
     * Gets the value of the addressTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTwo() {
        return addressTwo;
    }

    /**
     * Sets the value of the addressTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTwo(String value) {
        this.addressTwo = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the sendItineraryToEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendItineraryToEmailId() {
        return sendItineraryToEmailId;
    }

    /**
     * Sets the value of the sendItineraryToEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendItineraryToEmailId(Boolean value) {
        this.sendItineraryToEmailId = value;
    }

    /**
     * Gets the value of the alternateEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateEmailId() {
        return alternateEmailId;
    }

    /**
     * Sets the value of the alternateEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateEmailId(String value) {
        this.alternateEmailId = value;
    }

    /**
     * Gets the value of the sendItineraryToAltEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendItineraryToAltEmailId() {
        return sendItineraryToAltEmailId;
    }

    /**
     * Sets the value of the sendItineraryToAltEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendItineraryToAltEmailId(Boolean value) {
        this.sendItineraryToAltEmailId = value;
    }

    /**
     * Gets the value of the phoneNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberCountryCode() {
        return phoneNumberCountryCode;
    }

    /**
     * Sets the value of the phoneNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberCountryCode(String value) {
        this.phoneNumberCountryCode = value;
    }

    /**
     * Gets the value of the businessPhoneNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPhoneNumberCountryCode() {
        return businessPhoneNumberCountryCode;
    }

    /**
     * Sets the value of the businessPhoneNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPhoneNumberCountryCode(String value) {
        this.businessPhoneNumberCountryCode = value;
    }

    /**
     * Gets the value of the cellNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellNumberCountryCode() {
        return cellNumberCountryCode;
    }

    /**
     * Sets the value of the cellNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellNumberCountryCode(String value) {
        this.cellNumberCountryCode = value;
    }

    /**
     * Gets the value of the alternatePhoneNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePhoneNumberCountryCode() {
        return alternatePhoneNumberCountryCode;
    }

    /**
     * Sets the value of the alternatePhoneNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePhoneNumberCountryCode(String value) {
        this.alternatePhoneNumberCountryCode = value;
    }

    /**
     * Gets the value of the smartPhoneMailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartPhoneMailId() {
        return smartPhoneMailId;
    }

    /**
     * Sets the value of the smartPhoneMailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartPhoneMailId(String value) {
        this.smartPhoneMailId = value;
    }

    /**
     * Gets the value of the smartPhoneSendItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmartPhoneSendItinerary() {
        return smartPhoneSendItinerary;
    }

    /**
     * Sets the value of the smartPhoneSendItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmartPhoneSendItinerary(Boolean value) {
        this.smartPhoneSendItinerary = value;
    }

    /**
     * Gets the value of the profileGuestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileGuestId() {
        return profileGuestId;
    }

    /**
     * Sets the value of the profileGuestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileGuestId(String value) {
        this.profileGuestId = value;
    }

    /**
     * Gets the value of the sendItineraryToSMS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendItineraryToSMS() {
        return sendItineraryToSMS;
    }

    /**
     * Sets the value of the sendItineraryToSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendItineraryToSMS(Boolean value) {
        this.sendItineraryToSMS = value;
    }

}
