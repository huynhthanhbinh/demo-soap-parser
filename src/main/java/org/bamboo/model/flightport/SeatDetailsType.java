
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InternalRowNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InternalColumnNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExternalRowNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExternalColumnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocationAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FacilityAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ZoneAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatPriorityAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttachedSsr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PreferredSeatSsr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ControlAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AllocatedPassengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowedFareClasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RestrictedFareClasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatAssignMentFee" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignMentFeeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDetailsType", propOrder = {
    "seatNumber",
    "internalRowNumber",
    "internalColumnNumber",
    "externalRowNumber",
    "externalColumnName",
    "locationAttribute",
    "facilityAttribute",
    "zoneAttribute",
    "seatPriorityAttribute",
    "attachedSsr",
    "preferredSeatSsr",
    "controlAttribute",
    "allocatedPassengerType",
    "allowedFareClasses",
    "restrictedFareClasses",
    "seatPreference",
    "seatAssignMentFee"
})
public class SeatDetailsType {

    @XmlElement(name = "SeatNumber", required = true)
    protected String seatNumber;
    @XmlElement(name = "InternalRowNumber", required = true)
    protected String internalRowNumber;
    @XmlElement(name = "InternalColumnNumber", required = true)
    protected String internalColumnNumber;
    @XmlElement(name = "ExternalRowNumber", required = true)
    protected String externalRowNumber;
    @XmlElement(name = "ExternalColumnName", required = true)
    protected String externalColumnName;
    @XmlElement(name = "LocationAttribute")
    protected List<String> locationAttribute;
    @XmlElement(name = "FacilityAttribute")
    protected List<String> facilityAttribute;
    @XmlElement(name = "ZoneAttribute")
    protected List<String> zoneAttribute;
    @XmlElement(name = "SeatPriorityAttribute")
    protected List<String> seatPriorityAttribute;
    @XmlElement(name = "AttachedSsr")
    protected List<String> attachedSsr;
    @XmlElement(name = "PreferredSeatSsr")
    protected List<String> preferredSeatSsr;
    @XmlElement(name = "ControlAttribute", required = true)
    protected String controlAttribute;
    @XmlElement(name = "AllocatedPassengerType")
    protected String allocatedPassengerType;
    @XmlElement(name = "AllowedFareClasses")
    protected List<String> allowedFareClasses;
    @XmlElement(name = "RestrictedFareClasses")
    protected List<String> restrictedFareClasses;
    @XmlElement(name = "SeatPreference")
    protected String seatPreference;
    @XmlElement(name = "SeatAssignMentFee")
    protected List<SeatAssignMentFeeType> seatAssignMentFee;

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the internalRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalRowNumber() {
        return internalRowNumber;
    }

    /**
     * Sets the value of the internalRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalRowNumber(String value) {
        this.internalRowNumber = value;
    }

    /**
     * Gets the value of the internalColumnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalColumnNumber() {
        return internalColumnNumber;
    }

    /**
     * Sets the value of the internalColumnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalColumnNumber(String value) {
        this.internalColumnNumber = value;
    }

    /**
     * Gets the value of the externalRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRowNumber() {
        return externalRowNumber;
    }

    /**
     * Sets the value of the externalRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRowNumber(String value) {
        this.externalRowNumber = value;
    }

    /**
     * Gets the value of the externalColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalColumnName() {
        return externalColumnName;
    }

    /**
     * Sets the value of the externalColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalColumnName(String value) {
        this.externalColumnName = value;
    }

    /**
     * Gets the value of the locationAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocationAttribute() {
        if (locationAttribute == null) {
            locationAttribute = new ArrayList<String>();
        }
        return this.locationAttribute;
    }

    /**
     * Gets the value of the facilityAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFacilityAttribute() {
        if (facilityAttribute == null) {
            facilityAttribute = new ArrayList<String>();
        }
        return this.facilityAttribute;
    }

    /**
     * Gets the value of the zoneAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZoneAttribute() {
        if (zoneAttribute == null) {
            zoneAttribute = new ArrayList<String>();
        }
        return this.zoneAttribute;
    }

    /**
     * Gets the value of the seatPriorityAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatPriorityAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatPriorityAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatPriorityAttribute() {
        if (seatPriorityAttribute == null) {
            seatPriorityAttribute = new ArrayList<String>();
        }
        return this.seatPriorityAttribute;
    }

    /**
     * Gets the value of the attachedSsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedSsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedSsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachedSsr() {
        if (attachedSsr == null) {
            attachedSsr = new ArrayList<String>();
        }
        return this.attachedSsr;
    }

    /**
     * Gets the value of the preferredSeatSsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredSeatSsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredSeatSsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreferredSeatSsr() {
        if (preferredSeatSsr == null) {
            preferredSeatSsr = new ArrayList<String>();
        }
        return this.preferredSeatSsr;
    }

    /**
     * Gets the value of the controlAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlAttribute() {
        return controlAttribute;
    }

    /**
     * Sets the value of the controlAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlAttribute(String value) {
        this.controlAttribute = value;
    }

    /**
     * Gets the value of the allocatedPassengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocatedPassengerType() {
        return allocatedPassengerType;
    }

    /**
     * Sets the value of the allocatedPassengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocatedPassengerType(String value) {
        this.allocatedPassengerType = value;
    }

    /**
     * Gets the value of the allowedFareClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedFareClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedFareClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllowedFareClasses() {
        if (allowedFareClasses == null) {
            allowedFareClasses = new ArrayList<String>();
        }
        return this.allowedFareClasses;
    }

    /**
     * Gets the value of the restrictedFareClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedFareClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedFareClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRestrictedFareClasses() {
        if (restrictedFareClasses == null) {
            restrictedFareClasses = new ArrayList<String>();
        }
        return this.restrictedFareClasses;
    }

    /**
     * Gets the value of the seatPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPreference() {
        return seatPreference;
    }

    /**
     * Sets the value of the seatPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPreference(String value) {
        this.seatPreference = value;
    }

    /**
     * Gets the value of the seatAssignMentFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAssignMentFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAssignMentFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAssignMentFeeType }
     * 
     * 
     */
    public List<SeatAssignMentFeeType> getSeatAssignMentFee() {
        if (seatAssignMentFee == null) {
            seatAssignMentFee = new ArrayList<SeatAssignMentFeeType>();
        }
        return this.seatAssignMentFee;
    }

}
