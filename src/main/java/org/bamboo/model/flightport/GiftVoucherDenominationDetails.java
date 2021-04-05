
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftVoucherDenominationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftVoucherDenominationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giftVoucherValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="giftVoucherQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GiftVoucherTaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GiftVoucherTax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gcSeqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftVoucherDenominationDetails", propOrder = {
    "giftVoucherValue",
    "giftVoucherQuantity",
    "giftVoucherTaxDetails",
    "totalTaxAmount",
    "gcSeqId",
    "imageUrl"
})
public class GiftVoucherDenominationDetails {

    protected double giftVoucherValue;
    protected int giftVoucherQuantity;
    @XmlElement(name = "GiftVoucherTaxDetails")
    protected List<GiftVoucherTax> giftVoucherTaxDetails;
    @XmlElement(name = "TotalTaxAmount")
    protected Double totalTaxAmount;
    protected String gcSeqId;
    protected String imageUrl;

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
     * Gets the value of the giftVoucherQuantity property.
     * 
     */
    public int getGiftVoucherQuantity() {
        return giftVoucherQuantity;
    }

    /**
     * Sets the value of the giftVoucherQuantity property.
     * 
     */
    public void setGiftVoucherQuantity(int value) {
        this.giftVoucherQuantity = value;
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
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTaxAmount(Double value) {
        this.totalTaxAmount = value;
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

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

}
