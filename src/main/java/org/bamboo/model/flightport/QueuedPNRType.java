
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueuedPNRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueuedPNRType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PNRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QueueOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RevenueCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivedAtGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReasonTimeGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivedAtLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RecievedTimeInAgencyLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueuedPNRType", propOrder = {
    "pnrNumber",
    "queueNumber",
    "queueOfficeCode",
    "creationDate",
    "revenueCompany",
    "receivedAtGMT",
    "reasonTimeGMT",
    "reason",
    "itemTag",
    "receivedAtLTC",
    "recievedTimeInAgencyLTC"
})
public class QueuedPNRType {

    @XmlElement(name = "PNRNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "QueueNumber", required = true)
    protected String queueNumber;
    @XmlElement(name = "QueueOfficeCode", required = true)
    protected String queueOfficeCode;
    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "RevenueCompany")
    protected String revenueCompany;
    @XmlElement(name = "ReceivedAtGMT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedAtGMT;
    @XmlElement(name = "ReasonTimeGMT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reasonTimeGMT;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "ItemTag")
    protected String itemTag;
    @XmlElement(name = "ReceivedAtLTC")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedAtLTC;
    @XmlElement(name = "RecievedTimeInAgencyLTC")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recievedTimeInAgencyLTC;

    /**
     * Gets the value of the pnrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRNumber() {
        return pnrNumber;
    }

    /**
     * Sets the value of the pnrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * Gets the value of the queueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueNumber() {
        return queueNumber;
    }

    /**
     * Sets the value of the queueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueNumber(String value) {
        this.queueNumber = value;
    }

    /**
     * Gets the value of the queueOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueOfficeCode() {
        return queueOfficeCode;
    }

    /**
     * Sets the value of the queueOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueOfficeCode(String value) {
        this.queueOfficeCode = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the revenueCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueCompany() {
        return revenueCompany;
    }

    /**
     * Sets the value of the revenueCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueCompany(String value) {
        this.revenueCompany = value;
    }

    /**
     * Gets the value of the receivedAtGMT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedAtGMT() {
        return receivedAtGMT;
    }

    /**
     * Sets the value of the receivedAtGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedAtGMT(XMLGregorianCalendar value) {
        this.receivedAtGMT = value;
    }

    /**
     * Gets the value of the reasonTimeGMT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReasonTimeGMT() {
        return reasonTimeGMT;
    }

    /**
     * Sets the value of the reasonTimeGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReasonTimeGMT(XMLGregorianCalendar value) {
        this.reasonTimeGMT = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the itemTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTag() {
        return itemTag;
    }

    /**
     * Sets the value of the itemTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTag(String value) {
        this.itemTag = value;
    }

    /**
     * Gets the value of the receivedAtLTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedAtLTC() {
        return receivedAtLTC;
    }

    /**
     * Sets the value of the receivedAtLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedAtLTC(XMLGregorianCalendar value) {
        this.receivedAtLTC = value;
    }

    /**
     * Gets the value of the recievedTimeInAgencyLTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecievedTimeInAgencyLTC() {
        return recievedTimeInAgencyLTC;
    }

    /**
     * Sets the value of the recievedTimeInAgencyLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecievedTimeInAgencyLTC(XMLGregorianCalendar value) {
        this.recievedTimeInAgencyLTC = value;
    }

}
