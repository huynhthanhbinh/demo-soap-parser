
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlightInformationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInformationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlightCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureTimeString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BoardPointCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OffPointCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="JourneyTimeString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemainingSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FlightSerialNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInformationsType", propOrder = {
    "flightSuffix",
    "flightCarrier",
    "flightNumber",
    "departureDate",
    "arrivalDate",
    "departureTimeString",
    "boardPoint",
    "offPoint",
    "boardPointCity",
    "offPointCity",
    "departureTime",
    "arrivalTime",
    "journeyTime",
    "journeyTimeString",
    "remainingSeats",
    "flightSerialNumber"
})
public class FlightInformationsType {

    @XmlElement(name = "FlightSuffix", required = true)
    protected String flightSuffix;
    @XmlElement(name = "FlightCarrier", required = true)
    protected String flightCarrier;
    @XmlElement(name = "FlightNumber", required = true)
    protected String flightNumber;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "ArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(name = "DepartureTimeString", required = true)
    protected String departureTimeString;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected String offPoint;
    @XmlElement(name = "BoardPointCity", required = true)
    protected String boardPointCity;
    @XmlElement(name = "OffPointCity", required = true)
    protected String offPointCity;
    @XmlElement(name = "DepartureTime")
    protected int departureTime;
    @XmlElement(name = "ArrivalTime")
    protected int arrivalTime;
    @XmlElement(name = "JourneyTime")
    protected int journeyTime;
    @XmlElement(name = "JourneyTimeString", required = true)
    protected String journeyTimeString;
    @XmlElement(name = "RemainingSeats")
    protected int remainingSeats;
    @XmlElement(name = "FlightSerialNumber")
    protected int flightSerialNumber;

    /**
     * Gets the value of the flightSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSuffix() {
        return flightSuffix;
    }

    /**
     * Sets the value of the flightSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSuffix(String value) {
        this.flightSuffix = value;
    }

    /**
     * Gets the value of the flightCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightCarrier() {
        return flightCarrier;
    }

    /**
     * Sets the value of the flightCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightCarrier(String value) {
        this.flightCarrier = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the departureTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTimeString() {
        return departureTimeString;
    }

    /**
     * Sets the value of the departureTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTimeString(String value) {
        this.departureTimeString = value;
    }

    /**
     * Gets the value of the boardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * Sets the value of the boardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * Gets the value of the offPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * Gets the value of the boardPointCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPointCity() {
        return boardPointCity;
    }

    /**
     * Sets the value of the boardPointCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPointCity(String value) {
        this.boardPointCity = value;
    }

    /**
     * Gets the value of the offPointCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPointCity() {
        return offPointCity;
    }

    /**
     * Sets the value of the offPointCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPointCity(String value) {
        this.offPointCity = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     */
    public int getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     */
    public void setDepartureTime(int value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     */
    public void setArrivalTime(int value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the journeyTime property.
     * 
     */
    public int getJourneyTime() {
        return journeyTime;
    }

    /**
     * Sets the value of the journeyTime property.
     * 
     */
    public void setJourneyTime(int value) {
        this.journeyTime = value;
    }

    /**
     * Gets the value of the journeyTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyTimeString() {
        return journeyTimeString;
    }

    /**
     * Sets the value of the journeyTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyTimeString(String value) {
        this.journeyTimeString = value;
    }

    /**
     * Gets the value of the remainingSeats property.
     * 
     */
    public int getRemainingSeats() {
        return remainingSeats;
    }

    /**
     * Sets the value of the remainingSeats property.
     * 
     */
    public void setRemainingSeats(int value) {
        this.remainingSeats = value;
    }

    /**
     * Gets the value of the flightSerialNumber property.
     * 
     */
    public int getFlightSerialNumber() {
        return flightSerialNumber;
    }

    /**
     * Sets the value of the flightSerialNumber property.
     * 
     */
    public void setFlightSerialNumber(int value) {
        this.flightSerialNumber = value;
    }

}
