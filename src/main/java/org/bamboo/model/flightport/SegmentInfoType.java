
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightIdentifierInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierInfoType" minOccurs="0"/>
 *         &lt;element name="OperatingAirlineInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}OperatingAirlineInfoType" minOccurs="0"/>
 *         &lt;element name="DepartureInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelPointInfoType" minOccurs="0"/>
 *         &lt;element name="ArrivalInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelPointInfoType" minOccurs="0"/>
 *         &lt;element name="AircraftInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AircraftInfoType" minOccurs="0"/>
 *         &lt;element name="DeiInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}DeiInfoType" minOccurs="0"/>
 *         &lt;element name="SegmentAvailability" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentAvailabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Stops" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DayChange" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsIropedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentInfoType", propOrder = {
    "flightIdentifierInfo",
    "operatingAirlineInfo",
    "departureInfo",
    "arrivalInfo",
    "aircraftInfo",
    "deiInfo",
    "segmentAvailability"
})
public class SegmentInfoType {

    @XmlElement(name = "FlightIdentifierInfo")
    protected FlightIdentifierInfoType flightIdentifierInfo;
    @XmlElement(name = "OperatingAirlineInfo")
    protected OperatingAirlineInfoType operatingAirlineInfo;
    @XmlElement(name = "DepartureInfo")
    protected TravelPointInfoType departureInfo;
    @XmlElement(name = "ArrivalInfo")
    protected TravelPointInfoType arrivalInfo;
    @XmlElement(name = "AircraftInfo")
    protected AircraftInfoType aircraftInfo;
    @XmlElement(name = "DeiInfo")
    protected DeiInfoType deiInfo;
    @XmlElement(name = "SegmentAvailability")
    protected List<SegmentAvailabilityType> segmentAvailability;
    @XmlAttribute(name = "SegmentIndex")
    protected Long segmentIndex;
    @XmlAttribute(name = "Stops")
    protected Integer stops;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "DayChange")
    protected Integer dayChange;
    @XmlAttribute(name = "JourneyTime")
    protected String journeyTime;
    @XmlAttribute(name = "IsIropedInd")
    protected Boolean isIropedInd;

    /**
     * Gets the value of the flightIdentifierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierInfoType }
     *     
     */
    public FlightIdentifierInfoType getFlightIdentifierInfo() {
        return flightIdentifierInfo;
    }

    /**
     * Sets the value of the flightIdentifierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierInfoType }
     *     
     */
    public void setFlightIdentifierInfo(FlightIdentifierInfoType value) {
        this.flightIdentifierInfo = value;
    }

    /**
     * Gets the value of the operatingAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingAirlineInfoType }
     *     
     */
    public OperatingAirlineInfoType getOperatingAirlineInfo() {
        return operatingAirlineInfo;
    }

    /**
     * Sets the value of the operatingAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingAirlineInfoType }
     *     
     */
    public void setOperatingAirlineInfo(OperatingAirlineInfoType value) {
        this.operatingAirlineInfo = value;
    }

    /**
     * Gets the value of the departureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelPointInfoType }
     *     
     */
    public TravelPointInfoType getDepartureInfo() {
        return departureInfo;
    }

    /**
     * Sets the value of the departureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPointInfoType }
     *     
     */
    public void setDepartureInfo(TravelPointInfoType value) {
        this.departureInfo = value;
    }

    /**
     * Gets the value of the arrivalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelPointInfoType }
     *     
     */
    public TravelPointInfoType getArrivalInfo() {
        return arrivalInfo;
    }

    /**
     * Sets the value of the arrivalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPointInfoType }
     *     
     */
    public void setArrivalInfo(TravelPointInfoType value) {
        this.arrivalInfo = value;
    }

    /**
     * Gets the value of the aircraftInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftInfoType }
     *     
     */
    public AircraftInfoType getAircraftInfo() {
        return aircraftInfo;
    }

    /**
     * Sets the value of the aircraftInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftInfoType }
     *     
     */
    public void setAircraftInfo(AircraftInfoType value) {
        this.aircraftInfo = value;
    }

    /**
     * Gets the value of the deiInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeiInfoType }
     *     
     */
    public DeiInfoType getDeiInfo() {
        return deiInfo;
    }

    /**
     * Sets the value of the deiInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeiInfoType }
     *     
     */
    public void setDeiInfo(DeiInfoType value) {
        this.deiInfo = value;
    }

    /**
     * Gets the value of the segmentAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentAvailabilityType }
     * 
     * 
     */
    public List<SegmentAvailabilityType> getSegmentAvailability() {
        if (segmentAvailability == null) {
            segmentAvailability = new ArrayList<SegmentAvailabilityType>();
        }
        return this.segmentAvailability;
    }

    /**
     * Gets the value of the segmentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * Sets the value of the segmentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSegmentIndex(Long value) {
        this.segmentIndex = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStops(Integer value) {
        this.stops = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the isIropedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIropedInd() {
        return isIropedInd;
    }

    /**
     * Sets the value of the isIropedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIropedInd(Boolean value) {
        this.isIropedInd = value;
    }

}
