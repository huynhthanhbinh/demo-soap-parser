
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OAndDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BestFareInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}BestFareInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TripDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPartOfReturnTrip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightResults", propOrder = {
    "oAndDDetails",
    "bestFareInfo",
    "tripDirection",
    "isPartOfReturnTrip"
})
public class FlightResults {

    @XmlElement(name = "OAndDDetails")
    protected List<OandDDetails> oAndDDetails;
    @XmlElement(name = "BestFareInfo")
    protected List<BestFareInfo> bestFareInfo;
    @XmlElement(name = "TripDirection")
    protected String tripDirection;
    @XmlElement(name = "IsPartOfReturnTrip")
    protected Boolean isPartOfReturnTrip;

    /**
     * Gets the value of the oAndDDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oAndDDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOAndDDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDDetails }
     * 
     * 
     */
    public List<OandDDetails> getOAndDDetails() {
        if (oAndDDetails == null) {
            oAndDDetails = new ArrayList<OandDDetails>();
        }
        return this.oAndDDetails;
    }

    /**
     * Gets the value of the bestFareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestFareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BestFareInfo }
     * 
     * 
     */
    public List<BestFareInfo> getBestFareInfo() {
        if (bestFareInfo == null) {
            bestFareInfo = new ArrayList<BestFareInfo>();
        }
        return this.bestFareInfo;
    }

    /**
     * Gets the value of the tripDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripDirection() {
        return tripDirection;
    }

    /**
     * Sets the value of the tripDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripDirection(String value) {
        this.tripDirection = value;
    }

    /**
     * Gets the value of the isPartOfReturnTrip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartOfReturnTrip() {
        return isPartOfReturnTrip;
    }

    /**
     * Sets the value of the isPartOfReturnTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartOfReturnTrip(Boolean value) {
        this.isPartOfReturnTrip = value;
    }

}
