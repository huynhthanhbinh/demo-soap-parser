
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
 * <p>Java class for RevDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevDocDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/>
 *         &lt;element name="AgencyIATACode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IssueDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isConjunction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InitialTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalDomesticIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PNRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PassengerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PassengerContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CouponDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}RevDocCouponDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fare" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/>
 *         &lt;element name="FareCalculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareSurchargeAdc" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalSurcharge" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/>
 *         &lt;element name="SurchargeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}RevDocSurchargeDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalTaxAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/>
 *         &lt;element name="BSPAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType"/>
 *         &lt;element name="TaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}RevDocTaxDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginalIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuedInExchangeDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartialRefundAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/>
 *         &lt;element name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketingUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNRCreationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndorsementAndRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PNRCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PNRCreationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentFOPDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaymentFOPDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevDocDetailsType", propOrder = {
    "transactionDate",
    "agencyIATACode",
    "documentNumber",
    "documentType",
    "issueDate",
    "issueDateTimeZone",
    "transactionType",
    "isConjunction",
    "initialTicketNumber",
    "internationalDomesticIndicator",
    "pnrNumber",
    "passengerName",
    "passengerType",
    "passengerEmail",
    "passengerContact",
    "couponDetails",
    "fare",
    "fareCalculation",
    "fareSurchargeAdc",
    "feeCode",
    "feeName",
    "feeAmount",
    "totalSurcharge",
    "surchargeDetails",
    "discount",
    "totalTaxAmount",
    "totalAmount",
    "bspAmount",
    "taxDetails",
    "originalIssue",
    "issuedInExchangeDetails",
    "partialRefundAmount",
    "tourCode",
    "ticketingUserCode",
    "pnrCreationUserCode",
    "endorsementAndRestrictions",
    "pnrCreationDate",
    "pnrCreationTimeZone",
    "paymentFOPDetails"
})
public class RevDocDetailsType {

    @XmlElement(name = "TransactionDate", required = true)
    protected DateOnlyType transactionDate;
    @XmlElement(name = "AgencyIATACode", required = true)
    protected String agencyIATACode;
    @XmlElement(name = "DocumentNumber", required = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentType", required = true)
    protected String documentType;
    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "IssueDateTimeZone", required = true)
    protected String issueDateTimeZone;
    @XmlElement(name = "TransactionType", required = true)
    protected String transactionType;
    protected boolean isConjunction;
    @XmlElement(name = "InitialTicketNumber")
    protected String initialTicketNumber;
    @XmlElement(name = "InternationalDomesticIndicator", required = true)
    protected String internationalDomesticIndicator;
    @XmlElement(name = "PNRNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "PassengerName", required = true)
    protected String passengerName;
    @XmlElement(name = "PassengerType", required = true)
    protected String passengerType;
    @XmlElement(name = "PassengerEmail", required = true)
    protected String passengerEmail;
    @XmlElement(name = "PassengerContact", required = true)
    protected String passengerContact;
    @XmlElement(name = "CouponDetails")
    protected List<RevDocCouponDetailsType> couponDetails;
    @XmlElement(name = "Fare")
    protected AmountType fare;
    @XmlElement(name = "FareCalculation")
    protected String fareCalculation;
    @XmlElement(name = "FareSurchargeAdc")
    protected AmountType fareSurchargeAdc;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "FeeName")
    protected String feeName;
    @XmlElement(name = "FeeAmount")
    protected AmountType feeAmount;
    @XmlElement(name = "TotalSurcharge")
    protected AmountType totalSurcharge;
    @XmlElement(name = "SurchargeDetails")
    protected List<RevDocSurchargeDetailsType> surchargeDetails;
    @XmlElement(name = "Discount")
    protected AmountType discount;
    @XmlElement(name = "TotalTaxAmount")
    protected AmountType totalTaxAmount;
    @XmlElement(name = "TotalAmount")
    protected AmountType totalAmount;
    @XmlElement(name = "BSPAmount", required = true)
    protected AmountType bspAmount;
    @XmlElement(name = "TaxDetails")
    protected List<RevDocTaxDetailsType> taxDetails;
    @XmlElement(name = "OriginalIssue")
    protected String originalIssue;
    @XmlElement(name = "IssuedInExchangeDetails")
    protected String issuedInExchangeDetails;
    @XmlElement(name = "PartialRefundAmount")
    protected AmountType partialRefundAmount;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    @XmlElement(name = "TicketingUserCode")
    protected String ticketingUserCode;
    @XmlElement(name = "PNRCreationUserCode")
    protected String pnrCreationUserCode;
    @XmlElement(name = "EndorsementAndRestrictions")
    protected List<String> endorsementAndRestrictions;
    @XmlElement(name = "PNRCreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pnrCreationDate;
    @XmlElement(name = "PNRCreationTimeZone", required = true)
    protected String pnrCreationTimeZone;
    @XmlElement(name = "PaymentFOPDetails")
    protected List<PaymentFOPDetailsType> paymentFOPDetails;

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setTransactionDate(DateOnlyType value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the agencyIATACode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyIATACode() {
        return agencyIATACode;
    }

    /**
     * Sets the value of the agencyIATACode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyIATACode(String value) {
        this.agencyIATACode = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issueDateTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDateTimeZone() {
        return issueDateTimeZone;
    }

    /**
     * Sets the value of the issueDateTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDateTimeZone(String value) {
        this.issueDateTimeZone = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the isConjunction property.
     * 
     */
    public boolean isIsConjunction() {
        return isConjunction;
    }

    /**
     * Sets the value of the isConjunction property.
     * 
     */
    public void setIsConjunction(boolean value) {
        this.isConjunction = value;
    }

    /**
     * Gets the value of the initialTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialTicketNumber() {
        return initialTicketNumber;
    }

    /**
     * Sets the value of the initialTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialTicketNumber(String value) {
        this.initialTicketNumber = value;
    }

    /**
     * Gets the value of the internationalDomesticIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalDomesticIndicator() {
        return internationalDomesticIndicator;
    }

    /**
     * Sets the value of the internationalDomesticIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalDomesticIndicator(String value) {
        this.internationalDomesticIndicator = value;
    }

    /**
     * Gets the value of the pnrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRNumber() {
        return pnrNumber;
    }

    /**
     * Sets the value of the pnrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the passengerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerEmail() {
        return passengerEmail;
    }

    /**
     * Sets the value of the passengerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerEmail(String value) {
        this.passengerEmail = value;
    }

    /**
     * Gets the value of the passengerContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerContact() {
        return passengerContact;
    }

    /**
     * Sets the value of the passengerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerContact(String value) {
        this.passengerContact = value;
    }

    /**
     * Gets the value of the couponDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevDocCouponDetailsType }
     * 
     * 
     */
    public List<RevDocCouponDetailsType> getCouponDetails() {
        if (couponDetails == null) {
            couponDetails = new ArrayList<RevDocCouponDetailsType>();
        }
        return this.couponDetails;
    }

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFare(AmountType value) {
        this.fare = value;
    }

    /**
     * Gets the value of the fareCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalculation() {
        return fareCalculation;
    }

    /**
     * Sets the value of the fareCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCalculation(String value) {
        this.fareCalculation = value;
    }

    /**
     * Gets the value of the fareSurchargeAdc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFareSurchargeAdc() {
        return fareSurchargeAdc;
    }

    /**
     * Sets the value of the fareSurchargeAdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFareSurchargeAdc(AmountType value) {
        this.fareSurchargeAdc = value;
    }

    /**
     * Gets the value of the feeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the feeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeName() {
        return feeName;
    }

    /**
     * Sets the value of the feeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeName(String value) {
        this.feeName = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFeeAmount(AmountType value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the totalSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalSurcharge() {
        return totalSurcharge;
    }

    /**
     * Sets the value of the totalSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalSurcharge(AmountType value) {
        this.totalSurcharge = value;
    }

    /**
     * Gets the value of the surchargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surchargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurchargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevDocSurchargeDetailsType }
     * 
     * 
     */
    public List<RevDocSurchargeDetailsType> getSurchargeDetails() {
        if (surchargeDetails == null) {
            surchargeDetails = new ArrayList<RevDocSurchargeDetailsType>();
        }
        return this.surchargeDetails;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDiscount(AmountType value) {
        this.discount = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalTaxAmount(AmountType value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the bspAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBSPAmount() {
        return bspAmount;
    }

    /**
     * Sets the value of the bspAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBSPAmount(AmountType value) {
        this.bspAmount = value;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevDocTaxDetailsType }
     * 
     * 
     */
    public List<RevDocTaxDetailsType> getTaxDetails() {
        if (taxDetails == null) {
            taxDetails = new ArrayList<RevDocTaxDetailsType>();
        }
        return this.taxDetails;
    }

    /**
     * Gets the value of the originalIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalIssue() {
        return originalIssue;
    }

    /**
     * Sets the value of the originalIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalIssue(String value) {
        this.originalIssue = value;
    }

    /**
     * Gets the value of the issuedInExchangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedInExchangeDetails() {
        return issuedInExchangeDetails;
    }

    /**
     * Sets the value of the issuedInExchangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedInExchangeDetails(String value) {
        this.issuedInExchangeDetails = value;
    }

    /**
     * Gets the value of the partialRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPartialRefundAmount() {
        return partialRefundAmount;
    }

    /**
     * Sets the value of the partialRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPartialRefundAmount(AmountType value) {
        this.partialRefundAmount = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the ticketingUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingUserCode() {
        return ticketingUserCode;
    }

    /**
     * Sets the value of the ticketingUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingUserCode(String value) {
        this.ticketingUserCode = value;
    }

    /**
     * Gets the value of the pnrCreationUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRCreationUserCode() {
        return pnrCreationUserCode;
    }

    /**
     * Sets the value of the pnrCreationUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRCreationUserCode(String value) {
        this.pnrCreationUserCode = value;
    }

    /**
     * Gets the value of the endorsementAndRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementAndRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementAndRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEndorsementAndRestrictions() {
        if (endorsementAndRestrictions == null) {
            endorsementAndRestrictions = new ArrayList<String>();
        }
        return this.endorsementAndRestrictions;
    }

    /**
     * Gets the value of the pnrCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPNRCreationDate() {
        return pnrCreationDate;
    }

    /**
     * Sets the value of the pnrCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPNRCreationDate(XMLGregorianCalendar value) {
        this.pnrCreationDate = value;
    }

    /**
     * Gets the value of the pnrCreationTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRCreationTimeZone() {
        return pnrCreationTimeZone;
    }

    /**
     * Sets the value of the pnrCreationTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRCreationTimeZone(String value) {
        this.pnrCreationTimeZone = value;
    }

    /**
     * Gets the value of the paymentFOPDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFOPDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFOPDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFOPDetailsType }
     * 
     * 
     */
    public List<PaymentFOPDetailsType> getPaymentFOPDetails() {
        if (paymentFOPDetails == null) {
            paymentFOPDetails = new ArrayList<PaymentFOPDetailsType>();
        }
        return this.paymentFOPDetails;
    }

}
