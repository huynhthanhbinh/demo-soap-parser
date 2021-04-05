
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds the Weight Allowance Information.
 * 
 * <p>Java class for WeightAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeightAllowanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumWeight" type="{http://www.ibsplc.com/iRes/simpleTypes/}MaximumAllowanceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightAllowanceType", propOrder = {
    "maximumWeight"
})
public class WeightAllowanceType {

    @XmlElement(name = "MaximumWeight", required = true)
    protected MaximumAllowanceType maximumWeight;

    /**
     * Gets the value of the maximumWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAllowanceType }
     *     
     */
    public MaximumAllowanceType getMaximumWeight() {
        return maximumWeight;
    }

    /**
     * Sets the value of the maximumWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAllowanceType }
     *     
     */
    public void setMaximumWeight(MaximumAllowanceType value) {
        this.maximumWeight = value;
    }

}
