
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevDocSurchargeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevDocSurchargeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SurchargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SurchargeAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevDocSurchargeDetailsType", propOrder = {
    "surchargeCode",
    "surchargeAmount"
})
public class RevDocSurchargeDetailsType {

    @XmlElement(name = "SurchargeCode", required = true)
    protected String surchargeCode;
    @XmlElement(name = "SurchargeAmount", required = true)
    protected AmountType surchargeAmount;

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
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSurchargeAmount(AmountType value) {
        this.surchargeAmount = value;
    }

}
