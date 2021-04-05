
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountDetailsForAGuest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountDetailsForAGuest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountToBePaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AmountToBeReturned" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountDetailsForAGuest", propOrder = {
    "amountToBePaid",
    "amountToBeReturned",
    "currency"
})
public class AmountDetailsForAGuest {

    @XmlElement(name = "AmountToBePaid")
    protected Double amountToBePaid;
    @XmlElement(name = "AmountToBeReturned")
    protected Double amountToBeReturned;
    @XmlElement(name = "Currency", required = true)
    protected String currency;

    /**
     * Gets the value of the amountToBePaid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountToBePaid() {
        return amountToBePaid;
    }

    /**
     * Sets the value of the amountToBePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountToBePaid(Double value) {
        this.amountToBePaid = value;
    }

    /**
     * Gets the value of the amountToBeReturned property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountToBeReturned() {
        return amountToBeReturned;
    }

    /**
     * Sets the value of the amountToBeReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountToBeReturned(Double value) {
        this.amountToBeReturned = value;
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

}
