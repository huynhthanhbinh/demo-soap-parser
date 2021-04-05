
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
 * <p>Java class for ViewCustomerProfileDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewCustomerProfileDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupLeaderFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupLeaderLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}LoginDetails" minOccurs="0"/>
 *         &lt;element name="SecurityInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SecurityInfoType" minOccurs="0"/>
 *         &lt;element name="GuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HomeContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileContactDetails" minOccurs="0"/>
 *         &lt;element name="BusinessContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileContactDetails" minOccurs="0"/>
 *         &lt;element name="AlternateContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileContactDetails" minOccurs="0"/>
 *         &lt;element name="LocalLanguageContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileContactDetails" minOccurs="0"/>
 *         &lt;element name="PaxSpecificContacts" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileContactDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ViewMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeWaiveOrOverrideDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeWaiveOrOverrideDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastSyncTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewCustomerProfileDetails", propOrder = {
    "profileAlias",
    "groupName",
    "groupType",
    "groupLeaderFirstName",
    "groupLeaderLastName",
    "profileType",
    "loginDetails",
    "securityInfo",
    "guestDetails",
    "homeContact",
    "businessContact",
    "alternateContact",
    "localLanguageContact",
    "paxSpecificContacts",
    "viewMode",
    "feeWaiveOrOverrideDetails",
    "externalProfileID",
    "lastSyncTime",
    "errorType"
})
public class ViewCustomerProfileDetails {

    @XmlElement(name = "ProfileAlias")
    protected String profileAlias;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "GroupType")
    protected String groupType;
    @XmlElement(name = "GroupLeaderFirstName")
    protected String groupLeaderFirstName;
    @XmlElement(name = "GroupLeaderLastName")
    protected String groupLeaderLastName;
    @XmlElement(name = "ProfileType")
    protected String profileType;
    @XmlElement(name = "LoginDetails")
    protected LoginDetails loginDetails;
    @XmlElement(name = "SecurityInfo")
    protected SecurityInfoType securityInfo;
    @XmlElement(name = "GuestDetails")
    protected List<GuestDetails> guestDetails;
    @XmlElement(name = "HomeContact")
    protected CustomerProfileContactDetails homeContact;
    @XmlElement(name = "BusinessContact")
    protected CustomerProfileContactDetails businessContact;
    @XmlElement(name = "AlternateContact")
    protected CustomerProfileContactDetails alternateContact;
    @XmlElement(name = "LocalLanguageContact")
    protected CustomerProfileContactDetails localLanguageContact;
    @XmlElement(name = "PaxSpecificContacts")
    protected List<CustomerProfileContactDetails> paxSpecificContacts;
    @XmlElement(name = "ViewMode")
    protected String viewMode;
    @XmlElement(name = "FeeWaiveOrOverrideDetails")
    protected List<FeeWaiveOrOverrideDetails> feeWaiveOrOverrideDetails;
    @XmlElement(name = "ExternalProfileID")
    protected String externalProfileID;
    @XmlElement(name = "LastSyncTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSyncTime;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

    /**
     * Gets the value of the profileAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileAlias() {
        return profileAlias;
    }

    /**
     * Sets the value of the profileAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileAlias(String value) {
        this.profileAlias = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the groupLeaderFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLeaderFirstName() {
        return groupLeaderFirstName;
    }

    /**
     * Sets the value of the groupLeaderFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLeaderFirstName(String value) {
        this.groupLeaderFirstName = value;
    }

    /**
     * Gets the value of the groupLeaderLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLeaderLastName() {
        return groupLeaderLastName;
    }

    /**
     * Sets the value of the groupLeaderLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLeaderLastName(String value) {
        this.groupLeaderLastName = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * Gets the value of the loginDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LoginDetails }
     *     
     */
    public LoginDetails getLoginDetails() {
        return loginDetails;
    }

    /**
     * Sets the value of the loginDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginDetails }
     *     
     */
    public void setLoginDetails(LoginDetails value) {
        this.loginDetails = value;
    }

    /**
     * Gets the value of the securityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInfoType }
     *     
     */
    public SecurityInfoType getSecurityInfo() {
        return securityInfo;
    }

    /**
     * Sets the value of the securityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInfoType }
     *     
     */
    public void setSecurityInfo(SecurityInfoType value) {
        this.securityInfo = value;
    }

    /**
     * Gets the value of the guestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestDetails }
     * 
     * 
     */
    public List<GuestDetails> getGuestDetails() {
        if (guestDetails == null) {
            guestDetails = new ArrayList<GuestDetails>();
        }
        return this.guestDetails;
    }

    /**
     * Gets the value of the homeContact property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public CustomerProfileContactDetails getHomeContact() {
        return homeContact;
    }

    /**
     * Sets the value of the homeContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public void setHomeContact(CustomerProfileContactDetails value) {
        this.homeContact = value;
    }

    /**
     * Gets the value of the businessContact property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public CustomerProfileContactDetails getBusinessContact() {
        return businessContact;
    }

    /**
     * Sets the value of the businessContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public void setBusinessContact(CustomerProfileContactDetails value) {
        this.businessContact = value;
    }

    /**
     * Gets the value of the alternateContact property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public CustomerProfileContactDetails getAlternateContact() {
        return alternateContact;
    }

    /**
     * Sets the value of the alternateContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public void setAlternateContact(CustomerProfileContactDetails value) {
        this.alternateContact = value;
    }

    /**
     * Gets the value of the localLanguageContact property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public CustomerProfileContactDetails getLocalLanguageContact() {
        return localLanguageContact;
    }

    /**
     * Sets the value of the localLanguageContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public void setLocalLanguageContact(CustomerProfileContactDetails value) {
        this.localLanguageContact = value;
    }

    /**
     * Gets the value of the paxSpecificContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSpecificContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSpecificContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProfileContactDetails }
     * 
     * 
     */
    public List<CustomerProfileContactDetails> getPaxSpecificContacts() {
        if (paxSpecificContacts == null) {
            paxSpecificContacts = new ArrayList<CustomerProfileContactDetails>();
        }
        return this.paxSpecificContacts;
    }

    /**
     * Gets the value of the viewMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewMode() {
        return viewMode;
    }

    /**
     * Sets the value of the viewMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewMode(String value) {
        this.viewMode = value;
    }

    /**
     * Gets the value of the feeWaiveOrOverrideDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeWaiveOrOverrideDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeWaiveOrOverrideDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeWaiveOrOverrideDetails }
     * 
     * 
     */
    public List<FeeWaiveOrOverrideDetails> getFeeWaiveOrOverrideDetails() {
        if (feeWaiveOrOverrideDetails == null) {
            feeWaiveOrOverrideDetails = new ArrayList<FeeWaiveOrOverrideDetails>();
        }
        return this.feeWaiveOrOverrideDetails;
    }

    /**
     * Gets the value of the externalProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalProfileID() {
        return externalProfileID;
    }

    /**
     * Sets the value of the externalProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalProfileID(String value) {
        this.externalProfileID = value;
    }

    /**
     * Gets the value of the lastSyncTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     * Sets the value of the lastSyncTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSyncTime(XMLGregorianCalendar value) {
        this.lastSyncTime = value;
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

}
