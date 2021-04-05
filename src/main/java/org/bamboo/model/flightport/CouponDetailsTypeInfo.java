
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponDetailsTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponDetailsTypeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RfiscCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AncillaryDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillaryDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponDetailsTypeInfo", propOrder = {
    "rfiscCode",
    "couponStatus",
    "couponNumber",
    "segmentId",
    "ancillaryDetailsType"
})
public class CouponDetailsTypeInfo {

    @XmlElement(name = "RfiscCode")
    protected String rfiscCode;
    @XmlElement(name = "CouponStatus")
    protected String couponStatus;
    @XmlElement(name = "CouponNumber")
    protected Integer couponNumber;
    @XmlElement(name = "SegmentId", type = Long.class)
    protected List<Long> segmentId;
    @XmlElement(name = "AncillaryDetailsType")
    protected List<AncillaryDetailsType> ancillaryDetailsType;

    /**
     * Gets the value of the rfiscCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfiscCode() {
        return rfiscCode;
    }

    /**
     * Sets the value of the rfiscCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfiscCode(String value) {
        this.rfiscCode = value;
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
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCouponNumber(Integer value) {
        this.couponNumber = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSegmentId() {
        if (segmentId == null) {
            segmentId = new ArrayList<Long>();
        }
        return this.segmentId;
    }

    /**
     * Gets the value of the ancillaryDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryDetailsType }
     * 
     * 
     */
    public List<AncillaryDetailsType> getAncillaryDetailsType() {
        if (ancillaryDetailsType == null) {
            ancillaryDetailsType = new ArrayList<AncillaryDetailsType>();
        }
        return this.ancillaryDetailsType;
    }

}
