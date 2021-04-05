
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNRSegmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRSegmentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/>
 *         &lt;element name="FlightIdentifierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureDateAndTime" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateAndTimeType" minOccurs="0"/>
 *         &lt;element name="ArrivalAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalDateAndTime" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateAndTimeType" minOccurs="0"/>
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stops" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRSegmentDetailsType", propOrder = {
    "travelDate",
    "flightIdentifierType",
    "departureAirportCode",
    "departureDateAndTime",
    "arrivalAirportCode",
    "arrivalDateAndTime",
    "journeyTime",
    "stops"
})
public class PNRSegmentDetailsType {

    @XmlElement(name = "TravelDate")
    protected DateOnlyType travelDate;
    @XmlElement(name = "FlightIdentifierType")
    protected String flightIdentifierType;
    @XmlElement(name = "DepartureAirportCode")
    protected String departureAirportCode;
    @XmlElement(name = "DepartureDateAndTime")
    protected DateAndTimeType departureDateAndTime;
    @XmlElement(name = "ArrivalAirportCode")
    protected String arrivalAirportCode;
    @XmlElement(name = "ArrivalDateAndTime")
    protected DateAndTimeType arrivalDateAndTime;
    @XmlElement(name = "JourneyTime")
    protected String journeyTime;
    @XmlElement(name = "Stops")
    protected String stops;

    /**
     * Gets the value of the travelDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setTravelDate(DateOnlyType value) {
        this.travelDate = value;
    }

    /**
     * Gets the value of the flightIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightIdentifierType() {
        return flightIdentifierType;
    }

    /**
     * Sets the value of the flightIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightIdentifierType(String value) {
        this.flightIdentifierType = value;
    }

    /**
     * Gets the value of the departureAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    /**
     * Sets the value of the departureAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirportCode(String value) {
        this.departureAirportCode = value;
    }

    /**
     * Gets the value of the departureDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getDepartureDateAndTime() {
        return departureDateAndTime;
    }

    /**
     * Sets the value of the departureDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setDepartureDateAndTime(DateAndTimeType value) {
        this.departureDateAndTime = value;
    }

    /**
     * Gets the value of the arrivalAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    /**
     * Sets the value of the arrivalAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirportCode(String value) {
        this.arrivalAirportCode = value;
    }

    /**
     * Gets the value of the arrivalDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getArrivalDateAndTime() {
        return arrivalDateAndTime;
    }

    /**
     * Sets the value of the arrivalDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setArrivalDateAndTime(DateAndTimeType value) {
        this.arrivalDateAndTime = value;
    }

    /**
     * Gets the value of the journeyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyTime() {
        return journeyTime;
    }

    /**
     * Sets the value of the journeyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyTime(String value) {
        this.journeyTime = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStops(String value) {
        this.stops = value;
    }

}
