
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubModuleAccessDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubModuleAccessDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubModuleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PermissionDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubModuleAccessDetailsType", propOrder = {
    "subModuleName",
    "permissionDetails"
})
public class SubModuleAccessDetailsType {

    @XmlElement(name = "SubModuleName", required = true)
    protected String subModuleName;
    @XmlElement(name = "PermissionDetails", required = true)
    protected String permissionDetails;

    /**
     * Gets the value of the subModuleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubModuleName() {
        return subModuleName;
    }

    /**
     * Sets the value of the subModuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubModuleName(String value) {
        this.subModuleName = value;
    }

    /**
     * Gets the value of the permissionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionDetails() {
        return permissionDetails;
    }

    /**
     * Sets the value of the permissionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionDetails(String value) {
        this.permissionDetails = value;
    }

}
