
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShopingCartDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShopingCartDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CartName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CartAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CartQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CartOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShopingCartDetailsType", propOrder = {
    "cartName",
    "cartAmount",
    "cartQty",
    "cartOrder"
})
public class ShopingCartDetailsType {

    @XmlElement(name = "CartName")
    protected String cartName;
    @XmlElement(name = "CartAmount")
    protected Double cartAmount;
    @XmlElement(name = "CartQty")
    protected Integer cartQty;
    @XmlElement(name = "CartOrder")
    protected Integer cartOrder;

    /**
     * Gets the value of the cartName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartName() {
        return cartName;
    }

    /**
     * Sets the value of the cartName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartName(String value) {
        this.cartName = value;
    }

    /**
     * Gets the value of the cartAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCartAmount() {
        return cartAmount;
    }

    /**
     * Sets the value of the cartAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCartAmount(Double value) {
        this.cartAmount = value;
    }

    /**
     * Gets the value of the cartQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCartQty() {
        return cartQty;
    }

    /**
     * Sets the value of the cartQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCartQty(Integer value) {
        this.cartQty = value;
    }

    /**
     * Gets the value of the cartOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCartOrder() {
        return cartOrder;
    }

    /**
     * Sets the value of the cartOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCartOrder(Integer value) {
        this.cartOrder = value;
    }

}
