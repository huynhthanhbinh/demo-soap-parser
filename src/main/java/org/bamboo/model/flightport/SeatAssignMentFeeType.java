
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatAssignMentFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatAssignMentFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssrcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paxtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAssignMentFeeType", propOrder = {
    "amount",
    "currency",
    "ssrcode",
    "feecode",
    "paxtype"
})
public class SeatAssignMentFeeType {

    @XmlElement(name = "Amount")
    protected Double amount;
    protected String currency;
    protected String ssrcode;
    protected String feecode;
    protected String paxtype;

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
     * Gets the value of the ssrcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrcode() {
        return ssrcode;
    }

    /**
     * Sets the value of the ssrcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrcode(String value) {
        this.ssrcode = value;
    }

    /**
     * Gets the value of the feecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeecode() {
        return feecode;
    }

    /**
     * Sets the value of the feecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeecode(String value) {
        this.feecode = value;
    }

    /**
     * Gets the value of the paxtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxtype() {
        return paxtype;
    }

    /**
     * Sets the value of the paxtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxtype(String value) {
        this.paxtype = value;
    }

}
