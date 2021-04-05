
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuxInformationChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuxInformationChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ActionType"/>
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuxInformationChangeType", propOrder = {
    "actionType",
    "auxDetails"
})
public class AuxInformationChangeType {

    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType actionType;
    @XmlElement(name = "AuxDetails", required = true)
    protected AuxInformationType auxDetails;

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
     * Gets the value of the auxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AuxInformationType }
     *     
     */
    public AuxInformationType getAuxDetails() {
        return auxDetails;
    }

    /**
     * Sets the value of the auxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuxInformationType }
     *     
     */
    public void setAuxDetails(AuxInformationType value) {
        this.auxDetails = value;
    }

}
