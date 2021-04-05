
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalRedeemableAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/>
 *         &lt;element name="PayableEntityBreakdown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PayableEntityBreakdownType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="guestId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAmount", propOrder = {
    "totalRedeemableAmount",
    "payableEntityBreakdown"
})
public class GuestAmount {

    @XmlElement(name = "TotalRedeemableAmount")
    protected AmountType totalRedeemableAmount;
    @XmlElement(name = "PayableEntityBreakdown")
    protected PayableEntityBreakdownType payableEntityBreakdown;
    @XmlAttribute(name = "guestId")
    protected Long guestId;
    @XmlAttribute(name = "amount")
    protected Double amount;

    /**
     * Gets the value of the totalRedeemableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalRedeemableAmount() {
        return totalRedeemableAmount;
    }

    /**
     * Sets the value of the totalRedeemableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalRedeemableAmount(AmountType value) {
        this.totalRedeemableAmount = value;
    }

    /**
     * Gets the value of the payableEntityBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link PayableEntityBreakdownType }
     *     
     */
    public PayableEntityBreakdownType getPayableEntityBreakdown() {
        return payableEntityBreakdown;
    }

    /**
     * Sets the value of the payableEntityBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableEntityBreakdownType }
     *     
     */
    public void setPayableEntityBreakdown(PayableEntityBreakdownType value) {
        this.payableEntityBreakdown = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

}
