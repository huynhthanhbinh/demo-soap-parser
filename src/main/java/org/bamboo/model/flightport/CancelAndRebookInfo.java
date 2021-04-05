
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CancelAndRebookInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelAndRebookInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdultBaseFare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ChildBaseFare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="InfantBaseFare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OldFlightDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelAndRebookInfo", propOrder = {
    "fareClass",
    "fareBasis",
    "adultBaseFare",
    "childBaseFare",
    "infantBaseFare",
    "oldFlightDepartureDate",
    "timeZoneOffset"
})
public class CancelAndRebookInfo {

    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "FareBasis")
    protected String fareBasis;
    @XmlElement(name = "AdultBaseFare")
    protected Double adultBaseFare;
    @XmlElement(name = "ChildBaseFare")
    protected Double childBaseFare;
    @XmlElement(name = "InfantBaseFare")
    protected Double infantBaseFare;
    @XmlElement(name = "OldFlightDepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oldFlightDepartureDate;
    @XmlElement(name = "TimeZoneOffset", required = true)
    protected String timeZoneOffset;

    /**
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the adultBaseFare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdultBaseFare() {
        return adultBaseFare;
    }

    /**
     * Sets the value of the adultBaseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdultBaseFare(Double value) {
        this.adultBaseFare = value;
    }

    /**
     * Gets the value of the childBaseFare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChildBaseFare() {
        return childBaseFare;
    }

    /**
     * Sets the value of the childBaseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChildBaseFare(Double value) {
        this.childBaseFare = value;
    }

    /**
     * Gets the value of the infantBaseFare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInfantBaseFare() {
        return infantBaseFare;
    }

    /**
     * Sets the value of the infantBaseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInfantBaseFare(Double value) {
        this.infantBaseFare = value;
    }

    /**
     * Gets the value of the oldFlightDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOldFlightDepartureDate() {
        return oldFlightDepartureDate;
    }

    /**
     * Sets the value of the oldFlightDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOldFlightDepartureDate(XMLGregorianCalendar value) {
        this.oldFlightDepartureDate = value;
    }

    /**
     * Gets the value of the timeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * Sets the value of the timeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneOffset(String value) {
        this.timeZoneOffset = value;
    }

}
