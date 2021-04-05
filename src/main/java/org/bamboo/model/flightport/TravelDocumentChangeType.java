
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelDocumentChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelDocumentChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PnrActionType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrActionType"/>
 *         &lt;element name="TravelDocumentsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocumentsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDocumentChangeType", propOrder = {
    "pnrActionType",
    "travelDocumentsType"
})
public class TravelDocumentChangeType {

    @XmlElement(name = "PnrActionType", required = true)
    @XmlSchemaType(name = "string")
    protected PnrActionType pnrActionType;
    @XmlElement(name = "TravelDocumentsType")
    protected TravelDocumentsType travelDocumentsType;

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
     * Gets the value of the travelDocumentsType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelDocumentsType }
     *     
     */
    public TravelDocumentsType getTravelDocumentsType() {
        return travelDocumentsType;
    }

    /**
     * Sets the value of the travelDocumentsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDocumentsType }
     *     
     */
    public void setTravelDocumentsType(TravelDocumentsType value) {
        this.travelDocumentsType = value;
    }

}
