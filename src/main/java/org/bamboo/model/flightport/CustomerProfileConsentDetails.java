
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProfileConsentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileConsentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.ibsplc.com/iRes/simpleTypes/}ConsentCategory"/>
 *         &lt;element name="isConsentActivation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileConsentDetails", propOrder = {
    "category",
    "isConsentActivation",
    "remark",
    "status"
})
public class CustomerProfileConsentDetails {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConsentCategory category;
    protected boolean isConsentActivation;
    protected String remark;
    protected String status;

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
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
