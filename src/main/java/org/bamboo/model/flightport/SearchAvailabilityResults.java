
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchAvailabilityResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAvailabilityResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OnwardFlightInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightResults"/>
 *         &lt;element name="ReturnFlightInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightResults" minOccurs="0"/>
 *         &lt;element name="SearchId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchAvailabilityResults", propOrder = {
    "onwardFlightInfo",
    "returnFlightInfo",
    "searchId"
})
public class SearchAvailabilityResults {

    @XmlElement(name = "OnwardFlightInfo", required = true)
    protected FlightResults onwardFlightInfo;
    @XmlElement(name = "ReturnFlightInfo")
    protected FlightResults returnFlightInfo;
    @XmlElement(name = "SearchId")
    protected Integer searchId;

    /**
     * Gets the value of the onwardFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlightResults }
     *     
     */
    public FlightResults getOnwardFlightInfo() {
        return onwardFlightInfo;
    }

    /**
     * Sets the value of the onwardFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightResults }
     *     
     */
    public void setOnwardFlightInfo(FlightResults value) {
        this.onwardFlightInfo = value;
    }

    /**
     * Gets the value of the returnFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlightResults }
     *     
     */
    public FlightResults getReturnFlightInfo() {
        return returnFlightInfo;
    }

    /**
     * Sets the value of the returnFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightResults }
     *     
     */
    public void setReturnFlightInfo(FlightResults value) {
        this.returnFlightInfo = value;
    }

    /**
     * Gets the value of the searchId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchId() {
        return searchId;
    }

    /**
     * Sets the value of the searchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchId(Integer value) {
        this.searchId = value;
    }

}
