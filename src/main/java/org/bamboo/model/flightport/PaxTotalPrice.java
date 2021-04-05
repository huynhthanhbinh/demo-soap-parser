
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxTotalPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxTotalPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FarePrice" type="{http://www.ibsplc.com/iRes/simpleTypes/}FarePrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeePrice" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeePrice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="paxid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxTotalPrice", propOrder = {
    "farePrice",
    "feePrice"
})
public class PaxTotalPrice {

    @XmlElement(name = "FarePrice")
    protected List<FarePrice> farePrice;
    @XmlElement(name = "FeePrice")
    protected List<FeePrice> feePrice;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "amount")
    protected Double amount;
    @XmlAttribute(name = "paxid")
    protected Long paxid;

    /**
     * Gets the value of the farePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePrice }
     * 
     * 
     */
    public List<FarePrice> getFarePrice() {
        if (farePrice == null) {
            farePrice = new ArrayList<FarePrice>();
        }
        return this.farePrice;
    }

    /**
     * Gets the value of the feePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeePrice }
     * 
     * 
     */
    public List<FeePrice> getFeePrice() {
        if (feePrice == null) {
            feePrice = new ArrayList<FeePrice>();
        }
        return this.feePrice;
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
     * Gets the value of the paxid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaxid() {
        return paxid;
    }

    /**
     * Sets the value of the paxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaxid(Long value) {
        this.paxid = value;
    }

}
