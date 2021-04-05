
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
 * <p>Java class for OandDDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OandDDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OandDId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OandDReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareDetailsForAGuest" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareDetailsForAGuest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IsFareOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFareRuleOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FareOverrideDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareOverrideDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightSegmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentDetails" maxOccurs="unbounded"/>
 *         &lt;element name="FlightNumbers" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandbyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OandDSequenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldOandDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasArnk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ArnkDateLtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RefType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ReferenceType" minOccurs="0"/>
 *         &lt;element name="TripType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBookedAsReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PricingUnitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsMarked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="canDeleteAssociatedOAndD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OandDDetails", propOrder = {
    "oandDId",
    "origin",
    "destination",
    "route",
    "oandDReferenceId",
    "fareDetailsForAGuest",
    "isFareOverridden",
    "isFareRuleOverridden",
    "fareOverrideDetails",
    "flightSegmentDetails",
    "flightNumbers",
    "cabinClass",
    "fareClass",
    "standbyCode",
    "oandDSequenceID",
    "oldOandDID",
    "hasArnk",
    "arnkDateLtc",
    "refId",
    "refType",
    "tripType",
    "isBookedAsReturn",
    "pricingUnitID",
    "isMarked",
    "addedTime",
    "canDeleteAssociatedOAndD"
})
public class OandDDetails {

    @XmlElement(name = "OandDId")
    protected String oandDId;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "Route", required = true)
    protected String route;
    @XmlElement(name = "OandDReferenceId")
    protected String oandDReferenceId;
    @XmlElement(name = "FareDetailsForAGuest")
    protected List<FareDetailsForAGuest> fareDetailsForAGuest;
    @XmlElement(name = "IsFareOverridden")
    protected Boolean isFareOverridden;
    @XmlElement(name = "IsFareRuleOverridden")
    protected Boolean isFareRuleOverridden;
    @XmlElement(name = "FareOverrideDetails")
    protected List<FareOverrideDetails> fareOverrideDetails;
    @XmlElement(name = "FlightSegmentDetails", required = true)
    protected List<FlightSegmentDetails> flightSegmentDetails;
    @XmlElement(name = "FlightNumbers", required = true)
    protected String flightNumbers;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "StandbyCode")
    protected String standbyCode;
    @XmlElement(name = "OandDSequenceID")
    protected String oandDSequenceID;
    @XmlElement(name = "OldOandDID")
    protected String oldOandDID;
    @XmlElement(name = "HasArnk")
    protected Boolean hasArnk;
    @XmlElement(name = "ArnkDateLtc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arnkDateLtc;
    @XmlElement(name = "RefId")
    protected Long refId;
    @XmlElement(name = "RefType")
    @XmlSchemaType(name = "string")
    protected ReferenceType refType;
    @XmlElement(name = "TripType")
    protected String tripType;
    @XmlElement(name = "IsBookedAsReturn")
    protected Boolean isBookedAsReturn;
    @XmlElement(name = "PricingUnitID")
    protected Integer pricingUnitID;
    @XmlElement(name = "IsMarked")
    protected Boolean isMarked;
    @XmlElement(name = "AddedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar addedTime;
    protected Boolean canDeleteAssociatedOAndD;

    /**
     * Gets the value of the oandDId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOandDId() {
        return oandDId;
    }

    /**
     * Sets the value of the oandDId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOandDId(String value) {
        this.oandDId = value;
    }

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
     * Gets the value of the oandDReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOandDReferenceId() {
        return oandDReferenceId;
    }

    /**
     * Sets the value of the oandDReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOandDReferenceId(String value) {
        this.oandDReferenceId = value;
    }

    /**
     * Gets the value of the fareDetailsForAGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetailsForAGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetailsForAGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailsForAGuest }
     * 
     * 
     */
    public List<FareDetailsForAGuest> getFareDetailsForAGuest() {
        if (fareDetailsForAGuest == null) {
            fareDetailsForAGuest = new ArrayList<FareDetailsForAGuest>();
        }
        return this.fareDetailsForAGuest;
    }

    /**
     * Gets the value of the isFareOverridden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFareOverridden() {
        return isFareOverridden;
    }

    /**
     * Sets the value of the isFareOverridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFareOverridden(Boolean value) {
        this.isFareOverridden = value;
    }

    /**
     * Gets the value of the isFareRuleOverridden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFareRuleOverridden() {
        return isFareRuleOverridden;
    }

    /**
     * Sets the value of the isFareRuleOverridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFareRuleOverridden(Boolean value) {
        this.isFareRuleOverridden = value;
    }

    /**
     * Gets the value of the fareOverrideDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareOverrideDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareOverrideDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareOverrideDetails }
     * 
     * 
     */
    public List<FareOverrideDetails> getFareOverrideDetails() {
        if (fareOverrideDetails == null) {
            fareOverrideDetails = new ArrayList<FareOverrideDetails>();
        }
        return this.fareOverrideDetails;
    }

    /**
     * Gets the value of the flightSegmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentDetails }
     * 
     * 
     */
    public List<FlightSegmentDetails> getFlightSegmentDetails() {
        if (flightSegmentDetails == null) {
            flightSegmentDetails = new ArrayList<FlightSegmentDetails>();
        }
        return this.flightSegmentDetails;
    }

    /**
     * Gets the value of the flightNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumbers() {
        return flightNumbers;
    }

    /**
     * Sets the value of the flightNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumbers(String value) {
        this.flightNumbers = value;
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
     * Gets the value of the oandDSequenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOandDSequenceID() {
        return oandDSequenceID;
    }

    /**
     * Sets the value of the oandDSequenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOandDSequenceID(String value) {
        this.oandDSequenceID = value;
    }

    /**
     * Gets the value of the oldOandDID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldOandDID() {
        return oldOandDID;
    }

    /**
     * Sets the value of the oldOandDID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldOandDID(String value) {
        this.oldOandDID = value;
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
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefId(Long value) {
        this.refId = value;
    }

    /**
     * Gets the value of the refType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRefType() {
        return refType;
    }

    /**
     * Sets the value of the refType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRefType(ReferenceType value) {
        this.refType = value;
    }

    /**
     * Gets the value of the tripType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripType() {
        return tripType;
    }

    /**
     * Sets the value of the tripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripType(String value) {
        this.tripType = value;
    }

    /**
     * Gets the value of the isBookedAsReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBookedAsReturn() {
        return isBookedAsReturn;
    }

    /**
     * Sets the value of the isBookedAsReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBookedAsReturn(Boolean value) {
        this.isBookedAsReturn = value;
    }

    /**
     * Gets the value of the pricingUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPricingUnitID() {
        return pricingUnitID;
    }

    /**
     * Sets the value of the pricingUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPricingUnitID(Integer value) {
        this.pricingUnitID = value;
    }

    /**
     * Gets the value of the isMarked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMarked() {
        return isMarked;
    }

    /**
     * Sets the value of the isMarked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMarked(Boolean value) {
        this.isMarked = value;
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
     * Gets the value of the canDeleteAssociatedOAndD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDeleteAssociatedOAndD() {
        return canDeleteAssociatedOAndD;
    }

    /**
     * Sets the value of the canDeleteAssociatedOAndD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDeleteAssociatedOAndD(Boolean value) {
        this.canDeleteAssociatedOAndD = value;
    }

}
