
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSRDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSRDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IataSsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssrRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSRId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SSRKeyWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubSsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssrDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSRStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SsrAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfRequests" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SSRComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation" minOccurs="0"/>
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InfFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}InfFields" minOccurs="0"/>
 *         &lt;element name="UmnrFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}UmnrFields" minOccurs="0"/>
 *         &lt;element name="CbbgFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}CbbgFields" minOccurs="0"/>
 *         &lt;element name="CabinBaggageFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}CabinBaggageFields" minOccurs="0"/>
 *         &lt;element name="PBAAFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PBAAFields" minOccurs="0"/>
 *         &lt;element name="PBAXFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PBAXFields" minOccurs="0"/>
 *         &lt;element name="TkneFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}TkneFields" minOccurs="0"/>
 *         &lt;element name="FqtvFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}FqtvFields" minOccurs="0"/>
 *         &lt;element name="PetcFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PetcFields" minOccurs="0"/>
 *         &lt;element name="SsrFieldDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrFieldDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvoiceFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}InvoiceFields" minOccurs="0"/>
 *         &lt;element name="BookingSegments" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingSegments" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRDetailsType", propOrder = {
    "ssrCode",
    "iataSsrCode",
    "ssrType",
    "ssrRemarks",
    "ssrId",
    "ssrKeyWord",
    "ssrName",
    "subSsrCode",
    "ssrDescription",
    "ssrStatus",
    "ssrAirlineCode",
    "numberOfRequests",
    "ssrComments",
    "feeInformation",
    "familyId",
    "guestId",
    "infFields",
    "umnrFields",
    "cbbgFields",
    "cabinBaggageFields",
    "pbaaFields",
    "pbaxFields",
    "tkneFields",
    "fqtvFields",
    "petcFields",
    "ssrFieldDetails",
    "invoiceFields",
    "bookingSegments"
})
public class SSRDetailsType {

    @XmlElement(required = true)
    protected String ssrCode;
    @XmlElement(name = "IataSsrCode")
    protected String iataSsrCode;
    protected String ssrType;
    protected String ssrRemarks;
    @XmlElement(name = "SSRId")
    protected Long ssrId;
    @XmlElement(name = "SSRKeyWord")
    protected String ssrKeyWord;
    protected String ssrName;
    @XmlElement(name = "SubSsrCode")
    protected String subSsrCode;
    protected String ssrDescription;
    @XmlElement(name = "SSRStatus")
    protected String ssrStatus;
    @XmlElement(name = "SsrAirlineCode")
    protected String ssrAirlineCode;
    @XmlElement(name = "NumberOfRequests")
    protected Integer numberOfRequests;
    @XmlElement(name = "SSRComments")
    protected String ssrComments;
    @XmlElement(name = "FeeInformation")
    protected FeeInformation feeInformation;
    @XmlElement(name = "FamilyId")
    protected Long familyId;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "InfFields")
    protected InfFields infFields;
    @XmlElement(name = "UmnrFields")
    protected UmnrFields umnrFields;
    @XmlElement(name = "CbbgFields")
    protected CbbgFields cbbgFields;
    @XmlElement(name = "CabinBaggageFields")
    protected CabinBaggageFields cabinBaggageFields;
    @XmlElement(name = "PBAAFields")
    protected PBAAFields pbaaFields;
    @XmlElement(name = "PBAXFields")
    protected PBAXFields pbaxFields;
    @XmlElement(name = "TkneFields")
    protected TkneFields tkneFields;
    @XmlElement(name = "FqtvFields")
    protected FqtvFields fqtvFields;
    @XmlElement(name = "PetcFields")
    protected PetcFields petcFields;
    @XmlElement(name = "SsrFieldDetails")
    protected List<SsrFieldDetails> ssrFieldDetails;
    @XmlElement(name = "InvoiceFields")
    protected InvoiceFields invoiceFields;
    @XmlElement(name = "BookingSegments", required = true)
    protected List<BookingSegments> bookingSegments;

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrCode(String value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the iataSsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataSsrCode() {
        return iataSsrCode;
    }

    /**
     * Sets the value of the iataSsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataSsrCode(String value) {
        this.iataSsrCode = value;
    }

    /**
     * Gets the value of the ssrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrType() {
        return ssrType;
    }

    /**
     * Sets the value of the ssrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrType(String value) {
        this.ssrType = value;
    }

    /**
     * Gets the value of the ssrRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrRemarks() {
        return ssrRemarks;
    }

    /**
     * Sets the value of the ssrRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrRemarks(String value) {
        this.ssrRemarks = value;
    }

    /**
     * Gets the value of the ssrId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSSRId() {
        return ssrId;
    }

    /**
     * Sets the value of the ssrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSSRId(Long value) {
        this.ssrId = value;
    }

    /**
     * Gets the value of the ssrKeyWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRKeyWord() {
        return ssrKeyWord;
    }

    /**
     * Sets the value of the ssrKeyWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRKeyWord(String value) {
        this.ssrKeyWord = value;
    }

    /**
     * Gets the value of the ssrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrName() {
        return ssrName;
    }

    /**
     * Sets the value of the ssrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrName(String value) {
        this.ssrName = value;
    }

    /**
     * Gets the value of the subSsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSsrCode() {
        return subSsrCode;
    }

    /**
     * Sets the value of the subSsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSsrCode(String value) {
        this.subSsrCode = value;
    }

    /**
     * Gets the value of the ssrDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrDescription() {
        return ssrDescription;
    }

    /**
     * Sets the value of the ssrDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrDescription(String value) {
        this.ssrDescription = value;
    }

    /**
     * Gets the value of the ssrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRStatus() {
        return ssrStatus;
    }

    /**
     * Sets the value of the ssrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRStatus(String value) {
        this.ssrStatus = value;
    }

    /**
     * Gets the value of the ssrAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrAirlineCode() {
        return ssrAirlineCode;
    }

    /**
     * Sets the value of the ssrAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrAirlineCode(String value) {
        this.ssrAirlineCode = value;
    }

    /**
     * Gets the value of the numberOfRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRequests() {
        return numberOfRequests;
    }

    /**
     * Sets the value of the numberOfRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRequests(Integer value) {
        this.numberOfRequests = value;
    }

    /**
     * Gets the value of the ssrComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRComments() {
        return ssrComments;
    }

    /**
     * Sets the value of the ssrComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRComments(String value) {
        this.ssrComments = value;
    }

    /**
     * Gets the value of the feeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FeeInformation }
     *     
     */
    public FeeInformation getFeeInformation() {
        return feeInformation;
    }

    /**
     * Sets the value of the feeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInformation }
     *     
     */
    public void setFeeInformation(FeeInformation value) {
        this.feeInformation = value;
    }

    /**
     * Gets the value of the familyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFamilyId(Long value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the infFields property.
     * 
     * @return
     *     possible object is
     *     {@link InfFields }
     *     
     */
    public InfFields getInfFields() {
        return infFields;
    }

    /**
     * Sets the value of the infFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfFields }
     *     
     */
    public void setInfFields(InfFields value) {
        this.infFields = value;
    }

    /**
     * Gets the value of the umnrFields property.
     * 
     * @return
     *     possible object is
     *     {@link UmnrFields }
     *     
     */
    public UmnrFields getUmnrFields() {
        return umnrFields;
    }

    /**
     * Sets the value of the umnrFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link UmnrFields }
     *     
     */
    public void setUmnrFields(UmnrFields value) {
        this.umnrFields = value;
    }

    /**
     * Gets the value of the cbbgFields property.
     * 
     * @return
     *     possible object is
     *     {@link CbbgFields }
     *     
     */
    public CbbgFields getCbbgFields() {
        return cbbgFields;
    }

    /**
     * Sets the value of the cbbgFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbbgFields }
     *     
     */
    public void setCbbgFields(CbbgFields value) {
        this.cbbgFields = value;
    }

    /**
     * Gets the value of the cabinBaggageFields property.
     * 
     * @return
     *     possible object is
     *     {@link CabinBaggageFields }
     *     
     */
    public CabinBaggageFields getCabinBaggageFields() {
        return cabinBaggageFields;
    }

    /**
     * Sets the value of the cabinBaggageFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinBaggageFields }
     *     
     */
    public void setCabinBaggageFields(CabinBaggageFields value) {
        this.cabinBaggageFields = value;
    }

    /**
     * Gets the value of the pbaaFields property.
     * 
     * @return
     *     possible object is
     *     {@link PBAAFields }
     *     
     */
    public PBAAFields getPBAAFields() {
        return pbaaFields;
    }

    /**
     * Sets the value of the pbaaFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PBAAFields }
     *     
     */
    public void setPBAAFields(PBAAFields value) {
        this.pbaaFields = value;
    }

    /**
     * Gets the value of the pbaxFields property.
     * 
     * @return
     *     possible object is
     *     {@link PBAXFields }
     *     
     */
    public PBAXFields getPBAXFields() {
        return pbaxFields;
    }

    /**
     * Sets the value of the pbaxFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PBAXFields }
     *     
     */
    public void setPBAXFields(PBAXFields value) {
        this.pbaxFields = value;
    }

    /**
     * Gets the value of the tkneFields property.
     * 
     * @return
     *     possible object is
     *     {@link TkneFields }
     *     
     */
    public TkneFields getTkneFields() {
        return tkneFields;
    }

    /**
     * Sets the value of the tkneFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link TkneFields }
     *     
     */
    public void setTkneFields(TkneFields value) {
        this.tkneFields = value;
    }

    /**
     * Gets the value of the fqtvFields property.
     * 
     * @return
     *     possible object is
     *     {@link FqtvFields }
     *     
     */
    public FqtvFields getFqtvFields() {
        return fqtvFields;
    }

    /**
     * Sets the value of the fqtvFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FqtvFields }
     *     
     */
    public void setFqtvFields(FqtvFields value) {
        this.fqtvFields = value;
    }

    /**
     * Gets the value of the petcFields property.
     * 
     * @return
     *     possible object is
     *     {@link PetcFields }
     *     
     */
    public PetcFields getPetcFields() {
        return petcFields;
    }

    /**
     * Sets the value of the petcFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PetcFields }
     *     
     */
    public void setPetcFields(PetcFields value) {
        this.petcFields = value;
    }

    /**
     * Gets the value of the ssrFieldDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrFieldDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrFieldDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrFieldDetails }
     * 
     * 
     */
    public List<SsrFieldDetails> getSsrFieldDetails() {
        if (ssrFieldDetails == null) {
            ssrFieldDetails = new ArrayList<SsrFieldDetails>();
        }
        return this.ssrFieldDetails;
    }

    /**
     * Gets the value of the invoiceFields property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFields }
     *     
     */
    public InvoiceFields getInvoiceFields() {
        return invoiceFields;
    }

    /**
     * Sets the value of the invoiceFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFields }
     *     
     */
    public void setInvoiceFields(InvoiceFields value) {
        this.invoiceFields = value;
    }

    /**
     * Gets the value of the bookingSegments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingSegments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingSegments }
     * 
     * 
     */
    public List<BookingSegments> getBookingSegments() {
        if (bookingSegments == null) {
            bookingSegments = new ArrayList<BookingSegments>();
        }
        return this.bookingSegments;
    }

}
