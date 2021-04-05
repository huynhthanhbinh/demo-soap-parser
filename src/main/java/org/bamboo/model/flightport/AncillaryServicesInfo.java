
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds details of Bundled saleable SSRs
 * 
 * <p>Java class for AncillaryServicesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryServicesInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AncillaryServices" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillaryServices" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryServicesInfo", propOrder = {
    "ancillaryServices"
})
public class AncillaryServicesInfo {

    @XmlElement(name = "AncillaryServices")
    protected List<AncillaryServices> ancillaryServices;

    /**
     * Gets the value of the ancillaryServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryServices }
     * 
     * 
     */
    public List<AncillaryServices> getAncillaryServices() {
        if (ancillaryServices == null) {
            ancillaryServices = new ArrayList<AncillaryServices>();
        }
        return this.ancillaryServices;
    }

}
