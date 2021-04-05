
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}PositionInfoType" minOccurs="0"/>
 *         &lt;element name="ExpiryYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpriyMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}PositionInfoType" minOccurs="0"/>
 *         &lt;element name="CustomInfoList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomInfoListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfoType", propOrder = {
    "cardNumber",
    "expiryYear",
    "expriyMonth",
    "securityCode",
    "customInfoList"
})
public class CardInfoType {

    @XmlElement(name = "CardNumber")
    protected PositionInfoType cardNumber;
    @XmlElement(name = "ExpiryYear")
    protected String expiryYear;
    @XmlElement(name = "ExpriyMonth")
    protected String expriyMonth;
    @XmlElement(name = "SecurityCode")
    protected PositionInfoType securityCode;
    @XmlElement(name = "CustomInfoList")
    protected List<CustomInfoListType> customInfoList;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PositionInfoType }
     *     
     */
    public PositionInfoType getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionInfoType }
     *     
     */
    public void setCardNumber(PositionInfoType value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryYear(String value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the expriyMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpriyMonth() {
        return expriyMonth;
    }

    /**
     * Sets the value of the expriyMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpriyMonth(String value) {
        this.expriyMonth = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link PositionInfoType }
     *     
     */
    public PositionInfoType getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionInfoType }
     *     
     */
    public void setSecurityCode(PositionInfoType value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the customInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomInfoListType }
     * 
     * 
     */
    public List<CustomInfoListType> getCustomInfoList() {
        if (customInfoList == null) {
            customInfoList = new ArrayList<CustomInfoListType>();
        }
        return this.customInfoList;
    }

}
