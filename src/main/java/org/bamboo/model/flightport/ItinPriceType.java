
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * fare info details
 * 
 * <p>Java class for ItinPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestPriceBreakDown" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestPriceBreakDownType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OfferTimeLimit" type="{http://www.ibsplc.com/iRes/simpleTypes/}OfferTimeLimitType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinPriceType", propOrder = {
    "guestPriceBreakDown",
    "offerTimeLimit"
})
public class ItinPriceType {

    @XmlElement(name = "GuestPriceBreakDown")
    protected List<GuestPriceBreakDownType> guestPriceBreakDown;
    @XmlElement(name = "OfferTimeLimit")
    protected List<OfferTimeLimitType> offerTimeLimit;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the guestPriceBreakDown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestPriceBreakDown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestPriceBreakDown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestPriceBreakDownType }
     * 
     * 
     */
    public List<GuestPriceBreakDownType> getGuestPriceBreakDown() {
        if (guestPriceBreakDown == null) {
            guestPriceBreakDown = new ArrayList<GuestPriceBreakDownType>();
        }
        return this.guestPriceBreakDown;
    }

    /**
     * Gets the value of the offerTimeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerTimeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferTimeLimitType }
     * 
     * 
     */
    public List<OfferTimeLimitType> getOfferTimeLimit() {
        if (offerTimeLimit == null) {
            offerTimeLimit = new ArrayList<OfferTimeLimitType>();
        }
        return this.offerTimeLimit;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}
