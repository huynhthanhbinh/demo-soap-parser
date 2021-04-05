
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RevDocCouponDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevDocCouponDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FltNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlightDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/>
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepartureCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ArrivalCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ScheduledDepartureDateTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ScheduledDepartureTimeLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ScheduledArrivalTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ScheduledArrivalTimeLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ArrivalTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StopOver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BaggageAllowance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotValidBefore" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/>
 *         &lt;element name="NotValidAfter" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevDocCouponDetailsType", propOrder = {
    "couponNumber",
    "carrierCode",
    "fltNumber",
    "flightDate",
    "boardPoint",
    "offPoint",
    "departureCity",
    "arrivalCity",
    "scheduledDepartureDateTimeUTC",
    "scheduledDepartureTimeLTC",
    "departureTimeZone",
    "scheduledArrivalTimeUTC",
    "scheduledArrivalTimeLTC",
    "arrivalTimeZone",
    "journeyTime",
    "stopOver",
    "cabinClass",
    "rbd",
    "fareBasis",
    "couponStatus",
    "baggageAllowance",
    "notValidBefore",
    "notValidAfter"
})
public class RevDocCouponDetailsType {

    @XmlElement(name = "CouponNumber")
    protected int couponNumber;
    @XmlElement(name = "CarrierCode", required = true)
    protected String carrierCode;
    @XmlElement(name = "FltNumber", required = true)
    protected String fltNumber;
    @XmlElement(name = "FlightDate", required = true)
    protected DateOnlyType flightDate;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected String offPoint;
    @XmlElement(name = "DepartureCity", required = true)
    protected String departureCity;
    @XmlElement(name = "ArrivalCity", required = true)
    protected String arrivalCity;
    @XmlElement(name = "ScheduledDepartureDateTimeUTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureDateTimeUTC;
    @XmlElement(name = "ScheduledDepartureTimeLTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureTimeLTC;
    @XmlElement(name = "DepartureTimeZone", required = true)
    protected String departureTimeZone;
    @XmlElement(name = "ScheduledArrivalTimeUTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTimeUTC;
    @XmlElement(name = "ScheduledArrivalTimeLTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTimeLTC;
    @XmlElement(name = "ArrivalTimeZone", required = true)
    protected String arrivalTimeZone;
    @XmlElement(name = "JourneyTime", required = true)
    protected String journeyTime;
    @XmlElement(name = "StopOver", required = true)
    protected String stopOver;
    @XmlElement(name = "CabinClass")
    protected String cabinClass;
    @XmlElement(name = "RBD")
    protected String rbd;
    @XmlElement(name = "FareBasis")
    protected String fareBasis;
    @XmlElement(name = "CouponStatus", required = true)
    protected String couponStatus;
    @XmlElement(name = "BaggageAllowance")
    protected String baggageAllowance;
    @XmlElement(name = "NotValidBefore", required = true)
    protected DateOnlyType notValidBefore;
    @XmlElement(name = "NotValidAfter", required = true)
    protected DateOnlyType notValidAfter;

    /**
     * Gets the value of the couponNumber property.
     * 
     */
    public int getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     */
    public void setCouponNumber(int value) {
        this.couponNumber = value;
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
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setFlightDate(DateOnlyType value) {
        this.flightDate = value;
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
     * Gets the value of the departureCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCity() {
        return departureCity;
    }

    /**
     * Sets the value of the departureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCity(String value) {
        this.departureCity = value;
    }

    /**
     * Gets the value of the arrivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalCity() {
        return arrivalCity;
    }

    /**
     * Sets the value of the arrivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalCity(String value) {
        this.arrivalCity = value;
    }

    /**
     * Gets the value of the scheduledDepartureDateTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureDateTimeUTC() {
        return scheduledDepartureDateTimeUTC;
    }

    /**
     * Sets the value of the scheduledDepartureDateTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureDateTimeUTC(XMLGregorianCalendar value) {
        this.scheduledDepartureDateTimeUTC = value;
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
     * Gets the value of the scheduledArrivalTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTimeUTC() {
        return scheduledArrivalTimeUTC;
    }

    /**
     * Sets the value of the scheduledArrivalTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTimeUTC(XMLGregorianCalendar value) {
        this.scheduledArrivalTimeUTC = value;
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
     * Gets the value of the stopOver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopOver() {
        return stopOver;
    }

    /**
     * Sets the value of the stopOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopOver(String value) {
        this.stopOver = value;
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
     * Gets the value of the rbd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBD() {
        return rbd;
    }

    /**
     * Sets the value of the rbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBD(String value) {
        this.rbd = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the couponStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponStatus() {
        return couponStatus;
    }

    /**
     * Sets the value of the couponStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponStatus(String value) {
        this.couponStatus = value;
    }

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowance(String value) {
        this.baggageAllowance = value;
    }

    /**
     * Gets the value of the notValidBefore property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setNotValidBefore(DateOnlyType value) {
        this.notValidBefore = value;
    }

    /**
     * Gets the value of the notValidAfter property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setNotValidAfter(DateOnlyType value) {
        this.notValidAfter = value;
    }

}
