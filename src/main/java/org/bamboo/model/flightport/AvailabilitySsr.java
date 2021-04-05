
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailabilitySsr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilitySsr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SSRRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilitySsr", propOrder = {
    "ssrCode",
    "ssrRequest",
    "cabinClass"
})
public class AvailabilitySsr {

    @XmlElement(name = "SSRCode", required = true)
    protected String ssrCode;
    @XmlElement(name = "SSRRequest")
    protected int ssrRequest;
    @XmlElement(required = true)
    protected String cabinClass;

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the ssrRequest property.
     * 
     */
    public int getSSRRequest() {
        return ssrRequest;
    }

    /**
     * Sets the value of the ssrRequest property.
     * 
     */
    public void setSSRRequest(int value) {
        this.ssrRequest = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

}
