
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNRBaseFareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRBaseFareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareForAGuest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareForAllGuestInPNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRBaseFareType", propOrder = {
    "fareCode",
    "fareForAGuest",
    "fareForAllGuestInPNR"
})
public class PNRBaseFareType {

    @XmlElement(name = "FareCode", required = true)
    protected String fareCode;
    @XmlElement(name = "FareForAGuest")
    protected String fareForAGuest;
    @XmlElement(name = "FareForAllGuestInPNR")
    protected String fareForAllGuestInPNR;

    /**
     * Gets the value of the fareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCode() {
        return fareCode;
    }

    /**
     * Sets the value of the fareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCode(String value) {
        this.fareCode = value;
    }

    /**
     * Gets the value of the fareForAGuest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareForAGuest() {
        return fareForAGuest;
    }

    /**
     * Sets the value of the fareForAGuest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareForAGuest(String value) {
        this.fareForAGuest = value;
    }

    /**
     * Gets the value of the fareForAllGuestInPNR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareForAllGuestInPNR() {
        return fareForAllGuestInPNR;
    }

    /**
     * Sets the value of the fareForAllGuestInPNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareForAllGuestInPNR(String value) {
        this.fareForAllGuestInPNR = value;
    }

}
