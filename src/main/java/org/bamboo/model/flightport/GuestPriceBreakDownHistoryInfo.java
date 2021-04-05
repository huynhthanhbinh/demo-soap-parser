
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestPriceBreakDownHistoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestPriceBreakDownHistoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceBreakDownHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PriceBreakDownHistoryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestPriceBreakDownHistoryInfo", propOrder = {
    "priceBreakDownHistoryInfo",
    "guestId"
})
public class GuestPriceBreakDownHistoryInfo {

    @XmlElement(name = "PriceBreakDownHistoryInfo")
    protected List<PriceBreakDownHistoryInfo> priceBreakDownHistoryInfo;
    @XmlElement(name = "GuestId")
    protected Long guestId;

    /**
     * Gets the value of the priceBreakDownHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceBreakDownHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceBreakDownHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceBreakDownHistoryInfo }
     * 
     * 
     */
    public List<PriceBreakDownHistoryInfo> getPriceBreakDownHistoryInfo() {
        if (priceBreakDownHistoryInfo == null) {
            priceBreakDownHistoryInfo = new ArrayList<PriceBreakDownHistoryInfo>();
        }
        return this.priceBreakDownHistoryInfo;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

}
