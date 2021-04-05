
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlightSegmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegmentGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fltNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fltSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flightDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyDetailsType"/>
 *         &lt;element name="PartnerCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerflightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeshareRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheduledDepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="scheduledDepartureTimeLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="scheduledArrivalTimeLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ArrivalTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}ReservationStatusDetails_Type" minOccurs="0"/>
 *         &lt;element name="StandbyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="journeyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stops" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arrivalDayChange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostDepartureStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}PostDepartureStatusType" minOccurs="0"/>
 *         &lt;element name="FlightStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightStatusDetails_Type" minOccurs="0"/>
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isThroughFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deiCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isIropIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDCSFlightAffected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DCSFlightAffectedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldSegmentId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HasArnk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isForMarking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SegmenReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isFlightOverBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ArnkDateLtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentDetailsType", propOrder = {
    "flightSegmentGroupID",
    "segmentId",
    "carrierCode",
    "fltNumber",
    "fltSuffix",
    "flightDate",
    "partnerCarrierCode",
    "partnerflightNumber",
    "codeshareRole",
    "boardPoint",
    "offPoint",
    "scheduledDepartureDateTime",
    "scheduledDepartureTimeLTC",
    "departureTimeZone",
    "scheduledArrivalTime",
    "scheduledArrivalTimeLTC",
    "arrivalTimeZone",
    "departureTerminal",
    "arrivalTerminal",
    "segmentStatus",
    "standbyCode",
    "journeyTime",
    "stops",
    "arrivalDayChange",
    "cabinClass",
    "postDepartureStatus",
    "flightStatus",
    "aircraftType",
    "aircraftVersion",
    "isThroughFlight",
    "isDeiExists",
    "deiCarrierName",
    "isIropIndicator",
    "isDCSFlightAffected",
    "dcsFlightAffectedReason",
    "oldSegmentId",
    "addedTime",
    "hasArnk",
    "fareClass",
    "isForMarking",
    "segmenReferenceId",
    "isFlightOverBooking",
    "arnkDateLtc"
})
public class FlightSegmentDetailsType {

    @XmlElement(name = "FlightSegmentGroupID")
    protected String flightSegmentGroupID;
    @XmlElement(name = "SegmentId", required = true)
    protected String segmentId;
    @XmlElement(required = true)
    protected String carrierCode;
    @XmlElement(required = true)
    protected String fltNumber;
    @XmlElement(required = true)
    protected String fltSuffix;
    @XmlElement(required = true)
    protected DateOnlyDetailsType flightDate;
    @XmlElement(name = "PartnerCarrierCode")
    protected String partnerCarrierCode;
    @XmlElement(name = "PartnerflightNumber")
    protected String partnerflightNumber;
    @XmlElement(name = "CodeshareRole")
    protected String codeshareRole;
    @XmlElement(required = true)
    protected String boardPoint;
    @XmlElement(required = true)
    protected String offPoint;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureTimeLTC;
    @XmlElement(name = "DepartureTimeZone")
    protected String departureTimeZone;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTimeLTC;
    @XmlElement(name = "ArrivalTimeZone")
    protected String arrivalTimeZone;
    @XmlElement(name = "DepartureTerminal")
    protected String departureTerminal;
    @XmlElement(name = "ArrivalTerminal")
    protected String arrivalTerminal;
    @XmlSchemaType(name = "string")
    protected ReservationStatusDetailsType segmentStatus;
    @XmlElement(name = "StandbyCode")
    protected String standbyCode;
    protected String journeyTime;
    protected int stops;
    protected int arrivalDayChange;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "PostDepartureStatus")
    @XmlSchemaType(name = "string")
    protected PostDepartureStatusType postDepartureStatus;
    @XmlElement(name = "FlightStatus")
    @XmlSchemaType(name = "string")
    protected FlightStatusDetailsType flightStatus;
    @XmlElement(name = "AircraftType")
    protected String aircraftType;
    @XmlElement(name = "AircraftVersion")
    protected String aircraftVersion;
    protected Boolean isThroughFlight;
    protected Boolean isDeiExists;
    protected String deiCarrierName;
    protected Boolean isIropIndicator;
    protected Boolean isDCSFlightAffected;
    @XmlElement(name = "DCSFlightAffectedReason")
    protected String dcsFlightAffectedReason;
    @XmlElement(name = "OldSegmentId")
    protected List<String> oldSegmentId;
    @XmlElement(name = "AddedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar addedTime;
    @XmlElement(name = "HasArnk")
    protected Boolean hasArnk;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    protected Boolean isForMarking;
    @XmlElement(name = "SegmenReferenceId")
    protected String segmenReferenceId;
    protected Boolean isFlightOverBooking;
    @XmlElement(name = "ArnkDateLtc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arnkDateLtc;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * Gets the value of the flightSegmentGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSegmentGroupID() {
        return flightSegmentGroupID;
    }

    /**
     * Sets the value of the flightSegmentGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSegmentGroupID(String value) {
        this.flightSegmentGroupID = value;
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
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the fltNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltNumber() {
        return fltNumber;
    }

    /**
     * Sets the value of the fltNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltNumber(String value) {
        this.fltNumber = value;
    }

    /**
     * Gets the value of the fltSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltSuffix() {
        return fltSuffix;
    }

    /**
     * Sets the value of the fltSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltSuffix(String value) {
        this.fltSuffix = value;
    }

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public DateOnlyDetailsType getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public void setFlightDate(DateOnlyDetailsType value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the partnerCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCarrierCode() {
        return partnerCarrierCode;
    }

    /**
     * Sets the value of the partnerCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCarrierCode(String value) {
        this.partnerCarrierCode = value;
    }

    /**
     * Gets the value of the partnerflightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerflightNumber() {
        return partnerflightNumber;
    }

    /**
     * Sets the value of the partnerflightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerflightNumber(String value) {
        this.partnerflightNumber = value;
    }

    /**
     * Gets the value of the codeshareRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeshareRole() {
        return codeshareRole;
    }

    /**
     * Sets the value of the codeshareRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeshareRole(String value) {
        this.codeshareRole = value;
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
     * Gets the value of the scheduledDepartureTimeLTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureTimeLTC() {
        return scheduledDepartureTimeLTC;
    }

    /**
     * Sets the value of the scheduledDepartureTimeLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureTimeLTC(XMLGregorianCalendar value) {
        this.scheduledDepartureTimeLTC = value;
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
     * Gets the value of the scheduledArrivalTimeLTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTimeLTC() {
        return scheduledArrivalTimeLTC;
    }

    /**
     * Sets the value of the scheduledArrivalTimeLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTimeLTC(XMLGregorianCalendar value) {
        this.scheduledArrivalTimeLTC = value;
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
     *     {@link ReservationStatusDetailsType }
     *     
     */
    public ReservationStatusDetailsType getSegmentStatus() {
        return segmentStatus;
    }

    /**
     * Sets the value of the segmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationStatusDetailsType }
     *     
     */
    public void setSegmentStatus(ReservationStatusDetailsType value) {
        this.segmentStatus = value;
    }

    /**
     * Gets the value of the standbyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyCode() {
        return standbyCode;
    }

    /**
     * Sets the value of the standbyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyCode(String value) {
        this.standbyCode = value;
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
     *     {@link PostDepartureStatusType }
     *     
     */
    public PostDepartureStatusType getPostDepartureStatus() {
        return postDepartureStatus;
    }

    /**
     * Sets the value of the postDepartureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostDepartureStatusType }
     *     
     */
    public void setPostDepartureStatus(PostDepartureStatusType value) {
        this.postDepartureStatus = value;
    }

    /**
     * Gets the value of the flightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusDetailsType }
     *     
     */
    public FlightStatusDetailsType getFlightStatus() {
        return flightStatus;
    }

    /**
     * Sets the value of the flightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusDetailsType }
     *     
     */
    public void setFlightStatus(FlightStatusDetailsType value) {
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
     * Gets the value of the isDCSFlightAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDCSFlightAffected() {
        return isDCSFlightAffected;
    }

    /**
     * Sets the value of the isDCSFlightAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDCSFlightAffected(Boolean value) {
        this.isDCSFlightAffected = value;
    }

    /**
     * Gets the value of the dcsFlightAffectedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSFlightAffectedReason() {
        return dcsFlightAffectedReason;
    }

    /**
     * Sets the value of the dcsFlightAffectedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSFlightAffectedReason(String value) {
        this.dcsFlightAffectedReason = value;
    }

    /**
     * Gets the value of the oldSegmentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oldSegmentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOldSegmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOldSegmentId() {
        if (oldSegmentId == null) {
            oldSegmentId = new ArrayList<String>();
        }
        return this.oldSegmentId;
    }

    /**
     * Gets the value of the addedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAddedTime() {
        return addedTime;
    }

    /**
     * Sets the value of the addedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAddedTime(XMLGregorianCalendar value) {
        this.addedTime = value;
    }

    /**
     * Gets the value of the hasArnk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasArnk() {
        return hasArnk;
    }

    /**
     * Sets the value of the hasArnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasArnk(Boolean value) {
        this.hasArnk = value;
    }

    /**
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the isForMarking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForMarking() {
        return isForMarking;
    }

    /**
     * Sets the value of the isForMarking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForMarking(Boolean value) {
        this.isForMarking = value;
    }

    /**
     * Gets the value of the segmenReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmenReferenceId() {
        return segmenReferenceId;
    }

    /**
     * Sets the value of the segmenReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmenReferenceId(String value) {
        this.segmenReferenceId = value;
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

    /**
     * Gets the value of the arnkDateLtc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArnkDateLtc() {
        return arnkDateLtc;
    }

    /**
     * Sets the value of the arnkDateLtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArnkDateLtc(XMLGregorianCalendar value) {
        this.arnkDateLtc = value;
    }

    /**
     * Gets the value of the richContentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichContentRef() {
        return richContentRef;
    }

    /**
     * Sets the value of the richContentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichContentRef(String value) {
        this.richContentRef = value;
    }

}
