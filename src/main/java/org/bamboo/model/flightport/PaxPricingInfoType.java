
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxPricingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxPricingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayFare" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountInfoType" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountInfoType" minOccurs="0"/>
 *         &lt;element name="AppliedFare" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountInfoType" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountInfoType" minOccurs="0"/>
 *         &lt;element name="Surcharge" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareTypeLocal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareSubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareSubTypeLocal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BaggageAllowanceRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxPricingInfoType", propOrder = {
    "displayFare",
    "discount",
    "appliedFare",
    "tax",
    "surcharge"
})
public class PaxPricingInfoType {

    @XmlElement(name = "DisplayFare")
    protected AmountInfoType displayFare;
    @XmlElement(name = "Discount")
    protected AmountInfoType discount;
    @XmlElement(name = "AppliedFare")
    protected AmountInfoType appliedFare;
    @XmlElement(name = "Tax")
    protected AmountInfoType tax;
    @XmlElement(name = "Surcharge")
    protected AmountInfoType surcharge;
    @XmlAttribute(name = "FareType")
    protected String fareType;
    @XmlAttribute(name = "FareTypeLocal")
    protected String fareTypeLocal;
    @XmlAttribute(name = "FareSubType")
    protected String fareSubType;
    @XmlAttribute(name = "FareSubTypeLocal")
    protected String fareSubTypeLocal;
    @XmlAttribute(name = "PaxType")
    protected String paxType;
    @XmlAttribute(name = "BaggageAllowanceRef")
    protected String baggageAllowanceRef;

    /**
     * Gets the value of the displayFare property.
     * 
     * @return
     *     possible object is
     *     {@link AmountInfoType }
     *     
     */
    public AmountInfoType getDisplayFare() {
        return displayFare;
    }

    /**
     * Sets the value of the displayFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInfoType }
     *     
     */
    public void setDisplayFare(AmountInfoType value) {
        this.displayFare = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountInfoType }
     *     
     */
    public AmountInfoType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInfoType }
     *     
     */
    public void setDiscount(AmountInfoType value) {
        this.discount = value;
    }

    /**
     * Gets the value of the appliedFare property.
     * 
     * @return
     *     possible object is
     *     {@link AmountInfoType }
     *     
     */
    public AmountInfoType getAppliedFare() {
        return appliedFare;
    }

    /**
     * Sets the value of the appliedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInfoType }
     *     
     */
    public void setAppliedFare(AmountInfoType value) {
        this.appliedFare = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountInfoType }
     *     
     */
    public AmountInfoType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInfoType }
     *     
     */
    public void setTax(AmountInfoType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link AmountInfoType }
     *     
     */
    public AmountInfoType getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInfoType }
     *     
     */
    public void setSurcharge(AmountInfoType value) {
        this.surcharge = value;
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
     * Gets the value of the fareTypeLocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTypeLocal() {
        return fareTypeLocal;
    }

    /**
     * Sets the value of the fareTypeLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareTypeLocal(String value) {
        this.fareTypeLocal = value;
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
     * Gets the value of the fareSubTypeLocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareSubTypeLocal() {
        return fareSubTypeLocal;
    }

    /**
     * Sets the value of the fareSubTypeLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareSubTypeLocal(String value) {
        this.fareSubTypeLocal = value;
    }

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

    /**
     * Gets the value of the baggageAllowanceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowanceRef() {
        return baggageAllowanceRef;
    }

    /**
     * Sets the value of the baggageAllowanceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowanceRef(String value) {
        this.baggageAllowanceRef = value;
    }

}
