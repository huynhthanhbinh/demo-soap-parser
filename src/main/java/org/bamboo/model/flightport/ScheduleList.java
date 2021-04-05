
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ScheduleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlightDesignator" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightDesignator"/>
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DaysOfOperation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ScheduleStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ScheduleEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ScheduleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleList", propOrder = {
    "flightType",
    "flightDesignator",
    "route",
    "daysOfOperation",
    "scheduleStartDate",
    "scheduleEndDate",
    "status",
    "scheduleID"
})
public class ScheduleList {

    @XmlElement(name = "FlightType", required = true)
    protected String flightType;
    @XmlElement(name = "FlightDesignator", required = true)
    protected FlightDesignator flightDesignator;
    @XmlElement(name = "Route", required = true)
    protected String route;
    @XmlElement(name = "DaysOfOperation", required = true)
    protected String daysOfOperation;
    @XmlElement(name = "ScheduleStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleStartDate;
    @XmlElement(name = "ScheduleEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleEndDate;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "ScheduleID")
    protected int scheduleID;

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
     * Gets the value of the daysOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysOfOperation() {
        return daysOfOperation;
    }

    /**
     * Sets the value of the daysOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysOfOperation(String value) {
        this.daysOfOperation = value;
    }

    /**
     * Gets the value of the scheduleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * Sets the value of the scheduleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleStartDate(XMLGregorianCalendar value) {
        this.scheduleStartDate = value;
    }

    /**
     * Gets the value of the scheduleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleEndDate() {
        return scheduleEndDate;
    }

    /**
     * Sets the value of the scheduleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleEndDate(XMLGregorianCalendar value) {
        this.scheduleEndDate = value;
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
     * Gets the value of the scheduleID property.
     * 
     */
    public int getScheduleID() {
        return scheduleID;
    }

    /**
     * Sets the value of the scheduleID property.
     * 
     */
    public void setScheduleID(int value) {
        this.scheduleID = value;
    }

}
