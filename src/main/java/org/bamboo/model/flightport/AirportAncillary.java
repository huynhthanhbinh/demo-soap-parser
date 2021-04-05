
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportAncillary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportAncillary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaleableSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableSsrs" minOccurs="0"/>
 *         &lt;element name="SaleableAuxs" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableAuxs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportAncillary", propOrder = {
    "airportCode",
    "airportRole",
    "saleableSsrs",
    "saleableAuxs"
})
public class AirportAncillary {

    @XmlElement(name = "AirportCode")
    protected String airportCode;
    @XmlElement(name = "AirportRole")
    protected String airportRole;
    @XmlElement(name = "SaleableSsrs")
    protected SaleableSsrs saleableSsrs;
    @XmlElement(name = "SaleableAuxs")
    protected SaleableAuxs saleableAuxs;

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * Gets the value of the airportRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportRole() {
        return airportRole;
    }

    /**
     * Sets the value of the airportRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportRole(String value) {
        this.airportRole = value;
    }

    /**
     * Gets the value of the saleableSsrs property.
     * 
     * @return
     *     possible object is
     *     {@link SaleableSsrs }
     *     
     */
    public SaleableSsrs getSaleableSsrs() {
        return saleableSsrs;
    }

    /**
     * Sets the value of the saleableSsrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleableSsrs }
     *     
     */
    public void setSaleableSsrs(SaleableSsrs value) {
        this.saleableSsrs = value;
    }

    /**
     * Gets the value of the saleableAuxs property.
     * 
     * @return
     *     possible object is
     *     {@link SaleableAuxs }
     *     
     */
    public SaleableAuxs getSaleableAuxs() {
        return saleableAuxs;
    }

    /**
     * Sets the value of the saleableAuxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleableAuxs }
     *     
     */
    public void setSaleableAuxs(SaleableAuxs value) {
        this.saleableAuxs = value;
    }

}
