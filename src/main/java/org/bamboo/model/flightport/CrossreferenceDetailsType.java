
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossreferenceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossreferenceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrossreferencedPNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Crossreferencetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossreferenceDetailsType", propOrder = {
    "crossreferencedPNR",
    "crossreferencetype"
})
public class CrossreferenceDetailsType {

    @XmlElement(name = "CrossreferencedPNR", required = true)
    protected String crossreferencedPNR;
    @XmlElement(name = "Crossreferencetype", required = true)
    protected String crossreferencetype;

    /**
     * Gets the value of the crossreferencedPNR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossreferencedPNR() {
        return crossreferencedPNR;
    }

    /**
     * Sets the value of the crossreferencedPNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossreferencedPNR(String value) {
        this.crossreferencedPNR = value;
    }

    /**
     * Gets the value of the crossreferencetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossreferencetype() {
        return crossreferencetype;
    }

    /**
     * Sets the value of the crossreferencetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossreferencetype(String value) {
        this.crossreferencetype = value;
    }

}
