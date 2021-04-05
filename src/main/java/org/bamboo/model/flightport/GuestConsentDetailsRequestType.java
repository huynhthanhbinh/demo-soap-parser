
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestConsentDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestConsentDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Consents" type="{http://www.ibsplc.com/iRes/simpleTypes/}ConsentsRequestType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestConsentDetailsRequestType", propOrder = {
    "guestId",
    "consents"
})
public class GuestConsentDetailsRequestType {

    @XmlElement(name = "GuestId", required = true)
    protected String guestId;
    @XmlElement(name = "Consents", required = true)
    protected List<ConsentsRequestType> consents;

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestId(String value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the consents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsentsRequestType }
     * 
     * 
     */
    public List<ConsentsRequestType> getConsents() {
        if (consents == null) {
            consents = new ArrayList<ConsentsRequestType>();
        }
        return this.consents;
    }

}
