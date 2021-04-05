
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GVPurchaserInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GVPurchaserInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaserType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaserTypeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameAndAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}GiftVoucherNameAndAddress"/>
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
@XmlType(name = "GVPurchaserInformation", propOrder = {
    "purchaserType",
    "purchaserTypeValue",
    "nameAndAddress",
    "loyaltyNumber",
    "loyaltyBonusCode"
})
public class GVPurchaserInformation {

    @XmlElement(required = true)
    protected String purchaserType;
    protected String purchaserTypeValue;
    @XmlElement(required = true)
    protected GiftVoucherNameAndAddress nameAndAddress;
    protected String loyaltyNumber;
    protected String loyaltyBonusCode;

    /**
     * Gets the value of the purchaserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserType() {
        return purchaserType;
    }

    /**
     * Sets the value of the purchaserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserType(String value) {
        this.purchaserType = value;
    }

    /**
     * Gets the value of the purchaserTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserTypeValue() {
        return purchaserTypeValue;
    }

    /**
     * Sets the value of the purchaserTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserTypeValue(String value) {
        this.purchaserTypeValue = value;
    }

    /**
     * Gets the value of the nameAndAddress property.
     * 
     * @return
     *     possible object is
     *     {@link GiftVoucherNameAndAddress }
     *     
     */
    public GiftVoucherNameAndAddress getNameAndAddress() {
        return nameAndAddress;
    }

    /**
     * Sets the value of the nameAndAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftVoucherNameAndAddress }
     *     
     */
    public void setNameAndAddress(GiftVoucherNameAndAddress value) {
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
