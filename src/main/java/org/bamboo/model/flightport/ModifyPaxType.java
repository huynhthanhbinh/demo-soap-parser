
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyPaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyPaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSRDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="travelDocDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nextOfKinDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PnrGuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrGuestDetailsType"/>
 *         &lt;element name="InfantDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyPaxType", propOrder = {
    "ssrDelIndicator",
    "travelDocDelIndicator",
    "nextOfKinDelIndicator",
    "pnrGuestDetails",
    "infantDelIndicator"
})
public class ModifyPaxType {

    @XmlElement(name = "SSRDelIndicator")
    protected boolean ssrDelIndicator;
    protected boolean travelDocDelIndicator;
    protected boolean nextOfKinDelIndicator;
    @XmlElement(name = "PnrGuestDetails", required = true)
    protected PnrGuestDetailsType pnrGuestDetails;
    @XmlElement(name = "InfantDelIndicator")
    protected boolean infantDelIndicator;

    /**
     * Gets the value of the ssrDelIndicator property.
     * 
     */
    public boolean isSSRDelIndicator() {
        return ssrDelIndicator;
    }

    /**
     * Sets the value of the ssrDelIndicator property.
     * 
     */
    public void setSSRDelIndicator(boolean value) {
        this.ssrDelIndicator = value;
    }

    /**
     * Gets the value of the travelDocDelIndicator property.
     * 
     */
    public boolean isTravelDocDelIndicator() {
        return travelDocDelIndicator;
    }

    /**
     * Sets the value of the travelDocDelIndicator property.
     * 
     */
    public void setTravelDocDelIndicator(boolean value) {
        this.travelDocDelIndicator = value;
    }

    /**
     * Gets the value of the nextOfKinDelIndicator property.
     * 
     */
    public boolean isNextOfKinDelIndicator() {
        return nextOfKinDelIndicator;
    }

    /**
     * Sets the value of the nextOfKinDelIndicator property.
     * 
     */
    public void setNextOfKinDelIndicator(boolean value) {
        this.nextOfKinDelIndicator = value;
    }

    /**
     * Gets the value of the pnrGuestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PnrGuestDetailsType }
     *     
     */
    public PnrGuestDetailsType getPnrGuestDetails() {
        return pnrGuestDetails;
    }

    /**
     * Sets the value of the pnrGuestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnrGuestDetailsType }
     *     
     */
    public void setPnrGuestDetails(PnrGuestDetailsType value) {
        this.pnrGuestDetails = value;
    }

    /**
     * Gets the value of the infantDelIndicator property.
     * 
     */
    public boolean isInfantDelIndicator() {
        return infantDelIndicator;
    }

    /**
     * Sets the value of the infantDelIndicator property.
     * 
     */
    public void setInfantDelIndicator(boolean value) {
        this.infantDelIndicator = value;
    }

}
