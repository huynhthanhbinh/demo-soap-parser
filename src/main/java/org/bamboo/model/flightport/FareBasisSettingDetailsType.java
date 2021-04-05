
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare Basis Settings Details
 * 
 * <p>Java class for FareBasisSettingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareBasisSettingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="farebasiscode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareBasisSettingsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareBasisSettingsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareBasisSettingDetailsType", propOrder = {
    "farebasiscode",
    "fareBasisSettingsType"
})
public class FareBasisSettingDetailsType {

    @XmlElement(required = true)
    protected String farebasiscode;
    @XmlElement(name = "FareBasisSettingsType")
    protected List<FareBasisSettingsType> fareBasisSettingsType;

    /**
     * Gets the value of the farebasiscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarebasiscode() {
        return farebasiscode;
    }

    /**
     * Sets the value of the farebasiscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarebasiscode(String value) {
        this.farebasiscode = value;
    }

    /**
     * Gets the value of the fareBasisSettingsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareBasisSettingsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareBasisSettingsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareBasisSettingsType }
     * 
     * 
     */
    public List<FareBasisSettingsType> getFareBasisSettingsType() {
        if (fareBasisSettingsType == null) {
            fareBasisSettingsType = new ArrayList<FareBasisSettingsType>();
        }
        return this.fareBasisSettingsType;
    }

}
