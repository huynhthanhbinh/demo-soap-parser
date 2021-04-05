
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare Basis Settings Details
 * 
 * <p>Java class for FareBasisSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareBasisSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareBasisSettingsParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fareBasisSettingsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareBasisSettingsType", propOrder = {
    "fareBasisSettingsParam",
    "fareBasisSettingsValue"
})
public class FareBasisSettingsType {

    @XmlElement(required = true)
    protected String fareBasisSettingsParam;
    protected String fareBasisSettingsValue;

    /**
     * Gets the value of the fareBasisSettingsParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisSettingsParam() {
        return fareBasisSettingsParam;
    }

    /**
     * Sets the value of the fareBasisSettingsParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisSettingsParam(String value) {
        this.fareBasisSettingsParam = value;
    }

    /**
     * Gets the value of the fareBasisSettingsValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisSettingsValue() {
        return fareBasisSettingsValue;
    }

    /**
     * Sets the value of the fareBasisSettingsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisSettingsValue(String value) {
        this.fareBasisSettingsValue = value;
    }

}
