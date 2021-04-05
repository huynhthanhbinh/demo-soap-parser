
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateBookingRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateBookingRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BasePnrRQType">
 *       &lt;sequence>
 *         &lt;element name="PnrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaxCountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxCountDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItineraryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestRequestDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConsentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ConsentDetailsRequestType" minOccurs="0"/>
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatAssignmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignmentDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelDocuments" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocumentsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GroupPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupPaxDetailsType" minOccurs="0"/>
 *         &lt;element name="PnrContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrContactType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PnrComments" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestLoyaltyInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestLoyaltyInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestPaymentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestPaymentInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PromoCodeDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PromoCodeDetailsType" minOccurs="0"/>
 *         &lt;element name="CanContinueWithSsr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidateSeatSsr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PnrSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPnrUnpaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExternalBookingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pnrOnHoldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DiscountCouponDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxDiscountCouponDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalRecordLocatorDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ExternalRecordLocatorDetailsType" minOccurs="0"/>
 *         &lt;element name="PointOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomFieldList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomFieldListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateBookingRQ", propOrder = {
    "pnrType",
    "numberOfSeats",
    "paxCountDetails",
    "itineraryDetails",
    "fareInfo",
    "guestDetails",
    "consentDetails",
    "ssrDetails",
    "auxDetails",
    "seatAssignmentDetails",
    "travelDocuments",
    "groupPaxDetails",
    "pnrContact",
    "pnrComments",
    "guestLoyaltyInfo",
    "guestPaymentInfo",
    "feeInformation",
    "promoCodeDetailsType",
    "canContinueWithSsr",
    "isValidateSeatSsr",
    "pnrSessionId",
    "isPnrUnpaid",
    "externalBookingNumber",
    "pnrOnHoldIndicator",
    "discountCouponDetailsType",
    "externalRecordLocatorDetailsType",
    "pointOfOrigin",
    "currency",
    "customFieldList"
})
public class CreateBookingRQ
    extends BasePnrRQType
{

    @XmlElement(name = "PnrType")
    protected String pnrType;
    @XmlElement(name = "NumberOfSeats")
    protected Integer numberOfSeats;
    @XmlElement(name = "PaxCountDetails")
    protected List<PaxCountDetailsType> paxCountDetails;
    @XmlElement(name = "ItineraryDetails")
    protected List<ItineraryDetailsType> itineraryDetails;
    @XmlElement(name = "FareInfo")
    protected List<FareInfoType> fareInfo;
    @XmlElement(name = "GuestDetails")
    protected List<GuestRequestDetailsType> guestDetails;
    @XmlElement(name = "ConsentDetails")
    protected ConsentDetailsRequestType consentDetails;
    @XmlElement(name = "SSRDetails")
    protected List<SSRInformationType> ssrDetails;
    @XmlElement(name = "AuxDetails")
    protected List<AuxInformationType> auxDetails;
    @XmlElement(name = "SeatAssignmentDetails")
    protected List<SeatAssignmentDetailsType> seatAssignmentDetails;
    @XmlElement(name = "TravelDocuments")
    protected List<TravelDocumentsType> travelDocuments;
    @XmlElement(name = "GroupPaxDetails")
    protected GroupPaxDetailsType groupPaxDetails;
    @XmlElement(name = "PnrContact")
    protected List<PnrContactType> pnrContact;
    @XmlElement(name = "PnrComments")
    protected List<CommentDetailsType> pnrComments;
    @XmlElement(name = "GuestLoyaltyInfo")
    protected List<GuestLoyaltyInfoType> guestLoyaltyInfo;
    @XmlElement(name = "GuestPaymentInfo")
    protected List<GuestPaymentInfoType> guestPaymentInfo;
    @XmlElement(name = "FeeInformation")
    protected List<FeeRequestType> feeInformation;
    @XmlElement(name = "PromoCodeDetailsType")
    protected PromoCodeDetailsType promoCodeDetailsType;
    @XmlElement(name = "CanContinueWithSsr")
    protected Boolean canContinueWithSsr;
    @XmlElement(name = "IsValidateSeatSsr")
    protected Boolean isValidateSeatSsr;
    @XmlElement(name = "PnrSessionId")
    protected String pnrSessionId;
    protected Boolean isPnrUnpaid;
    @XmlElement(name = "ExternalBookingNumber")
    protected String externalBookingNumber;
    protected Boolean pnrOnHoldIndicator;
    @XmlElement(name = "DiscountCouponDetailsType")
    protected List<PaxDiscountCouponDetailsType> discountCouponDetailsType;
    @XmlElement(name = "ExternalRecordLocatorDetailsType")
    protected ExternalRecordLocatorDetailsType externalRecordLocatorDetailsType;
    @XmlElement(name = "PointOfOrigin")
    protected String pointOfOrigin;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CustomFieldList")
    protected CustomFieldListType customFieldList;

    /**
     * Gets the value of the pnrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrType() {
        return pnrType;
    }

    /**
     * Sets the value of the pnrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrType(String value) {
        this.pnrType = value;
    }

    /**
     * Gets the value of the numberOfSeats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Sets the value of the numberOfSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSeats(Integer value) {
        this.numberOfSeats = value;
    }

    /**
     * Gets the value of the paxCountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxCountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxCountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxCountDetailsType }
     * 
     * 
     */
    public List<PaxCountDetailsType> getPaxCountDetails() {
        if (paxCountDetails == null) {
            paxCountDetails = new ArrayList<PaxCountDetailsType>();
        }
        return this.paxCountDetails;
    }

    /**
     * Gets the value of the itineraryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDetailsType }
     * 
     * 
     */
    public List<ItineraryDetailsType> getItineraryDetails() {
        if (itineraryDetails == null) {
            itineraryDetails = new ArrayList<ItineraryDetailsType>();
        }
        return this.itineraryDetails;
    }

    /**
     * Gets the value of the fareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoType }
     * 
     * 
     */
    public List<FareInfoType> getFareInfo() {
        if (fareInfo == null) {
            fareInfo = new ArrayList<FareInfoType>();
        }
        return this.fareInfo;
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
     * {@link GuestRequestDetailsType }
     * 
     * 
     */
    public List<GuestRequestDetailsType> getGuestDetails() {
        if (guestDetails == null) {
            guestDetails = new ArrayList<GuestRequestDetailsType>();
        }
        return this.guestDetails;
    }

    /**
     * Gets the value of the consentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentDetailsRequestType }
     *     
     */
    public ConsentDetailsRequestType getConsentDetails() {
        return consentDetails;
    }

    /**
     * Sets the value of the consentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentDetailsRequestType }
     *     
     */
    public void setConsentDetails(ConsentDetailsRequestType value) {
        this.consentDetails = value;
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
     * {@link SSRInformationType }
     * 
     * 
     */
    public List<SSRInformationType> getSSRDetails() {
        if (ssrDetails == null) {
            ssrDetails = new ArrayList<SSRInformationType>();
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
     * {@link AuxInformationType }
     * 
     * 
     */
    public List<AuxInformationType> getAuxDetails() {
        if (auxDetails == null) {
            auxDetails = new ArrayList<AuxInformationType>();
        }
        return this.auxDetails;
    }

    /**
     * Gets the value of the seatAssignmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAssignmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAssignmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAssignmentDetailsType }
     * 
     * 
     */
    public List<SeatAssignmentDetailsType> getSeatAssignmentDetails() {
        if (seatAssignmentDetails == null) {
            seatAssignmentDetails = new ArrayList<SeatAssignmentDetailsType>();
        }
        return this.seatAssignmentDetails;
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
     * {@link TravelDocumentsType }
     * 
     * 
     */
    public List<TravelDocumentsType> getTravelDocuments() {
        if (travelDocuments == null) {
            travelDocuments = new ArrayList<TravelDocumentsType>();
        }
        return this.travelDocuments;
    }

    /**
     * Gets the value of the groupPaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GroupPaxDetailsType }
     *     
     */
    public GroupPaxDetailsType getGroupPaxDetails() {
        return groupPaxDetails;
    }

    /**
     * Sets the value of the groupPaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupPaxDetailsType }
     *     
     */
    public void setGroupPaxDetails(GroupPaxDetailsType value) {
        this.groupPaxDetails = value;
    }

    /**
     * Gets the value of the pnrContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrContactType }
     * 
     * 
     */
    public List<PnrContactType> getPnrContact() {
        if (pnrContact == null) {
            pnrContact = new ArrayList<PnrContactType>();
        }
        return this.pnrContact;
    }

    /**
     * Gets the value of the pnrComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentDetailsType }
     * 
     * 
     */
    public List<CommentDetailsType> getPnrComments() {
        if (pnrComments == null) {
            pnrComments = new ArrayList<CommentDetailsType>();
        }
        return this.pnrComments;
    }

    /**
     * Gets the value of the guestLoyaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestLoyaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestLoyaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestLoyaltyInfoType }
     * 
     * 
     */
    public List<GuestLoyaltyInfoType> getGuestLoyaltyInfo() {
        if (guestLoyaltyInfo == null) {
            guestLoyaltyInfo = new ArrayList<GuestLoyaltyInfoType>();
        }
        return this.guestLoyaltyInfo;
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
     * {@link GuestPaymentInfoType }
     * 
     * 
     */
    public List<GuestPaymentInfoType> getGuestPaymentInfo() {
        if (guestPaymentInfo == null) {
            guestPaymentInfo = new ArrayList<GuestPaymentInfoType>();
        }
        return this.guestPaymentInfo;
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
     * {@link FeeRequestType }
     * 
     * 
     */
    public List<FeeRequestType> getFeeInformation() {
        if (feeInformation == null) {
            feeInformation = new ArrayList<FeeRequestType>();
        }
        return this.feeInformation;
    }

    /**
     * Gets the value of the promoCodeDetailsType property.
     * 
     * @return
     *     possible object is
     *     {@link PromoCodeDetailsType }
     *     
     */
    public PromoCodeDetailsType getPromoCodeDetailsType() {
        return promoCodeDetailsType;
    }

    /**
     * Sets the value of the promoCodeDetailsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoCodeDetailsType }
     *     
     */
    public void setPromoCodeDetailsType(PromoCodeDetailsType value) {
        this.promoCodeDetailsType = value;
    }

    /**
     * Gets the value of the canContinueWithSsr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanContinueWithSsr() {
        return canContinueWithSsr;
    }

    /**
     * Sets the value of the canContinueWithSsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanContinueWithSsr(Boolean value) {
        this.canContinueWithSsr = value;
    }

    /**
     * Gets the value of the isValidateSeatSsr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidateSeatSsr() {
        return isValidateSeatSsr;
    }

    /**
     * Sets the value of the isValidateSeatSsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidateSeatSsr(Boolean value) {
        this.isValidateSeatSsr = value;
    }

    /**
     * Gets the value of the pnrSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrSessionId() {
        return pnrSessionId;
    }

    /**
     * Sets the value of the pnrSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrSessionId(String value) {
        this.pnrSessionId = value;
    }

    /**
     * Gets the value of the isPnrUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPnrUnpaid() {
        return isPnrUnpaid;
    }

    /**
     * Sets the value of the isPnrUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPnrUnpaid(Boolean value) {
        this.isPnrUnpaid = value;
    }

    /**
     * Gets the value of the externalBookingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBookingNumber() {
        return externalBookingNumber;
    }

    /**
     * Sets the value of the externalBookingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBookingNumber(String value) {
        this.externalBookingNumber = value;
    }

    /**
     * Gets the value of the pnrOnHoldIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPnrOnHoldIndicator() {
        return pnrOnHoldIndicator;
    }

    /**
     * Sets the value of the pnrOnHoldIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPnrOnHoldIndicator(Boolean value) {
        this.pnrOnHoldIndicator = value;
    }

    /**
     * Gets the value of the discountCouponDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCouponDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountCouponDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxDiscountCouponDetailsType }
     * 
     * 
     */
    public List<PaxDiscountCouponDetailsType> getDiscountCouponDetailsType() {
        if (discountCouponDetailsType == null) {
            discountCouponDetailsType = new ArrayList<PaxDiscountCouponDetailsType>();
        }
        return this.discountCouponDetailsType;
    }

    /**
     * Gets the value of the externalRecordLocatorDetailsType property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRecordLocatorDetailsType }
     *     
     */
    public ExternalRecordLocatorDetailsType getExternalRecordLocatorDetailsType() {
        return externalRecordLocatorDetailsType;
    }

    /**
     * Sets the value of the externalRecordLocatorDetailsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRecordLocatorDetailsType }
     *     
     */
    public void setExternalRecordLocatorDetailsType(ExternalRecordLocatorDetailsType value) {
        this.externalRecordLocatorDetailsType = value;
    }

    /**
     * Gets the value of the pointOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfOrigin() {
        return pointOfOrigin;
    }

    /**
     * Sets the value of the pointOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfOrigin(String value) {
        this.pointOfOrigin = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldListType }
     *     
     */
    public CustomFieldListType getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldListType }
     *     
     */
    public void setCustomFieldList(CustomFieldListType value) {
        this.customFieldList = value;
    }

}
