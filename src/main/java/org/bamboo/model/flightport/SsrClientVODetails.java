
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsrClientVODetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsrClientVODetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SsrSendVODetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRDetailsType"/>
 *         &lt;element name="BookingSegmentFinderVOs" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingSegmentFinderVODetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsrClientVODetails", propOrder = {
    "ssrSendVODetails",
    "bookingSegmentFinderVOs"
})
public class SsrClientVODetails {

    @XmlElement(name = "SsrSendVODetails", required = true)
    protected SSRDetailsType ssrSendVODetails;
    @XmlElement(name = "BookingSegmentFinderVOs", required = true)
    protected List<BookingSegmentFinderVODetails> bookingSegmentFinderVOs;

    /**
     * Gets the value of the ssrSendVODetails property.
     * 
     * @return
     *     possible object is
     *     {@link SSRDetailsType }
     *     
     */
    public SSRDetailsType getSsrSendVODetails() {
        return ssrSendVODetails;
    }

    /**
     * Sets the value of the ssrSendVODetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSRDetailsType }
     *     
     */
    public void setSsrSendVODetails(SSRDetailsType value) {
        this.ssrSendVODetails = value;
    }

    /**
     * Gets the value of the bookingSegmentFinderVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingSegmentFinderVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingSegmentFinderVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingSegmentFinderVODetails }
     * 
     * 
     */
    public List<BookingSegmentFinderVODetails> getBookingSegmentFinderVOs() {
        if (bookingSegmentFinderVOs == null) {
            bookingSegmentFinderVOs = new ArrayList<BookingSegmentFinderVODetails>();
        }
        return this.bookingSegmentFinderVOs;
    }

}
