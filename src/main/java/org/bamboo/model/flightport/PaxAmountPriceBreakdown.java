
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxAmountPriceBreakdown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxAmountPriceBreakdown">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxTotalPrice" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxTotalPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaxAmountToBePaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxAmountToBePaid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxAmountPriceBreakdown", propOrder = {
    "paxTotalPrice",
    "paxAmountToBePaid"
})
public class PaxAmountPriceBreakdown {

    @XmlElement(name = "PaxTotalPrice")
    protected List<PaxTotalPrice> paxTotalPrice;
    @XmlElement(name = "PaxAmountToBePaid")
    protected List<PaxAmountToBePaid> paxAmountToBePaid;

    /**
     * Gets the value of the paxTotalPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxTotalPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxTotalPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxTotalPrice }
     * 
     * 
     */
    public List<PaxTotalPrice> getPaxTotalPrice() {
        if (paxTotalPrice == null) {
            paxTotalPrice = new ArrayList<PaxTotalPrice>();
        }
        return this.paxTotalPrice;
    }

    /**
     * Gets the value of the paxAmountToBePaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxAmountToBePaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxAmountToBePaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxAmountToBePaid }
     * 
     * 
     */
    public List<PaxAmountToBePaid> getPaxAmountToBePaid() {
        if (paxAmountToBePaid == null) {
            paxAmountToBePaid = new ArrayList<PaxAmountToBePaid>();
        }
        return this.paxAmountToBePaid;
    }

}
