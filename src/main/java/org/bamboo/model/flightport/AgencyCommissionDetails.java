
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyCommissionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyCommissionDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsEligibleForCommission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AgencyCommissionRateDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyCommissionRateDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddOnCommissionRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyCommissionDetails", propOrder = {
    "isEligibleForCommission",
    "agencyCommissionRateDetails",
    "addOnCommissionRate"
})
public class AgencyCommissionDetails {

    @XmlElement(name = "IsEligibleForCommission")
    protected Boolean isEligibleForCommission;
    @XmlElement(name = "AgencyCommissionRateDetails")
    protected List<AgencyCommissionRateDetails> agencyCommissionRateDetails;
    @XmlElement(name = "AddOnCommissionRate")
    protected Double addOnCommissionRate;

    /**
     * Gets the value of the isEligibleForCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEligibleForCommission() {
        return isEligibleForCommission;
    }

    /**
     * Sets the value of the isEligibleForCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEligibleForCommission(Boolean value) {
        this.isEligibleForCommission = value;
    }

    /**
     * Gets the value of the agencyCommissionRateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencyCommissionRateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencyCommissionRateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgencyCommissionRateDetails }
     * 
     * 
     */
    public List<AgencyCommissionRateDetails> getAgencyCommissionRateDetails() {
        if (agencyCommissionRateDetails == null) {
            agencyCommissionRateDetails = new ArrayList<AgencyCommissionRateDetails>();
        }
        return this.agencyCommissionRateDetails;
    }

    /**
     * Gets the value of the addOnCommissionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAddOnCommissionRate() {
        return addOnCommissionRate;
    }

    /**
     * Sets the value of the addOnCommissionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAddOnCommissionRate(Double value) {
        this.addOnCommissionRate = value;
    }

}
