
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxBaggageAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxBaggageAllowanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaggageCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaggageAllowancePerSegment" type="{http://www.ibsplc.com/iRes/simpleTypes/}BaggageAllowancePerSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxBaggageAllowanceType", propOrder = {
    "guestId",
    "baggageCategory",
    "baggageAllowancePerSegment"
})
public class PaxBaggageAllowanceType {

    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "BaggageCategory")
    protected String baggageCategory;
    @XmlElement(name = "BaggageAllowancePerSegment")
    protected List<BaggageAllowancePerSegmentType> baggageAllowancePerSegment;

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestId(String value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the baggageCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageCategory() {
        return baggageCategory;
    }

    /**
     * Sets the value of the baggageCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageCategory(String value) {
        this.baggageCategory = value;
    }

    /**
     * Gets the value of the baggageAllowancePerSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowancePerSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageAllowancePerSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageAllowancePerSegmentType }
     * 
     * 
     */
    public List<BaggageAllowancePerSegmentType> getBaggageAllowancePerSegment() {
        if (baggageAllowancePerSegment == null) {
            baggageAllowancePerSegment = new ArrayList<BaggageAllowancePerSegmentType>();
        }
        return this.baggageAllowancePerSegment;
    }

}
