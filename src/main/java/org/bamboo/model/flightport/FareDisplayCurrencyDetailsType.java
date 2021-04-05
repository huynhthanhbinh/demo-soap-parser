
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareDisplayCurrencyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDisplayCurrencyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CombinedPaxDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FareDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DisplayAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalSurcharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDisplayCurrencyDetailsType", propOrder = {
    "currency",
    "totalFare",
    "combinedPaxDiscount",
    "fareDiscount",
    "displayAmount",
    "totalTax",
    "totalSurcharge"
})
public class FareDisplayCurrencyDetailsType {

    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "TotalFare")
    protected double totalFare;
    @XmlElement(name = "CombinedPaxDiscount")
    protected double combinedPaxDiscount;
    @XmlElement(name = "FareDiscount")
    protected double fareDiscount;
    @XmlElement(name = "DisplayAmount")
    protected double displayAmount;
    @XmlElement(name = "TotalTax")
    protected double totalTax;
    @XmlElement(name = "TotalSurcharge")
    protected double totalSurcharge;

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

}
