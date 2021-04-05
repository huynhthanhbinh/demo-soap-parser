
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSRSegmentMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSRSegmentMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSRInPNR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubSsrCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRSegmentMapping", propOrder = {
    "ssrInPNR",
    "subSsrCategory",
    "segmentID"
})
public class SSRSegmentMapping {

    @XmlElement(name = "SSRInPNR")
    protected List<String> ssrInPNR;
    @XmlElement(name = "SubSsrCategory")
    protected String subSsrCategory;
    @XmlElement(name = "SegmentID", type = Long.class)
    protected List<Long> segmentID;

    /**
     * Gets the value of the ssrInPNR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrInPNR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRInPNR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSSRInPNR() {
        if (ssrInPNR == null) {
            ssrInPNR = new ArrayList<String>();
        }
        return this.ssrInPNR;
    }

    /**
     * Gets the value of the subSsrCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSsrCategory() {
        return subSsrCategory;
    }

    /**
     * Sets the value of the subSsrCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSsrCategory(String value) {
        this.subSsrCategory = value;
    }

    /**
     * Gets the value of the segmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSegmentID() {
        if (segmentID == null) {
            segmentID = new ArrayList<Long>();
        }
        return this.segmentID;
    }

}
