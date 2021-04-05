
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AgencyCreditHistType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyCreditHistType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCreditAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCommAddedToAvlCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="AvailableCredit" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="UsedCredit" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="IsNegCreditAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxNegCreditAllowed" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="TransactionAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="ServiceInitiator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyCreditHistType", propOrder = {
    "agencyCode",
    "agencyName",
    "isCreditAllowed",
    "creditType",
    "isCommAddedToAvlCredit",
    "creditLimit",
    "availableCredit",
    "usedCredit",
    "isNegCreditAllowed",
    "maxNegCreditAllowed",
    "transactionAmount",
    "serviceInitiator",
    "trackingNumber",
    "action",
    "userID",
    "dutyCode",
    "officeCode",
    "lastModifiedDate"
})
public class AgencyCreditHistType {

    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "IsCreditAllowed")
    protected Boolean isCreditAllowed;
    @XmlElement(name = "CreditType")
    protected String creditType;
    @XmlElement(name = "IsCommAddedToAvlCredit")
    protected Boolean isCommAddedToAvlCredit;
    @XmlElement(name = "CreditLimit")
    protected CurrencyAmountType creditLimit;
    @XmlElement(name = "AvailableCredit")
    protected CurrencyAmountType availableCredit;
    @XmlElement(name = "UsedCredit")
    protected CurrencyAmountType usedCredit;
    @XmlElement(name = "IsNegCreditAllowed")
    protected Boolean isNegCreditAllowed;
    @XmlElement(name = "MaxNegCreditAllowed")
    protected CurrencyAmountType maxNegCreditAllowed;
    @XmlElement(name = "TransactionAmount")
    protected CurrencyAmountType transactionAmount;
    @XmlElement(name = "ServiceInitiator")
    protected String serviceInitiator;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "DutyCode")
    protected String dutyCode;
    @XmlElement(name = "OfficeCode")
    protected String officeCode;
    @XmlElement(name = "LastModifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;

    /**
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the isCreditAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreditAllowed() {
        return isCreditAllowed;
    }

    /**
     * Sets the value of the isCreditAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCreditAllowed(Boolean value) {
        this.isCreditAllowed = value;
    }

    /**
     * Gets the value of the creditType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditType() {
        return creditType;
    }

    /**
     * Sets the value of the creditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditType(String value) {
        this.creditType = value;
    }

    /**
     * Gets the value of the isCommAddedToAvlCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommAddedToAvlCredit() {
        return isCommAddedToAvlCredit;
    }

    /**
     * Sets the value of the isCommAddedToAvlCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommAddedToAvlCredit(Boolean value) {
        this.isCommAddedToAvlCredit = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setCreditLimit(CurrencyAmountType value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the availableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getAvailableCredit() {
        return availableCredit;
    }

    /**
     * Sets the value of the availableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setAvailableCredit(CurrencyAmountType value) {
        this.availableCredit = value;
    }

    /**
     * Gets the value of the usedCredit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getUsedCredit() {
        return usedCredit;
    }

    /**
     * Sets the value of the usedCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setUsedCredit(CurrencyAmountType value) {
        this.usedCredit = value;
    }

    /**
     * Gets the value of the isNegCreditAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNegCreditAllowed() {
        return isNegCreditAllowed;
    }

    /**
     * Sets the value of the isNegCreditAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNegCreditAllowed(Boolean value) {
        this.isNegCreditAllowed = value;
    }

    /**
     * Gets the value of the maxNegCreditAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getMaxNegCreditAllowed() {
        return maxNegCreditAllowed;
    }

    /**
     * Sets the value of the maxNegCreditAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setMaxNegCreditAllowed(CurrencyAmountType value) {
        this.maxNegCreditAllowed = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTransactionAmount(CurrencyAmountType value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the serviceInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInitiator() {
        return serviceInitiator;
    }

    /**
     * Sets the value of the serviceInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInitiator(String value) {
        this.serviceInitiator = value;
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
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the dutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyCode() {
        return dutyCode;
    }

    /**
     * Sets the value of the dutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyCode(String value) {
        this.dutyCode = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

}
