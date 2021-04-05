
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AncillaryServiceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillaryServiceDetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AncillaryServicesIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryServices", propOrder = {
    "ancillaryServiceDetails"
})
public class AncillaryServices {

    @XmlElement(name = "AncillaryServiceDetails", required = true)
    protected List<AncillaryServiceDetails> ancillaryServiceDetails;
    @XmlAttribute(name = "AncillaryServicesIndex", required = true)
    protected long ancillaryServicesIndex;

    /**
     * Gets the value of the ancillaryServiceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryServiceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryServiceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryServiceDetails }
     * 
     * 
     */
    public List<AncillaryServiceDetails> getAncillaryServiceDetails() {
        if (ancillaryServiceDetails == null) {
            ancillaryServiceDetails = new ArrayList<AncillaryServiceDetails>();
        }
        return this.ancillaryServiceDetails;
    }

    /**
     * Gets the value of the ancillaryServicesIndex property.
     * 
     */
    public long getAncillaryServicesIndex() {
        return ancillaryServicesIndex;
    }

    /**
     * Sets the value of the ancillaryServicesIndex property.
     * 
     */
    public void setAncillaryServicesIndex(long value) {
        this.ancillaryServicesIndex = value;
    }

}
