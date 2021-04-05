
package org.bamboo.model.flightport;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatAttributesPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatAttributesPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartRow" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="EndRow" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PositionIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocationIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAttributesPositionType", propOrder = {
    "attributeCode",
    "attributeName",
    "startRow",
    "endRow",
    "positionIndicator",
    "locationIndicator"
})
public class SeatAttributesPositionType {

    @XmlElement(name = "AttributeCode", required = true)
    protected String attributeCode;
    @XmlElement(name = "AttributeName", required = true)
    protected String attributeName;
    @XmlElement(name = "StartRow", required = true)
    protected BigInteger startRow;
    @XmlElement(name = "EndRow", required = true)
    protected BigInteger endRow;
    @XmlElement(name = "PositionIndicator", required = true)
    protected String positionIndicator;
    @XmlElement(name = "LocationIndicator", required = true)
    protected String locationIndicator;

    /**
     * Gets the value of the attributeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeCode() {
        return attributeCode;
    }

    /**
     * Sets the value of the attributeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeCode(String value) {
        this.attributeCode = value;
    }

    /**
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Gets the value of the startRow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartRow(BigInteger value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the endRow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndRow() {
        return endRow;
    }

    /**
     * Sets the value of the endRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndRow(BigInteger value) {
        this.endRow = value;
    }

    /**
     * Gets the value of the positionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionIndicator() {
        return positionIndicator;
    }

    /**
     * Sets the value of the positionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionIndicator(String value) {
        this.positionIndicator = value;
    }

    /**
     * Gets the value of the locationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationIndicator() {
        return locationIndicator;
    }

    /**
     * Sets the value of the locationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIndicator(String value) {
        this.locationIndicator = value;
    }

}
