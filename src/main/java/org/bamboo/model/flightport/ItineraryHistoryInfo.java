
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryHistoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryHistoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegmentHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentHistoryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryHistoryInfo", propOrder = {
    "flightSegmentHistoryInfo"
})
public class ItineraryHistoryInfo {

    @XmlElement(name = "FlightSegmentHistoryInfo")
    protected List<FlightSegmentHistoryInfo> flightSegmentHistoryInfo;

    /**
     * Gets the value of the flightSegmentHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentHistoryInfo }
     * 
     * 
     */
    public List<FlightSegmentHistoryInfo> getFlightSegmentHistoryInfo() {
        if (flightSegmentHistoryInfo == null) {
            flightSegmentHistoryInfo = new ArrayList<FlightSegmentHistoryInfo>();
        }
        return this.flightSegmentHistoryInfo;
    }

}
