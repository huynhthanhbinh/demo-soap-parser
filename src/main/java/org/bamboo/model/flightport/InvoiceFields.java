
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Invoicename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Invoiceaddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Invoicecity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Invoicepostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Invoicevat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Invoiceemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFields", propOrder = {
    "invoicename",
    "invoiceaddress1",
    "invoicecity",
    "invoicepostcode",
    "invoicevat",
    "invoiceemail"
})
public class InvoiceFields {

    @XmlElement(name = "Invoicename")
    protected String invoicename;
    @XmlElement(name = "Invoiceaddress1")
    protected String invoiceaddress1;
    @XmlElement(name = "Invoicecity")
    protected String invoicecity;
    @XmlElement(name = "Invoicepostcode")
    protected String invoicepostcode;
    @XmlElement(name = "Invoicevat")
    protected String invoicevat;
    @XmlElement(name = "Invoiceemail")
    protected String invoiceemail;

    /**
     * Gets the value of the invoicename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicename() {
        return invoicename;
    }

    /**
     * Sets the value of the invoicename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicename(String value) {
        this.invoicename = value;
    }

    /**
     * Gets the value of the invoiceaddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceaddress1() {
        return invoiceaddress1;
    }

    /**
     * Sets the value of the invoiceaddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceaddress1(String value) {
        this.invoiceaddress1 = value;
    }

    /**
     * Gets the value of the invoicecity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicecity() {
        return invoicecity;
    }

    /**
     * Sets the value of the invoicecity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicecity(String value) {
        this.invoicecity = value;
    }

    /**
     * Gets the value of the invoicepostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicepostcode() {
        return invoicepostcode;
    }

    /**
     * Sets the value of the invoicepostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicepostcode(String value) {
        this.invoicepostcode = value;
    }

    /**
     * Gets the value of the invoicevat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicevat() {
        return invoicevat;
    }

    /**
     * Sets the value of the invoicevat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicevat(String value) {
        this.invoicevat = value;
    }

    /**
     * Gets the value of the invoiceemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceemail() {
        return invoiceemail;
    }

    /**
     * Sets the value of the invoiceemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceemail(String value) {
        this.invoiceemail = value;
    }

}
