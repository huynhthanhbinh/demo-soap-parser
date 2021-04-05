
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsrBookingSegmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsrBookingSegmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegmentIdentifierType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentIdentifierType" minOccurs="0"/>
 *         &lt;element name="SsrCountType" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrCountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsrBookingSegmentDetails", propOrder = {
    "flightSegmentIdentifierType",
    "ssrCountType"
})
public class SsrBookingSegmentDetails {

    @XmlElement(name = "FlightSegmentIdentifierType")
    protected FlightSegmentIdentifierType flightSegmentIdentifierType;
    @XmlElement(name = "SsrCountType")
    protected List<SsrCountType> ssrCountType;

    /**
     * Gets the value of the flightSegmentIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentIdentifierType }
     *     
     */
    public FlightSegmentIdentifierType getFlightSegmentIdentifierType() {
        return flightSegmentIdentifierType;
    }

    /**
     * Sets the value of the flightSegmentIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentIdentifierType }
     *     
     */
    public void setFlightSegmentIdentifierType(FlightSegmentIdentifierType value) {
        this.flightSegmentIdentifierType = value;
    }

    /**
     * Gets the value of the ssrCountType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrCountType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrCountType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrCountType }
     * 
     * 
     */
    public List<SsrCountType> getSsrCountType() {
        if (ssrCountType == null) {
            ssrCountType = new ArrayList<SsrCountType>();
        }
        return this.ssrCountType;
    }

}
