
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BestFareDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestFareDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="LowFares" type="{http://www.ibsplc.com/iRes/simpleTypes/}LowFaresType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestFareDetailsType", propOrder = {
    "flightDate",
    "lowFares"
})
public class BestFareDetailsType {

    @XmlElement(name = "FlightDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar flightDate;
    @XmlElement(name = "LowFares", required = true)
    protected List<LowFaresType> lowFares;

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDate(XMLGregorianCalendar value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the lowFares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lowFares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLowFares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LowFaresType }
     * 
     * 
     */
    public List<LowFaresType> getLowFares() {
        if (lowFares == null) {
            lowFares = new ArrayList<LowFaresType>();
        }
        return this.lowFares;
    }

}
