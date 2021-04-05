
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsrFieldDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsrFieldDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SsrFieldName" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrFieldNameType" minOccurs="0"/>
 *         &lt;element name="SsrFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsrFieldDetails", propOrder = {
    "ssrFieldName",
    "ssrFieldValue"
})
public class SsrFieldDetails {

    @XmlElement(name = "SsrFieldName")
    protected String ssrFieldName;
    @XmlElement(name = "SsrFieldValue")
    protected String ssrFieldValue;

    /**
     * Gets the value of the ssrFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrFieldName() {
        return ssrFieldName;
    }

    /**
     * Sets the value of the ssrFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrFieldName(String value) {
        this.ssrFieldName = value;
    }

    /**
     * Gets the value of the ssrFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrFieldValue() {
        return ssrFieldValue;
    }

    /**
     * Sets the value of the ssrFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrFieldValue(String value) {
        this.ssrFieldValue = value;
    }

}
