
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerValueDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerValueDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpvValueForPax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tierLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fareClasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noOfSegs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerValueDetails", propOrder = {
    "cpvValueForPax",
    "tierLevelCode",
    "fareClasses",
    "noOfSegs"
})
public class CustomerValueDetails {

    protected Double cpvValueForPax;
    protected String tierLevelCode;
    protected List<String> fareClasses;
    protected Integer noOfSegs;

    /**
     * Gets the value of the cpvValueForPax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCpvValueForPax() {
        return cpvValueForPax;
    }

    /**
     * Sets the value of the cpvValueForPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCpvValueForPax(Double value) {
        this.cpvValueForPax = value;
    }

    /**
     * Gets the value of the tierLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierLevelCode() {
        return tierLevelCode;
    }

    /**
     * Sets the value of the tierLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierLevelCode(String value) {
        this.tierLevelCode = value;
    }

    /**
     * Gets the value of the fareClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFareClasses() {
        if (fareClasses == null) {
            fareClasses = new ArrayList<String>();
        }
        return this.fareClasses;
    }

    /**
     * Gets the value of the noOfSegs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfSegs() {
        return noOfSegs;
    }

    /**
     * Sets the value of the noOfSegs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfSegs(Integer value) {
        this.noOfSegs = value;
    }

}
