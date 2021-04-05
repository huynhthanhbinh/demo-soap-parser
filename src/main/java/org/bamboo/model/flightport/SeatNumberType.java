
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OldSeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewSeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatNumberType", propOrder = {
    "oldSeatNumber",
    "newSeatNumber"
})
public class SeatNumberType {

    @XmlElement(name = "OldSeatNumber")
    protected String oldSeatNumber;
    @XmlElement(name = "NewSeatNumber")
    protected String newSeatNumber;

    /**
     * Gets the value of the oldSeatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSeatNumber() {
        return oldSeatNumber;
    }

    /**
     * Sets the value of the oldSeatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSeatNumber(String value) {
        this.oldSeatNumber = value;
    }

    /**
     * Gets the value of the newSeatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSeatNumber() {
        return newSeatNumber;
    }

    /**
     * Sets the value of the newSeatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSeatNumber(String value) {
        this.newSeatNumber = value;
    }

}
