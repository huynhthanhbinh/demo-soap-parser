
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildBaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InfantBaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetails", propOrder = {
    "baseFare",
    "fareLevel",
    "fareBasisCode",
    "currency",
    "childBaseFare",
    "infantBaseFare"
})
public class FareDetails {

    @XmlElement(name = "BaseFare")
    protected double baseFare;
    @XmlElement(name = "FareLevel")
    protected String fareLevel;
    @XmlElement(name = "FareBasisCode")
    protected String fareBasisCode;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "ChildBaseFare")
    protected double childBaseFare;
    @XmlElement(name = "InfantBaseFare")
    protected double infantBaseFare;

    /**
     * Gets the value of the baseFare property.
     * 
     */
    public double getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     */
    public void setBaseFare(double value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the fareLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevel() {
        return fareLevel;
    }

    /**
     * Sets the value of the fareLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevel(String value) {
        this.fareLevel = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the childBaseFare property.
     * 
     */
    public double getChildBaseFare() {
        return childBaseFare;
    }

    /**
     * Sets the value of the childBaseFare property.
     * 
     */
    public void setChildBaseFare(double value) {
        this.childBaseFare = value;
    }

    /**
     * Gets the value of the infantBaseFare property.
     * 
     */
    public double getInfantBaseFare() {
        return infantBaseFare;
    }

    /**
     * Sets the value of the infantBaseFare property.
     * 
     */
    public void setInfantBaseFare(double value) {
        this.infantBaseFare = value;
    }

}
