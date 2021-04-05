
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AncillaryType" type="{http://www.ibsplc.com/iRes/simpleTypes/}Ancillary_Type" minOccurs="0"/>
 *         &lt;element name="AncillaryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryDetailsType", propOrder = {
    "ancillaryType",
    "ancillaryId"
})
public class AncillaryDetailsType {

    @XmlElement(name = "AncillaryType")
    @XmlSchemaType(name = "string")
    protected AncillaryType ancillaryType;
    @XmlElement(name = "AncillaryId")
    protected Long ancillaryId;

    /**
     * Gets the value of the ancillaryType property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryType }
     *     
     */
    public AncillaryType getAncillaryType() {
        return ancillaryType;
    }

    /**
     * Sets the value of the ancillaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryType }
     *     
     */
    public void setAncillaryType(AncillaryType value) {
        this.ancillaryType = value;
    }

    /**
     * Gets the value of the ancillaryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAncillaryId() {
        return ancillaryId;
    }

    /**
     * Sets the value of the ancillaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAncillaryId(Long value) {
        this.ancillaryId = value;
    }

}
