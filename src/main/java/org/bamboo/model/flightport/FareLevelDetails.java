
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareLevelDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareLevelDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareLevelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareLevelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareLevelDetails", propOrder = {
    "fareLevelCode",
    "fareLevelName",
    "description"
})
public class FareLevelDetails {

    @XmlElement(name = "FareLevelCode", required = true)
    protected String fareLevelCode;
    @XmlElement(name = "FareLevelName", required = true)
    protected String fareLevelName;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the fareLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevelCode() {
        return fareLevelCode;
    }

    /**
     * Sets the value of the fareLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevelCode(String value) {
        this.fareLevelCode = value;
    }

    /**
     * Gets the value of the fareLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevelName() {
        return fareLevelName;
    }

    /**
     * Sets the value of the fareLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevelName(String value) {
        this.fareLevelName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
