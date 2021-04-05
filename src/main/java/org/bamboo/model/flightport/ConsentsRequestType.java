
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsentsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsentsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{http://www.ibsplc.com/iRes/simpleTypes/}ConsentCategory"/>
 *         &lt;element name="isConsentActivation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsentsRequestType", propOrder = {
    "category",
    "isConsentActivation",
    "remarks"
})
public class ConsentsRequestType {

    @XmlElement(name = "Category", required = true)
    @XmlSchemaType(name = "string")
    protected ConsentCategory category;
    protected boolean isConsentActivation;
    protected String remarks;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentCategory }
     *     
     */
    public ConsentCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentCategory }
     *     
     */
    public void setCategory(ConsentCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the isConsentActivation property.
     * 
     */
    public boolean isIsConsentActivation() {
        return isConsentActivation;
    }

    /**
     * Sets the value of the isConsentActivation property.
     * 
     */
    public void setIsConsentActivation(boolean value) {
        this.isConsentActivation = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
