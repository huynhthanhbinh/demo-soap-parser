
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicationType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeApplicationDetails_Type" minOccurs="0"/>
 *         &lt;element name="AncillaryDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillaryDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="canBypassFeeRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeeCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsFeeWaiveRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFeeOverriden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isFopFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WaiverOverrideReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WaiverCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeRequestType", propOrder = {
    "feeCode",
    "feeAmount",
    "feeId",
    "guestId",
    "segmentId",
    "applicationType",
    "ancillaryDetailsType",
    "canBypassFeeRules",
    "feeCurrency",
    "isFeeWaiveRequired",
    "isFeeOverriden",
    "isFopFee",
    "waiverOverrideReason",
    "certificateNumber",
    "waiverCode"
})
public class FeeRequestType {

    @XmlElement(name = "FeeCode", required = true)
    protected String feeCode;
    @XmlElement(name = "FeeAmount")
    protected double feeAmount;
    @XmlElement(name = "FeeId")
    protected Long feeId;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "SegmentId")
    protected List<String> segmentId;
    @XmlElement(name = "ApplicationType")
    @XmlSchemaType(name = "string")
    protected FeeApplicationDetailsType applicationType;
    @XmlElement(name = "AncillaryDetailsType")
    protected List<AncillaryDetailsType> ancillaryDetailsType;
    protected Boolean canBypassFeeRules;
    @XmlElement(name = "FeeCurrency", required = true)
    protected String feeCurrency;
    @XmlElement(name = "IsFeeWaiveRequired")
    protected Boolean isFeeWaiveRequired;
    @XmlElement(name = "IsFeeOverriden")
    protected Boolean isFeeOverriden;
    protected Boolean isFopFee;
    @XmlElement(name = "WaiverOverrideReason")
    protected String waiverOverrideReason;
    @XmlElement(name = "CertificateNumber")
    protected String certificateNumber;
    @XmlElement(name = "WaiverCode")
    protected String waiverCode;

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
     * Gets the value of the feeAmount property.
     * 
     */
    public double getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     */
    public void setFeeAmount(double value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the feeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeeId() {
        return feeId;
    }

    /**
     * Sets the value of the feeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeeId(Long value) {
        this.feeId = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getSegmentId() {
        if (segmentId == null) {
            segmentId = new ArrayList<String>();
        }
        return this.segmentId;
    }

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link FeeApplicationDetailsType }
     *     
     */
    public FeeApplicationDetailsType getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeApplicationDetailsType }
     *     
     */
    public void setApplicationType(FeeApplicationDetailsType value) {
        this.applicationType = value;
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

    /**
     * Gets the value of the canBypassFeeRules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBypassFeeRules() {
        return canBypassFeeRules;
    }

    /**
     * Sets the value of the canBypassFeeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBypassFeeRules(Boolean value) {
        this.canBypassFeeRules = value;
    }

    /**
     * Gets the value of the feeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCurrency() {
        return feeCurrency;
    }

    /**
     * Sets the value of the feeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCurrency(String value) {
        this.feeCurrency = value;
    }

    /**
     * Gets the value of the isFeeWaiveRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeeWaiveRequired() {
        return isFeeWaiveRequired;
    }

    /**
     * Sets the value of the isFeeWaiveRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeeWaiveRequired(Boolean value) {
        this.isFeeWaiveRequired = value;
    }

    /**
     * Gets the value of the isFeeOverriden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeeOverriden() {
        return isFeeOverriden;
    }

    /**
     * Sets the value of the isFeeOverriden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeeOverriden(Boolean value) {
        this.isFeeOverriden = value;
    }

    /**
     * Gets the value of the isFopFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFopFee() {
        return isFopFee;
    }

    /**
     * Sets the value of the isFopFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFopFee(Boolean value) {
        this.isFopFee = value;
    }

    /**
     * Gets the value of the waiverOverrideReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverOverrideReason() {
        return waiverOverrideReason;
    }

    /**
     * Sets the value of the waiverOverrideReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverOverrideReason(String value) {
        this.waiverOverrideReason = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the waiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverCode(String value) {
        this.waiverCode = value;
    }

}
