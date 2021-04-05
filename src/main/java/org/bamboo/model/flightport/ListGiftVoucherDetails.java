
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ListGiftVoucherDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListGiftVoucherDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GiftVoucherNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BulkOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftVoucherTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VPPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerOfCreation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiftVoucherCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiftVoucherBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiftVoucherStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiftVoucherExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="isPrevBtnDisable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isNextBtnDisable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListGiftVoucherDetails", propOrder = {
    "giftVoucherNumber",
    "bulkOrderNumber",
    "giftVoucherTypeCode",
    "vppId",
    "ownerOfCreation",
    "giftVoucherCurrencyCode",
    "giftVoucherBalanceAmount",
    "giftVoucherStatus",
    "giftVoucherExpiryDate",
    "isPrevBtnDisable",
    "isNextBtnDisable",
    "totalPages"
})
public class ListGiftVoucherDetails {

    @XmlElement(name = "GiftVoucherNumber", required = true)
    protected String giftVoucherNumber;
    @XmlElement(name = "BulkOrderNumber")
    protected String bulkOrderNumber;
    @XmlElement(name = "GiftVoucherTypeCode", required = true)
    protected String giftVoucherTypeCode;
    @XmlElement(name = "VPPId")
    protected String vppId;
    @XmlElement(name = "OwnerOfCreation", required = true)
    protected String ownerOfCreation;
    @XmlElement(name = "GiftVoucherCurrencyCode", required = true)
    protected String giftVoucherCurrencyCode;
    @XmlElement(name = "GiftVoucherBalanceAmount", required = true)
    protected String giftVoucherBalanceAmount;
    @XmlElement(name = "GiftVoucherStatus", required = true)
    protected String giftVoucherStatus;
    @XmlElement(name = "GiftVoucherExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar giftVoucherExpiryDate;
    protected boolean isPrevBtnDisable;
    protected boolean isNextBtnDisable;
    protected int totalPages;

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
     * Gets the value of the bulkOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkOrderNumber() {
        return bulkOrderNumber;
    }

    /**
     * Sets the value of the bulkOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkOrderNumber(String value) {
        this.bulkOrderNumber = value;
    }

    /**
     * Gets the value of the giftVoucherTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherTypeCode() {
        return giftVoucherTypeCode;
    }

    /**
     * Sets the value of the giftVoucherTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherTypeCode(String value) {
        this.giftVoucherTypeCode = value;
    }

    /**
     * Gets the value of the vppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVPPId() {
        return vppId;
    }

    /**
     * Sets the value of the vppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVPPId(String value) {
        this.vppId = value;
    }

    /**
     * Gets the value of the ownerOfCreation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerOfCreation() {
        return ownerOfCreation;
    }

    /**
     * Sets the value of the ownerOfCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerOfCreation(String value) {
        this.ownerOfCreation = value;
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
     * Gets the value of the giftVoucherBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherBalanceAmount() {
        return giftVoucherBalanceAmount;
    }

    /**
     * Sets the value of the giftVoucherBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherBalanceAmount(String value) {
        this.giftVoucherBalanceAmount = value;
    }

    /**
     * Gets the value of the giftVoucherStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherStatus() {
        return giftVoucherStatus;
    }

    /**
     * Sets the value of the giftVoucherStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherStatus(String value) {
        this.giftVoucherStatus = value;
    }

    /**
     * Gets the value of the giftVoucherExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGiftVoucherExpiryDate() {
        return giftVoucherExpiryDate;
    }

    /**
     * Sets the value of the giftVoucherExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGiftVoucherExpiryDate(XMLGregorianCalendar value) {
        this.giftVoucherExpiryDate = value;
    }

    /**
     * Gets the value of the isPrevBtnDisable property.
     * 
     */
    public boolean isIsPrevBtnDisable() {
        return isPrevBtnDisable;
    }

    /**
     * Sets the value of the isPrevBtnDisable property.
     * 
     */
    public void setIsPrevBtnDisable(boolean value) {
        this.isPrevBtnDisable = value;
    }

    /**
     * Gets the value of the isNextBtnDisable property.
     * 
     */
    public boolean isIsNextBtnDisable() {
        return isNextBtnDisable;
    }

    /**
     * Sets the value of the isNextBtnDisable property.
     * 
     */
    public void setIsNextBtnDisable(boolean value) {
        this.isNextBtnDisable = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

}
