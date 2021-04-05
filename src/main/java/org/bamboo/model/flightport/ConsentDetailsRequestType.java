
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsentDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsentDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestConsentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestConsentDetailsRequestType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsentDetailsRequestType", propOrder = {
    "guestConsentDetails"
})
public class ConsentDetailsRequestType {

    @XmlElement(name = "GuestConsentDetails", required = true)
    protected List<GuestConsentDetailsRequestType> guestConsentDetails;

    /**
     * Gets the value of the guestConsentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestConsentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestConsentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestConsentDetailsRequestType }
     * 
     * 
     */
    public List<GuestConsentDetailsRequestType> getGuestConsentDetails() {
        if (guestConsentDetails == null) {
            guestConsentDetails = new ArrayList<GuestConsentDetailsRequestType>();
        }
        return this.guestConsentDetails;
    }

}
