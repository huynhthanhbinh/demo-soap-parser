
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItinPriceHistoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinPriceHistoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestPriceBreakDownHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestPriceBreakDownHistoryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinPriceHistoryInfo", propOrder = {
    "guestPriceBreakDownHistoryInfo"
})
public class ItinPriceHistoryInfo {

    @XmlElement(name = "GuestPriceBreakDownHistoryInfo")
    protected List<GuestPriceBreakDownHistoryInfo> guestPriceBreakDownHistoryInfo;

    /**
     * Gets the value of the guestPriceBreakDownHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestPriceBreakDownHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestPriceBreakDownHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestPriceBreakDownHistoryInfo }
     * 
     * 
     */
    public List<GuestPriceBreakDownHistoryInfo> getGuestPriceBreakDownHistoryInfo() {
        if (guestPriceBreakDownHistoryInfo == null) {
            guestPriceBreakDownHistoryInfo = new ArrayList<GuestPriceBreakDownHistoryInfo>();
        }
        return this.guestPriceBreakDownHistoryInfo;
    }

}
