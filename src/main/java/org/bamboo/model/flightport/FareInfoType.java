
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * fare info details
 * 
 * <p>Java class for FareInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareOverrideDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareOverrideDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareDetailsForGuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareDetailsForGuestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInfoType", propOrder = {
    "fareOverrideDetails",
    "fareDetailsForGuestType"
})
public class FareInfoType {

    @XmlElement(name = "FareOverrideDetails")
    protected List<FareOverrideDetailsType> fareOverrideDetails;
    @XmlElement(name = "FareDetailsForGuestType")
    protected List<FareDetailsForGuestType> fareDetailsForGuestType;

    /**
     * Gets the value of the fareOverrideDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareOverrideDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareOverrideDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareOverrideDetailsType }
     * 
     * 
     */
    public List<FareOverrideDetailsType> getFareOverrideDetails() {
        if (fareOverrideDetails == null) {
            fareOverrideDetails = new ArrayList<FareOverrideDetailsType>();
        }
        return this.fareOverrideDetails;
    }

    /**
     * Gets the value of the fareDetailsForGuestType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetailsForGuestType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetailsForGuestType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailsForGuestType }
     * 
     * 
     */
    public List<FareDetailsForGuestType> getFareDetailsForGuestType() {
        if (fareDetailsForGuestType == null) {
            fareDetailsForGuestType = new ArrayList<FareDetailsForGuestType>();
        }
        return this.fareDetailsForGuestType;
    }

}
