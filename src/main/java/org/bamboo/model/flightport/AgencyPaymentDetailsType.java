
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AgencyPaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyPaymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormOfPayment" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyPaymentFOPType"/>
 *         &lt;element name="FOPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemittanceAmtDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType"/>
 *         &lt;element name="TransactionAmtDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType"/>
 *         &lt;element name="AvailableCredit" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="WriteOffAmtDtls" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="ReportingOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyPaymentDetailsType", propOrder = {
    "agencyCode",
    "paymentDate",
    "comment",
    "formOfPayment",
    "fopNumber",
    "remittanceAmtDetails",
    "transactionAmtDetails",
    "availableCredit",
    "writeOffAmtDtls",
    "reportingOffice"
})
public class AgencyPaymentDetailsType {

    @XmlElement(name = "AgencyCode", required = true)
    protected String agencyCode;
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "FormOfPayment", required = true)
    @XmlSchemaType(name = "string")
    protected AgencyPaymentFOPType formOfPayment;
    @XmlElement(name = "FOPNumber")
    protected String fopNumber;
    @XmlElement(name = "RemittanceAmtDetails", required = true)
    protected CurrencyAmountType remittanceAmtDetails;
    @XmlElement(name = "TransactionAmtDetails", required = true)
    protected CurrencyAmountType transactionAmtDetails;
    @XmlElement(name = "AvailableCredit")
    protected CurrencyAmountType availableCredit;
    @XmlElement(name = "WriteOffAmtDtls")
    protected CurrencyAmountType writeOffAmtDtls;
    @XmlElement(name = "ReportingOffice")
    protected String reportingOffice;

    /**
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyPaymentFOPType }
     *     
     */
    public AgencyPaymentFOPType getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyPaymentFOPType }
     *     
     */
    public void setFormOfPayment(AgencyPaymentFOPType value) {
        this.formOfPayment = value;
    }

    /**
     * Gets the value of the fopNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOPNumber() {
        return fopNumber;
    }

    /**
     * Sets the value of the fopNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOPNumber(String value) {
        this.fopNumber = value;
    }

    /**
     * Gets the value of the remittanceAmtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getRemittanceAmtDetails() {
        return remittanceAmtDetails;
    }

    /**
     * Sets the value of the remittanceAmtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setRemittanceAmtDetails(CurrencyAmountType value) {
        this.remittanceAmtDetails = value;
    }

    /**
     * Gets the value of the transactionAmtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTransactionAmtDetails() {
        return transactionAmtDetails;
    }

    /**
     * Sets the value of the transactionAmtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTransactionAmtDetails(CurrencyAmountType value) {
        this.transactionAmtDetails = value;
    }

    /**
     * Gets the value of the availableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getAvailableCredit() {
        return availableCredit;
    }

    /**
     * Sets the value of the availableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setAvailableCredit(CurrencyAmountType value) {
        this.availableCredit = value;
    }

    /**
     * Gets the value of the writeOffAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getWriteOffAmtDtls() {
        return writeOffAmtDtls;
    }

    /**
     * Sets the value of the writeOffAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setWriteOffAmtDtls(CurrencyAmountType value) {
        this.writeOffAmtDtls = value;
    }

    /**
     * Gets the value of the reportingOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingOffice() {
        return reportingOffice;
    }

    /**
     * Sets the value of the reportingOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingOffice(String value) {
        this.reportingOffice = value;
    }

}
