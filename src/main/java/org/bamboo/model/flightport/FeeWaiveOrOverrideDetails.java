
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeWaiveOrOverrideDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeWaiveOrOverrideDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsWaiveOrOverride" type="{http://www.ibsplc.com/iRes/simpleTypes/}WaiveOrOverride"/>
 *         &lt;element name="PercentOfOverride" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AbsoluteValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeWaiveOrOverrideDetails", propOrder = {
    "feeName",
    "feeCode",
    "isWaiveOrOverride",
    "percentOfOverride",
    "absoluteValue",
    "currency",
    "overrideReason"
})
public class FeeWaiveOrOverrideDetails {

    @XmlElement(name = "FeeName")
    protected String feeName;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "IsWaiveOrOverride", required = true)
    @XmlSchemaType(name = "string")
    protected WaiveOrOverride isWaiveOrOverride;
    @XmlElement(name = "PercentOfOverride")
    protected Double percentOfOverride;
    @XmlElement(name = "AbsoluteValue")
    protected Double absoluteValue;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "OverrideReason")
    protected String overrideReason;

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
     * Gets the value of the isWaiveOrOverride property.
     * 
     * @return
     *     possible object is
     *     {@link WaiveOrOverride }
     *     
     */
    public WaiveOrOverride getIsWaiveOrOverride() {
        return isWaiveOrOverride;
    }

    /**
     * Sets the value of the isWaiveOrOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiveOrOverride }
     *     
     */
    public void setIsWaiveOrOverride(WaiveOrOverride value) {
        this.isWaiveOrOverride = value;
    }

    /**
     * Gets the value of the percentOfOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentOfOverride() {
        return percentOfOverride;
    }

    /**
     * Sets the value of the percentOfOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentOfOverride(Double value) {
        this.percentOfOverride = value;
    }

    /**
     * Gets the value of the absoluteValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAbsoluteValue() {
        return absoluteValue;
    }

    /**
     * Sets the value of the absoluteValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAbsoluteValue(Double value) {
        this.absoluteValue = value;
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
     * Gets the value of the overrideReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideReason() {
        return overrideReason;
    }

    /**
     * Sets the value of the overrideReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideReason(String value) {
        this.overrideReason = value;
    }

}
