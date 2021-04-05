
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CCFeeRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCFeeRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ServiceInitiator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDateLTC" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/>
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaxSegmentMapping" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxSegmentMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCFeeRequestDetails", propOrder = {
    "amount",
    "serviceInitiator",
    "paymentCurrency",
    "serviceCurrency",
    "paymentDateLTC",
    "creditCardType",
    "feeCode",
    "additionDate",
    "paxSegmentMapping"
})
public class CCFeeRequestDetails {

    @XmlElement(name = "Amount")
    protected Double amount;
    @XmlElement(name = "ServiceInitiator", required = true)
    protected String serviceInitiator;
    @XmlElement(name = "PaymentCurrency", required = true)
    protected String paymentCurrency;
    @XmlElement(name = "ServiceCurrency")
    protected String serviceCurrency;
    @XmlElement(name = "PaymentDateLTC", required = true)
    protected DateOnlyType paymentDateLTC;
    @XmlElement(name = "CreditCardType", required = true)
    protected String creditCardType;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "AdditionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar additionDate;
    @XmlElement(name = "PaxSegmentMapping")
    protected List<PaxSegmentMapping> paxSegmentMapping;

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
     * Gets the value of the serviceInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInitiator() {
        return serviceInitiator;
    }

    /**
     * Sets the value of the serviceInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInitiator(String value) {
        this.serviceInitiator = value;
    }

    /**
     * Gets the value of the paymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * Sets the value of the paymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCurrency(String value) {
        this.paymentCurrency = value;
    }

    /**
     * Gets the value of the serviceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCurrency() {
        return serviceCurrency;
    }

    /**
     * Sets the value of the serviceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCurrency(String value) {
        this.serviceCurrency = value;
    }

    /**
     * Gets the value of the paymentDateLTC property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getPaymentDateLTC() {
        return paymentDateLTC;
    }

    /**
     * Sets the value of the paymentDateLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setPaymentDateLTC(DateOnlyType value) {
        this.paymentDateLTC = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the feeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the additionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdditionDate() {
        return additionDate;
    }

    /**
     * Sets the value of the additionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdditionDate(XMLGregorianCalendar value) {
        this.additionDate = value;
    }

    /**
     * Gets the value of the paxSegmentMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegmentMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSegmentMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSegmentMapping }
     * 
     * 
     */
    public List<PaxSegmentMapping> getPaxSegmentMapping() {
        if (paxSegmentMapping == null) {
            paxSegmentMapping = new ArrayList<PaxSegmentMapping>();
        }
        return this.paxSegmentMapping;
    }

}
