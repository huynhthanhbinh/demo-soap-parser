
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnrContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamePrefix" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameTitle_Type" minOccurs="0"/>
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyContactRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.ibsplc.com/iRes/simpleTypes/}AddressType"/>
 *         &lt;element name="ItineraryReceivingMode" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryReceivingType" minOccurs="0"/>
 *         &lt;element name="ContactType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ContactDetails_Type" minOccurs="0"/>
 *         &lt;element name="IsPrefferedContact" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PrefferedLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrContactType", propOrder = {
    "namePrefix",
    "givenName",
    "localGivenName",
    "middleName",
    "surName",
    "localSurName",
    "guestId",
    "emergencyContactRelation",
    "address",
    "itineraryReceivingMode",
    "contactType",
    "isPrefferedContact",
    "prefferedLanguage"
})
public class PnrContactType {

    @XmlElement(name = "NamePrefix")
    @XmlSchemaType(name = "string")
    protected NameTitleType namePrefix;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "LocalGivenName")
    protected String localGivenName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "SurName")
    protected String surName;
    @XmlElement(name = "LocalSurName")
    protected String localSurName;
    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "EmergencyContactRelation")
    protected String emergencyContactRelation;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "ItineraryReceivingMode")
    @XmlSchemaType(name = "string")
    protected ItineraryReceivingType itineraryReceivingMode;
    @XmlElement(name = "ContactType")
    @XmlSchemaType(name = "string")
    protected ContactDetailsType contactType;
    @XmlElement(name = "IsPrefferedContact")
    protected boolean isPrefferedContact;
    @XmlElement(name = "PrefferedLanguage")
    protected String prefferedLanguage;

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link NameTitleType }
     *     
     */
    public NameTitleType getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTitleType }
     *     
     */
    public void setNamePrefix(NameTitleType value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the localGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalGivenName() {
        return localGivenName;
    }

    /**
     * Sets the value of the localGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalGivenName(String value) {
        this.localGivenName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the surName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Sets the value of the surName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurName(String value) {
        this.surName = value;
    }

    /**
     * Gets the value of the localSurName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSurName() {
        return localSurName;
    }

    /**
     * Sets the value of the localSurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSurName(String value) {
        this.localSurName = value;
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
     * Gets the value of the emergencyContactRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    /**
     * Sets the value of the emergencyContactRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactRelation(String value) {
        this.emergencyContactRelation = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the itineraryReceivingMode property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryReceivingType }
     *     
     */
    public ItineraryReceivingType getItineraryReceivingMode() {
        return itineraryReceivingMode;
    }

    /**
     * Sets the value of the itineraryReceivingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryReceivingType }
     *     
     */
    public void setItineraryReceivingMode(ItineraryReceivingType value) {
        this.itineraryReceivingMode = value;
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetailsType }
     *     
     */
    public ContactDetailsType getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetailsType }
     *     
     */
    public void setContactType(ContactDetailsType value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the isPrefferedContact property.
     * 
     */
    public boolean isIsPrefferedContact() {
        return isPrefferedContact;
    }

    /**
     * Sets the value of the isPrefferedContact property.
     * 
     */
    public void setIsPrefferedContact(boolean value) {
        this.isPrefferedContact = value;
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

}
