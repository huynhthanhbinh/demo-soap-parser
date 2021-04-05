
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds the Media Information such as media link and Content type.
 * 
 * <p>Java class for MediaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.ibsplc.com/iRes/simpleTypes/}MediaContentType"/>
 *         &lt;element name="Link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaType", propOrder = {
    "type",
    "link"
})
public class MediaType {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected MediaContentType type;
    @XmlElement(name = "Link", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String link;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MediaContentType }
     *     
     */
    public MediaContentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaContentType }
     *     
     */
    public void setType(MediaContentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

}
