
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CouponDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CouponDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isConjunction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketDetailsType", propOrder = {
    "ticketNumber",
    "couponDetails",
    "isConjunction"
})
public class TicketDetailsType {

    @XmlElement(name = "TicketNumber", required = true)
    protected String ticketNumber;
    @XmlElement(name = "CouponDetails")
    protected List<CouponDetailsType> couponDetails;
    protected boolean isConjunction;

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the couponDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponDetailsType }
     * 
     * 
     */
    public List<CouponDetailsType> getCouponDetails() {
        if (couponDetails == null) {
            couponDetails = new ArrayList<CouponDetailsType>();
        }
        return this.couponDetails;
    }

    /**
     * Gets the value of the isConjunction property.
     * 
     */
    public boolean isIsConjunction() {
        return isConjunction;
    }

    /**
     * Sets the value of the isConjunction property.
     * 
     */
    public void setIsConjunction(boolean value) {
        this.isConjunction = value;
    }

}
