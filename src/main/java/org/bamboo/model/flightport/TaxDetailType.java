
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tax Detail representation.
 * 
 * <p>Java class for TaxDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType"/>
 *         &lt;element name="TaxBreakDown" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetailsPerGuest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailType", propOrder = {
    "total",
    "taxBreakDown"
})
public class TaxDetailType {

    @XmlElement(name = "Total", required = true)
    protected CurrencyAmountType total;
    @XmlElement(name = "TaxBreakDown")
    protected List<TaxDetailsPerGuest> taxBreakDown;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotal(CurrencyAmountType value) {
        this.total = value;
    }

    /**
     * Gets the value of the taxBreakDown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxBreakDown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxBreakDown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailsPerGuest }
     * 
     * 
     */
    public List<TaxDetailsPerGuest> getTaxBreakDown() {
        if (taxBreakDown == null) {
            taxBreakDown = new ArrayList<TaxDetailsPerGuest>();
        }
        return this.taxBreakDown;
    }

}
