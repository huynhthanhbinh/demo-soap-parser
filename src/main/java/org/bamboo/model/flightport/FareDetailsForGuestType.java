
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareDetailsForGuestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDetailsForGuestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareTypeLocalLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareRuleDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxDetails_Type" minOccurs="0"/>
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReturnRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FareTransactionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareSubTypeLocalLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingUnitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FareComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsFareRuleOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailsForGuestType", propOrder = {
    "fareLevel",
    "fareType",
    "fareTypeLocalLang",
    "fareRuleDesc",
    "fareBasisCode",
    "fareClass",
    "guestType",
    "baseFare",
    "currency",
    "returnRestrictionInd",
    "fareTransactionID",
    "segmentId",
    "fareSubType",
    "fareSubTypeLocalLang",
    "pricingUnitID",
    "fareComponentId",
    "isFareRuleOverridden"
})
public class FareDetailsForGuestType {

    @XmlElement(name = "FareLevel")
    protected String fareLevel;
    @XmlElement(name = "FareType")
    protected String fareType;
    @XmlElement(name = "FareTypeLocalLang")
    protected String fareTypeLocalLang;
    @XmlElement(name = "FareRuleDesc")
    protected String fareRuleDesc;
    @XmlElement(name = "FareBasisCode", required = true)
    protected String fareBasisCode;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "GuestType")
    @XmlSchemaType(name = "string")
    protected PaxDetailsType guestType;
    @XmlElement(name = "BaseFare")
    protected Double baseFare;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "ReturnRestrictionInd")
    protected Boolean returnRestrictionInd;
    @XmlElement(name = "FareTransactionID")
    protected Long fareTransactionID;
    @XmlElement(name = "SegmentId", type = Long.class)
    protected List<Long> segmentId;
    @XmlElement(name = "FareSubType")
    protected String fareSubType;
    @XmlElement(name = "FareSubTypeLocalLang")
    protected String fareSubTypeLocalLang;
    @XmlElement(name = "PricingUnitID")
    protected Integer pricingUnitID;
    @XmlElement(name = "FareComponentId")
    protected String fareComponentId;
    @XmlElement(name = "IsFareRuleOverridden")
    protected Boolean isFareRuleOverridden;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * Gets the value of the fareLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevel() {
        return fareLevel;
    }

    /**
     * Sets the value of the fareLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevel(String value) {
        this.fareLevel = value;
    }

    /**
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

    /**
     * Gets the value of the fareTypeLocalLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTypeLocalLang() {
        return fareTypeLocalLang;
    }

    /**
     * Sets the value of the fareTypeLocalLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareTypeLocalLang(String value) {
        this.fareTypeLocalLang = value;
    }

    /**
     * Gets the value of the fareRuleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRuleDesc() {
        return fareRuleDesc;
    }

    /**
     * Sets the value of the fareRuleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRuleDesc(String value) {
        this.fareRuleDesc = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the guestType property.
     * 
     * @return
     *     possible object is
     *     {@link PaxDetailsType }
     *     
     */
    public PaxDetailsType getGuestType() {
        return guestType;
    }

    /**
     * Sets the value of the guestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxDetailsType }
     *     
     */
    public void setGuestType(PaxDetailsType value) {
        this.guestType = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseFare(Double value) {
        this.baseFare = value;
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
     * Gets the value of the returnRestrictionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnRestrictionInd() {
        return returnRestrictionInd;
    }

    /**
     * Sets the value of the returnRestrictionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnRestrictionInd(Boolean value) {
        this.returnRestrictionInd = value;
    }

    /**
     * Gets the value of the fareTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFareTransactionID() {
        return fareTransactionID;
    }

    /**
     * Sets the value of the fareTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFareTransactionID(Long value) {
        this.fareTransactionID = value;
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
     * Gets the value of the fareSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareSubType() {
        return fareSubType;
    }

    /**
     * Sets the value of the fareSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareSubType(String value) {
        this.fareSubType = value;
    }

    /**
     * Gets the value of the fareSubTypeLocalLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareSubTypeLocalLang() {
        return fareSubTypeLocalLang;
    }

    /**
     * Sets the value of the fareSubTypeLocalLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareSubTypeLocalLang(String value) {
        this.fareSubTypeLocalLang = value;
    }

    /**
     * Gets the value of the pricingUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPricingUnitID() {
        return pricingUnitID;
    }

    /**
     * Sets the value of the pricingUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPricingUnitID(Integer value) {
        this.pricingUnitID = value;
    }

    /**
     * Gets the value of the fareComponentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareComponentId() {
        return fareComponentId;
    }

    /**
     * Sets the value of the fareComponentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareComponentId(String value) {
        this.fareComponentId = value;
    }

    /**
     * Gets the value of the isFareRuleOverridden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFareRuleOverridden() {
        return isFareRuleOverridden;
    }

    /**
     * Sets the value of the isFareRuleOverridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFareRuleOverridden(Boolean value) {
        this.isFareRuleOverridden = value;
    }

    /**
     * Gets the value of the richContentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichContentRef() {
        return richContentRef;
    }

    /**
     * Sets the value of the richContentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichContentRef(String value) {
        this.richContentRef = value;
    }

}
