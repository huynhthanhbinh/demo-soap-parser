
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxFeeMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxFeeMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaxType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType" minOccurs="0"/>
 *         &lt;element name="TotalFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeResponseDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeResponseDetails" maxOccurs="unbounded"/>
 *         &lt;element name="TaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxFeeMapping", propOrder = {
    "paxID",
    "paxType",
    "totalFeeAmount",
    "totalAmount",
    "currency",
    "feeCode",
    "applicationType",
    "creditCardType",
    "feeResponseDetails",
    "taxDetails"
})
public class PaxFeeMapping {

    @XmlElement(name = "PaxID")
    protected long paxID;
    @XmlElement(name = "PaxType")
    @XmlSchemaType(name = "string")
    protected GuestType paxType;
    @XmlElement(name = "TotalFeeAmount")
    protected double totalFeeAmount;
    @XmlElement(name = "TotalAmount")
    protected double totalAmount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "FeeCode", required = true)
    protected String feeCode;
    @XmlElement(name = "ApplicationType", required = true)
    protected String applicationType;
    @XmlElement(name = "CreditCardType")
    protected String creditCardType;
    @XmlElement(name = "FeeResponseDetails", required = true)
    protected List<FeeResponseDetails> feeResponseDetails;
    @XmlElement(name = "TaxDetails")
    protected TaxDetailType taxDetails;

    /**
     * Gets the value of the paxID property.
     * 
     */
    public long getPaxID() {
        return paxID;
    }

    /**
     * Sets the value of the paxID property.
     * 
     */
    public void setPaxID(long value) {
        this.paxID = value;
    }

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link GuestType }
     *     
     */
    public GuestType getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestType }
     *     
     */
    public void setPaxType(GuestType value) {
        this.paxType = value;
    }

    /**
     * Gets the value of the totalFeeAmount property.
     * 
     */
    public double getTotalFeeAmount() {
        return totalFeeAmount;
    }

    /**
     * Sets the value of the totalFeeAmount property.
     * 
     */
    public void setTotalFeeAmount(double value) {
        this.totalFeeAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(double value) {
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
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationType(String value) {
        this.applicationType = value;
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
     * Gets the value of the feeResponseDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeResponseDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeResponseDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeResponseDetails }
     * 
     * 
     */
    public List<FeeResponseDetails> getFeeResponseDetails() {
        if (feeResponseDetails == null) {
            feeResponseDetails = new ArrayList<FeeResponseDetails>();
        }
        return this.feeResponseDetails;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailType }
     *     
     */
    public TaxDetailType getTaxDetails() {
        return taxDetails;
    }

    /**
     * Sets the value of the taxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailType }
     *     
     */
    public void setTaxDetails(TaxDetailType value) {
        this.taxDetails = value;
    }

}
