
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsrFieldsMetaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsrFieldsMetaDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SsrField" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MetaDataKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsrFieldsMetaDataType", propOrder = {
    "ssrField"
})
public class SsrFieldsMetaDataType {

    @XmlElement(name = "SsrField")
    protected List<SsrFieldType> ssrField;
    @XmlAttribute(name = "MetaDataKey")
    protected String metaDataKey;

    /**
     * Gets the value of the ssrField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrFieldType }
     * 
     * 
     */
    public List<SsrFieldType> getSsrField() {
        if (ssrField == null) {
            ssrField = new ArrayList<SsrFieldType>();
        }
        return this.ssrField;
    }

    /**
     * Gets the value of the metaDataKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataKey() {
        return metaDataKey;
    }

    /**
     * Sets the value of the metaDataKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataKey(String value) {
        this.metaDataKey = value;
    }

}
