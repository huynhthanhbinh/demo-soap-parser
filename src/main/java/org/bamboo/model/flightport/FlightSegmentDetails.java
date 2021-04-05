
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlightSegmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/>
 *         &lt;element name="boardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheduledDepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ArrivalTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}ReservationStatusType" minOccurs="0"/>
 *         &lt;element name="journeyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stops" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arrivalDayChange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flightLegDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightLegDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostDepartureStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}PostDepartureStatus" minOccurs="0"/>
 *         &lt;element name="FlightStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightStatusType" minOccurs="0"/>
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentSequenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isThroughFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deiCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isIropIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TicketDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TicketDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isDisplayableDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isFlightOverBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentDetails", propOrder = {
    "flightIdentifier",
    "boardPoint",
    "offPoint",
    "scheduledDepartureDateTime",
    "departureTimeZone",
    "scheduledArrivalTime",
    "arrivalTimeZone",
    "departureTerminal",
    "arrivalTerminal",
    "segmentStatus",
    "journeyTime",
    "stops",
    "arrivalDayChange",
    "flightLegDetails",
    "segmentId",
    "cabinClass",
    "postDepartureStatus",
    "flightStatus",
    "aircraftType",
    "aircraftVersion",
    "segmentSequenceID",
    "isThroughFlight",
    "isDeiExists",
    "deiCarrierName",
    "isIropIndicator",
    "ticketDetails",
    "isDisplayableDeiExists",
    "isFlightOverBooking"
})
public class FlightSegmentDetails {

    @XmlElement(required = true)
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(required = true)
    protected String boardPoint;
    @XmlElement(required = true)
    protected String offPoint;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureDateTime;
    @XmlElement(name = "DepartureTimeZone")
    protected String departureTimeZone;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTime;
    @XmlElement(name = "ArrivalTimeZone")
    protected String arrivalTimeZone;
    @XmlElement(name = "DepartureTerminal")
    protected String departureTerminal;
    @XmlElement(name = "ArrivalTerminal")
    protected String arrivalTerminal;
    @XmlSchemaType(name = "string")
    protected ReservationStatusType segmentStatus;
    protected String journeyTime;
    protected int stops;
    protected int arrivalDayChange;
    protected List<FlightLegDetailsType> flightLegDetails;
    @XmlElement(name = "SegmentId")
    protected String segmentId;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "PostDepartureStatus")
    @XmlSchemaType(name = "string")
    protected PostDepartureStatus postDepartureStatus;
    @XmlElement(name = "FlightStatus")
    @XmlSchemaType(name = "string")
    protected FlightStatusType flightStatus;
    @XmlElement(name = "AircraftType")
    protected String aircraftType;
    @XmlElement(name = "AircraftVersion")
    protected String aircraftVersion;
    @XmlElement(name = "SegmentSequenceID")
    protected String segmentSequenceID;
    protected Boolean isThroughFlight;
    protected Boolean isDeiExists;
    protected String deiCarrierName;
    protected Boolean isIropIndicator;
    @XmlElement(name = "TicketDetails")
    protected List<TicketDetailsType> ticketDetails;
    protected Boolean isDisplayableDeiExists;
    protected Boolean isFlightOverBooking;

    /**
     * Gets the value of the flightIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifier() {
        return flightIdentifier;
    }

    /**
     * Sets the value of the flightIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifier(FlightIdentifierType value) {
        this.flightIdentifier = value;
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
     * Gets the value of the scheduledDepartureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureDateTime() {
        return scheduledDepartureDateTime;
    }

    /**
     * Sets the value of the scheduledDepartureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureDateTime(XMLGregorianCalendar value) {
        this.scheduledDepartureDateTime = value;
    }

    /**
     * Gets the value of the departureTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTimeZone() {
        return departureTimeZone;
    }

    /**
     * Sets the value of the departureTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTimeZone(String value) {
        this.departureTimeZone = value;
    }

    /**
     * Gets the value of the scheduledArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    /**
     * Sets the value of the scheduledArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTime(XMLGregorianCalendar value) {
        this.scheduledArrivalTime = value;
    }

    /**
     * Gets the value of the arrivalTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTimeZone() {
        return arrivalTimeZone;
    }

    /**
     * Sets the value of the arrivalTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTimeZone(String value) {
        this.arrivalTimeZone = value;
    }

    /**
     * Gets the value of the departureTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTerminal() {
        return departureTerminal;
    }

    /**
     * Sets the value of the departureTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTerminal(String value) {
        this.departureTerminal = value;
    }

    /**
     * Gets the value of the arrivalTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    /**
     * Sets the value of the arrivalTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTerminal(String value) {
        this.arrivalTerminal = value;
    }

    /**
     * Gets the value of the segmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationStatusType }
     *     
     */
    public ReservationStatusType getSegmentStatus() {
        return segmentStatus;
    }

    /**
     * Sets the value of the segmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationStatusType }
     *     
     */
    public void setSegmentStatus(ReservationStatusType value) {
        this.segmentStatus = value;
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
     */
    public int getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     */
    public void setStops(int value) {
        this.stops = value;
    }

    /**
     * Gets the value of the arrivalDayChange property.
     * 
     */
    public int getArrivalDayChange() {
        return arrivalDayChange;
    }

    /**
     * Sets the value of the arrivalDayChange property.
     * 
     */
    public void setArrivalDayChange(int value) {
        this.arrivalDayChange = value;
    }

    /**
     * Gets the value of the flightLegDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightLegDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightLegDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightLegDetailsType }
     * 
     * 
     */
    public List<FlightLegDetailsType> getFlightLegDetails() {
        if (flightLegDetails == null) {
            flightLegDetails = new ArrayList<FlightLegDetailsType>();
        }
        return this.flightLegDetails;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the postDepartureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PostDepartureStatus }
     *     
     */
    public PostDepartureStatus getPostDepartureStatus() {
        return postDepartureStatus;
    }

    /**
     * Sets the value of the postDepartureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostDepartureStatus }
     *     
     */
    public void setPostDepartureStatus(PostDepartureStatus value) {
        this.postDepartureStatus = value;
    }

    /**
     * Gets the value of the flightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusType }
     *     
     */
    public FlightStatusType getFlightStatus() {
        return flightStatus;
    }

    /**
     * Sets the value of the flightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusType }
     *     
     */
    public void setFlightStatus(FlightStatusType value) {
        this.flightStatus = value;
    }

    /**
     * Gets the value of the aircraftType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * Sets the value of the aircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftType(String value) {
        this.aircraftType = value;
    }

    /**
     * Gets the value of the aircraftVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftVersion() {
        return aircraftVersion;
    }

    /**
     * Sets the value of the aircraftVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftVersion(String value) {
        this.aircraftVersion = value;
    }

    /**
     * Gets the value of the segmentSequenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentSequenceID() {
        return segmentSequenceID;
    }

    /**
     * Sets the value of the segmentSequenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentSequenceID(String value) {
        this.segmentSequenceID = value;
    }

    /**
     * Gets the value of the isThroughFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsThroughFlight() {
        return isThroughFlight;
    }

    /**
     * Sets the value of the isThroughFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsThroughFlight(Boolean value) {
        this.isThroughFlight = value;
    }

    /**
     * Gets the value of the isDeiExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeiExists() {
        return isDeiExists;
    }

    /**
     * Sets the value of the isDeiExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeiExists(Boolean value) {
        this.isDeiExists = value;
    }

    /**
     * Gets the value of the deiCarrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeiCarrierName() {
        return deiCarrierName;
    }

    /**
     * Sets the value of the deiCarrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeiCarrierName(String value) {
        this.deiCarrierName = value;
    }

    /**
     * Gets the value of the isIropIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIropIndicator() {
        return isIropIndicator;
    }

    /**
     * Sets the value of the isIropIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIropIndicator(Boolean value) {
        this.isIropIndicator = value;
    }

    /**
     * Gets the value of the ticketDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDetailsType }
     * 
     * 
     */
    public List<TicketDetailsType> getTicketDetails() {
        if (ticketDetails == null) {
            ticketDetails = new ArrayList<TicketDetailsType>();
        }
        return this.ticketDetails;
    }

    /**
     * Gets the value of the isDisplayableDeiExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisplayableDeiExists() {
        return isDisplayableDeiExists;
    }

    /**
     * Sets the value of the isDisplayableDeiExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisplayableDeiExists(Boolean value) {
        this.isDisplayableDeiExists = value;
    }

    /**
     * Gets the value of the isFlightOverBooking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFlightOverBooking() {
        return isFlightOverBooking;
    }

    /**
     * Sets the value of the isFlightOverBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFlightOverBooking(Boolean value) {
        this.isFlightOverBooking = value;
    }

}
