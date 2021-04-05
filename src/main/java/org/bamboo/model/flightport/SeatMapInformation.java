
package org.bamboo.model.flightport;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatMapInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatMapdetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatMapDetailsType"/>
 *         &lt;element name="LocationAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FacilityAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="ZoneAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatPriorityAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttachedSsr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaximumInfantsPerUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "SeatMapInformation", propOrder = {
    "seatMapdetails",
    "locationAttribute",
    "facilityAttributes",
    "zoneAttributes",
    "seatPriorityAttributes",
    "attachedSsr",
    "maximumInfantsPerUnit"
})
public class SeatMapInformation {

    @XmlElement(name = "SeatMapdetails", required = true)
    protected SeatMapDetailsType seatMapdetails;
    @XmlElement(name = "LocationAttribute")
    protected List<String> locationAttribute;
    @XmlElement(name = "FacilityAttributes", required = true)
    protected List<String> facilityAttributes;
    @XmlElement(name = "ZoneAttributes")
    protected List<String> zoneAttributes;
    @XmlElement(name = "SeatPriorityAttributes")
    protected List<String> seatPriorityAttributes;
    @XmlElement(name = "AttachedSsr")
    protected List<String> attachedSsr;
    @XmlElement(name = "MaximumInfantsPerUnit")
    protected BigInteger maximumInfantsPerUnit;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * Gets the value of the seatMapdetails property.
     * 
     * @return
     *     possible object is
     *     {@link SeatMapDetailsType }
     *     
     */
    public SeatMapDetailsType getSeatMapdetails() {
        return seatMapdetails;
    }

    /**
     * Sets the value of the seatMapdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatMapDetailsType }
     *     
     */
    public void setSeatMapdetails(SeatMapDetailsType value) {
        this.seatMapdetails = value;
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
     * Gets the value of the facilityAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFacilityAttributes() {
        if (facilityAttributes == null) {
            facilityAttributes = new ArrayList<String>();
        }
        return this.facilityAttributes;
    }

    /**
     * Gets the value of the zoneAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZoneAttributes() {
        if (zoneAttributes == null) {
            zoneAttributes = new ArrayList<String>();
        }
        return this.zoneAttributes;
    }

    /**
     * Gets the value of the seatPriorityAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatPriorityAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatPriorityAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatPriorityAttributes() {
        if (seatPriorityAttributes == null) {
            seatPriorityAttributes = new ArrayList<String>();
        }
        return this.seatPriorityAttributes;
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
     * Gets the value of the maximumInfantsPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumInfantsPerUnit() {
        return maximumInfantsPerUnit;
    }

    /**
     * Sets the value of the maximumInfantsPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumInfantsPerUnit(BigInteger value) {
        this.maximumInfantsPerUnit = value;
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
