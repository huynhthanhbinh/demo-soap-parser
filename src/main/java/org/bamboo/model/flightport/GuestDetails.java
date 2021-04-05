
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
 * <p>Java class for GuestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalLastName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalLastName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalFirstName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalFirstName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoyaltyNumberDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}LoyaltyNumberDetails" minOccurs="0"/>
 *         &lt;element name="PartnerLoyaltyNumberDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PartnerLoyaltyNumberDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestSalutaion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.ibsplc.com/iRes/simpleTypes/}NamePrefixType" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType"/>
 *         &lt;element name="Gender" type="{http://www.ibsplc.com/iRes/simpleTypes/}GenderType" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealSSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatSSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherSSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelDocuments" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocuments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditCards" type="{http://www.ibsplc.com/iRes/simpleTypes/}CreditCardDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProfileGuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerValueDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerValueDetails" minOccurs="0"/>
 *         &lt;element name="ConsentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileConsentDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestDetails", propOrder = {
    "lastName",
    "localLastName",
    "localLastName1",
    "localLastName2",
    "middleName",
    "firstName",
    "localFirstName",
    "localFirstName1",
    "localFirstName2",
    "loyaltyNumberDetails",
    "partnerLoyaltyNumberDetails",
    "guestSalutaion",
    "title",
    "dateOfBirth",
    "guestType",
    "gender",
    "occupation",
    "language",
    "mealSSR",
    "seatSSR",
    "otherSSR",
    "travelDocuments",
    "creditCards",
    "profileGuestId",
    "customerValueDetails",
    "consentDetails"
})
public class GuestDetails {

    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "LocalLastName")
    protected String localLastName;
    @XmlElement(name = "LocalLastName1")
    protected String localLastName1;
    @XmlElement(name = "LocalLastName2")
    protected String localLastName2;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LocalFirstName")
    protected String localFirstName;
    @XmlElement(name = "LocalFirstName1")
    protected String localFirstName1;
    @XmlElement(name = "LocalFirstName2")
    protected String localFirstName2;
    @XmlElement(name = "LoyaltyNumberDetails")
    protected LoyaltyNumberDetails loyaltyNumberDetails;
    @XmlElement(name = "PartnerLoyaltyNumberDetails")
    protected List<PartnerLoyaltyNumberDetails> partnerLoyaltyNumberDetails;
    @XmlElement(name = "GuestSalutaion")
    protected String guestSalutaion;
    @XmlElement(name = "Title")
    @XmlSchemaType(name = "string")
    protected NamePrefixType title;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "GuestType", required = true)
    @XmlSchemaType(name = "string")
    protected GuestType guestType;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected GenderType gender;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "MealSSR")
    protected String mealSSR;
    @XmlElement(name = "SeatSSR")
    protected String seatSSR;
    @XmlElement(name = "OtherSSR")
    protected String otherSSR;
    @XmlElement(name = "TravelDocuments")
    protected List<TravelDocuments> travelDocuments;
    @XmlElement(name = "CreditCards")
    protected List<CreditCardDetails> creditCards;
    @XmlElement(name = "ProfileGuestId")
    protected String profileGuestId;
    @XmlElement(name = "CustomerValueDetails")
    protected CustomerValueDetails customerValueDetails;
    @XmlElement(name = "ConsentDetails")
    protected List<CustomerProfileConsentDetails> consentDetails;

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the localLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLastName() {
        return localLastName;
    }

    /**
     * Sets the value of the localLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLastName(String value) {
        this.localLastName = value;
    }

    /**
     * Gets the value of the localLastName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLastName1() {
        return localLastName1;
    }

    /**
     * Sets the value of the localLastName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLastName1(String value) {
        this.localLastName1 = value;
    }

    /**
     * Gets the value of the localLastName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLastName2() {
        return localLastName2;
    }

    /**
     * Sets the value of the localLastName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLastName2(String value) {
        this.localLastName2 = value;
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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the localFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFirstName() {
        return localFirstName;
    }

    /**
     * Sets the value of the localFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFirstName(String value) {
        this.localFirstName = value;
    }

    /**
     * Gets the value of the localFirstName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFirstName1() {
        return localFirstName1;
    }

    /**
     * Sets the value of the localFirstName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFirstName1(String value) {
        this.localFirstName1 = value;
    }

    /**
     * Gets the value of the localFirstName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFirstName2() {
        return localFirstName2;
    }

    /**
     * Sets the value of the localFirstName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFirstName2(String value) {
        this.localFirstName2 = value;
    }

    /**
     * Gets the value of the loyaltyNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyNumberDetails }
     *     
     */
    public LoyaltyNumberDetails getLoyaltyNumberDetails() {
        return loyaltyNumberDetails;
    }

    /**
     * Sets the value of the loyaltyNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyNumberDetails }
     *     
     */
    public void setLoyaltyNumberDetails(LoyaltyNumberDetails value) {
        this.loyaltyNumberDetails = value;
    }

    /**
     * Gets the value of the partnerLoyaltyNumberDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerLoyaltyNumberDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerLoyaltyNumberDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerLoyaltyNumberDetails }
     * 
     * 
     */
    public List<PartnerLoyaltyNumberDetails> getPartnerLoyaltyNumberDetails() {
        if (partnerLoyaltyNumberDetails == null) {
            partnerLoyaltyNumberDetails = new ArrayList<PartnerLoyaltyNumberDetails>();
        }
        return this.partnerLoyaltyNumberDetails;
    }

    /**
     * Gets the value of the guestSalutaion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestSalutaion() {
        return guestSalutaion;
    }

    /**
     * Sets the value of the guestSalutaion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestSalutaion(String value) {
        this.guestSalutaion = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefixType }
     *     
     */
    public NamePrefixType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefixType }
     *     
     */
    public void setTitle(NamePrefixType value) {
        this.title = value;
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
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
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
     * Gets the value of the mealSSR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealSSR() {
        return mealSSR;
    }

    /**
     * Sets the value of the mealSSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealSSR(String value) {
        this.mealSSR = value;
    }

    /**
     * Gets the value of the seatSSR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatSSR() {
        return seatSSR;
    }

    /**
     * Sets the value of the seatSSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatSSR(String value) {
        this.seatSSR = value;
    }

    /**
     * Gets the value of the otherSSR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSSR() {
        return otherSSR;
    }

    /**
     * Sets the value of the otherSSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSSR(String value) {
        this.otherSSR = value;
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
     * Gets the value of the creditCards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardDetails }
     * 
     * 
     */
    public List<CreditCardDetails> getCreditCards() {
        if (creditCards == null) {
            creditCards = new ArrayList<CreditCardDetails>();
        }
        return this.creditCards;
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
     * Gets the value of the customerValueDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerValueDetails }
     *     
     */
    public CustomerValueDetails getCustomerValueDetails() {
        return customerValueDetails;
    }

    /**
     * Sets the value of the customerValueDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerValueDetails }
     *     
     */
    public void setCustomerValueDetails(CustomerValueDetails value) {
        this.customerValueDetails = value;
    }

    /**
     * Gets the value of the consentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProfileConsentDetails }
     * 
     * 
     */
    public List<CustomerProfileConsentDetails> getConsentDetails() {
        if (consentDetails == null) {
            consentDetails = new ArrayList<CustomerProfileConsentDetails>();
        }
        return this.consentDetails;
    }

}
