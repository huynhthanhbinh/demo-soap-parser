
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSRDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="travelDocDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nextOfKinDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InfantDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PnrActionType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrActionType"/>
 *         &lt;element name="GuestRequestDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestRequestDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxChangeType", propOrder = {
    "ssrDelIndicator",
    "travelDocDelIndicator",
    "nextOfKinDelIndicator",
    "infantDelIndicator",
    "pnrActionType",
    "guestRequestDetailsType"
})
public class PaxChangeType {

    @XmlElement(name = "SSRDelIndicator")
    protected boolean ssrDelIndicator;
    protected boolean travelDocDelIndicator;
    protected boolean nextOfKinDelIndicator;
    @XmlElement(name = "InfantDelIndicator")
    protected boolean infantDelIndicator;
    @XmlElement(name = "PnrActionType", required = true)
    @XmlSchemaType(name = "string")
    protected PnrActionType pnrActionType;
    @XmlElement(name = "GuestRequestDetailsType", required = true)
    protected GuestRequestDetailsType guestRequestDetailsType;

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

    /**
     * Gets the value of the pnrActionType property.
     * 
     * @return
     *     possible object is
     *     {@link PnrActionType }
     *     
     */
    public PnrActionType getPnrActionType() {
        return pnrActionType;
    }

    /**
     * Sets the value of the pnrActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnrActionType }
     *     
     */
    public void setPnrActionType(PnrActionType value) {
        this.pnrActionType = value;
    }

    /**
     * Gets the value of the guestRequestDetailsType property.
     * 
     * @return
     *     possible object is
     *     {@link GuestRequestDetailsType }
     *     
     */
    public GuestRequestDetailsType getGuestRequestDetailsType() {
        return guestRequestDetailsType;
    }

    /**
     * Sets the value of the guestRequestDetailsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRequestDetailsType }
     *     
     */
    public void setGuestRequestDetailsType(GuestRequestDetailsType value) {
        this.guestRequestDetailsType = value;
    }

}
