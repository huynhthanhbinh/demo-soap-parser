
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinChangeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinChangeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldCabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewCabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsStandbyUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanContinueUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinChangeDetails", propOrder = {
    "segmentId",
    "oldCabinClass",
    "newCabinClass",
    "isStandbyUpgrade",
    "canContinueUpgrade"
})
public class CabinChangeDetails {

    @XmlElement(name = "SegmentId")
    protected String segmentId;
    @XmlElement(name = "OldCabinClass", required = true)
    protected String oldCabinClass;
    @XmlElement(name = "NewCabinClass", required = true)
    protected String newCabinClass;
    @XmlElement(name = "IsStandbyUpgrade")
    protected Boolean isStandbyUpgrade;
    @XmlElement(name = "CanContinueUpgrade")
    protected Boolean canContinueUpgrade;

    /**
     * Gets the value of the segmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the oldCabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCabinClass() {
        return oldCabinClass;
    }

    /**
     * Sets the value of the oldCabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCabinClass(String value) {
        this.oldCabinClass = value;
    }

    /**
     * Gets the value of the newCabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCabinClass() {
        return newCabinClass;
    }

    /**
     * Sets the value of the newCabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCabinClass(String value) {
        this.newCabinClass = value;
    }

    /**
     * Gets the value of the isStandbyUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStandbyUpgrade() {
        return isStandbyUpgrade;
    }

    /**
     * Sets the value of the isStandbyUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStandbyUpgrade(Boolean value) {
        this.isStandbyUpgrade = value;
    }

    /**
     * Gets the value of the canContinueUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanContinueUpgrade() {
        return canContinueUpgrade;
    }

    /**
     * Sets the value of the canContinueUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanContinueUpgrade(Boolean value) {
        this.canContinueUpgrade = value;
    }

}
