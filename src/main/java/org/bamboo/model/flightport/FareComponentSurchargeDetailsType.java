
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareComponentSurchargeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentSurchargeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SurchargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SurchargeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentSurchargeDetailsType", propOrder = {
    "surchargeCode",
    "surchargeAmount"
})
public class FareComponentSurchargeDetailsType {

    @XmlElement(name = "SurchargeCode", required = true)
    protected String surchargeCode;
    @XmlElement(name = "SurchargeAmount")
    protected double surchargeAmount;

    /**
     * Gets the value of the surchargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeCode() {
        return surchargeCode;
    }

    /**
     * Sets the value of the surchargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeCode(String value) {
        this.surchargeCode = value;
    }

    /**
     * Gets the value of the surchargeAmount property.
     * 
     */
    public double getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     */
    public void setSurchargeAmount(double value) {
        this.surchargeAmount = value;
    }

}
