
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInfoPaxManifest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoPaxManifest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ContactType" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltCellPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltEmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellPhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltCellPhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendSmsNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendEmailNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrefferedLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameinMailingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumberExtn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltCellPhoneNumberExtn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoPaxManifest", propOrder = {
    "contactType",
    "phoneNumber",
    "cellPhoneNumber",
    "altCellPhoneNumber",
    "faxNumber",
    "emailID",
    "altEmailID",
    "guestId",
    "phoneNumberCountryCode",
    "cellPhoneNumberCountryCode",
    "altCellPhoneNumberCountryCode",
    "sendSmsNotification",
    "sendEmailNotification",
    "prefferedLanguage",
    "nameinMailingAddress",
    "phoneNumberExtn",
    "altCellPhoneNumberExtn"
})
public class ContactInfoPaxManifest {

    @XmlElement(name = "ContactType")
    @XmlSchemaType(name = "string")
    protected ContactType contactType;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "CellPhoneNumber")
    protected String cellPhoneNumber;
    @XmlElement(name = "AltCellPhoneNumber")
    protected String altCellPhoneNumber;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "EmailID")
    protected String emailID;
    @XmlElement(name = "AltEmailID")
    protected String altEmailID;
    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "PhoneNumberCountryCode")
    protected String phoneNumberCountryCode;
    @XmlElement(name = "CellPhoneNumberCountryCode")
    protected String cellPhoneNumberCountryCode;
    @XmlElement(name = "AltCellPhoneNumberCountryCode")
    protected String altCellPhoneNumberCountryCode;
    @XmlElement(name = "SendSmsNotification")
    protected Boolean sendSmsNotification;
    @XmlElement(name = "SendEmailNotification")
    protected Boolean sendEmailNotification;
    @XmlElement(name = "PrefferedLanguage")
    protected String prefferedLanguage;
    @XmlElement(name = "NameinMailingAddress")
    protected String nameinMailingAddress;
    @XmlElement(name = "PhoneNumberExtn")
    protected String phoneNumberExtn;
    @XmlElement(name = "AltCellPhoneNumberExtn")
    protected String altCellPhoneNumberExtn;

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContactType(ContactType value) {
        this.contactType = value;
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
     * Gets the value of the cellPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Sets the value of the cellPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumber(String value) {
        this.cellPhoneNumber = value;
    }

    /**
     * Gets the value of the altCellPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCellPhoneNumber() {
        return altCellPhoneNumber;
    }

    /**
     * Sets the value of the altCellPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCellPhoneNumber(String value) {
        this.altCellPhoneNumber = value;
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
     * Gets the value of the altEmailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltEmailID() {
        return altEmailID;
    }

    /**
     * Sets the value of the altEmailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltEmailID(String value) {
        this.altEmailID = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestId(String value) {
        this.guestId = value;
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
     * Gets the value of the cellPhoneNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumberCountryCode() {
        return cellPhoneNumberCountryCode;
    }

    /**
     * Sets the value of the cellPhoneNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumberCountryCode(String value) {
        this.cellPhoneNumberCountryCode = value;
    }

    /**
     * Gets the value of the altCellPhoneNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCellPhoneNumberCountryCode() {
        return altCellPhoneNumberCountryCode;
    }

    /**
     * Sets the value of the altCellPhoneNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCellPhoneNumberCountryCode(String value) {
        this.altCellPhoneNumberCountryCode = value;
    }

    /**
     * Gets the value of the sendSmsNotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendSmsNotification() {
        return sendSmsNotification;
    }

    /**
     * Sets the value of the sendSmsNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendSmsNotification(Boolean value) {
        this.sendSmsNotification = value;
    }

    /**
     * Gets the value of the sendEmailNotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmailNotification() {
        return sendEmailNotification;
    }

    /**
     * Sets the value of the sendEmailNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmailNotification(Boolean value) {
        this.sendEmailNotification = value;
    }

    /**
     * Gets the value of the prefferedLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefferedLanguage() {
        return prefferedLanguage;
    }

    /**
     * Sets the value of the prefferedLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefferedLanguage(String value) {
        this.prefferedLanguage = value;
    }

    /**
     * Gets the value of the nameinMailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameinMailingAddress() {
        return nameinMailingAddress;
    }

    /**
     * Sets the value of the nameinMailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameinMailingAddress(String value) {
        this.nameinMailingAddress = value;
    }

    /**
     * Gets the value of the phoneNumberExtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberExtn() {
        return phoneNumberExtn;
    }

    /**
     * Sets the value of the phoneNumberExtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberExtn(String value) {
        this.phoneNumberExtn = value;
    }

    /**
     * Gets the value of the altCellPhoneNumberExtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCellPhoneNumberExtn() {
        return altCellPhoneNumberExtn;
    }

    /**
     * Sets the value of the altCellPhoneNumberExtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCellPhoneNumberExtn(String value) {
        this.altCellPhoneNumberExtn = value;
    }

}
