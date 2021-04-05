
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Holds tax invoice details for a country.
 * 
 * <p>Java class for TaxInvoiceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInvoiceDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxInvoice" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxInvoiceType" maxOccurs="unbounded"/>
 *         &lt;element name="DefaultInvoiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInvoiceDetailType", propOrder = {
    "countryCode",
    "taxInvoice",
    "defaultInvoiceType"
})
public class TaxInvoiceDetailType {

    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "TaxInvoice", required = true)
    protected List<TaxInvoiceType> taxInvoice;
    @XmlElement(name = "DefaultInvoiceType", required = true)
    protected String defaultInvoiceType;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the taxInvoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInvoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInvoiceType }
     * 
     * 
     */
    public List<TaxInvoiceType> getTaxInvoice() {
        if (taxInvoice == null) {
            taxInvoice = new ArrayList<TaxInvoiceType>();
        }
        return this.taxInvoice;
    }

    /**
     * Gets the value of the defaultInvoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultInvoiceType() {
        return defaultInvoiceType;
    }

    /**
     * Sets the value of the defaultInvoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultInvoiceType(String value) {
        this.defaultInvoiceType = value;
    }

}
