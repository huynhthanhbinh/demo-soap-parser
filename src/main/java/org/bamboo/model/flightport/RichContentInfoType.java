
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds the Rich Content Informations and values
 * 
 * <p>Java class for RichContentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RichContentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContentDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Media" type="{http://www.ibsplc.com/iRes/simpleTypes/}MediaType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RichContentKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RichContentInfoType", propOrder = {
    "contentName",
    "contentDescription",
    "media"
})
public class RichContentInfoType {

    @XmlElement(name = "ContentName", required = true)
    protected String contentName;
    @XmlElement(name = "ContentDescription", required = true)
    protected String contentDescription;
    @XmlElement(name = "Media", required = true)
    protected List<MediaType> media;
    @XmlAttribute(name = "RichContentKey")
    protected String richContentKey;

    /**
     * Gets the value of the contentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentName() {
        return contentName;
    }

    /**
     * Sets the value of the contentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentName(String value) {
        this.contentName = value;
    }

    /**
     * Gets the value of the contentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDescription() {
        return contentDescription;
    }

    /**
     * Sets the value of the contentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDescription(String value) {
        this.contentDescription = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaType }
     * 
     * 
     */
    public List<MediaType> getMedia() {
        if (media == null) {
            media = new ArrayList<MediaType>();
        }
        return this.media;
    }

    /**
     * Gets the value of the richContentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichContentKey() {
        return richContentKey;
    }

    /**
     * Sets the value of the richContentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichContentKey(String value) {
        this.richContentKey = value;
    }

}
