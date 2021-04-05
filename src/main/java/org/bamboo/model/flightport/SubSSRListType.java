
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubSSRListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubSSRListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubSSR" type="{http://www.ibsplc.com/iRes/simpleTypes/}SubSSRType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubSSRListType", propOrder = {
    "subSSR"
})
public class SubSSRListType {

    @XmlElement(name = "SubSSR")
    protected List<SubSSRType> subSSR;

    /**
     * Gets the value of the subSSR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSSR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubSSRType }
     * 
     * 
     */
    public List<SubSSRType> getSubSSR() {
        if (subSSR == null) {
            subSSR = new ArrayList<SubSSRType>();
        }
        return this.subSSR;
    }

}
