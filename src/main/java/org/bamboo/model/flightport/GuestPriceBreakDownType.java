
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Price break down details
 * 
 * <p>Java class for GuestPriceBreakDownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestPriceBreakDownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceBreakDown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PriceBreakDownType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxDetails_Type" minOccurs="0"/>
 *         &lt;element name="GuestSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestPriceBreakDownType", propOrder = {
    "priceBreakDown",
    "tax",
    "guestId",
    "guestType",
    "guestSubType"
})
public class GuestPriceBreakDownType {

    @XmlElement(name = "PriceBreakDown")
    protected List<PriceBreakDownType> priceBreakDown;
    @XmlElement(name = "Tax")
    protected List<TaxType> tax;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "GuestType")
    @XmlSchemaType(name = "string")
    protected PaxDetailsType guestType;
    @XmlElement(name = "GuestSubType")
    protected String guestSubType;

    /**
     * Gets the value of the priceBreakDown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceBreakDown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceBreakDown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceBreakDownType }
     * 
     * 
     */
    public List<PriceBreakDownType> getPriceBreakDown() {
        if (priceBreakDown == null) {
            priceBreakDown = new ArrayList<PriceBreakDownType>();
        }
        return this.priceBreakDown;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxType>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the guestType property.
     * 
     * @return
     *     possible object is
     *     {@link PaxDetailsType }
     *     
     */
    public PaxDetailsType getGuestType() {
        return guestType;
    }

    /**
     * Sets the value of the guestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxDetailsType }
     *     
     */
    public void setGuestType(PaxDetailsType value) {
        this.guestType = value;
    }

    /**
     * Gets the value of the guestSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestSubType() {
        return guestSubType;
    }

    /**
     * Sets the value of the guestSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestSubType(String value) {
        this.guestSubType = value;
    }

}
