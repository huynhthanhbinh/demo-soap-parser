
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
 * <p>Java class for PaymentReceiptDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentReceiptDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PrintDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TotalAmountForPymReceipt" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountForPymReceiptType" minOccurs="0"/>
 *         &lt;element name="FarePymntDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FarePymntDetailsType" minOccurs="0"/>
 *         &lt;element name="FeePymntDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeePymntDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormOfPaymentCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}FOPType"/>
 *         &lt;element name="PaymentTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSTNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDoneBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceInitiator" type="{http://www.ibsplc.com/iRes/simpleTypes/}ServiceInitiatorType" minOccurs="0"/>
 *         &lt;element name="PaymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDuplicate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentSubcode" type="{http://www.ibsplc.com/iRes/simpleTypes/}CardType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReceiptDetailsType", propOrder = {
    "receiptNumber",
    "paymentDate",
    "printDate",
    "totalAmountForPymReceipt",
    "farePymntDetails",
    "feePymntDetails",
    "formOfPaymentCode",
    "paymentTypeNumber",
    "gstNumber",
    "transactionID",
    "paymentDoneBy",
    "trackingNumber",
    "serviceInitiator",
    "paymentDescription",
    "remarks",
    "paxName",
    "isDuplicate",
    "paymentDateAndTime",
    "paymentSubcode"
})
public class PaymentReceiptDetailsType {

    @XmlElement(name = "ReceiptNumber", required = true)
    protected String receiptNumber;
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "PrintDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar printDate;
    @XmlElement(name = "TotalAmountForPymReceipt")
    protected TotalAmountForPymReceiptType totalAmountForPymReceipt;
    @XmlElement(name = "FarePymntDetails")
    protected FarePymntDetailsType farePymntDetails;
    @XmlElement(name = "FeePymntDetails")
    protected List<FeePymntDetailsType> feePymntDetails;
    @XmlElement(name = "FormOfPaymentCode", required = true)
    @XmlSchemaType(name = "string")
    protected FOPType formOfPaymentCode;
    @XmlElement(name = "PaymentTypeNumber")
    protected String paymentTypeNumber;
    @XmlElement(name = "GSTNumber")
    protected String gstNumber;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "PaymentDoneBy")
    protected String paymentDoneBy;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "ServiceInitiator")
    @XmlSchemaType(name = "string")
    protected ServiceInitiatorType serviceInitiator;
    @XmlElement(name = "PaymentDescription")
    protected String paymentDescription;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "PaxName")
    protected String paxName;
    protected Boolean isDuplicate;
    @XmlElement(name = "PaymentDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDateAndTime;
    @XmlElement(name = "PaymentSubcode")
    @XmlSchemaType(name = "string")
    protected CardType paymentSubcode;

    /**
     * Gets the value of the receiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Sets the value of the receiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNumber(String value) {
        this.receiptNumber = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the printDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintDate() {
        return printDate;
    }

    /**
     * Sets the value of the printDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintDate(XMLGregorianCalendar value) {
        this.printDate = value;
    }

    /**
     * Gets the value of the totalAmountForPymReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountForPymReceiptType }
     *     
     */
    public TotalAmountForPymReceiptType getTotalAmountForPymReceipt() {
        return totalAmountForPymReceipt;
    }

    /**
     * Sets the value of the totalAmountForPymReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountForPymReceiptType }
     *     
     */
    public void setTotalAmountForPymReceipt(TotalAmountForPymReceiptType value) {
        this.totalAmountForPymReceipt = value;
    }

    /**
     * Gets the value of the farePymntDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FarePymntDetailsType }
     *     
     */
    public FarePymntDetailsType getFarePymntDetails() {
        return farePymntDetails;
    }

    /**
     * Sets the value of the farePymntDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePymntDetailsType }
     *     
     */
    public void setFarePymntDetails(FarePymntDetailsType value) {
        this.farePymntDetails = value;
    }

    /**
     * Gets the value of the feePymntDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feePymntDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeePymntDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeePymntDetailsType }
     * 
     * 
     */
    public List<FeePymntDetailsType> getFeePymntDetails() {
        if (feePymntDetails == null) {
            feePymntDetails = new ArrayList<FeePymntDetailsType>();
        }
        return this.feePymntDetails;
    }

    /**
     * Gets the value of the formOfPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link FOPType }
     *     
     */
    public FOPType getFormOfPaymentCode() {
        return formOfPaymentCode;
    }

    /**
     * Sets the value of the formOfPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOPType }
     *     
     */
    public void setFormOfPaymentCode(FOPType value) {
        this.formOfPaymentCode = value;
    }

    /**
     * Gets the value of the paymentTypeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeNumber() {
        return paymentTypeNumber;
    }

    /**
     * Sets the value of the paymentTypeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeNumber(String value) {
        this.paymentTypeNumber = value;
    }

    /**
     * Gets the value of the gstNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTNumber() {
        return gstNumber;
    }

    /**
     * Sets the value of the gstNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTNumber(String value) {
        this.gstNumber = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the paymentDoneBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDoneBy() {
        return paymentDoneBy;
    }

    /**
     * Sets the value of the paymentDoneBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDoneBy(String value) {
        this.paymentDoneBy = value;
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
     * Gets the value of the paymentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * Sets the value of the paymentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the paxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxName() {
        return paxName;
    }

    /**
     * Sets the value of the paxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxName(String value) {
        this.paxName = value;
    }

    /**
     * Gets the value of the isDuplicate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDuplicate() {
        return isDuplicate;
    }

    /**
     * Sets the value of the isDuplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDuplicate(Boolean value) {
        this.isDuplicate = value;
    }

    /**
     * Gets the value of the paymentDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDateAndTime() {
        return paymentDateAndTime;
    }

    /**
     * Sets the value of the paymentDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDateAndTime(XMLGregorianCalendar value) {
        this.paymentDateAndTime = value;
    }

    /**
     * Gets the value of the paymentSubcode property.
     * 
     * @return
     *     possible object is
     *     {@link CardType }
     *     
     */
    public CardType getPaymentSubcode() {
        return paymentSubcode;
    }

    /**
     * Sets the value of the paymentSubcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType }
     *     
     */
    public void setPaymentSubcode(CardType value) {
        this.paymentSubcode = value;
    }

}
