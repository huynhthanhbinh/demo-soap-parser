
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceProductDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceProviderCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalPremium" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PremiumCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceInfoDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}InsuranceInfoDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceProductDetailsType", propOrder = {
    "insuranceProviderCountry",
    "language",
    "productId",
    "productName",
    "productDescription",
    "totalPremium",
    "currency",
    "premiumCode",
    "insuranceInfoDetails"
})
public class InsuranceProductDetailsType {

    @XmlElement(name = "InsuranceProviderCountry")
    protected String insuranceProviderCountry;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "TotalPremium")
    protected double totalPremium;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "PremiumCode")
    protected String premiumCode;
    @XmlElement(name = "InsuranceInfoDetails", required = true)
    protected InsuranceInfoDetailsType insuranceInfoDetails;

    /**
     * Gets the value of the insuranceProviderCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceProviderCountry() {
        return insuranceProviderCountry;
    }

    /**
     * Sets the value of the insuranceProviderCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceProviderCountry(String value) {
        this.insuranceProviderCountry = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the totalPremium property.
     * 
     */
    public double getTotalPremium() {
        return totalPremium;
    }

    /**
     * Sets the value of the totalPremium property.
     * 
     */
    public void setTotalPremium(double value) {
        this.totalPremium = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the premiumCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumCode() {
        return premiumCode;
    }

    /**
     * Sets the value of the premiumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumCode(String value) {
        this.premiumCode = value;
    }

    /**
     * Gets the value of the insuranceInfoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceInfoDetailsType }
     *     
     */
    public InsuranceInfoDetailsType getInsuranceInfoDetails() {
        return insuranceInfoDetails;
    }

    /**
     * Sets the value of the insuranceInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceInfoDetailsType }
     *     
     */
    public void setInsuranceInfoDetails(InsuranceInfoDetailsType value) {
        this.insuranceInfoDetails = value;
    }

}
