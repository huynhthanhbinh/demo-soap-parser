
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinChangeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CabinChangeDetails" maxOccurs="unbounded"/>
 *         &lt;element name="canContinueWithoutSsrs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinChangeType", propOrder = {
    "cabinChangeDetails",
    "canContinueWithoutSsrs"
})
public class CabinChangeType {

    @XmlElement(name = "CabinChangeDetails", required = true)
    protected List<CabinChangeDetails> cabinChangeDetails;
    protected boolean canContinueWithoutSsrs;

    /**
     * Gets the value of the cabinChangeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinChangeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinChangeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinChangeDetails }
     * 
     * 
     */
    public List<CabinChangeDetails> getCabinChangeDetails() {
        if (cabinChangeDetails == null) {
            cabinChangeDetails = new ArrayList<CabinChangeDetails>();
        }
        return this.cabinChangeDetails;
    }

    /**
     * Gets the value of the canContinueWithoutSsrs property.
     * 
     */
    public boolean isCanContinueWithoutSsrs() {
        return canContinueWithoutSsrs;
    }

    /**
     * Sets the value of the canContinueWithoutSsrs property.
     * 
     */
    public void setCanContinueWithoutSsrs(boolean value) {
        this.canContinueWithoutSsrs = value;
    }

}
