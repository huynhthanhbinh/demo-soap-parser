
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyContactDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyManagerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyManagerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyAddress" minOccurs="0"/>
 *         &lt;element name="BankAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyAddress" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyAddress" minOccurs="0"/>
 *         &lt;element name="ManagerContactAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyAddress" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsdPhoneCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsdCodeAltPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TollFreeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyContactDetails", propOrder = {
    "agencyManagerFirstName",
    "agencyManagerLastName",
    "managerTitle",
    "locationAddress",
    "bankAddress",
    "mailingAddress",
    "managerContactAddress",
    "website",
    "emailAddress",
    "phoneNumber",
    "isdPhoneCode",
    "altPhoneNumber",
    "isdCodeAltPhone",
    "fax",
    "tollFreeNumber",
    "language",
    "phoneExtensionNumber",
    "alternateEmailAddress"
})
public class AgencyContactDetails {

    @XmlElement(name = "AgencyManagerFirstName")
    protected String agencyManagerFirstName;
    @XmlElement(name = "AgencyManagerLastName")
    protected String agencyManagerLastName;
    @XmlElement(name = "ManagerTitle")
    protected String managerTitle;
    @XmlElement(name = "LocationAddress")
    protected AgencyAddress locationAddress;
    @XmlElement(name = "BankAddress")
    protected AgencyAddress bankAddress;
    @XmlElement(name = "MailingAddress")
    protected AgencyAddress mailingAddress;
    @XmlElement(name = "ManagerContactAddress")
    protected AgencyAddress managerContactAddress;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "IsdPhoneCode")
    protected String isdPhoneCode;
    @XmlElement(name = "AltPhoneNumber")
    protected String altPhoneNumber;
    @XmlElement(name = "IsdCodeAltPhone")
    protected String isdCodeAltPhone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "TollFreeNumber")
    protected String tollFreeNumber;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "PhoneExtensionNumber")
    protected String phoneExtensionNumber;
    @XmlElement(name = "AlternateEmailAddress")
    protected String alternateEmailAddress;

    /**
     * Gets the value of the agencyManagerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyManagerFirstName() {
        return agencyManagerFirstName;
    }

    /**
     * Sets the value of the agencyManagerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyManagerFirstName(String value) {
        this.agencyManagerFirstName = value;
    }

    /**
     * Gets the value of the agencyManagerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyManagerLastName() {
        return agencyManagerLastName;
    }

    /**
     * Sets the value of the agencyManagerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyManagerLastName(String value) {
        this.agencyManagerLastName = value;
    }

    /**
     * Gets the value of the managerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerTitle() {
        return managerTitle;
    }

    /**
     * Sets the value of the managerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerTitle(String value) {
        this.managerTitle = value;
    }

    /**
     * Gets the value of the locationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyAddress }
     *     
     */
    public AgencyAddress getLocationAddress() {
        return locationAddress;
    }

    /**
     * Sets the value of the locationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyAddress }
     *     
     */
    public void setLocationAddress(AgencyAddress value) {
        this.locationAddress = value;
    }

    /**
     * Gets the value of the bankAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyAddress }
     *     
     */
    public AgencyAddress getBankAddress() {
        return bankAddress;
    }

    /**
     * Sets the value of the bankAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyAddress }
     *     
     */
    public void setBankAddress(AgencyAddress value) {
        this.bankAddress = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyAddress }
     *     
     */
    public AgencyAddress getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyAddress }
     *     
     */
    public void setMailingAddress(AgencyAddress value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the managerContactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyAddress }
     *     
     */
    public AgencyAddress getManagerContactAddress() {
        return managerContactAddress;
    }

    /**
     * Sets the value of the managerContactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyAddress }
     *     
     */
    public void setManagerContactAddress(AgencyAddress value) {
        this.managerContactAddress = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
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
     * Gets the value of the isdPhoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdPhoneCode() {
        return isdPhoneCode;
    }

    /**
     * Sets the value of the isdPhoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdPhoneCode(String value) {
        this.isdPhoneCode = value;
    }

    /**
     * Gets the value of the altPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhoneNumber() {
        return altPhoneNumber;
    }

    /**
     * Sets the value of the altPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhoneNumber(String value) {
        this.altPhoneNumber = value;
    }

    /**
     * Gets the value of the isdCodeAltPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdCodeAltPhone() {
        return isdCodeAltPhone;
    }

    /**
     * Sets the value of the isdCodeAltPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdCodeAltPhone(String value) {
        this.isdCodeAltPhone = value;
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
     * Gets the value of the tollFreeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeNumber() {
        return tollFreeNumber;
    }

    /**
     * Sets the value of the tollFreeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeNumber(String value) {
        this.tollFreeNumber = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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
     * Gets the value of the alternateEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateEmailAddress() {
        return alternateEmailAddress;
    }

    /**
     * Sets the value of the alternateEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateEmailAddress(String value) {
        this.alternateEmailAddress = value;
    }

}
