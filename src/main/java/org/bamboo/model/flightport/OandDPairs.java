
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OandDPairs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OandDPairs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Origin" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportInfo"/>
 *         &lt;element name="Destination" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportInfo"/>
 *         &lt;element name="FlightType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OandDPairs", propOrder = {
    "origin",
    "destination",
    "flightType"
})
public class OandDPairs {

    @XmlElement(name = "Origin", required = true)
    protected AirportInfo origin;
    @XmlElement(name = "Destination", required = true)
    protected AirportInfo destination;
    @XmlElement(name = "FlightType", required = true)
    protected String flightType;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link AirportInfo }
     *     
     */
    public AirportInfo getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportInfo }
     *     
     */
    public void setOrigin(AirportInfo value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link AirportInfo }
     *     
     */
    public AirportInfo getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportInfo }
     *     
     */
    public void setDestination(AirportInfo value) {
        this.destination = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

}
