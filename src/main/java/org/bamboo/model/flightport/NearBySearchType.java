
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
 * <p>Java class for NearBySearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NearBySearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TravelDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SpecificFlightDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositiveDaysOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PreferredTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NegativeDaysOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailabilitySsr" type="{http://www.ibsplc.com/iRes/simpleTypes/}AvailabilitySsr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="canSearchNearbyOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canSearchNearbyDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestFarePossitiveDaysOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BestFareNegativeDaysOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NearBySearchType", propOrder = {
    "origin",
    "destination",
    "travelDate",
    "specificFlightDetails",
    "positiveDaysOut",
    "preferredTimeOfDay",
    "negativeDaysOut",
    "cabinClass",
    "availabilitySsr",
    "canSearchNearbyOrigin",
    "canSearchNearbyDestination",
    "bestFarePossitiveDaysOut",
    "bestFareNegativeDaysOut"
})
public class NearBySearchType {

    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "TravelDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDate;
    @XmlElement(name = "SpecificFlightDetails")
    protected String specificFlightDetails;
    @XmlElement(name = "PositiveDaysOut", defaultValue = "0")
    protected int positiveDaysOut;
    @XmlElement(name = "PreferredTimeOfDay")
    protected String preferredTimeOfDay;
    @XmlElement(name = "NegativeDaysOut", defaultValue = "0")
    protected int negativeDaysOut;
    @XmlElement(name = "CabinClass")
    protected String cabinClass;
    @XmlElement(name = "AvailabilitySsr")
    protected List<AvailabilitySsr> availabilitySsr;
    protected Boolean canSearchNearbyOrigin;
    protected Boolean canSearchNearbyDestination;
    @XmlElement(name = "BestFarePossitiveDaysOut", defaultValue = "0")
    protected int bestFarePossitiveDaysOut;
    @XmlElement(name = "BestFareNegativeDaysOut", defaultValue = "0")
    protected int bestFareNegativeDaysOut;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the travelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDate(XMLGregorianCalendar value) {
        this.travelDate = value;
    }

    /**
     * Gets the value of the specificFlightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificFlightDetails() {
        return specificFlightDetails;
    }

    /**
     * Sets the value of the specificFlightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificFlightDetails(String value) {
        this.specificFlightDetails = value;
    }

    /**
     * Gets the value of the positiveDaysOut property.
     * 
     */
    public int getPositiveDaysOut() {
        return positiveDaysOut;
    }

    /**
     * Sets the value of the positiveDaysOut property.
     * 
     */
    public void setPositiveDaysOut(int value) {
        this.positiveDaysOut = value;
    }

    /**
     * Gets the value of the preferredTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredTimeOfDay() {
        return preferredTimeOfDay;
    }

    /**
     * Sets the value of the preferredTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredTimeOfDay(String value) {
        this.preferredTimeOfDay = value;
    }

    /**
     * Gets the value of the negativeDaysOut property.
     * 
     */
    public int getNegativeDaysOut() {
        return negativeDaysOut;
    }

    /**
     * Sets the value of the negativeDaysOut property.
     * 
     */
    public void setNegativeDaysOut(int value) {
        this.negativeDaysOut = value;
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
     * Gets the value of the availabilitySsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilitySsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilitySsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailabilitySsr }
     * 
     * 
     */
    public List<AvailabilitySsr> getAvailabilitySsr() {
        if (availabilitySsr == null) {
            availabilitySsr = new ArrayList<AvailabilitySsr>();
        }
        return this.availabilitySsr;
    }

    /**
     * Gets the value of the canSearchNearbyOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSearchNearbyOrigin() {
        return canSearchNearbyOrigin;
    }

    /**
     * Sets the value of the canSearchNearbyOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSearchNearbyOrigin(Boolean value) {
        this.canSearchNearbyOrigin = value;
    }

    /**
     * Gets the value of the canSearchNearbyDestination property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSearchNearbyDestination() {
        return canSearchNearbyDestination;
    }

    /**
     * Sets the value of the canSearchNearbyDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSearchNearbyDestination(Boolean value) {
        this.canSearchNearbyDestination = value;
    }

    /**
     * Gets the value of the bestFarePossitiveDaysOut property.
     * 
     */
    public int getBestFarePossitiveDaysOut() {
        return bestFarePossitiveDaysOut;
    }

    /**
     * Sets the value of the bestFarePossitiveDaysOut property.
     * 
     */
    public void setBestFarePossitiveDaysOut(int value) {
        this.bestFarePossitiveDaysOut = value;
    }

    /**
     * Gets the value of the bestFareNegativeDaysOut property.
     * 
     */
    public int getBestFareNegativeDaysOut() {
        return bestFareNegativeDaysOut;
    }

    /**
     * Sets the value of the bestFareNegativeDaysOut property.
     * 
     */
    public void setBestFareNegativeDaysOut(int value) {
        this.bestFareNegativeDaysOut = value;
    }

}
