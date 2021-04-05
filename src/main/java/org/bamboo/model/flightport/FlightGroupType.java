
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
 * <p>Java class for FlightGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsNonStop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsThrough" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsConnection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InitialDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FinalArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InitialDepartureTime" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FinalArrivalTime" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InitialDepartureTimeString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FinalArrivalTimeString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InitialFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConnectionLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalStops" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalJourneyTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FareGroupID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlightInformations" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightInformationsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightGroupType", propOrder = {
    "isNonStop",
    "isThrough",
    "isConnection",
    "initialDepartureDate",
    "finalArrivalDate",
    "initialDepartureTime",
    "finalArrivalTime",
    "initialDepartureTimeString",
    "finalArrivalTimeString",
    "initialFlightNumber",
    "connectionLevel",
    "totalStops",
    "totalJourneyTime",
    "fareGroupID",
    "flightInformations"
})
public class FlightGroupType {

    @XmlElement(name = "IsNonStop")
    protected boolean isNonStop;
    @XmlElement(name = "IsThrough")
    protected boolean isThrough;
    @XmlElement(name = "IsConnection")
    protected boolean isConnection;
    @XmlElement(name = "InitialDepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialDepartureDate;
    @XmlElement(name = "FinalArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finalArrivalDate;
    @XmlElement(name = "InitialDepartureTime")
    protected double initialDepartureTime;
    @XmlElement(name = "FinalArrivalTime")
    protected double finalArrivalTime;
    @XmlElement(name = "InitialDepartureTimeString", required = true)
    protected String initialDepartureTimeString;
    @XmlElement(name = "FinalArrivalTimeString", required = true)
    protected String finalArrivalTimeString;
    @XmlElement(name = "InitialFlightNumber", required = true)
    protected String initialFlightNumber;
    @XmlElement(name = "ConnectionLevel")
    protected int connectionLevel;
    @XmlElement(name = "TotalStops")
    protected int totalStops;
    @XmlElement(name = "TotalJourneyTime")
    protected int totalJourneyTime;
    @XmlElement(name = "FareGroupID", required = true)
    protected String fareGroupID;
    @XmlElement(name = "FlightInformations", required = true)
    protected List<FlightInformationsType> flightInformations;

    /**
     * Gets the value of the isNonStop property.
     * 
     */
    public boolean isIsNonStop() {
        return isNonStop;
    }

    /**
     * Sets the value of the isNonStop property.
     * 
     */
    public void setIsNonStop(boolean value) {
        this.isNonStop = value;
    }

    /**
     * Gets the value of the isThrough property.
     * 
     */
    public boolean isIsThrough() {
        return isThrough;
    }

    /**
     * Sets the value of the isThrough property.
     * 
     */
    public void setIsThrough(boolean value) {
        this.isThrough = value;
    }

    /**
     * Gets the value of the isConnection property.
     * 
     */
    public boolean isIsConnection() {
        return isConnection;
    }

    /**
     * Sets the value of the isConnection property.
     * 
     */
    public void setIsConnection(boolean value) {
        this.isConnection = value;
    }

    /**
     * Gets the value of the initialDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialDepartureDate() {
        return initialDepartureDate;
    }

    /**
     * Sets the value of the initialDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialDepartureDate(XMLGregorianCalendar value) {
        this.initialDepartureDate = value;
    }

    /**
     * Gets the value of the finalArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalArrivalDate() {
        return finalArrivalDate;
    }

    /**
     * Sets the value of the finalArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalArrivalDate(XMLGregorianCalendar value) {
        this.finalArrivalDate = value;
    }

    /**
     * Gets the value of the initialDepartureTime property.
     * 
     */
    public double getInitialDepartureTime() {
        return initialDepartureTime;
    }

    /**
     * Sets the value of the initialDepartureTime property.
     * 
     */
    public void setInitialDepartureTime(double value) {
        this.initialDepartureTime = value;
    }

    /**
     * Gets the value of the finalArrivalTime property.
     * 
     */
    public double getFinalArrivalTime() {
        return finalArrivalTime;
    }

    /**
     * Sets the value of the finalArrivalTime property.
     * 
     */
    public void setFinalArrivalTime(double value) {
        this.finalArrivalTime = value;
    }

    /**
     * Gets the value of the initialDepartureTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialDepartureTimeString() {
        return initialDepartureTimeString;
    }

    /**
     * Sets the value of the initialDepartureTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialDepartureTimeString(String value) {
        this.initialDepartureTimeString = value;
    }

    /**
     * Gets the value of the finalArrivalTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalArrivalTimeString() {
        return finalArrivalTimeString;
    }

    /**
     * Sets the value of the finalArrivalTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalArrivalTimeString(String value) {
        this.finalArrivalTimeString = value;
    }

    /**
     * Gets the value of the initialFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialFlightNumber() {
        return initialFlightNumber;
    }

    /**
     * Sets the value of the initialFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialFlightNumber(String value) {
        this.initialFlightNumber = value;
    }

    /**
     * Gets the value of the connectionLevel property.
     * 
     */
    public int getConnectionLevel() {
        return connectionLevel;
    }

    /**
     * Sets the value of the connectionLevel property.
     * 
     */
    public void setConnectionLevel(int value) {
        this.connectionLevel = value;
    }

    /**
     * Gets the value of the totalStops property.
     * 
     */
    public int getTotalStops() {
        return totalStops;
    }

    /**
     * Sets the value of the totalStops property.
     * 
     */
    public void setTotalStops(int value) {
        this.totalStops = value;
    }

    /**
     * Gets the value of the totalJourneyTime property.
     * 
     */
    public int getTotalJourneyTime() {
        return totalJourneyTime;
    }

    /**
     * Sets the value of the totalJourneyTime property.
     * 
     */
    public void setTotalJourneyTime(int value) {
        this.totalJourneyTime = value;
    }

    /**
     * Gets the value of the fareGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareGroupID() {
        return fareGroupID;
    }

    /**
     * Sets the value of the fareGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareGroupID(String value) {
        this.fareGroupID = value;
    }

    /**
     * Gets the value of the flightInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInformationsType }
     * 
     * 
     */
    public List<FlightInformationsType> getFlightInformations() {
        if (flightInformations == null) {
            flightInformations = new ArrayList<FlightInformationsType>();
        }
        return this.flightInformations;
    }

}
