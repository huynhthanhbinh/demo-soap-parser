
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareComponentMappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentMappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareComponentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentMappingType", propOrder = {
    "fareComponentId",
    "originAirport",
    "destinationAirport"
})
public class FareComponentMappingType {

    @XmlElement(name = "FareComponentId")
    protected long fareComponentId;
    @XmlElement(name = "OriginAirport", required = true)
    protected String originAirport;
    @XmlElement(name = "DestinationAirport", required = true)
    protected String destinationAirport;

    /**
     * Gets the value of the fareComponentId property.
     * 
     */
    public long getFareComponentId() {
        return fareComponentId;
    }

    /**
     * Sets the value of the fareComponentId property.
     * 
     */
    public void setFareComponentId(long value) {
        this.fareComponentId = value;
    }

    /**
     * Gets the value of the originAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAirport() {
        return originAirport;
    }

    /**
     * Sets the value of the originAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAirport(String value) {
        this.originAirport = value;
    }

    /**
     * Gets the value of the destinationAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAirport() {
        return destinationAirport;
    }

    /**
     * Sets the value of the destinationAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAirport(String value) {
        this.destinationAirport = value;
    }

}
