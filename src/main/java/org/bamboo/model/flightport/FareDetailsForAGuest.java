
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareDetailsForAGuest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDetailsForAGuest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareTypeLocalLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareQuoteDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareQuoteDetailsType" minOccurs="0"/>
 *         &lt;element name="FareRuleDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType" minOccurs="0"/>
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AppliedFare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaxDetailsPerGuest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SurChargeDetailsPerGuest" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayFareAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FareSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareSubTypeLocalLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FareTransactionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InventoryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailsForAGuest", propOrder = {
    "fareLevel",
    "fareType",
    "fareTypeLocalLang",
    "fareQuoteDetails",
    "fareRuleDesc",
    "fareBasisCode",
    "fareClass",
    "guestType",
    "baseFare",
    "appliedFare",
    "numberOfSeats",
    "taxDetailsPerGuest",
    "surChargeDetailsPerGuest",
    "currency",
    "guestId",
    "displayFareAmount",
    "totalPaymentAmount",
    "fareSubType",
    "fareSubTypeLocalLang",
    "returnRestrictionInd",
    "fareTransactionID",
    "inventoryStatus"
})
public class FareDetailsForAGuest {

    @XmlElement(name = "FareLevel")
    protected String fareLevel;
    @XmlElement(name = "FareType")
    protected String fareType;
    @XmlElement(name = "FareTypeLocalLang")
    protected String fareTypeLocalLang;
    @XmlElement(name = "FareQuoteDetails")
    protected FareQuoteDetailsType fareQuoteDetails;
    @XmlElement(name = "FareRuleDesc")
    protected String fareRuleDesc;
    @XmlElement(name = "FareBasisCode", required = true)
    protected String fareBasisCode;
    @XmlElement(name = "FareClass", required = true)
    protected String fareClass;
    @XmlElement(name = "GuestType")
    @XmlSchemaType(name = "string")
    protected GuestType guestType;
    @XmlElement(name = "BaseFare")
    protected double baseFare;
    @XmlElement(name = "AppliedFare")
    protected Double appliedFare;
    @XmlElement(name = "NumberOfSeats")
    protected int numberOfSeats;
    @XmlElement(name = "TaxDetailsPerGuest")
    protected double taxDetailsPerGuest;
    @XmlElement(name = "SurChargeDetailsPerGuest")
    protected Double surChargeDetailsPerGuest;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "DisplayFareAmount")
    protected double displayFareAmount;
    @XmlElement(name = "TotalPaymentAmount")
    protected Double totalPaymentAmount;
    @XmlElement(name = "FareSubType")
    protected String fareSubType;
    @XmlElement(name = "FareSubTypeLocalLang")
    protected String fareSubTypeLocalLang;
    @XmlElement(name = "ReturnRestrictionInd")
    protected Boolean returnRestrictionInd;
    @XmlElement(name = "FareTransactionID")
    protected Long fareTransactionID;
    @XmlElement(name = "InventoryStatus")
    protected String inventoryStatus;

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
     * Gets the value of the fareQuoteDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareQuoteDetailsType }
     *     
     */
    public FareQuoteDetailsType getFareQuoteDetails() {
        return fareQuoteDetails;
    }

    /**
     * Sets the value of the fareQuoteDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareQuoteDetailsType }
     *     
     */
    public void setFareQuoteDetails(FareQuoteDetailsType value) {
        this.fareQuoteDetails = value;
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
     *     {@link GuestType }
     *     
     */
    public GuestType getGuestType() {
        return guestType;
    }

    /**
     * Sets the value of the guestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestType }
     *     
     */
    public void setGuestType(GuestType value) {
        this.guestType = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     */
    public double getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     */
    public void setBaseFare(double value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the appliedFare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAppliedFare() {
        return appliedFare;
    }

    /**
     * Sets the value of the appliedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAppliedFare(Double value) {
        this.appliedFare = value;
    }

    /**
     * Gets the value of the numberOfSeats property.
     * 
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Sets the value of the numberOfSeats property.
     * 
     */
    public void setNumberOfSeats(int value) {
        this.numberOfSeats = value;
    }

    /**
     * Gets the value of the taxDetailsPerGuest property.
     * 
     */
    public double getTaxDetailsPerGuest() {
        return taxDetailsPerGuest;
    }

    /**
     * Sets the value of the taxDetailsPerGuest property.
     * 
     */
    public void setTaxDetailsPerGuest(double value) {
        this.taxDetailsPerGuest = value;
    }

    /**
     * Gets the value of the surChargeDetailsPerGuest property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSurChargeDetailsPerGuest() {
        return surChargeDetailsPerGuest;
    }

    /**
     * Sets the value of the surChargeDetailsPerGuest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSurChargeDetailsPerGuest(Double value) {
        this.surChargeDetailsPerGuest = value;
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
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestId(String value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the displayFareAmount property.
     * 
     */
    public double getDisplayFareAmount() {
        return displayFareAmount;
    }

    /**
     * Sets the value of the displayFareAmount property.
     * 
     */
    public void setDisplayFareAmount(double value) {
        this.displayFareAmount = value;
    }

    /**
     * Gets the value of the totalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * Sets the value of the totalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPaymentAmount(Double value) {
        this.totalPaymentAmount = value;
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
     * Gets the value of the inventoryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryStatus() {
        return inventoryStatus;
    }

    /**
     * Sets the value of the inventoryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryStatus(String value) {
        this.inventoryStatus = value;
    }

}
