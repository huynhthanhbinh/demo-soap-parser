
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalAmountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalAmountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxAmountPriceBreakdown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxAmountPriceBreakdown" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalAmountDetailsType", propOrder = {
    "amount",
    "totalAmount",
    "currency",
    "paxAmountPriceBreakdown"
})
public class TotalAmountDetailsType {

    @XmlElement(name = "Amount")
    protected List<AmountDetailsType> amount;
    @XmlElement(name = "TotalAmount")
    protected Double totalAmount;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "PaxAmountPriceBreakdown")
    protected PaxAmountPriceBreakdown paxAmountPriceBreakdown;

    /**
     * Gets the value of the amount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountDetailsType }
     * 
     * 
     */
    public List<AmountDetailsType> getAmount() {
        if (amount == null) {
            amount = new ArrayList<AmountDetailsType>();
        }
        return this.amount;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paxAmountPriceBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link PaxAmountPriceBreakdown }
     *     
     */
    public PaxAmountPriceBreakdown getPaxAmountPriceBreakdown() {
        return paxAmountPriceBreakdown;
    }

    /**
     * Sets the value of the paxAmountPriceBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxAmountPriceBreakdown }
     *     
     */
    public void setPaxAmountPriceBreakdown(PaxAmountPriceBreakdown value) {
        this.paxAmountPriceBreakdown = value;
    }

}
