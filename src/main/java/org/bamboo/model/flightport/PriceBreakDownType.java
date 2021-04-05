
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Price break down details
 * 
 * <p>Java class for PriceBreakDownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceBreakDownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppliedFareDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AppliedFareDetailsForPaxType" minOccurs="0"/>
 *         &lt;element name="FareOverrideDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareOverrideDetailsType" minOccurs="0"/>
 *         &lt;element name="FareDetailsForGuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareDetailsForGuestType" minOccurs="0"/>
 *         &lt;element name="Surcharge" type="{http://www.ibsplc.com/iRes/simpleTypes/}SurchargeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceBreakDownType", propOrder = {
    "appliedFareDetailsType",
    "fareOverrideDetails",
    "fareDetailsForGuestType",
    "surcharge"
})
public class PriceBreakDownType {

    @XmlElement(name = "AppliedFareDetailsType")
    protected AppliedFareDetailsForPaxType appliedFareDetailsType;
    @XmlElement(name = "FareOverrideDetails")
    protected FareOverrideDetailsType fareOverrideDetails;
    @XmlElement(name = "FareDetailsForGuestType")
    protected FareDetailsForGuestType fareDetailsForGuestType;
    @XmlElement(name = "Surcharge")
    protected List<SurchargeType> surcharge;

    /**
     * Gets the value of the appliedFareDetailsType property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedFareDetailsForPaxType }
     *     
     */
    public AppliedFareDetailsForPaxType getAppliedFareDetailsType() {
        return appliedFareDetailsType;
    }

    /**
     * Sets the value of the appliedFareDetailsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedFareDetailsForPaxType }
     *     
     */
    public void setAppliedFareDetailsType(AppliedFareDetailsForPaxType value) {
        this.appliedFareDetailsType = value;
    }

    /**
     * Gets the value of the fareOverrideDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareOverrideDetailsType }
     *     
     */
    public FareOverrideDetailsType getFareOverrideDetails() {
        return fareOverrideDetails;
    }

    /**
     * Sets the value of the fareOverrideDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareOverrideDetailsType }
     *     
     */
    public void setFareOverrideDetails(FareOverrideDetailsType value) {
        this.fareOverrideDetails = value;
    }

    /**
     * Gets the value of the fareDetailsForGuestType property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsForGuestType }
     *     
     */
    public FareDetailsForGuestType getFareDetailsForGuestType() {
        return fareDetailsForGuestType;
    }

    /**
     * Sets the value of the fareDetailsForGuestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsForGuestType }
     *     
     */
    public void setFareDetailsForGuestType(FareDetailsForGuestType value) {
        this.fareDetailsForGuestType = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurchargeType }
     * 
     * 
     */
    public List<SurchargeType> getSurcharge() {
        if (surcharge == null) {
            surcharge = new ArrayList<SurchargeType>();
        }
        return this.surcharge;
    }

}
