
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaserInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaserInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameAndAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}GVNameAndAddress"/>
 *         &lt;element name="loyaltyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loyaltyBonusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaserInformation", propOrder = {
    "nameAndAddress",
    "loyaltyNumber",
    "loyaltyBonusCode"
})
public class PurchaserInformation {

    @XmlElement(required = true)
    protected GVNameAndAddress nameAndAddress;
    protected String loyaltyNumber;
    protected String loyaltyBonusCode;

    /**
     * Gets the value of the nameAndAddress property.
     * 
     * @return
     *     possible object is
     *     {@link GVNameAndAddress }
     *     
     */
    public GVNameAndAddress getNameAndAddress() {
        return nameAndAddress;
    }

    /**
     * Sets the value of the nameAndAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GVNameAndAddress }
     *     
     */
    public void setNameAndAddress(GVNameAndAddress value) {
        this.nameAndAddress = value;
    }

    /**
     * Gets the value of the loyaltyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyNumber() {
        return loyaltyNumber;
    }

    /**
     * Sets the value of the loyaltyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyNumber(String value) {
        this.loyaltyNumber = value;
    }

    /**
     * Gets the value of the loyaltyBonusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyBonusCode() {
        return loyaltyBonusCode;
    }

    /**
     * Sets the value of the loyaltyBonusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyBonusCode(String value) {
        this.loyaltyBonusCode = value;
    }

}
