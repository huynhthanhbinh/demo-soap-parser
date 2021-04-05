
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ScheduleSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirportPair" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportPairType" minOccurs="0"/>
 *         &lt;element name="ScheduleFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ScheduleToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleSearchType", propOrder = {
    "airportPair",
    "scheduleFromDate",
    "scheduleToDate",
    "scheduleId"
})
public class ScheduleSearchType {

    @XmlElement(name = "AirportPair")
    protected AirportPairType airportPair;
    @XmlElement(name = "ScheduleFromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleFromDate;
    @XmlElement(name = "ScheduleToDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleToDate;
    @XmlElement(name = "ScheduleId")
    protected Integer scheduleId;

    /**
     * Gets the value of the airportPair property.
     * 
     * @return
     *     possible object is
     *     {@link AirportPairType }
     *     
     */
    public AirportPairType getAirportPair() {
        return airportPair;
    }

    /**
     * Sets the value of the airportPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportPairType }
     *     
     */
    public void setAirportPair(AirportPairType value) {
        this.airportPair = value;
    }

    /**
     * Gets the value of the scheduleFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleFromDate() {
        return scheduleFromDate;
    }

    /**
     * Sets the value of the scheduleFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleFromDate(XMLGregorianCalendar value) {
        this.scheduleFromDate = value;
    }

    /**
     * Gets the value of the scheduleToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleToDate() {
        return scheduleToDate;
    }

    /**
     * Sets the value of the scheduleToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleToDate(XMLGregorianCalendar value) {
        this.scheduleToDate = value;
    }

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduleId(Integer value) {
        this.scheduleId = value;
    }

}
