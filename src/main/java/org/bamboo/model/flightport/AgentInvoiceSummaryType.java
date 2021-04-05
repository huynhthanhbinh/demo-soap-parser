
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AgentInvoiceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentInvoiceSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalSales" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalCommission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalUsedCredit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BalanceAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FopType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgencyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgencyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParentAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentInvoiceSummaryType", propOrder = {
    "invoiceDate",
    "invoiceNumber",
    "totalSales",
    "totalCommission",
    "totalUsedCredit",
    "balanceAmount",
    "currency",
    "fopType",
    "agencyId",
    "agencyType",
    "parentAgencyCode"
})
public class AgentInvoiceSummaryType {

    @XmlElement(name = "InvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "TotalSales")
    protected Double totalSales;
    @XmlElement(name = "TotalCommission")
    protected double totalCommission;
    @XmlElement(name = "TotalUsedCredit")
    protected double totalUsedCredit;
    @XmlElement(name = "BalanceAmount")
    protected double balanceAmount;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "FopType", required = true)
    protected String fopType;
    @XmlElement(name = "AgencyId", required = true)
    protected String agencyId;
    @XmlElement(name = "AgencyType", required = true)
    protected String agencyType;
    @XmlElement(name = "ParentAgencyCode", required = true)
    protected String parentAgencyCode;

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the totalSales property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSales() {
        return totalSales;
    }

    /**
     * Sets the value of the totalSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSales(Double value) {
        this.totalSales = value;
    }

    /**
     * Gets the value of the totalCommission property.
     * 
     */
    public double getTotalCommission() {
        return totalCommission;
    }

    /**
     * Sets the value of the totalCommission property.
     * 
     */
    public void setTotalCommission(double value) {
        this.totalCommission = value;
    }

    /**
     * Gets the value of the totalUsedCredit property.
     * 
     */
    public double getTotalUsedCredit() {
        return totalUsedCredit;
    }

    /**
     * Sets the value of the totalUsedCredit property.
     * 
     */
    public void setTotalUsedCredit(double value) {
        this.totalUsedCredit = value;
    }

    /**
     * Gets the value of the balanceAmount property.
     * 
     */
    public double getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     */
    public void setBalanceAmount(double value) {
        this.balanceAmount = value;
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
     * Gets the value of the fopType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopType() {
        return fopType;
    }

    /**
     * Sets the value of the fopType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopType(String value) {
        this.fopType = value;
    }

    /**
     * Gets the value of the agencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyId(String value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the agencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyType() {
        return agencyType;
    }

    /**
     * Sets the value of the agencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyType(String value) {
        this.agencyType = value;
    }

    /**
     * Gets the value of the parentAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAgencyCode() {
        return parentAgencyCode;
    }

    /**
     * Sets the value of the parentAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAgencyCode(String value) {
        this.parentAgencyCode = value;
    }

}
