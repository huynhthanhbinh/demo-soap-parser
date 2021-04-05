
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OandDChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OandDChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ActionType"/>
 *         &lt;element name="OandDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OandDChangeType", propOrder = {
    "actionType",
    "oandDDetails"
})
public class OandDChangeType {

    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType actionType;
    @XmlElement(name = "OandDDetails", required = true)
    protected OandDDetails oandDDetails;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setActionType(ActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the oandDDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OandDDetails }
     *     
     */
    public OandDDetails getOandDDetails() {
        return oandDDetails;
    }

    /**
     * Sets the value of the oandDDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OandDDetails }
     *     
     */
    public void setOandDDetails(OandDDetails value) {
        this.oandDDetails = value;
    }

}
