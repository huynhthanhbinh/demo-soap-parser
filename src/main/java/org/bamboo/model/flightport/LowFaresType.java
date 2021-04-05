
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
 * <p>Java class for LowFaresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LowFaresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faretypelocallang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsOnward" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BaseFareAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CombinedPaxDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FareDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareLevelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaxDiscountString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalSurcharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FareDisplayCurrencyDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareDisplayCurrencyDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowFaresType", propOrder = {
    "fareType",
    "faretypelocallang",
    "currency",
    "isOnward",
    "flightDate",
    "baseFareAmount",
    "totalFare",
    "combinedPaxDiscount",
    "fareDiscount",
    "fareBasisCode",
    "fareLevelCode",
    "cabinClass",
    "fareClass",
    "paxDiscountString",
    "displayAmount",
    "totalTax",
    "totalSurcharge",
    "fareDisplayCurrencyDetails"
})
public class LowFaresType {

    @XmlElement(name = "FareType", required = true)
    protected String fareType;
    protected String faretypelocallang;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "IsOnward")
    protected boolean isOnward;
    @XmlElement(name = "FlightDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar flightDate;
    @XmlElement(name = "BaseFareAmount")
    protected double baseFareAmount;
    @XmlElement(name = "TotalFare")
    protected double totalFare;
    @XmlElement(name = "CombinedPaxDiscount")
    protected double combinedPaxDiscount;
    @XmlElement(name = "FareDiscount")
    protected double fareDiscount;
    @XmlElement(name = "FareBasisCode", required = true)
    protected String fareBasisCode;
    @XmlElement(name = "FareLevelCode", required = true)
    protected String fareLevelCode;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "FareClass", required = true)
    protected String fareClass;
    @XmlElement(name = "PaxDiscountString")
    protected String paxDiscountString;
    @XmlElement(name = "DisplayAmount")
    protected double displayAmount;
    @XmlElement(name = "TotalTax")
    protected double totalTax;
    @XmlElement(name = "TotalSurcharge")
    protected double totalSurcharge;
    @XmlElement(name = "FareDisplayCurrencyDetails")
    protected List<FareDisplayCurrencyDetailsType> fareDisplayCurrencyDetails;

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
     * Gets the value of the faretypelocallang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaretypelocallang() {
        return faretypelocallang;
    }

    /**
     * Sets the value of the faretypelocallang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaretypelocallang(String value) {
        this.faretypelocallang = value;
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
     * Gets the value of the isOnward property.
     * 
     */
    public boolean isIsOnward() {
        return isOnward;
    }

    /**
     * Sets the value of the isOnward property.
     * 
     */
    public void setIsOnward(boolean value) {
        this.isOnward = value;
    }

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDate(XMLGregorianCalendar value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the baseFareAmount property.
     * 
     */
    public double getBaseFareAmount() {
        return baseFareAmount;
    }

    /**
     * Sets the value of the baseFareAmount property.
     * 
     */
    public void setBaseFareAmount(double value) {
        this.baseFareAmount = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     */
    public double getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     */
    public void setTotalFare(double value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the combinedPaxDiscount property.
     * 
     */
    public double getCombinedPaxDiscount() {
        return combinedPaxDiscount;
    }

    /**
     * Sets the value of the combinedPaxDiscount property.
     * 
     */
    public void setCombinedPaxDiscount(double value) {
        this.combinedPaxDiscount = value;
    }

    /**
     * Gets the value of the fareDiscount property.
     * 
     */
    public double getFareDiscount() {
        return fareDiscount;
    }

    /**
     * Sets the value of the fareDiscount property.
     * 
     */
    public void setFareDiscount(double value) {
        this.fareDiscount = value;
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
     * Gets the value of the fareLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevelCode() {
        return fareLevelCode;
    }

    /**
     * Sets the value of the fareLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevelCode(String value) {
        this.fareLevelCode = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
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
     * Gets the value of the paxDiscountString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxDiscountString() {
        return paxDiscountString;
    }

    /**
     * Sets the value of the paxDiscountString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxDiscountString(String value) {
        this.paxDiscountString = value;
    }

    /**
     * Gets the value of the displayAmount property.
     * 
     */
    public double getDisplayAmount() {
        return displayAmount;
    }

    /**
     * Sets the value of the displayAmount property.
     * 
     */
    public void setDisplayAmount(double value) {
        this.displayAmount = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     */
    public double getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     */
    public void setTotalTax(double value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the totalSurcharge property.
     * 
     */
    public double getTotalSurcharge() {
        return totalSurcharge;
    }

    /**
     * Sets the value of the totalSurcharge property.
     * 
     */
    public void setTotalSurcharge(double value) {
        this.totalSurcharge = value;
    }

    /**
     * Gets the value of the fareDisplayCurrencyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDisplayCurrencyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDisplayCurrencyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDisplayCurrencyDetailsType }
     * 
     * 
     */
    public List<FareDisplayCurrencyDetailsType> getFareDisplayCurrencyDetails() {
        if (fareDisplayCurrencyDetails == null) {
            fareDisplayCurrencyDetails = new ArrayList<FareDisplayCurrencyDetailsType>();
        }
        return this.fareDisplayCurrencyDetails;
    }

}
