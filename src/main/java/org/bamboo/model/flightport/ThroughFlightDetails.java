
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThroughFlightDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThroughFlightDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightDesignator" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightDesignator"/>
 *         &lt;element name="DepartureDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StopOverPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ArrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DayChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StopOverDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}StopOverDetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThroughFlightDetails", propOrder = {
    "flightDesignator",
    "departureDate",
    "day",
    "stopOverPoints",
    "depAirport",
    "arrivalAirport",
    "route",
    "departureTime",
    "arrivalTime",
    "journeyTime",
    "dayChange",
    "stopOverDetails"
})
public class ThroughFlightDetails {

    @XmlElement(name = "FlightDesignator", required = true)
    protected FlightDesignator flightDesignator;
    @XmlElement(name = "DepartureDate", required = true)
    protected DateOnlyType departureDate;
    @XmlElement(name = "Day")
    protected int day;
    @XmlElement(name = "StopOverPoints")
    protected String stopOverPoints;
    @XmlElement(name = "DepAirport", required = true)
    protected String depAirport;
    @XmlElement(name = "ArrivalAirport", required = true)
    protected String arrivalAirport;
    @XmlElement(name = "Route", required = true)
    protected String route;
    @XmlElement(name = "DepartureTime", required = true)
    protected String departureTime;
    @XmlElement(name = "ArrivalTime", required = true)
    protected String arrivalTime;
    @XmlElement(name = "JourneyTime", required = true)
    protected String journeyTime;
    @XmlElement(name = "DayChange")
    protected Integer dayChange;
    @XmlElement(name = "StopOverDetails", required = true)
    protected List<StopOverDetails> stopOverDetails;

    /**
     * Gets the value of the flightDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDesignator }
     *     
     */
    public FlightDesignator getFlightDesignator() {
        return flightDesignator;
    }

    /**
     * Sets the value of the flightDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDesignator }
     *     
     */
    public void setFlightDesignator(FlightDesignator value) {
        this.flightDesignator = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setDepartureDate(DateOnlyType value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the day property.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Gets the value of the stopOverPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopOverPoints() {
        return stopOverPoints;
    }

    /**
     * Sets the value of the stopOverPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopOverPoints(String value) {
        this.stopOverPoints = value;
    }

    /**
     * Gets the value of the depAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepAirport() {
        return depAirport;
    }

    /**
     * Sets the value of the depAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepAirport(String value) {
        this.depAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirport(String value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
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
     * Gets the value of the dayChange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayChange() {
        return dayChange;
    }

    /**
     * Sets the value of the dayChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayChange(Integer value) {
        this.dayChange = value;
    }

    /**
     * Gets the value of the stopOverDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopOverDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopOverDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopOverDetails }
     * 
     * 
     */
    public List<StopOverDetails> getStopOverDetails() {
        if (stopOverDetails == null) {
            stopOverDetails = new ArrayList<StopOverDetails>();
        }
        return this.stopOverDetails;
    }

}
