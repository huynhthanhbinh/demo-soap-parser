
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightDtlsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDtlsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightIdentifierType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/>
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepartureDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DepartureType"/>
 *         &lt;element name="ArrivalDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ArrivalType"/>
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DayChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IROPComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DcsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelayCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}DelayCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDtlsType", propOrder = {
    "flightIdentifierType",
    "boardPoint",
    "offPoint",
    "departureDetails",
    "arrivalDetails",
    "journeyTime",
    "tailNumber",
    "aircraftType",
    "lastUpdateTime",
    "dayChange",
    "iropComments",
    "legStatus",
    "dcsStatus",
    "delayCode",
    "legOrder",
    "flightType"
})
public class FlightDtlsType {

    @XmlElement(name = "FlightIdentifierType", required = true)
    protected FlightIdentifierType flightIdentifierType;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected String offPoint;
    @XmlElement(name = "DepartureDetails", required = true)
    protected DepartureType departureDetails;
    @XmlElement(name = "ArrivalDetails", required = true)
    protected ArrivalType arrivalDetails;
    @XmlElement(name = "JourneyTime", required = true)
    protected String journeyTime;
    @XmlElement(name = "TailNumber")
    protected String tailNumber;
    @XmlElement(name = "AircraftType")
    protected String aircraftType;
    @XmlElement(name = "LastUpdateTime")
    protected String lastUpdateTime;
    @XmlElement(name = "DayChange")
    protected Integer dayChange;
    @XmlElement(name = "IROPComments")
    protected String iropComments;
    @XmlElement(name = "LegStatus")
    protected String legStatus;
    @XmlElement(name = "DcsStatus")
    protected String dcsStatus;
    @XmlElement(name = "DelayCode")
    protected List<DelayCodeType> delayCode;
    @XmlElement(name = "LegOrder")
    protected Integer legOrder;
    @XmlElement(name = "FlightType")
    protected String flightType;

    /**
     * Gets the value of the flightIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifierType() {
        return flightIdentifierType;
    }

    /**
     * Sets the value of the flightIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifierType(FlightIdentifierType value) {
        this.flightIdentifierType = value;
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
     * Gets the value of the departureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureType }
     *     
     */
    public DepartureType getDepartureDetails() {
        return departureDetails;
    }

    /**
     * Sets the value of the departureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureType }
     *     
     */
    public void setDepartureDetails(DepartureType value) {
        this.departureDetails = value;
    }

    /**
     * Gets the value of the arrivalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalType }
     *     
     */
    public ArrivalType getArrivalDetails() {
        return arrivalDetails;
    }

    /**
     * Sets the value of the arrivalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalType }
     *     
     */
    public void setArrivalDetails(ArrivalType value) {
        this.arrivalDetails = value;
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
     * Gets the value of the tailNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailNumber() {
        return tailNumber;
    }

    /**
     * Sets the value of the tailNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailNumber(String value) {
        this.tailNumber = value;
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
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateTime(String value) {
        this.lastUpdateTime = value;
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
     * Gets the value of the iropComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIROPComments() {
        return iropComments;
    }

    /**
     * Sets the value of the iropComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIROPComments(String value) {
        this.iropComments = value;
    }

    /**
     * Gets the value of the legStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegStatus() {
        return legStatus;
    }

    /**
     * Sets the value of the legStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegStatus(String value) {
        this.legStatus = value;
    }

    /**
     * Gets the value of the dcsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcsStatus() {
        return dcsStatus;
    }

    /**
     * Sets the value of the dcsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcsStatus(String value) {
        this.dcsStatus = value;
    }

    /**
     * Gets the value of the delayCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delayCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelayCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelayCodeType }
     * 
     * 
     */
    public List<DelayCodeType> getDelayCode() {
        if (delayCode == null) {
            delayCode = new ArrayList<DelayCodeType>();
        }
        return this.delayCode;
    }

    /**
     * Gets the value of the legOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegOrder() {
        return legOrder;
    }

    /**
     * Sets the value of the legOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegOrder(Integer value) {
        this.legOrder = value;
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
