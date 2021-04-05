
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreatedGiftVoucherDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatedGiftVoucherDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giftVoucherNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="giftVoucherValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="giftVoucherCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiftVoucherTaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GiftVoucherTax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gcSeqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatedGiftVoucherDetails", propOrder = {
    "giftVoucherNumber",
    "giftVoucherValue",
    "giftVoucherCurrencyCode",
    "giftVoucherTaxDetails",
    "gcSeqId"
})
public class CreatedGiftVoucherDetails {

    @XmlElement(required = true)
    protected String giftVoucherNumber;
    protected double giftVoucherValue;
    @XmlElement(required = true)
    protected String giftVoucherCurrencyCode;
    @XmlElement(name = "GiftVoucherTaxDetails")
    protected List<GiftVoucherTax> giftVoucherTaxDetails;
    protected String gcSeqId;

    /**
     * Gets the value of the giftVoucherNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherNumber() {
        return giftVoucherNumber;
    }

    /**
     * Sets the value of the giftVoucherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherNumber(String value) {
        this.giftVoucherNumber = value;
    }

    /**
     * Gets the value of the giftVoucherValue property.
     * 
     */
    public double getGiftVoucherValue() {
        return giftVoucherValue;
    }

    /**
     * Sets the value of the giftVoucherValue property.
     * 
     */
    public void setGiftVoucherValue(double value) {
        this.giftVoucherValue = value;
    }

    /**
     * Gets the value of the giftVoucherCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherCurrencyCode() {
        return giftVoucherCurrencyCode;
    }

    /**
     * Sets the value of the giftVoucherCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherCurrencyCode(String value) {
        this.giftVoucherCurrencyCode = value;
    }

    /**
     * Gets the value of the giftVoucherTaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftVoucherTaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftVoucherTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiftVoucherTax }
     * 
     * 
     */
    public List<GiftVoucherTax> getGiftVoucherTaxDetails() {
        if (giftVoucherTaxDetails == null) {
            giftVoucherTaxDetails = new ArrayList<GiftVoucherTax>();
        }
        return this.giftVoucherTaxDetails;
    }

    /**
     * Gets the value of the gcSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGcSeqId() {
        return gcSeqId;
    }

    /**
     * Sets the value of the gcSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGcSeqId(String value) {
        this.gcSeqId = value;
    }

}
