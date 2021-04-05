
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarRentalServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarRentalServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AUXCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AirportCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarRentalServiceType", propOrder = {
    "auxCode",
    "airportCodes"
})
public class CarRentalServiceType {

    @XmlElement(name = "AUXCode", required = true)
    protected String auxCode;
    @XmlElement(name = "AirportCodes", required = true)
    protected List<String> airportCodes;

    /**
     * Gets the value of the auxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUXCode() {
        return auxCode;
    }

    /**
     * Sets the value of the auxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUXCode(String value) {
        this.auxCode = value;
    }

    /**
     * Gets the value of the airportCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAirportCodes() {
        if (airportCodes == null) {
            airportCodes = new ArrayList<String>();
        }
        return this.airportCodes;
    }

}
