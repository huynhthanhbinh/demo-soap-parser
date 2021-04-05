
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportAncillaries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportAncillaries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirportAncillary" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportAncillary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportAncillaries", propOrder = {
    "airportAncillary"
})
public class AirportAncillaries {

    @XmlElement(name = "AirportAncillary")
    protected List<AirportAncillary> airportAncillary;

    /**
     * Gets the value of the airportAncillary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportAncillary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportAncillary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportAncillary }
     * 
     * 
     */
    public List<AirportAncillary> getAirportAncillary() {
        if (airportAncillary == null) {
            airportAncillary = new ArrayList<AirportAncillary>();
        }
        return this.airportAncillary;
    }

}
