
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditFileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditFileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditFileTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceInitiator" type="{http://www.ibsplc.com/iRes/simpleTypes/}ServiceInitiatorType" minOccurs="0"/>
 *         &lt;element name="CreditRecordNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AirlineComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeneralComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SharedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlackOutDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateRangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BalanceAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ConvertToCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditFileType", propOrder = {
    "creditFileTypeCode",
    "serviceInitiator",
    "creditRecordNumber",
    "expiryDate",
    "transactionAmount",
    "currency",
    "airlineComments",
    "generalComments",
    "owner",
    "profileReference",
    "sharedIndicator",
    "blackOutDate",
    "trackingNumber",
    "balanceAmount",
    "convertToCurrency",
    "convertedAmount"
})
public class CreditFileType {

    @XmlElement(name = "CreditFileTypeCode", required = true)
    protected String creditFileTypeCode;
    @XmlElement(name = "ServiceInitiator")
    @XmlSchemaType(name = "string")
    protected ServiceInitiatorType serviceInitiator;
    @XmlElement(name = "CreditRecordNumber", required = true)
    protected String creditRecordNumber;
    @XmlElement(name = "ExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "TransactionAmount")
    protected double transactionAmount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "AirlineComments")
    protected String airlineComments;
    @XmlElement(name = "GeneralComments")
    protected String generalComments;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "ProfileReference")
    protected String profileReference;
    @XmlElement(name = "SharedIndicator")
    protected String sharedIndicator;
    @XmlElement(name = "BlackOutDate")
    protected List<DateRangeType> blackOutDate;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "BalanceAmount")
    protected double balanceAmount;
    @XmlElement(name = "ConvertToCurrency")
    protected String convertToCurrency;
    @XmlElement(name = "ConvertedAmount")
    protected double convertedAmount;

    /**
     * Gets the value of the creditFileTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditFileTypeCode() {
        return creditFileTypeCode;
    }

    /**
     * Sets the value of the creditFileTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditFileTypeCode(String value) {
        this.creditFileTypeCode = value;
    }

    /**
     * Gets the value of the serviceInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInitiatorType }
     *     
     */
    public ServiceInitiatorType getServiceInitiator() {
        return serviceInitiator;
    }

    /**
     * Sets the value of the serviceInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInitiatorType }
     *     
     */
    public void setServiceInitiator(ServiceInitiatorType value) {
        this.serviceInitiator = value;
    }

    /**
     * Gets the value of the creditRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRecordNumber() {
        return creditRecordNumber;
    }

    /**
     * Sets the value of the creditRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRecordNumber(String value) {
        this.creditRecordNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     */
    public void setTransactionAmount(double value) {
        this.transactionAmount = value;
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
     * Gets the value of the airlineComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineComments() {
        return airlineComments;
    }

    /**
     * Sets the value of the airlineComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineComments(String value) {
        this.airlineComments = value;
    }

    /**
     * Gets the value of the generalComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralComments() {
        return generalComments;
    }

    /**
     * Sets the value of the generalComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralComments(String value) {
        this.generalComments = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the profileReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileReference() {
        return profileReference;
    }

    /**
     * Sets the value of the profileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileReference(String value) {
        this.profileReference = value;
    }

    /**
     * Gets the value of the sharedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedIndicator() {
        return sharedIndicator;
    }

    /**
     * Sets the value of the sharedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedIndicator(String value) {
        this.sharedIndicator = value;
    }

    /**
     * Gets the value of the blackOutDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blackOutDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlackOutDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateRangeType }
     * 
     * 
     */
    public List<DateRangeType> getBlackOutDate() {
        if (blackOutDate == null) {
            blackOutDate = new ArrayList<DateRangeType>();
        }
        return this.blackOutDate;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the balanceAmount property.
     * 
     */
    public double getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     */
    public void setBalanceAmount(double value) {
        this.balanceAmount = value;
    }

    /**
     * Gets the value of the convertToCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertToCurrency() {
        return convertToCurrency;
    }

    /**
     * Sets the value of the convertToCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertToCurrency(String value) {
        this.convertToCurrency = value;
    }

    /**
     * Gets the value of the convertedAmount property.
     * 
     */
    public double getConvertedAmount() {
        return convertedAmount;
    }

    /**
     * Sets the value of the convertedAmount property.
     * 
     */
    public void setConvertedAmount(double value) {
        this.convertedAmount = value;
    }

}
