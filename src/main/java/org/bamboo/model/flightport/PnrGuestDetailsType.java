
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
 * <p>Java class for PnrGuestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrGuestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamePrefix" type="{http://www.ibsplc.com/iRes/simpleTypes/}NamePrefixType" minOccurs="0"/>
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenefitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaffGuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}StaffGuestType" minOccurs="0"/>
 *         &lt;element name="TaxExemptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RewardCollectionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Infants" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrInfantDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}LoyaltyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestPaymentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaymentDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatAllocationDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAllocationDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OldSeatAllocationDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OldSeatAllocationDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestRepriceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestRepriceDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestCheckInInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestCheckInInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AmountDetailsForAGuest" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountDetailsForAGuest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DateOfHire" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TravelDocuments" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocuments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.ibsplc.com/iRes/simpleTypes/}GenderType" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentGuestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRegistrationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketingOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldTicketNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalTicketIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaxTicketDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxTicketDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PnrGuestDetailsType", propOrder = {
    "givenName",
    "localGivenName",
    "surName",
    "localSurName",
    "middleName",
    "namePrefix",
    "guestType",
    "dateOfBirth",
    "employeeID",
    "benefitID",
    "staffGuestType",
    "taxExemptionCodes",
    "rewardCollectionNumber",
    "discountCode",
    "infants",
    "loyaltyInfo",
    "guestPaymentInfo",
    "cabin",
    "seatAllocationDetails",
    "oldSeatAllocationDetails",
    "ssrDetails",
    "auxDetails",
    "feeInformation",
    "profileId",
    "familyId",
    "guestId",
    "guestRepriceDetails",
    "guestCheckInInfo",
    "amountDetailsForAGuest",
    "dateOfHire",
    "travelDocuments",
    "gender",
    "age",
    "parentGuestID",
    "taxRegistrationNo",
    "ticketingOfficeCode",
    "ticketNumbers",
    "fareString",
    "oldTicketNumbers",
    "originalTicketIssueDate",
    "paxTicketDetails",
    "recordLocator"
})
public class PnrGuestDetailsType {

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
    protected NamePrefixType namePrefix;
    @XmlElement(name = "GuestType", required = true)
    @XmlSchemaType(name = "string")
    protected GuestType guestType;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "EmployeeID")
    protected String employeeID;
    @XmlElement(name = "BenefitID")
    protected String benefitID;
    @XmlElement(name = "StaffGuestType")
    @XmlSchemaType(name = "string")
    protected StaffGuestType staffGuestType;
    @XmlElement(name = "TaxExemptionCodes")
    protected List<String> taxExemptionCodes;
    @XmlElement(name = "RewardCollectionNumber")
    protected String rewardCollectionNumber;
    @XmlElement(name = "DiscountCode")
    protected String discountCode;
    @XmlElement(name = "Infants")
    protected List<PnrInfantDetailsType> infants;
    @XmlElement(name = "LoyaltyInfo")
    protected List<LoyaltyInfo> loyaltyInfo;
    @XmlElement(name = "GuestPaymentInfo")
    protected List<PaymentDetailsType> guestPaymentInfo;
    @XmlElement(name = "Cabin")
    protected String cabin;
    @XmlElement(name = "SeatAllocationDetails")
    protected List<SeatAllocationDetails> seatAllocationDetails;
    @XmlElement(name = "OldSeatAllocationDetails")
    protected List<OldSeatAllocationDetails> oldSeatAllocationDetails;
    @XmlElement(name = "SSRDetails")
    protected List<SSRDetailsType> ssrDetails;
    @XmlElement(name = "AuxDetails")
    protected List<AuxDetailsType> auxDetails;
    @XmlElement(name = "FeeInformation")
    protected List<FeeInformation> feeInformation;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "FamilyId")
    protected String familyId;
    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "GuestRepriceDetails")
    protected List<GuestRepriceDetails> guestRepriceDetails;
    @XmlElement(name = "GuestCheckInInfo")
    protected List<GuestCheckInInfo> guestCheckInInfo;
    @XmlElement(name = "AmountDetailsForAGuest")
    protected List<AmountDetailsForAGuest> amountDetailsForAGuest;
    @XmlElement(name = "DateOfHire")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfHire;
    @XmlElement(name = "TravelDocuments")
    protected List<TravelDocuments> travelDocuments;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected GenderType gender;
    @XmlElement(name = "Age")
    protected Integer age;
    @XmlElement(name = "ParentGuestID")
    protected String parentGuestID;
    @XmlElement(name = "TaxRegistrationNo")
    protected String taxRegistrationNo;
    @XmlElement(name = "TicketingOfficeCode")
    protected String ticketingOfficeCode;
    @XmlElement(name = "TicketNumbers")
    protected String ticketNumbers;
    @XmlElement(name = "FareString")
    protected String fareString;
    @XmlElement(name = "OldTicketNumbers")
    protected String oldTicketNumbers;
    @XmlElement(name = "OriginalTicketIssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalTicketIssueDate;
    @XmlElement(name = "PaxTicketDetails")
    protected List<PaxTicketDetailsType> paxTicketDetails;
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
     *     {@link NamePrefixType }
     *     
     */
    public NamePrefixType getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefixType }
     *     
     */
    public void setNamePrefix(NamePrefixType value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the guestType property.
     * 
     * @return
     *     possible object is
     *     {@link GuestType }
     *     
     */
    public GuestType getGuestType() {
        return guestType;
    }

    /**
     * Sets the value of the guestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestType }
     *     
     */
    public void setGuestType(GuestType value) {
        this.guestType = value;
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
     *     {@link StaffGuestType }
     *     
     */
    public StaffGuestType getStaffGuestType() {
        return staffGuestType;
    }

    /**
     * Sets the value of the staffGuestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffGuestType }
     *     
     */
    public void setStaffGuestType(StaffGuestType value) {
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
     * Gets the value of the infants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrInfantDetailsType }
     * 
     * 
     */
    public List<PnrInfantDetailsType> getInfants() {
        if (infants == null) {
            infants = new ArrayList<PnrInfantDetailsType>();
        }
        return this.infants;
    }

    /**
     * Gets the value of the loyaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyInfo }
     * 
     * 
     */
    public List<LoyaltyInfo> getLoyaltyInfo() {
        if (loyaltyInfo == null) {
            loyaltyInfo = new ArrayList<LoyaltyInfo>();
        }
        return this.loyaltyInfo;
    }

    /**
     * Gets the value of the guestPaymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestPaymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailsType }
     * 
     * 
     */
    public List<PaymentDetailsType> getGuestPaymentInfo() {
        if (guestPaymentInfo == null) {
            guestPaymentInfo = new ArrayList<PaymentDetailsType>();
        }
        return this.guestPaymentInfo;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the seatAllocationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAllocationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAllocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAllocationDetails }
     * 
     * 
     */
    public List<SeatAllocationDetails> getSeatAllocationDetails() {
        if (seatAllocationDetails == null) {
            seatAllocationDetails = new ArrayList<SeatAllocationDetails>();
        }
        return this.seatAllocationDetails;
    }

    /**
     * Gets the value of the oldSeatAllocationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oldSeatAllocationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOldSeatAllocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OldSeatAllocationDetails }
     * 
     * 
     */
    public List<OldSeatAllocationDetails> getOldSeatAllocationDetails() {
        if (oldSeatAllocationDetails == null) {
            oldSeatAllocationDetails = new ArrayList<OldSeatAllocationDetails>();
        }
        return this.oldSeatAllocationDetails;
    }

    /**
     * Gets the value of the ssrDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRDetailsType }
     * 
     * 
     */
    public List<SSRDetailsType> getSSRDetails() {
        if (ssrDetails == null) {
            ssrDetails = new ArrayList<SSRDetailsType>();
        }
        return this.ssrDetails;
    }

    /**
     * Gets the value of the auxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxDetailsType }
     * 
     * 
     */
    public List<AuxDetailsType> getAuxDetails() {
        if (auxDetails == null) {
            auxDetails = new ArrayList<AuxDetailsType>();
        }
        return this.auxDetails;
    }

    /**
     * Gets the value of the feeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeInformation }
     * 
     * 
     */
    public List<FeeInformation> getFeeInformation() {
        if (feeInformation == null) {
            feeInformation = new ArrayList<FeeInformation>();
        }
        return this.feeInformation;
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
     * Gets the value of the guestRepriceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestRepriceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestRepriceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestRepriceDetails }
     * 
     * 
     */
    public List<GuestRepriceDetails> getGuestRepriceDetails() {
        if (guestRepriceDetails == null) {
            guestRepriceDetails = new ArrayList<GuestRepriceDetails>();
        }
        return this.guestRepriceDetails;
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
     * {@link GuestCheckInInfo }
     * 
     * 
     */
    public List<GuestCheckInInfo> getGuestCheckInInfo() {
        if (guestCheckInInfo == null) {
            guestCheckInInfo = new ArrayList<GuestCheckInInfo>();
        }
        return this.guestCheckInInfo;
    }

    /**
     * Gets the value of the amountDetailsForAGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountDetailsForAGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountDetailsForAGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountDetailsForAGuest }
     * 
     * 
     */
    public List<AmountDetailsForAGuest> getAmountDetailsForAGuest() {
        if (amountDetailsForAGuest == null) {
            amountDetailsForAGuest = new ArrayList<AmountDetailsForAGuest>();
        }
        return this.amountDetailsForAGuest;
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
     * Gets the value of the travelDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocuments }
     * 
     * 
     */
    public List<TravelDocuments> getTravelDocuments() {
        if (travelDocuments == null) {
            travelDocuments = new ArrayList<TravelDocuments>();
        }
        return this.travelDocuments;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
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
     * Gets the value of the ticketingOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingOfficeCode() {
        return ticketingOfficeCode;
    }

    /**
     * Sets the value of the ticketingOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingOfficeCode(String value) {
        this.ticketingOfficeCode = value;
    }

    /**
     * Gets the value of the ticketNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumbers() {
        return ticketNumbers;
    }

    /**
     * Sets the value of the ticketNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumbers(String value) {
        this.ticketNumbers = value;
    }

    /**
     * Gets the value of the fareString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareString() {
        return fareString;
    }

    /**
     * Sets the value of the fareString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareString(String value) {
        this.fareString = value;
    }

    /**
     * Gets the value of the oldTicketNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldTicketNumbers() {
        return oldTicketNumbers;
    }

    /**
     * Sets the value of the oldTicketNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldTicketNumbers(String value) {
        this.oldTicketNumbers = value;
    }

    /**
     * Gets the value of the originalTicketIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalTicketIssueDate() {
        return originalTicketIssueDate;
    }

    /**
     * Sets the value of the originalTicketIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalTicketIssueDate(XMLGregorianCalendar value) {
        this.originalTicketIssueDate = value;
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
     * {@link PaxTicketDetailsType }
     * 
     * 
     */
    public List<PaxTicketDetailsType> getPaxTicketDetails() {
        if (paxTicketDetails == null) {
            paxTicketDetails = new ArrayList<PaxTicketDetailsType>();
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
