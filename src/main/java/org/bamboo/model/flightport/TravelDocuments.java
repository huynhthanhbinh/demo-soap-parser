
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TravelDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelDocumentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelDocumentIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TravelDocumentexpirydate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TravelDocumentCountryOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Residence" type="{http://www.ibsplc.com/iRes/simpleTypes/}ResidenceDetailsType" minOccurs="0"/>
 *         &lt;element name="isPrimaryHolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceForVisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationResidence" type="{http://www.ibsplc.com/iRes/simpleTypes/}ResidenceDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDocuments", propOrder = {
    "travelDocumentId",
    "firstName",
    "middleName",
    "lastName",
    "travelDocumentType",
    "travelDocumentNumber",
    "travelDocumentIssueDate",
    "travelDocumentexpirydate",
    "travelDocumentCountryOfIssue",
    "nationality",
    "residence",
    "isPrimaryHolder",
    "gender",
    "placeForVisa",
    "dateOfBirth",
    "placeOfBirth",
    "destinationResidence"
})
public class TravelDocuments {

    @XmlElement(name = "TravelDocumentId")
    protected Long travelDocumentId;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "TravelDocumentType")
    protected String travelDocumentType;
    @XmlElement(name = "TravelDocumentNumber")
    protected String travelDocumentNumber;
    @XmlElement(name = "TravelDocumentIssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDocumentIssueDate;
    @XmlElement(name = "TravelDocumentexpirydate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDocumentexpirydate;
    @XmlElement(name = "TravelDocumentCountryOfIssue")
    protected String travelDocumentCountryOfIssue;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "Residence")
    protected ResidenceDetailsType residence;
    protected Boolean isPrimaryHolder;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "PlaceForVisa")
    protected String placeForVisa;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "PlaceOfBirth")
    protected String placeOfBirth;
    @XmlElement(name = "DestinationResidence")
    protected ResidenceDetailsType destinationResidence;

    /**
     * Gets the value of the travelDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTravelDocumentId() {
        return travelDocumentId;
    }

    /**
     * Sets the value of the travelDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTravelDocumentId(Long value) {
        this.travelDocumentId = value;
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
     * Gets the value of the travelDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDocumentType() {
        return travelDocumentType;
    }

    /**
     * Sets the value of the travelDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDocumentType(String value) {
        this.travelDocumentType = value;
    }

    /**
     * Gets the value of the travelDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDocumentNumber() {
        return travelDocumentNumber;
    }

    /**
     * Sets the value of the travelDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDocumentNumber(String value) {
        this.travelDocumentNumber = value;
    }

    /**
     * Gets the value of the travelDocumentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDocumentIssueDate() {
        return travelDocumentIssueDate;
    }

    /**
     * Sets the value of the travelDocumentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDocumentIssueDate(XMLGregorianCalendar value) {
        this.travelDocumentIssueDate = value;
    }

    /**
     * Gets the value of the travelDocumentexpirydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDocumentexpirydate() {
        return travelDocumentexpirydate;
    }

    /**
     * Sets the value of the travelDocumentexpirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDocumentexpirydate(XMLGregorianCalendar value) {
        this.travelDocumentexpirydate = value;
    }

    /**
     * Gets the value of the travelDocumentCountryOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDocumentCountryOfIssue() {
        return travelDocumentCountryOfIssue;
    }

    /**
     * Sets the value of the travelDocumentCountryOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDocumentCountryOfIssue(String value) {
        this.travelDocumentCountryOfIssue = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the residence property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public ResidenceDetailsType getResidence() {
        return residence;
    }

    /**
     * Sets the value of the residence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public void setResidence(ResidenceDetailsType value) {
        this.residence = value;
    }

    /**
     * Gets the value of the isPrimaryHolder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryHolder() {
        return isPrimaryHolder;
    }

    /**
     * Sets the value of the isPrimaryHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryHolder(Boolean value) {
        this.isPrimaryHolder = value;
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
     * Gets the value of the placeForVisa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceForVisa() {
        return placeForVisa;
    }

    /**
     * Sets the value of the placeForVisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceForVisa(String value) {
        this.placeForVisa = value;
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
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the destinationResidence property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public ResidenceDetailsType getDestinationResidence() {
        return destinationResidence;
    }

    /**
     * Sets the value of the destinationResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public void setDestinationResidence(ResidenceDetailsType value) {
        this.destinationResidence = value;
    }

}
