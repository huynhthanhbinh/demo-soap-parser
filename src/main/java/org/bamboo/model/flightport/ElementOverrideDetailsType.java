
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementOverrideDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementOverrideDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElementId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ElementCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ElementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ElementSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AmountInPOS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="POSCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AmountInPOO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="POOCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OverrideReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementOverrideDetailsType", propOrder = {
    "elementId",
    "elementCategory",
    "guestId",
    "elementType",
    "elementSubType",
    "amountInPOS",
    "posCurrency",
    "amountInPOO",
    "pooCurrency",
    "overrideReason"
})
public class ElementOverrideDetailsType {

    @XmlElement(name = "ElementId")
    protected long elementId;
    @XmlElement(name = "ElementCategory", required = true)
    protected String elementCategory;
    @XmlElement(name = "GuestId")
    protected long guestId;
    @XmlElement(name = "ElementType", required = true)
    protected String elementType;
    @XmlElement(name = "ElementSubType", required = true)
    protected String elementSubType;
    @XmlElement(name = "AmountInPOS")
    protected double amountInPOS;
    @XmlElement(name = "POSCurrency", required = true)
    protected String posCurrency;
    @XmlElement(name = "AmountInPOO")
    protected double amountInPOO;
    @XmlElement(name = "POOCurrency", required = true)
    protected String pooCurrency;
    @XmlElement(name = "OverrideReason")
    protected String overrideReason;

    /**
     * Gets the value of the elementId property.
     * 
     */
    public long getElementId() {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     */
    public void setElementId(long value) {
        this.elementId = value;
    }

    /**
     * Gets the value of the elementCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementCategory() {
        return elementCategory;
    }

    /**
     * Sets the value of the elementCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementCategory(String value) {
        this.elementCategory = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     */
    public long getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     */
    public void setGuestId(long value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementType(String value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the elementSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementSubType() {
        return elementSubType;
    }

    /**
     * Sets the value of the elementSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementSubType(String value) {
        this.elementSubType = value;
    }

    /**
     * Gets the value of the amountInPOS property.
     * 
     */
    public double getAmountInPOS() {
        return amountInPOS;
    }

    /**
     * Sets the value of the amountInPOS property.
     * 
     */
    public void setAmountInPOS(double value) {
        this.amountInPOS = value;
    }

    /**
     * Gets the value of the posCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSCurrency() {
        return posCurrency;
    }

    /**
     * Sets the value of the posCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSCurrency(String value) {
        this.posCurrency = value;
    }

    /**
     * Gets the value of the amountInPOO property.
     * 
     */
    public double getAmountInPOO() {
        return amountInPOO;
    }

    /**
     * Sets the value of the amountInPOO property.
     * 
     */
    public void setAmountInPOO(double value) {
        this.amountInPOO = value;
    }

    /**
     * Gets the value of the pooCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOOCurrency() {
        return pooCurrency;
    }

    /**
     * Sets the value of the pooCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOOCurrency(String value) {
        this.pooCurrency = value;
    }

    /**
     * Gets the value of the overrideReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideReason() {
        return overrideReason;
    }

    /**
     * Sets the value of the overrideReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideReason(String value) {
        this.overrideReason = value;
    }

}
