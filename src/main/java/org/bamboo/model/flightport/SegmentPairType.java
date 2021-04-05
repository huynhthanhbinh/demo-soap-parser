
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentPairType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentPairType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivingFlightSegment" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentType"/>
 *         &lt;element name="DepartingFlightSegment" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentType"/>
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentPairType", propOrder = {
    "arrivingFlightSegment",
    "departingFlightSegment",
    "groupID"
})
public class SegmentPairType {

    @XmlElement(name = "ArrivingFlightSegment", required = true)
    protected FlightSegmentType arrivingFlightSegment;
    @XmlElement(name = "DepartingFlightSegment", required = true)
    protected FlightSegmentType departingFlightSegment;
    @XmlElement(name = "GroupID")
    protected Integer groupID;

    /**
     * Gets the value of the arrivingFlightSegment property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentType }
     *     
     */
    public FlightSegmentType getArrivingFlightSegment() {
        return arrivingFlightSegment;
    }

    /**
     * Sets the value of the arrivingFlightSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentType }
     *     
     */
    public void setArrivingFlightSegment(FlightSegmentType value) {
        this.arrivingFlightSegment = value;
    }

    /**
     * Gets the value of the departingFlightSegment property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentType }
     *     
     */
    public FlightSegmentType getDepartingFlightSegment() {
        return departingFlightSegment;
    }

    /**
     * Sets the value of the departingFlightSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentType }
     *     
     */
    public void setDepartingFlightSegment(FlightSegmentType value) {
        this.departingFlightSegment = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupID(Integer value) {
        this.groupID = value;
    }

}
