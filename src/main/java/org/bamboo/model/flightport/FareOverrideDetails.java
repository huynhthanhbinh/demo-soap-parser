
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareOverrideDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareOverrideDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OverriddenFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OverrideReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareOverrideDetails", propOrder = {
    "guestId",
    "overriddenFare",
    "overrideReason",
    "currencyCode"
})
public class FareOverrideDetails {

    @XmlElement(name = "GuestId", type = Long.class)
    protected List<Long> guestId;
    @XmlElement(name = "OverriddenFare")
    protected double overriddenFare;
    @XmlElement(name = "OverrideReason", required = true)
    protected String overrideReason;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;

    /**
     * Gets the value of the guestId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getGuestId() {
        if (guestId == null) {
            guestId = new ArrayList<Long>();
        }
        return this.guestId;
    }

    /**
     * Gets the value of the overriddenFare property.
     * 
     */
    public double getOverriddenFare() {
        return overriddenFare;
    }

    /**
     * Sets the value of the overriddenFare property.
     * 
     */
    public void setOverriddenFare(double value) {
        this.overriddenFare = value;
    }

    /**
     * Gets the value of the overrideReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideReason() {
        return overrideReason;
    }

    /**
     * Sets the value of the overrideReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideReason(String value) {
        this.overrideReason = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

}
