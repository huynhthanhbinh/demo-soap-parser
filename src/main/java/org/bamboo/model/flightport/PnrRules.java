
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * These are the rules defined for a PNR
 * 
 * <p>Java class for PnrRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PnrRules" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrRules", propOrder = {
    "pnrRules"
})
public class PnrRules {

    @XmlElement(name = "PnrRules", required = true)
    protected String pnrRules;

    /**
     * Gets the value of the pnrRules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrRules() {
        return pnrRules;
    }

    /**
     * Sets the value of the pnrRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrRules(String value) {
        this.pnrRules = value;
    }

}
