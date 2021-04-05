
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Unique Identifier for a flight.
 * 
 * <p>Java class for FlightIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fltNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="airlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flightDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/>
 *         &lt;element name="fltSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrierFltNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carrierInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightIdentifierType", propOrder = {
    "fltNumber",
    "airlineCode",
    "flightDate",
    "fltSuffix",
    "carrierCode",
    "carrierFltNumber",
    "carrierInfo"
})
public class FlightIdentifierType {

    @XmlElement(required = true)
    protected String fltNumber;
    @XmlElement(required = true)
    protected String airlineCode;
    @XmlElement(required = true)
    protected DateOnlyType flightDate;
    @XmlElement(required = true)
    protected String fltSuffix;
    @XmlElement(required = true)
    protected String carrierCode;
    protected Integer carrierFltNumber;
    protected String carrierInfo;

    /**
     * Gets the value of the fltNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltNumber() {
        return fltNumber;
    }

    /**
     * Sets the value of the fltNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltNumber(String value) {
        this.fltNumber = value;
    }

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setFlightDate(DateOnlyType value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the fltSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltSuffix() {
        return fltSuffix;
    }

    /**
     * Sets the value of the fltSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltSuffix(String value) {
        this.fltSuffix = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the carrierFltNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarrierFltNumber() {
        return carrierFltNumber;
    }

    /**
     * Sets the value of the carrierFltNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarrierFltNumber(Integer value) {
        this.carrierFltNumber = value;
    }

    /**
     * Gets the value of the carrierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierInfo() {
        return carrierInfo;
    }

    /**
     * Sets the value of the carrierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierInfo(String value) {
        this.carrierInfo = value;
    }

}
