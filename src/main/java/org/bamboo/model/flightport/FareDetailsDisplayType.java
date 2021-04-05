
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareDetailsDisplayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDetailsDisplayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareDetailsId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CurrencyDisplayDetailsTypes" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyDisplayDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailsDisplayType", propOrder = {
    "fareDetailsId",
    "currencyDisplayDetailsTypes"
})
public class FareDetailsDisplayType {

    @XmlElement(name = "FareDetailsId")
    protected long fareDetailsId;
    @XmlElement(name = "CurrencyDisplayDetailsTypes")
    protected List<CurrencyDisplayDetailsType> currencyDisplayDetailsTypes;

    /**
     * Gets the value of the fareDetailsId property.
     * 
     */
    public long getFareDetailsId() {
        return fareDetailsId;
    }

    /**
     * Sets the value of the fareDetailsId property.
     * 
     */
    public void setFareDetailsId(long value) {
        this.fareDetailsId = value;
    }

    /**
     * Gets the value of the currencyDisplayDetailsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyDisplayDetailsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyDisplayDetailsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyDisplayDetailsType }
     * 
     * 
     */
    public List<CurrencyDisplayDetailsType> getCurrencyDisplayDetailsTypes() {
        if (currencyDisplayDetailsTypes == null) {
            currencyDisplayDetailsTypes = new ArrayList<CurrencyDisplayDetailsType>();
        }
        return this.currencyDisplayDetailsTypes;
    }

}
