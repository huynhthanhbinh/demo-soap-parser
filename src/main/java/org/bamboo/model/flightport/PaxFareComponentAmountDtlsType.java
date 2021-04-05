
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxFareComponentAmountDtlsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxFareComponentAmountDtlsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareComponentTaxDetailsTypes" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareComponentTaxDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareComponentSurchargeDetailsTypes" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareComponentSurchargeDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxFareComponentAmountDtlsType", propOrder = {
    "paxType",
    "baseFare",
    "discount",
    "currency",
    "fareComponentTaxDetailsTypes",
    "fareComponentSurchargeDetailsTypes"
})
public class PaxFareComponentAmountDtlsType {

    @XmlElement(name = "PaxType", required = true)
    protected String paxType;
    @XmlElement(name = "BaseFare")
    protected double baseFare;
    @XmlElement(name = "Discount")
    protected double discount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "FareComponentTaxDetailsTypes")
    protected List<FareComponentTaxDetailsType> fareComponentTaxDetailsTypes;
    @XmlElement(name = "FareComponentSurchargeDetailsTypes")
    protected List<FareComponentSurchargeDetailsType> fareComponentSurchargeDetailsTypes;

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     */
    public double getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     */
    public void setBaseFare(double value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     */
    public void setDiscount(double value) {
        this.discount = value;
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
     * Gets the value of the fareComponentTaxDetailsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponentTaxDetailsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponentTaxDetailsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentTaxDetailsType }
     * 
     * 
     */
    public List<FareComponentTaxDetailsType> getFareComponentTaxDetailsTypes() {
        if (fareComponentTaxDetailsTypes == null) {
            fareComponentTaxDetailsTypes = new ArrayList<FareComponentTaxDetailsType>();
        }
        return this.fareComponentTaxDetailsTypes;
    }

    /**
     * Gets the value of the fareComponentSurchargeDetailsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponentSurchargeDetailsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponentSurchargeDetailsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentSurchargeDetailsType }
     * 
     * 
     */
    public List<FareComponentSurchargeDetailsType> getFareComponentSurchargeDetailsTypes() {
        if (fareComponentSurchargeDetailsTypes == null) {
            fareComponentSurchargeDetailsTypes = new ArrayList<FareComponentSurchargeDetailsType>();
        }
        return this.fareComponentSurchargeDetailsTypes;
    }

}
