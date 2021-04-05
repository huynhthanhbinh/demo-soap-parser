
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceInfoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceInfoDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuxFieldDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxFieldDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceInfoDetailsType", propOrder = {
    "auxFieldDetailsType"
})
public class InsuranceInfoDetailsType {

    @XmlElement(name = "AuxFieldDetailsType")
    protected List<AuxFieldDetailsType> auxFieldDetailsType;

    /**
     * Gets the value of the auxFieldDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxFieldDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxFieldDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxFieldDetailsType }
     * 
     * 
     */
    public List<AuxFieldDetailsType> getAuxFieldDetailsType() {
        if (auxFieldDetailsType == null) {
            auxFieldDetailsType = new ArrayList<AuxFieldDetailsType>();
        }
        return this.auxFieldDetailsType;
    }

}
