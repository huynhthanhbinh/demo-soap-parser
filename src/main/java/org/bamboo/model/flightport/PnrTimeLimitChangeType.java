
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnrTimeLimitChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrTimeLimitChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PnrActionType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrActionType"/>
 *         &lt;element name="TimeLimitDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRTimeLimitDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrTimeLimitChangeType", propOrder = {
    "pnrActionType",
    "timeLimitDetails"
})
public class PnrTimeLimitChangeType {

    @XmlElement(name = "PnrActionType", required = true)
    @XmlSchemaType(name = "string")
    protected PnrActionType pnrActionType;
    @XmlElement(name = "TimeLimitDetails")
    protected PNRTimeLimitDetailsType timeLimitDetails;

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
     * Gets the value of the timeLimitDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PNRTimeLimitDetailsType }
     *     
     */
    public PNRTimeLimitDetailsType getTimeLimitDetails() {
        return timeLimitDetails;
    }

    /**
     * Sets the value of the timeLimitDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRTimeLimitDetailsType }
     *     
     */
    public void setTimeLimitDetails(PNRTimeLimitDetailsType value) {
        this.timeLimitDetails = value;
    }

}
