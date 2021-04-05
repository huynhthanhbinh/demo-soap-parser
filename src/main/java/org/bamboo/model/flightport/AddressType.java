
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternatePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendItineraryToEmailId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendItineraryToPreferredEmailId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferredEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendItineraryToSMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DestinationPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendItineraryToDestSMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltPhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmartPhoneMailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmartPhoneSendItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressType",
    "address1",
    "address2",
    "address3",
    "city",
    "province",
    "countryName",
    "zipCode",
    "phoneNumber",
    "phoneExtensionNumber",
    "alternatePhoneNumber",
    "alternateExtensionNumber",
    "faxNumber",
    "emailAddress",
    "sendItineraryToEmailId",
    "sendItineraryToPreferredEmailId",
    "preferredEmailAddress",
    "cellNumber",
    "sendItineraryToSMS",
    "destinationPhone",
    "sendItineraryToDestSMS",
    "businessPhoneExtension",
    "preferredLanguage",
    "phoneNumberCountryCode",
    "altPhoneNumberCountryCode",
    "cellNumberCountryCode",
    "smartPhoneMailId",
    "smartPhoneSendItinerary"
})
public class AddressType {

    @XmlElement(name = "AddressType")
    protected String addressType;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "PhoneExtensionNumber")
    protected String phoneExtensionNumber;
    @XmlElement(name = "AlternatePhoneNumber")
    protected String alternatePhoneNumber;
    @XmlElement(name = "AlternateExtensionNumber")
    protected String alternateExtensionNumber;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "SendItineraryToEmailId")
    protected Boolean sendItineraryToEmailId;
    @XmlElement(name = "SendItineraryToPreferredEmailId")
    protected Boolean sendItineraryToPreferredEmailId;
    @XmlElement(name = "PreferredEmailAddress")
    protected String preferredEmailAddress;
    @XmlElement(name = "CellNumber")
    protected String cellNumber;
    @XmlElement(name = "SendItineraryToSMS")
    protected Boolean sendItineraryToSMS;
    @XmlElement(name = "DestinationPhone")
    protected String destinationPhone;
    @XmlElement(name = "SendItineraryToDestSMS")
    protected Boolean sendItineraryToDestSMS;
    @XmlElement(name = "BusinessPhoneExtension")
    protected String businessPhoneExtension;
    @XmlElement(name = "PreferredLanguage")
    protected String preferredLanguage;
    @XmlElement(name = "PhoneNumberCountryCode")
    protected String phoneNumberCountryCode;
    @XmlElement(name = "AltPhoneNumberCountryCode")
    protected String altPhoneNumberCountryCode;
    @XmlElement(name = "CellNumberCountryCode")
    protected String cellNumberCountryCode;
    @XmlElement(name = "SmartPhoneMailId")
    protected String smartPhoneMailId;
    @XmlElement(name = "SmartPhoneSendItinerary")
    protected Boolean smartPhoneSendItinerary;

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
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
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
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
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
     * Gets the value of the phoneExtensionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExtensionNumber() {
        return phoneExtensionNumber;
    }

    /**
     * Sets the value of the phoneExtensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExtensionNumber(String value) {
        this.phoneExtensionNumber = value;
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
     * Gets the value of the alternateExtensionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateExtensionNumber() {
        return alternateExtensionNumber;
    }

    /**
     * Sets the value of the alternateExtensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateExtensionNumber(String value) {
        this.alternateExtensionNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
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
     * Gets the value of the sendItineraryToPreferredEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendItineraryToPreferredEmailId() {
        return sendItineraryToPreferredEmailId;
    }

    /**
     * Sets the value of the sendItineraryToPreferredEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendItineraryToPreferredEmailId(Boolean value) {
        this.sendItineraryToPreferredEmailId = value;
    }

    /**
     * Gets the value of the preferredEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredEmailAddress() {
        return preferredEmailAddress;
    }

    /**
     * Sets the value of the preferredEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredEmailAddress(String value) {
        this.preferredEmailAddress = value;
    }

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellNumber(String value) {
        this.cellNumber = value;
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

    /**
     * Gets the value of the destinationPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPhone() {
        return destinationPhone;
    }

    /**
     * Sets the value of the destinationPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPhone(String value) {
        this.destinationPhone = value;
    }

    /**
     * Gets the value of the sendItineraryToDestSMS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendItineraryToDestSMS() {
        return sendItineraryToDestSMS;
    }

    /**
     * Sets the value of the sendItineraryToDestSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendItineraryToDestSMS(Boolean value) {
        this.sendItineraryToDestSMS = value;
    }

    /**
     * Gets the value of the businessPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPhoneExtension() {
        return businessPhoneExtension;
    }

    /**
     * Sets the value of the businessPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPhoneExtension(String value) {
        this.businessPhoneExtension = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguage(String value) {
        this.preferredLanguage = value;
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
     * Gets the value of the altPhoneNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhoneNumberCountryCode() {
        return altPhoneNumberCountryCode;
    }

    /**
     * Sets the value of the altPhoneNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhoneNumberCountryCode(String value) {
        this.altPhoneNumberCountryCode = value;
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

}
