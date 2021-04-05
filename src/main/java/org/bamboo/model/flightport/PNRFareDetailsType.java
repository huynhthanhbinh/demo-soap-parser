
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNRFareDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRFareDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFareCodes" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRBaseFareType"/>
 *         &lt;element name="TotalFareForAGuest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalFareForAllGuestInPNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChangeFees" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CancelFees" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxOnFees" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRFareDetailsType", propOrder = {
    "baseFareCodes",
    "totalFareForAGuest",
    "totalFareForAllGuestInPNR",
    "changeFees",
    "cancelFees",
    "taxOnFees",
    "total"
})
public class PNRFareDetailsType {

    @XmlElement(name = "BaseFareCodes", required = true)
    protected PNRBaseFareType baseFareCodes;
    @XmlElement(name = "TotalFareForAGuest", required = true)
    protected String totalFareForAGuest;
    @XmlElement(name = "TotalFareForAllGuestInPNR", required = true)
    protected String totalFareForAllGuestInPNR;
    @XmlElement(name = "ChangeFees", required = true)
    protected String changeFees;
    @XmlElement(name = "CancelFees", required = true)
    protected String cancelFees;
    @XmlElement(name = "TaxOnFees", required = true)
    protected String taxOnFees;
    @XmlElement(name = "Total", required = true)
    protected String total;

    /**
     * Gets the value of the baseFareCodes property.
     * 
     * @return
     *     possible object is
     *     {@link PNRBaseFareType }
     *     
     */
    public PNRBaseFareType getBaseFareCodes() {
        return baseFareCodes;
    }

    /**
     * Sets the value of the baseFareCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRBaseFareType }
     *     
     */
    public void setBaseFareCodes(PNRBaseFareType value) {
        this.baseFareCodes = value;
    }

    /**
     * Gets the value of the totalFareForAGuest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFareForAGuest() {
        return totalFareForAGuest;
    }

    /**
     * Sets the value of the totalFareForAGuest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFareForAGuest(String value) {
        this.totalFareForAGuest = value;
    }

    /**
     * Gets the value of the totalFareForAllGuestInPNR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFareForAllGuestInPNR() {
        return totalFareForAllGuestInPNR;
    }

    /**
     * Sets the value of the totalFareForAllGuestInPNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFareForAllGuestInPNR(String value) {
        this.totalFareForAllGuestInPNR = value;
    }

    /**
     * Gets the value of the changeFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFees() {
        return changeFees;
    }

    /**
     * Sets the value of the changeFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeFees(String value) {
        this.changeFees = value;
    }

    /**
     * Gets the value of the cancelFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelFees() {
        return cancelFees;
    }

    /**
     * Sets the value of the cancelFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelFees(String value) {
        this.cancelFees = value;
    }

    /**
     * Gets the value of the taxOnFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOnFees() {
        return taxOnFees;
    }

    /**
     * Sets the value of the taxOnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOnFees(String value) {
        this.taxOnFees = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

}
