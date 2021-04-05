
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirportPair" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportPairType" minOccurs="0"/>
 *         &lt;element name="ScheduleLists" type="{http://www.ibsplc.com/iRes/simpleTypes/}ScheduleList" maxOccurs="unbounded"/>
 *         &lt;element name="ScheduleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleDetailsType", propOrder = {
    "airportPair",
    "scheduleLists",
    "scheduleId"
})
public class ScheduleDetailsType {

    @XmlElement(name = "AirportPair")
    protected AirportPairType airportPair;
    @XmlElement(name = "ScheduleLists", required = true)
    protected List<ScheduleList> scheduleLists;
    @XmlElement(name = "ScheduleId")
    protected int scheduleId;

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
     * Gets the value of the scheduleLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleList }
     * 
     * 
     */
    public List<ScheduleList> getScheduleLists() {
        if (scheduleLists == null) {
            scheduleLists = new ArrayList<ScheduleList>();
        }
        return this.scheduleLists;
    }

    /**
     * Gets the value of the scheduleId property.
     * 
     */
    public int getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     */
    public void setScheduleId(int value) {
        this.scheduleId = value;
    }

}
