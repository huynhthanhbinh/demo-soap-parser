
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaxId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ApplicationType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeApplicationType" minOccurs="0"/>
 *         &lt;element name="canBypassFeeRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutomaticFeeAddedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OandDFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDFeeDetailsInputType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetailsPerGuest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SurChargeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SurChargeDetailsPerGuest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IsFeeWaiveRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFeeOverriden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplicableFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IsAddedInCurrentSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeInformation", propOrder = {
    "feeCode",
    "feeAmount",
    "feeId",
    "paxId",
    "applicationType",
    "canBypassFeeRules",
    "automaticFeeAddedStatus",
    "feeCurrency",
    "feeName",
    "oandDFeeDetails",
    "taxDetails",
    "surChargeDetails",
    "isFeeWaiveRequired",
    "isFeeOverriden",
    "applicableFeeAmount",
    "isAddedInCurrentSession"
})
public class FeeInformation {

    @XmlElement(name = "FeeCode", required = true)
    protected String feeCode;
    @XmlElement(name = "FeeAmount")
    protected double feeAmount;
    @XmlElement(name = "FeeId")
    protected Long feeId;
    @XmlElement(name = "PaxId")
    protected Long paxId;
    @XmlElement(name = "ApplicationType")
    @XmlSchemaType(name = "string")
    protected FeeApplicationType applicationType;
    protected Boolean canBypassFeeRules;
    @XmlElement(name = "AutomaticFeeAddedStatus")
    protected String automaticFeeAddedStatus;
    @XmlElement(name = "FeeCurrency", required = true)
    protected String feeCurrency;
    @XmlElement(name = "FeeName")
    protected String feeName;
    @XmlElement(name = "OandDFeeDetails")
    protected List<OandDFeeDetailsInputType> oandDFeeDetails;
    @XmlElement(name = "TaxDetails")
    protected List<TaxDetailsPerGuest> taxDetails;
    @XmlElement(name = "SurChargeDetails")
    protected List<SurChargeDetailsPerGuest> surChargeDetails;
    @XmlElement(name = "IsFeeWaiveRequired")
    protected Boolean isFeeWaiveRequired;
    @XmlElement(name = "IsFeeOverriden")
    protected Boolean isFeeOverriden;
    @XmlElement(name = "ApplicableFeeAmount")
    protected Double applicableFeeAmount;
    @XmlElement(name = "IsAddedInCurrentSession")
    protected Boolean isAddedInCurrentSession;

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
     * Gets the value of the paxId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaxId() {
        return paxId;
    }

    /**
     * Sets the value of the paxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaxId(Long value) {
        this.paxId = value;
    }

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link FeeApplicationType }
     *     
     */
    public FeeApplicationType getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeApplicationType }
     *     
     */
    public void setApplicationType(FeeApplicationType value) {
        this.applicationType = value;
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
     * Gets the value of the automaticFeeAddedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticFeeAddedStatus() {
        return automaticFeeAddedStatus;
    }

    /**
     * Sets the value of the automaticFeeAddedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticFeeAddedStatus(String value) {
        this.automaticFeeAddedStatus = value;
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
     * Gets the value of the oandDFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oandDFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOandDFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDFeeDetailsInputType }
     * 
     * 
     */
    public List<OandDFeeDetailsInputType> getOandDFeeDetails() {
        if (oandDFeeDetails == null) {
            oandDFeeDetails = new ArrayList<OandDFeeDetailsInputType>();
        }
        return this.oandDFeeDetails;
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
     * {@link TaxDetailsPerGuest }
     * 
     * 
     */
    public List<TaxDetailsPerGuest> getTaxDetails() {
        if (taxDetails == null) {
            taxDetails = new ArrayList<TaxDetailsPerGuest>();
        }
        return this.taxDetails;
    }

    /**
     * Gets the value of the surChargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surChargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurChargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurChargeDetailsPerGuest }
     * 
     * 
     */
    public List<SurChargeDetailsPerGuest> getSurChargeDetails() {
        if (surChargeDetails == null) {
            surChargeDetails = new ArrayList<SurChargeDetailsPerGuest>();
        }
        return this.surChargeDetails;
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
     * Gets the value of the applicableFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getApplicableFeeAmount() {
        return applicableFeeAmount;
    }

    /**
     * Sets the value of the applicableFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setApplicableFeeAmount(Double value) {
        this.applicableFeeAmount = value;
    }

    /**
     * Gets the value of the isAddedInCurrentSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAddedInCurrentSession() {
        return isAddedInCurrentSession;
    }

    /**
     * Sets the value of the isAddedInCurrentSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAddedInCurrentSession(Boolean value) {
        this.isAddedInCurrentSession = value;
    }

}
