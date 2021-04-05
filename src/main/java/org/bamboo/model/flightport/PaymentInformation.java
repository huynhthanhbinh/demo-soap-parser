
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formOfPaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ParentFOPType"/>
 *         &lt;element name="paymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="paymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="owedCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="owedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="feeTaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeTax" minOccurs="0"/>
 *         &lt;element name="chequeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ChequeDetails" minOccurs="0"/>
 *         &lt;element name="debitCardDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DebitCardDetails" minOccurs="0"/>
 *         &lt;element name="electronicFundDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ElectronicFundDetails"/>
 *         &lt;element name="writeOffDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}WriteOffDetails"/>
 *         &lt;element name="creditCardDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PymCreditCardDetails"/>
 *         &lt;element name="creditFileDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CreditFileDetails"/>
 *         &lt;element name="agPaymentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AGPaymentDetails" minOccurs="0"/>
 *         &lt;element name="paPaymentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PAPaymentDetails" minOccurs="0"/>
 *         &lt;element name="authenticationTxnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSecurityDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ThreeDSecurityDtls" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformation", propOrder = {
    "formOfPaymentType",
    "parentType",
    "paymentAmount",
    "paymentCurrency",
    "exchangeRate",
    "owedCurrency",
    "owedAmount",
    "feeTaxDetails",
    "chequeDetails",
    "debitCardDetails",
    "electronicFundDetails",
    "writeOffDetails",
    "creditCardDetails",
    "creditFileDetails",
    "agPaymentDetails",
    "paPaymentDetails",
    "authenticationTxnId",
    "threeDSecurityDetails"
})
public class PaymentInformation {

    @XmlElement(required = true)
    protected String formOfPaymentType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ParentFOPType parentType;
    protected double paymentAmount;
    @XmlElement(required = true)
    protected String paymentCurrency;
    protected double exchangeRate;
    @XmlElement(required = true)
    protected String owedCurrency;
    protected double owedAmount;
    protected FeeTax feeTaxDetails;
    protected ChequeDetails chequeDetails;
    protected DebitCardDetails debitCardDetails;
    @XmlElement(required = true)
    protected ElectronicFundDetails electronicFundDetails;
    @XmlElement(required = true)
    protected WriteOffDetails writeOffDetails;
    @XmlElement(required = true)
    protected PymCreditCardDetails creditCardDetails;
    @XmlElement(required = true)
    protected CreditFileDetails creditFileDetails;
    protected AGPaymentDetails agPaymentDetails;
    protected PAPaymentDetails paPaymentDetails;
    protected String authenticationTxnId;
    protected ThreeDSecurityDtls threeDSecurityDetails;

    /**
     * Gets the value of the formOfPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPaymentType() {
        return formOfPaymentType;
    }

    /**
     * Sets the value of the formOfPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfPaymentType(String value) {
        this.formOfPaymentType = value;
    }

    /**
     * Gets the value of the parentType property.
     * 
     * @return
     *     possible object is
     *     {@link ParentFOPType }
     *     
     */
    public ParentFOPType getParentType() {
        return parentType;
    }

    /**
     * Sets the value of the parentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentFOPType }
     *     
     */
    public void setParentType(ParentFOPType value) {
        this.parentType = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     */
    public double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     */
    public void setPaymentAmount(double value) {
        this.paymentAmount = value;
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
     * Gets the value of the exchangeRate property.
     * 
     */
    public double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     */
    public void setExchangeRate(double value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the owedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwedCurrency() {
        return owedCurrency;
    }

    /**
     * Sets the value of the owedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwedCurrency(String value) {
        this.owedCurrency = value;
    }

    /**
     * Gets the value of the owedAmount property.
     * 
     */
    public double getOwedAmount() {
        return owedAmount;
    }

    /**
     * Sets the value of the owedAmount property.
     * 
     */
    public void setOwedAmount(double value) {
        this.owedAmount = value;
    }

    /**
     * Gets the value of the feeTaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FeeTax }
     *     
     */
    public FeeTax getFeeTaxDetails() {
        return feeTaxDetails;
    }

    /**
     * Sets the value of the feeTaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeTax }
     *     
     */
    public void setFeeTaxDetails(FeeTax value) {
        this.feeTaxDetails = value;
    }

    /**
     * Gets the value of the chequeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeDetails }
     *     
     */
    public ChequeDetails getChequeDetails() {
        return chequeDetails;
    }

    /**
     * Sets the value of the chequeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeDetails }
     *     
     */
    public void setChequeDetails(ChequeDetails value) {
        this.chequeDetails = value;
    }

    /**
     * Gets the value of the debitCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCardDetails }
     *     
     */
    public DebitCardDetails getDebitCardDetails() {
        return debitCardDetails;
    }

    /**
     * Sets the value of the debitCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCardDetails }
     *     
     */
    public void setDebitCardDetails(DebitCardDetails value) {
        this.debitCardDetails = value;
    }

    /**
     * Gets the value of the electronicFundDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicFundDetails }
     *     
     */
    public ElectronicFundDetails getElectronicFundDetails() {
        return electronicFundDetails;
    }

    /**
     * Sets the value of the electronicFundDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicFundDetails }
     *     
     */
    public void setElectronicFundDetails(ElectronicFundDetails value) {
        this.electronicFundDetails = value;
    }

    /**
     * Gets the value of the writeOffDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WriteOffDetails }
     *     
     */
    public WriteOffDetails getWriteOffDetails() {
        return writeOffDetails;
    }

    /**
     * Sets the value of the writeOffDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteOffDetails }
     *     
     */
    public void setWriteOffDetails(WriteOffDetails value) {
        this.writeOffDetails = value;
    }

    /**
     * Gets the value of the creditCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PymCreditCardDetails }
     *     
     */
    public PymCreditCardDetails getCreditCardDetails() {
        return creditCardDetails;
    }

    /**
     * Sets the value of the creditCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PymCreditCardDetails }
     *     
     */
    public void setCreditCardDetails(PymCreditCardDetails value) {
        this.creditCardDetails = value;
    }

    /**
     * Gets the value of the creditFileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditFileDetails }
     *     
     */
    public CreditFileDetails getCreditFileDetails() {
        return creditFileDetails;
    }

    /**
     * Sets the value of the creditFileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditFileDetails }
     *     
     */
    public void setCreditFileDetails(CreditFileDetails value) {
        this.creditFileDetails = value;
    }

    /**
     * Gets the value of the agPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AGPaymentDetails }
     *     
     */
    public AGPaymentDetails getAgPaymentDetails() {
        return agPaymentDetails;
    }

    /**
     * Sets the value of the agPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AGPaymentDetails }
     *     
     */
    public void setAgPaymentDetails(AGPaymentDetails value) {
        this.agPaymentDetails = value;
    }

    /**
     * Gets the value of the paPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PAPaymentDetails }
     *     
     */
    public PAPaymentDetails getPaPaymentDetails() {
        return paPaymentDetails;
    }

    /**
     * Sets the value of the paPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAPaymentDetails }
     *     
     */
    public void setPaPaymentDetails(PAPaymentDetails value) {
        this.paPaymentDetails = value;
    }

    /**
     * Gets the value of the authenticationTxnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTxnId() {
        return authenticationTxnId;
    }

    /**
     * Sets the value of the authenticationTxnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTxnId(String value) {
        this.authenticationTxnId = value;
    }

    /**
     * Gets the value of the threeDSecurityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSecurityDtls }
     *     
     */
    public ThreeDSecurityDtls getThreeDSecurityDetails() {
        return threeDSecurityDetails;
    }

    /**
     * Sets the value of the threeDSecurityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSecurityDtls }
     *     
     */
    public void setThreeDSecurityDetails(ThreeDSecurityDtls value) {
        this.threeDSecurityDetails = value;
    }

}
