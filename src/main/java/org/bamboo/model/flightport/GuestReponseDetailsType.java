
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
 * <p>Java class for GuestReponseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestReponseDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamePrefix" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameTitle_Type" minOccurs="0"/>
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxDetails_Type"/>
 *         &lt;element name="GuestSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenefitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaffGuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}StaffGuestDetails_Type" minOccurs="0"/>
 *         &lt;element name="TaxExemptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RewardCollectionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestCheckInInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestCheckInInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestAmountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestAmountDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DateOfHire" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.ibsplc.com/iRes/simpleTypes/}GenderDetails_Type" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentGuestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRegistrationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxTicketDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestTicketDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestReponseDetailsType", propOrder = {
    "givenName",
    "localGivenName",
    "surName",
    "localSurName",
    "middleName",
    "namePrefix",
    "guestType",
    "guestSubType",
    "dateOfBirth",
    "employeeID",
    "benefitID",
    "staffGuestType",
    "taxExemptionCodes",
    "rewardCollectionNumber",
    "discountCode",
    "profileId",
    "familyId",
    "guestId",
    "guestCheckInInfo",
    "guestAmountDetails",
    "dateOfHire",
    "gender",
    "age",
    "parentGuestID",
    "taxRegistrationNo",
    "paxTicketDetails",
    "recordLocator"
})
public class GuestReponseDetailsType {

    @XmlElement(name = "GivenName", required = true)
    protected String givenName;
    @XmlElement(name = "LocalGivenName")
    protected String localGivenName;
    @XmlElement(name = "SurName", required = true)
    protected String surName;
    @XmlElement(name = "LocalSurName")
    protected String localSurName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "NamePrefix")
    @XmlSchemaType(name = "string")
    protected NameTitleType namePrefix;
    @XmlElement(name = "GuestType", required = true)
    @XmlSchemaType(name = "string")
    protected PaxDetailsType guestType;
    @XmlElement(name = "GuestSubType")
    protected String guestSubType;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "EmployeeID")
    protected String employeeID;
    @XmlElement(name = "BenefitID")
    protected String benefitID;
    @XmlElement(name = "StaffGuestType")
    @XmlSchemaType(name = "string")
    protected StaffGuestDetailsType staffGuestType;
    @XmlElement(name = "TaxExemptionCodes")
    protected List<String> taxExemptionCodes;
    @XmlElement(name = "RewardCollectionNumber")
    protected String rewardCollectionNumber;
    @XmlElement(name = "DiscountCode")
    protected String discountCode;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "FamilyId")
    protected String familyId;
    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "GuestCheckInInfo")
    protected List<GuestCheckInInfoType> guestCheckInInfo;
    @XmlElement(name = "GuestAmountDetails")
    protected List<GuestAmountDetailsType> guestAmountDetails;
    @XmlElement(name = "DateOfHire")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfHire;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected GenderDetailsType gender;
    @XmlElement(name = "Age")
    protected Integer age;
    @XmlElement(name = "ParentGuestID")
    protected String parentGuestID;
    @XmlElement(name = "TaxRegistrationNo")
    protected String taxRegistrationNo;
    @XmlElement(name = "PaxTicketDetails")
    protected List<GuestTicketDetailsType> paxTicketDetails;
    @XmlElement(name = "RecordLocator")
    protected String recordLocator;

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
     * Gets the value of the guestType property.
     * 
     * @return
     *     possible object is
     *     {@link PaxDetailsType }
     *     
     */
    public PaxDetailsType getGuestType() {
        return guestType;
    }

    /**
     * Sets the value of the guestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxDetailsType }
     *     
     */
    public void setGuestType(PaxDetailsType value) {
        this.guestType = value;
    }

    /**
     * Gets the value of the guestSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestSubType() {
        return guestSubType;
    }

    /**
     * Sets the value of the guestSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestSubType(String value) {
        this.guestSubType = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the employeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeID(String value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the benefitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitID() {
        return benefitID;
    }

    /**
     * Sets the value of the benefitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitID(String value) {
        this.benefitID = value;
    }

    /**
     * Gets the value of the staffGuestType property.
     * 
     * @return
     *     possible object is
     *     {@link StaffGuestDetailsType }
     *     
     */
    public StaffGuestDetailsType getStaffGuestType() {
        return staffGuestType;
    }

    /**
     * Sets the value of the staffGuestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffGuestDetailsType }
     *     
     */
    public void setStaffGuestType(StaffGuestDetailsType value) {
        this.staffGuestType = value;
    }

    /**
     * Gets the value of the taxExemptionCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemptionCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExemptionCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTaxExemptionCodes() {
        if (taxExemptionCodes == null) {
            taxExemptionCodes = new ArrayList<String>();
        }
        return this.taxExemptionCodes;
    }

    /**
     * Gets the value of the rewardCollectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCollectionNumber() {
        return rewardCollectionNumber;
    }

    /**
     * Sets the value of the rewardCollectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCollectionNumber(String value) {
        this.rewardCollectionNumber = value;
    }

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the familyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyId(String value) {
        this.familyId = value;
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
     * Gets the value of the guestCheckInInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestCheckInInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestCheckInInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestCheckInInfoType }
     * 
     * 
     */
    public List<GuestCheckInInfoType> getGuestCheckInInfo() {
        if (guestCheckInInfo == null) {
            guestCheckInInfo = new ArrayList<GuestCheckInInfoType>();
        }
        return this.guestCheckInInfo;
    }

    /**
     * Gets the value of the guestAmountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestAmountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestAmountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestAmountDetailsType }
     * 
     * 
     */
    public List<GuestAmountDetailsType> getGuestAmountDetails() {
        if (guestAmountDetails == null) {
            guestAmountDetails = new ArrayList<GuestAmountDetailsType>();
        }
        return this.guestAmountDetails;
    }

    /**
     * Gets the value of the dateOfHire property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfHire() {
        return dateOfHire;
    }

    /**
     * Sets the value of the dateOfHire property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfHire(XMLGregorianCalendar value) {
        this.dateOfHire = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderDetailsType }
     *     
     */
    public GenderDetailsType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderDetailsType }
     *     
     */
    public void setGender(GenderDetailsType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Gets the value of the parentGuestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGuestID() {
        return parentGuestID;
    }

    /**
     * Sets the value of the parentGuestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGuestID(String value) {
        this.parentGuestID = value;
    }

    /**
     * Gets the value of the taxRegistrationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistrationNo() {
        return taxRegistrationNo;
    }

    /**
     * Sets the value of the taxRegistrationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistrationNo(String value) {
        this.taxRegistrationNo = value;
    }

    /**
     * Gets the value of the paxTicketDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxTicketDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxTicketDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestTicketDetailsType }
     * 
     * 
     */
    public List<GuestTicketDetailsType> getPaxTicketDetails() {
        if (paxTicketDetails == null) {
            paxTicketDetails = new ArrayList<GuestTicketDetailsType>();
        }
        return this.paxTicketDetails;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordLocator(String value) {
        this.recordLocator = value;
    }

}
