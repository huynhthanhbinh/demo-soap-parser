
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotofiableAuxsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotofiableAuxsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ancillary" type="{http://www.ibsplc.com/iRes/simpleTypes/}Ancillary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotofiableAuxsType", propOrder = {
    "ancillary"
})
public class NotofiableAuxsType {

    @XmlElement(name = "Ancillary")
    protected List<Ancillary> ancillary;

    /**
     * Gets the value of the ancillary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ancillary }
     * 
     * 
     */
    public List<Ancillary> getAncillary() {
        if (ancillary == null) {
            ancillary = new ArrayList<Ancillary>();
        }
        return this.ancillary;
    }

}
