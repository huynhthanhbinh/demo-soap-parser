
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxDiscountCouponDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxDiscountCouponDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscountCouponID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SegmentGroupingID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxDiscountCouponDetailsType", propOrder = {
    "discountCouponID",
    "guestID",
    "segmentGroupingID"
})
public class PaxDiscountCouponDetailsType {

    @XmlElement(name = "DiscountCouponID")
    protected String discountCouponID;
    @XmlElement(name = "GuestID", required = true)
    protected String guestID;
    @XmlElement(name = "SegmentGroupingID", required = true)
    protected String segmentGroupingID;

    /**
     * Gets the value of the discountCouponID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCouponID() {
        return discountCouponID;
    }

    /**
     * Sets the value of the discountCouponID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCouponID(String value) {
        this.discountCouponID = value;
    }

    /**
     * Gets the value of the guestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestID() {
        return guestID;
    }

    /**
     * Sets the value of the guestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestID(String value) {
        this.guestID = value;
    }

    /**
     * Gets the value of the segmentGroupingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentGroupingID() {
        return segmentGroupingID;
    }

    /**
     * Sets the value of the segmentGroupingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentGroupingID(String value) {
        this.segmentGroupingID = value;
    }

}
