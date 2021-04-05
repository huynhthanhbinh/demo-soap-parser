
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestCouponDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestCouponDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotValidBefore" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyDetailsType"/>
 *         &lt;element name="NotValidAfter" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyDetailsType"/>
 *         &lt;element name="BaggageAllowance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="boardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestCouponDetailsType", propOrder = {
    "couponNumber",
    "couponStatus",
    "notValidBefore",
    "notValidAfter",
    "baggageAllowance",
    "boardPoint",
    "offPoint",
    "segmentId"
})
public class GuestCouponDetailsType {

    @XmlElement(name = "CouponNumber", required = true)
    protected String couponNumber;
    @XmlElement(name = "CouponStatus")
    protected String couponStatus;
    @XmlElement(name = "NotValidBefore", required = true)
    protected DateOnlyDetailsType notValidBefore;
    @XmlElement(name = "NotValidAfter", required = true)
    protected DateOnlyDetailsType notValidAfter;
    @XmlElement(name = "BaggageAllowance", required = true)
    protected String baggageAllowance;
    @XmlElement(required = true)
    protected String boardPoint;
    @XmlElement(required = true)
    protected String offPoint;
    @XmlElement(name = "SegmentId")
    protected long segmentId;

    /**
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponNumber(String value) {
        this.couponNumber = value;
    }

    /**
     * Gets the value of the couponStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponStatus() {
        return couponStatus;
    }

    /**
     * Sets the value of the couponStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponStatus(String value) {
        this.couponStatus = value;
    }

    /**
     * Gets the value of the notValidBefore property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public DateOnlyDetailsType getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public void setNotValidBefore(DateOnlyDetailsType value) {
        this.notValidBefore = value;
    }

    /**
     * Gets the value of the notValidAfter property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public DateOnlyDetailsType getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public void setNotValidAfter(DateOnlyDetailsType value) {
        this.notValidAfter = value;
    }

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowance(String value) {
        this.baggageAllowance = value;
    }

    /**
     * Gets the value of the boardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * Sets the value of the boardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * Gets the value of the offPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     */
    public long getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     */
    public void setSegmentId(long value) {
        this.segmentId = value;
    }

}
