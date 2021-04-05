
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxCountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxCountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaxSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxCountType", propOrder = {
    "paxType",
    "paxSubType",
    "paxCount"
})
public class PaxCountType {

    @XmlElement(name = "PaxType", required = true)
    protected String paxType;
    @XmlElement(name = "PaxSubType")
    protected String paxSubType;
    @XmlElement(name = "PaxCount")
    protected int paxCount;

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

    /**
     * Gets the value of the paxSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSubType() {
        return paxSubType;
    }

    /**
     * Sets the value of the paxSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxSubType(String value) {
        this.paxSubType = value;
    }

    /**
     * Gets the value of the paxCount property.
     * 
     */
    public int getPaxCount() {
        return paxCount;
    }

    /**
     * Sets the value of the paxCount property.
     * 
     */
    public void setPaxCount(int value) {
        this.paxCount = value;
    }

}
