
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyCategory" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyCategoryType"/>
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyDetailsType", propOrder = {
    "agencyCategory",
    "agencyCode",
    "agencyName"
})
public class AgencyDetailsType {

    @XmlElement(name = "AgencyCategory", required = true)
    @XmlSchemaType(name = "string")
    protected AgencyCategoryType agencyCategory;
    @XmlElement(name = "AgencyCode", required = true)
    protected String agencyCode;
    @XmlElement(name = "AgencyName", required = true)
    protected String agencyName;

    /**
     * Gets the value of the agencyCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCategoryType }
     *     
     */
    public AgencyCategoryType getAgencyCategory() {
        return agencyCategory;
    }

    /**
     * Sets the value of the agencyCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCategoryType }
     *     
     */
    public void setAgencyCategory(AgencyCategoryType value) {
        this.agencyCategory = value;
    }

    /**
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

}
