
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds the tax invoice details of each invoice type.
 * 
 * <p>Java class for TaxInvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInvoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxInvoiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxInvoiceField" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxInvoiceFieldType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInvoiceType", propOrder = {
    "taxInvoiceType",
    "taxInvoiceField"
})
public class TaxInvoiceType {

    @XmlElement(name = "TaxInvoiceType", required = true)
    protected String taxInvoiceType;
    @XmlElement(name = "TaxInvoiceField", required = true)
    protected List<TaxInvoiceFieldType> taxInvoiceField;

    /**
     * Gets the value of the taxInvoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxInvoiceType() {
        return taxInvoiceType;
    }

    /**
     * Sets the value of the taxInvoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxInvoiceType(String value) {
        this.taxInvoiceType = value;
    }

    /**
     * Gets the value of the taxInvoiceField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInvoiceField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInvoiceField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInvoiceFieldType }
     * 
     * 
     */
    public List<TaxInvoiceFieldType> getTaxInvoiceField() {
        if (taxInvoiceField == null) {
            taxInvoiceField = new ArrayList<TaxInvoiceFieldType>();
        }
        return this.taxInvoiceField;
    }

}
