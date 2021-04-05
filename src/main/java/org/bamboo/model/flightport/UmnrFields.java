
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UmnrFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UmnrFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RAddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdressTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RAdressTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternatePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RAlternatePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinorLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialInsructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedicalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UMNRRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUMNRRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UmnrFields", propOrder = {
    "firstName",
    "rFirstName",
    "middleName",
    "rMiddleName",
    "lastName",
    "rLastName",
    "addressOne",
    "rAddressOne",
    "adressTwo",
    "rAdressTwo",
    "city",
    "rCity",
    "province",
    "rProvince",
    "country",
    "rCountry",
    "postalCode",
    "rPostalCode",
    "phoneNumber",
    "rPhoneNumber",
    "alternatePhoneNumber",
    "rAlternatePhoneNumber",
    "fax",
    "rFax",
    "gender",
    "rGender",
    "dateOfBirth",
    "rDateOfBirth",
    "minorName",
    "minorLastName",
    "age",
    "sex",
    "specialInsructions",
    "medicalInfo",
    "remarks",
    "alternateContactName",
    "alternateContactNumber",
    "password",
    "umnrRelation",
    "rumnrRelation"
})
public class UmnrFields {

    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "RFirstName")
    protected String rFirstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "RMiddleName")
    protected String rMiddleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "RLastName")
    protected String rLastName;
    @XmlElement(name = "AddressOne")
    protected String addressOne;
    @XmlElement(name = "RAddressOne")
    protected String rAddressOne;
    @XmlElement(name = "AdressTwo")
    protected String adressTwo;
    @XmlElement(name = "RAdressTwo")
    protected String rAdressTwo;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "RCity")
    protected String rCity;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "RProvince")
    protected String rProvince;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "RCountry")
    protected String rCountry;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "RPostalCode")
    protected String rPostalCode;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "RPhoneNumber")
    protected String rPhoneNumber;
    @XmlElement(name = "AlternatePhoneNumber")
    protected String alternatePhoneNumber;
    @XmlElement(name = "RAlternatePhoneNumber")
    protected String rAlternatePhoneNumber;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "RFax")
    protected String rFax;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "RGender")
    protected String rGender;
    @XmlElement(name = "DateOfBirth")
    protected String dateOfBirth;
    @XmlElement(name = "RDateOfBirth")
    protected String rDateOfBirth;
    @XmlElement(name = "MinorName")
    protected String minorName;
    @XmlElement(name = "MinorLastName")
    protected String minorLastName;
    @XmlElement(name = "Age")
    protected String age;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "SpecialInsructions")
    protected String specialInsructions;
    @XmlElement(name = "MedicalInfo")
    protected String medicalInfo;
    protected String remarks;
    @XmlElement(name = "AlternateContactName")
    protected String alternateContactName;
    @XmlElement(name = "AlternateContactNumber")
    protected String alternateContactNumber;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "UMNRRelation")
    protected String umnrRelation;
    @XmlElement(name = "RUMNRRelation")
    protected String rumnrRelation;

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
     * Gets the value of the rFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFirstName() {
        return rFirstName;
    }

    /**
     * Sets the value of the rFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFirstName(String value) {
        this.rFirstName = value;
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
     * Gets the value of the rMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMiddleName() {
        return rMiddleName;
    }

    /**
     * Sets the value of the rMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMiddleName(String value) {
        this.rMiddleName = value;
    }

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
     * Gets the value of the rLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRLastName() {
        return rLastName;
    }

    /**
     * Sets the value of the rLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRLastName(String value) {
        this.rLastName = value;
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
     * Gets the value of the rAddressOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAddressOne() {
        return rAddressOne;
    }

    /**
     * Sets the value of the rAddressOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAddressOne(String value) {
        this.rAddressOne = value;
    }

    /**
     * Gets the value of the adressTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressTwo() {
        return adressTwo;
    }

    /**
     * Sets the value of the adressTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressTwo(String value) {
        this.adressTwo = value;
    }

    /**
     * Gets the value of the rAdressTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAdressTwo() {
        return rAdressTwo;
    }

    /**
     * Sets the value of the rAdressTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAdressTwo(String value) {
        this.rAdressTwo = value;
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
     * Gets the value of the rCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCity() {
        return rCity;
    }

    /**
     * Sets the value of the rCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCity(String value) {
        this.rCity = value;
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
     * Gets the value of the rProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRProvince() {
        return rProvince;
    }

    /**
     * Sets the value of the rProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRProvince(String value) {
        this.rProvince = value;
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
     * Gets the value of the rCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCountry() {
        return rCountry;
    }

    /**
     * Sets the value of the rCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCountry(String value) {
        this.rCountry = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the rPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPostalCode() {
        return rPostalCode;
    }

    /**
     * Sets the value of the rPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPostalCode(String value) {
        this.rPostalCode = value;
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
     * Gets the value of the rPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPhoneNumber() {
        return rPhoneNumber;
    }

    /**
     * Sets the value of the rPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPhoneNumber(String value) {
        this.rPhoneNumber = value;
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
     * Gets the value of the rAlternatePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAlternatePhoneNumber() {
        return rAlternatePhoneNumber;
    }

    /**
     * Sets the value of the rAlternatePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAlternatePhoneNumber(String value) {
        this.rAlternatePhoneNumber = value;
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
     * Gets the value of the rFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFax() {
        return rFax;
    }

    /**
     * Sets the value of the rFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFax(String value) {
        this.rFax = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the rGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGender() {
        return rGender;
    }

    /**
     * Sets the value of the rGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGender(String value) {
        this.rGender = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the rDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDateOfBirth() {
        return rDateOfBirth;
    }

    /**
     * Sets the value of the rDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDateOfBirth(String value) {
        this.rDateOfBirth = value;
    }

    /**
     * Gets the value of the minorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorName() {
        return minorName;
    }

    /**
     * Sets the value of the minorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorName(String value) {
        this.minorName = value;
    }

    /**
     * Gets the value of the minorLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorLastName() {
        return minorLastName;
    }

    /**
     * Sets the value of the minorLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorLastName(String value) {
        this.minorLastName = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge(String value) {
        this.age = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the specialInsructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInsructions() {
        return specialInsructions;
    }

    /**
     * Sets the value of the specialInsructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInsructions(String value) {
        this.specialInsructions = value;
    }

    /**
     * Gets the value of the medicalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalInfo() {
        return medicalInfo;
    }

    /**
     * Sets the value of the medicalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalInfo(String value) {
        this.medicalInfo = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the alternateContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateContactName() {
        return alternateContactName;
    }

    /**
     * Sets the value of the alternateContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateContactName(String value) {
        this.alternateContactName = value;
    }

    /**
     * Gets the value of the alternateContactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateContactNumber() {
        return alternateContactNumber;
    }

    /**
     * Sets the value of the alternateContactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateContactNumber(String value) {
        this.alternateContactNumber = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the umnrRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMNRRelation() {
        return umnrRelation;
    }

    /**
     * Sets the value of the umnrRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMNRRelation(String value) {
        this.umnrRelation = value;
    }

    /**
     * Gets the value of the rumnrRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUMNRRelation() {
        return rumnrRelation;
    }

    /**
     * Sets the value of the rumnrRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUMNRRelation(String value) {
        this.rumnrRelation = value;
    }

}
