
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsentDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsentDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestConsentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestConsentDetailsResponseType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsentDetailsResponseType", propOrder = {
    "guestConsentDetails"
})
public class ConsentDetailsResponseType {

    @XmlElement(name = "GuestConsentDetails", required = true)
    protected List<GuestConsentDetailsResponseType> guestConsentDetails;

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
     * {@link GuestConsentDetailsResponseType }
     * 
     * 
     */
    public List<GuestConsentDetailsResponseType> getGuestConsentDetails() {
        if (guestConsentDetails == null) {
            guestConsentDetails = new ArrayList<GuestConsentDetailsResponseType>();
        }
        return this.guestConsentDetails;
    }

}
