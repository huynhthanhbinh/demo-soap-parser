
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OAndDFareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OAndDFareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareDetailsForAGuest" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareDetailsForAGuest"/>
 *         &lt;element name="OandDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAndDFareType", propOrder = {
    "fareDetailsForAGuest",
    "oandDDetails"
})
public class OAndDFareType {

    @XmlElement(name = "FareDetailsForAGuest", required = true)
    protected FareDetailsForAGuest fareDetailsForAGuest;
    @XmlElement(name = "OandDDetails", required = true)
    protected OandDDetails oandDDetails;

    /**
     * Gets the value of the fareDetailsForAGuest property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsForAGuest }
     *     
     */
    public FareDetailsForAGuest getFareDetailsForAGuest() {
        return fareDetailsForAGuest;
    }

    /**
     * Sets the value of the fareDetailsForAGuest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsForAGuest }
     *     
     */
    public void setFareDetailsForAGuest(FareDetailsForAGuest value) {
        this.fareDetailsForAGuest = value;
    }

    /**
     * Gets the value of the oandDDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OandDDetails }
     *     
     */
    public OandDDetails getOandDDetails() {
        return oandDDetails;
    }

    /**
     * Sets the value of the oandDDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OandDDetails }
     *     
     */
    public void setOandDDetails(OandDDetails value) {
        this.oandDDetails = value;
    }

}
