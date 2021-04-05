
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PymCreditCardDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PymCreditCardDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CardType"/>
 *         &lt;element name="creditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hasValidationOverride" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cvv2Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pymDccDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PymDccDetails" minOccurs="0"/>
 *         &lt;element name="ipAddresss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalCCDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AdditionalCCDetails" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PymCreditCardDetails", propOrder = {
    "cardType",
    "creditCardNumber",
    "expiryDate",
    "cardHolderName",
    "hasValidationOverride",
    "cvv2Number",
    "trackOne",
    "trackTwo",
    "pymDccDetails",
    "ipAddresss",
    "addressOne",
    "addressTwo",
    "cityName",
    "countryName",
    "zipCode",
    "provinceCode",
    "countryCode",
    "emailAddress",
    "additionalCCDetails",
    "customerId",
    "phoneNumber"
})
public class PymCreditCardDetails {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CardType cardType;
    @XmlElement(required = true)
    protected String creditCardNumber;
    @XmlElement(required = true)
    protected String expiryDate;
    @XmlElement(required = true)
    protected String cardHolderName;
    protected boolean hasValidationOverride;
    protected String cvv2Number;
    protected String trackOne;
    protected String trackTwo;
    protected PymDccDetails pymDccDetails;
    protected String ipAddresss;
    protected String addressOne;
    protected String addressTwo;
    protected String cityName;
    protected String countryName;
    protected String zipCode;
    protected String provinceCode;
    protected String countryCode;
    protected String emailAddress;
    protected AdditionalCCDetails additionalCCDetails;
    protected String customerId;
    protected String phoneNumber;

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CardType }
     *     
     */
    public CardType getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType }
     *     
     */
    public void setCardType(CardType value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the hasValidationOverride property.
     * 
     */
    public boolean isHasValidationOverride() {
        return hasValidationOverride;
    }

    /**
     * Sets the value of the hasValidationOverride property.
     * 
     */
    public void setHasValidationOverride(boolean value) {
        this.hasValidationOverride = value;
    }

    /**
     * Gets the value of the cvv2Number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv2Number() {
        return cvv2Number;
    }

    /**
     * Sets the value of the cvv2Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv2Number(String value) {
        this.cvv2Number = value;
    }

    /**
     * Gets the value of the trackOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackOne() {
        return trackOne;
    }

    /**
     * Sets the value of the trackOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackOne(String value) {
        this.trackOne = value;
    }

    /**
     * Gets the value of the trackTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackTwo() {
        return trackTwo;
    }

    /**
     * Sets the value of the trackTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackTwo(String value) {
        this.trackTwo = value;
    }

    /**
     * Gets the value of the pymDccDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PymDccDetails }
     *     
     */
    public PymDccDetails getPymDccDetails() {
        return pymDccDetails;
    }

    /**
     * Sets the value of the pymDccDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PymDccDetails }
     *     
     */
    public void setPymDccDetails(PymDccDetails value) {
        this.pymDccDetails = value;
    }

    /**
     * Gets the value of the ipAddresss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddresss() {
        return ipAddresss;
    }

    /**
     * Sets the value of the ipAddresss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddresss(String value) {
        this.ipAddresss = value;
    }

    /**
     * Gets the value of the addressOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOne() {
        return addressOne;
    }

    /**
     * Sets the value of the addressOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOne(String value) {
        this.addressOne = value;
    }

    /**
     * Gets the value of the addressTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTwo() {
        return addressTwo;
    }

    /**
     * Sets the value of the addressTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTwo(String value) {
        this.addressTwo = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the provinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Sets the value of the provinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceCode(String value) {
        this.provinceCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the additionalCCDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCCDetails }
     *     
     */
    public AdditionalCCDetails getAdditionalCCDetails() {
        return additionalCCDetails;
    }

    /**
     * Sets the value of the additionalCCDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCCDetails }
     *     
     */
    public void setAdditionalCCDetails(AdditionalCCDetails value) {
        this.additionalCCDetails = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
