
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItineraryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="JourneyInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}JourneyInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryInfo", propOrder = {
    "itineraryID",
    "journeyInfo"
})
public class ItineraryInfo {

    @XmlElement(name = "ItineraryID")
    protected long itineraryID;
    @XmlElement(name = "JourneyInfo", required = true)
    protected List<JourneyInfo> journeyInfo;

    /**
     * Gets the value of the itineraryID property.
     * 
     */
    public long getItineraryID() {
        return itineraryID;
    }

    /**
     * Sets the value of the itineraryID property.
     * 
     */
    public void setItineraryID(long value) {
        this.itineraryID = value;
    }

    /**
     * Gets the value of the journeyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyInfo }
     * 
     * 
     */
    public List<JourneyInfo> getJourneyInfo() {
        if (journeyInfo == null) {
            journeyInfo = new ArrayList<JourneyInfo>();
        }
        return this.journeyInfo;
    }

}
