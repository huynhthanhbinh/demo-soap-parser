
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Delay codes set for the flight.
 * 
 * <p>Java class for DelayCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelayCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DelayCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DelayTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DelayDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelayComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubDelayCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubDelayCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelayCodeType", propOrder = {
    "delayCode",
    "delayTime",
    "delayDescription",
    "delayComment",
    "subDelayCode",
    "subDelayCodeDescription"
})
public class DelayCodeType {

    @XmlElement(name = "DelayCode", required = true)
    protected String delayCode;
    @XmlElement(name = "DelayTime")
    protected Integer delayTime;
    @XmlElement(name = "DelayDescription")
    protected String delayDescription;
    @XmlElement(name = "DelayComment")
    protected String delayComment;
    @XmlElement(name = "SubDelayCode")
    protected String subDelayCode;
    @XmlElement(name = "SubDelayCodeDescription")
    protected String subDelayCodeDescription;

    /**
     * Gets the value of the delayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayCode() {
        return delayCode;
    }

    /**
     * Sets the value of the delayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayCode(String value) {
        this.delayCode = value;
    }

    /**
     * Gets the value of the delayTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    /**
     * Sets the value of the delayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelayTime(Integer value) {
        this.delayTime = value;
    }

    /**
     * Gets the value of the delayDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayDescription() {
        return delayDescription;
    }

    /**
     * Sets the value of the delayDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayDescription(String value) {
        this.delayDescription = value;
    }

    /**
     * Gets the value of the delayComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayComment() {
        return delayComment;
    }

    /**
     * Sets the value of the delayComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayComment(String value) {
        this.delayComment = value;
    }

    /**
     * Gets the value of the subDelayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDelayCode() {
        return subDelayCode;
    }

    /**
     * Sets the value of the subDelayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDelayCode(String value) {
        this.subDelayCode = value;
    }

    /**
     * Gets the value of the subDelayCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDelayCodeDescription() {
        return subDelayCodeDescription;
    }

    /**
     * Sets the value of the subDelayCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDelayCodeDescription(String value) {
        this.subDelayCodeDescription = value;
    }

}
