
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This contains the DEI code and the corresponding value.
 * 
 * <p>Java class for DataElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeiCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeiDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeiValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanDisplayDei" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataElementType", propOrder = {
    "deiCode",
    "deiDesc",
    "deiValue",
    "canDisplayDei"
})
public class DataElementType {

    @XmlElement(name = "DeiCode", required = true)
    protected String deiCode;
    @XmlElement(name = "DeiDesc")
    protected String deiDesc;
    @XmlElement(name = "DeiValue")
    protected String deiValue;
    @XmlElement(name = "CanDisplayDei")
    protected Boolean canDisplayDei;

    /**
     * Gets the value of the deiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeiCode() {
        return deiCode;
    }

    /**
     * Sets the value of the deiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeiCode(String value) {
        this.deiCode = value;
    }

    /**
     * Gets the value of the deiDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeiDesc() {
        return deiDesc;
    }

    /**
     * Sets the value of the deiDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeiDesc(String value) {
        this.deiDesc = value;
    }

    /**
     * Gets the value of the deiValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeiValue() {
        return deiValue;
    }

    /**
     * Sets the value of the deiValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeiValue(String value) {
        this.deiValue = value;
    }

    /**
     * Gets the value of the canDisplayDei property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDisplayDei() {
        return canDisplayDei;
    }

    /**
     * Sets the value of the canDisplayDei property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDisplayDei(Boolean value) {
        this.canDisplayDei = value;
    }

}
