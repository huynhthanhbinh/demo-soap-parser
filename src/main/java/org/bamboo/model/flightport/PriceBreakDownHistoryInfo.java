
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceBreakDownHistoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceBreakDownHistoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElementAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceBreakDown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PriceBreakDownType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceBreakDownHistoryInfo", propOrder = {
    "elementAction",
    "priceBreakDown"
})
public class PriceBreakDownHistoryInfo {

    @XmlElement(name = "ElementAction")
    protected String elementAction;
    @XmlElement(name = "PriceBreakDown")
    protected List<PriceBreakDownType> priceBreakDown;

    /**
     * Gets the value of the elementAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementAction() {
        return elementAction;
    }

    /**
     * Sets the value of the elementAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementAction(String value) {
        this.elementAction = value;
    }

    /**
     * Gets the value of the priceBreakDown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceBreakDown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceBreakDown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceBreakDownType }
     * 
     * 
     */
    public List<PriceBreakDownType> getPriceBreakDown() {
        if (priceBreakDown == null) {
            priceBreakDown = new ArrayList<PriceBreakDownType>();
        }
        return this.priceBreakDown;
    }

}
