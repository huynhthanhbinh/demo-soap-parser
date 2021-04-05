
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNRDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OandDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDDetails" maxOccurs="unbounded"/>
 *         &lt;element name="GroupPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupPaxDetails" minOccurs="0"/>
 *         &lt;element name="PnrGuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrGuestDetailsType" maxOccurs="unbounded"/>
 *         &lt;element name="PnrContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrContact" maxOccurs="unbounded"/>
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BookerDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookerDetails" minOccurs="0"/>
 *         &lt;element name="LoyaltyDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}LoyaltyDetails" minOccurs="0"/>
 *         &lt;element name="PromoCodeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PromoCodeDetails" minOccurs="0"/>
 *         &lt;element name="CrossreferenceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CrossreferenceDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DiscountCouponDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DiscountCouponDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimeLimitDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TimeLimitDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalNonRefundableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DeletedPnrGuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrGuestDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRDetailsType", propOrder = {
    "oandDDetails",
    "groupPaxDetails",
    "pnrGuestDetails",
    "pnrContact",
    "ssrDetails",
    "comments",
    "bookerDetails",
    "loyaltyDetails",
    "promoCodeDetails",
    "crossreferenceDetails",
    "auxDetails",
    "discountCouponDetails",
    "timeLimitDetails",
    "totalNonRefundableAmount",
    "deletedPnrGuestDetails"
})
public class PNRDetailsType {

    @XmlElement(name = "OandDDetails", required = true)
    protected List<OandDDetails> oandDDetails;
    @XmlElement(name = "GroupPaxDetails")
    protected GroupPaxDetails groupPaxDetails;
    @XmlElement(name = "PnrGuestDetails", required = true)
    protected List<PnrGuestDetailsType> pnrGuestDetails;
    @XmlElement(name = "PnrContact", required = true)
    protected List<PnrContact> pnrContact;
    @XmlElement(name = "SSRDetails")
    protected List<SSRDetailsType> ssrDetails;
    @XmlElement(name = "Comments")
    protected List<CommentType> comments;
    @XmlElement(name = "BookerDetails")
    protected BookerDetails bookerDetails;
    @XmlElement(name = "LoyaltyDetails")
    protected LoyaltyDetails loyaltyDetails;
    @XmlElement(name = "PromoCodeDetails")
    protected PromoCodeDetails promoCodeDetails;
    @XmlElement(name = "CrossreferenceDetails")
    protected List<CrossreferenceDetailsType> crossreferenceDetails;
    @XmlElement(name = "AuxDetails")
    protected List<AuxDetailsType> auxDetails;
    @XmlElement(name = "DiscountCouponDetails")
    protected List<DiscountCouponDetails> discountCouponDetails;
    @XmlElement(name = "TimeLimitDetails")
    protected List<TimeLimitDetailsType> timeLimitDetails;
    protected Double totalNonRefundableAmount;
    @XmlElement(name = "DeletedPnrGuestDetails")
    protected List<PnrGuestDetailsType> deletedPnrGuestDetails;

    /**
     * Gets the value of the oandDDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oandDDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOandDDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDDetails }
     * 
     * 
     */
    public List<OandDDetails> getOandDDetails() {
        if (oandDDetails == null) {
            oandDDetails = new ArrayList<OandDDetails>();
        }
        return this.oandDDetails;
    }

    /**
     * Gets the value of the groupPaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GroupPaxDetails }
     *     
     */
    public GroupPaxDetails getGroupPaxDetails() {
        return groupPaxDetails;
    }

    /**
     * Sets the value of the groupPaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupPaxDetails }
     *     
     */
    public void setGroupPaxDetails(GroupPaxDetails value) {
        this.groupPaxDetails = value;
    }

    /**
     * Gets the value of the pnrGuestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrGuestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrGuestDetailsType }
     * 
     * 
     */
    public List<PnrGuestDetailsType> getPnrGuestDetails() {
        if (pnrGuestDetails == null) {
            pnrGuestDetails = new ArrayList<PnrGuestDetailsType>();
        }
        return this.pnrGuestDetails;
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
     * {@link PnrContact }
     * 
     * 
     */
    public List<PnrContact> getPnrContact() {
        if (pnrContact == null) {
            pnrContact = new ArrayList<PnrContact>();
        }
        return this.pnrContact;
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
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComments() {
        if (comments == null) {
            comments = new ArrayList<CommentType>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the bookerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BookerDetails }
     *     
     */
    public BookerDetails getBookerDetails() {
        return bookerDetails;
    }

    /**
     * Sets the value of the bookerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookerDetails }
     *     
     */
    public void setBookerDetails(BookerDetails value) {
        this.bookerDetails = value;
    }

    /**
     * Gets the value of the loyaltyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyDetails }
     *     
     */
    public LoyaltyDetails getLoyaltyDetails() {
        return loyaltyDetails;
    }

    /**
     * Sets the value of the loyaltyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyDetails }
     *     
     */
    public void setLoyaltyDetails(LoyaltyDetails value) {
        this.loyaltyDetails = value;
    }

    /**
     * Gets the value of the promoCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PromoCodeDetails }
     *     
     */
    public PromoCodeDetails getPromoCodeDetails() {
        return promoCodeDetails;
    }

    /**
     * Sets the value of the promoCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoCodeDetails }
     *     
     */
    public void setPromoCodeDetails(PromoCodeDetails value) {
        this.promoCodeDetails = value;
    }

    /**
     * Gets the value of the crossreferenceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossreferenceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossreferenceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossreferenceDetailsType }
     * 
     * 
     */
    public List<CrossreferenceDetailsType> getCrossreferenceDetails() {
        if (crossreferenceDetails == null) {
            crossreferenceDetails = new ArrayList<CrossreferenceDetailsType>();
        }
        return this.crossreferenceDetails;
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
     * Gets the value of the discountCouponDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCouponDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountCouponDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCouponDetails }
     * 
     * 
     */
    public List<DiscountCouponDetails> getDiscountCouponDetails() {
        if (discountCouponDetails == null) {
            discountCouponDetails = new ArrayList<DiscountCouponDetails>();
        }
        return this.discountCouponDetails;
    }

    /**
     * Gets the value of the timeLimitDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeLimitDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLimitDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeLimitDetailsType }
     * 
     * 
     */
    public List<TimeLimitDetailsType> getTimeLimitDetails() {
        if (timeLimitDetails == null) {
            timeLimitDetails = new ArrayList<TimeLimitDetailsType>();
        }
        return this.timeLimitDetails;
    }

    /**
     * Gets the value of the totalNonRefundableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalNonRefundableAmount() {
        return totalNonRefundableAmount;
    }

    /**
     * Sets the value of the totalNonRefundableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalNonRefundableAmount(Double value) {
        this.totalNonRefundableAmount = value;
    }

    /**
     * Gets the value of the deletedPnrGuestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedPnrGuestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedPnrGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrGuestDetailsType }
     * 
     * 
     */
    public List<PnrGuestDetailsType> getDeletedPnrGuestDetails() {
        if (deletedPnrGuestDetails == null) {
            deletedPnrGuestDetails = new ArrayList<PnrGuestDetailsType>();
        }
        return this.deletedPnrGuestDetails;
    }

}
