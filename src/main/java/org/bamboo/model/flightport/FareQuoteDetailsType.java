
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareQuoteDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQuoteDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxBreakDownType" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetailsPerGuest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SurChargeBreakDown" type="{http://www.ibsplc.com/iRes/simpleTypes/}SurChargeDetailsPerGuest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQuoteDetailsType", propOrder = {
    "taxBreakDownType",
    "surChargeBreakDown"
})
public class FareQuoteDetailsType {

    @XmlElement(name = "TaxBreakDownType")
    protected List<TaxDetailsPerGuest> taxBreakDownType;
    @XmlElement(name = "SurChargeBreakDown")
    protected List<SurChargeDetailsPerGuest> surChargeBreakDown;

    /**
     * Gets the value of the taxBreakDownType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxBreakDownType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxBreakDownType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailsPerGuest }
     * 
     * 
     */
    public List<TaxDetailsPerGuest> getTaxBreakDownType() {
        if (taxBreakDownType == null) {
            taxBreakDownType = new ArrayList<TaxDetailsPerGuest>();
        }
        return this.taxBreakDownType;
    }

    /**
     * Gets the value of the surChargeBreakDown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surChargeBreakDown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurChargeBreakDown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurChargeDetailsPerGuest }
     * 
     * 
     */
    public List<SurChargeDetailsPerGuest> getSurChargeBreakDown() {
        if (surChargeBreakDown == null) {
            surChargeBreakDown = new ArrayList<SurChargeDetailsPerGuest>();
        }
        return this.surChargeBreakDown;
    }

}
