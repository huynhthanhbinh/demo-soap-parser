
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BaseFareAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CombinedPaxDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FareAfterDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlightGroups" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightGroupType" maxOccurs="unbounded"/>
 *         &lt;element name="PaxDiscountString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RouteString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalSurchargeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDetailsType", propOrder = {
    "fareBasis",
    "fareClass",
    "fareLevel",
    "currency",
    "baseFareAmount",
    "totalFare",
    "combinedPaxDiscount",
    "discount",
    "fareAfterDiscount",
    "cabinClass",
    "fareID",
    "flightGroups",
    "paxDiscountString",
    "routeString",
    "totalTaxAmount",
    "totalSurchargeAmount"
})
public class FlightDetailsType {

    @XmlElement(name = "FareBasis", required = true)
    protected String fareBasis;
    @XmlElement(name = "FareClass", required = true)
    protected String fareClass;
    @XmlElement(name = "FareLevel", required = true)
    protected String fareLevel;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "BaseFareAmount")
    protected double baseFareAmount;
    @XmlElement(name = "TotalFare")
    protected double totalFare;
    @XmlElement(name = "CombinedPaxDiscount")
    protected double combinedPaxDiscount;
    @XmlElement(name = "Discount")
    protected double discount;
    @XmlElement(name = "FareAfterDiscount")
    protected double fareAfterDiscount;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "FareID", required = true)
    protected String fareID;
    @XmlElement(name = "FlightGroups", required = true)
    protected List<FlightGroupType> flightGroups;
    @XmlElement(name = "PaxDiscountString", required = true)
    protected String paxDiscountString;
    @XmlElement(name = "RouteString", required = true)
    protected String routeString;
    @XmlElement(name = "TotalTaxAmount")
    protected double totalTaxAmount;
    @XmlElement(name = "TotalSurchargeAmount")
    protected double totalSurchargeAmount;

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
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
     * Gets the value of the discount property.
     * 
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     */
    public void setDiscount(double value) {
        this.discount = value;
    }

    /**
     * Gets the value of the fareAfterDiscount property.
     * 
     */
    public double getFareAfterDiscount() {
        return fareAfterDiscount;
    }

    /**
     * Sets the value of the fareAfterDiscount property.
     * 
     */
    public void setFareAfterDiscount(double value) {
        this.fareAfterDiscount = value;
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
     * Gets the value of the fareID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareID() {
        return fareID;
    }

    /**
     * Sets the value of the fareID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareID(String value) {
        this.fareID = value;
    }

    /**
     * Gets the value of the flightGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightGroupType }
     * 
     * 
     */
    public List<FlightGroupType> getFlightGroups() {
        if (flightGroups == null) {
            flightGroups = new ArrayList<FlightGroupType>();
        }
        return this.flightGroups;
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
     * Gets the value of the routeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteString() {
        return routeString;
    }

    /**
     * Sets the value of the routeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteString(String value) {
        this.routeString = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     */
    public double getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     */
    public void setTotalTaxAmount(double value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the totalSurchargeAmount property.
     * 
     */
    public double getTotalSurchargeAmount() {
        return totalSurchargeAmount;
    }

    /**
     * Sets the value of the totalSurchargeAmount property.
     * 
     */
    public void setTotalSurchargeAmount(double value) {
        this.totalSurchargeAmount = value;
    }

}
