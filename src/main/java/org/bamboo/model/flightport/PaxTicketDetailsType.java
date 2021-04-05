
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
 * <p>Java class for PaxTicketDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxTicketDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isConjunction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OriginalTicketIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndorsementAndRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketingOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxTicketDetailsType", propOrder = {
    "ticketNumber",
    "isConjunction",
    "originalTicketIssueDate",
    "endorsementAndRestrictions",
    "fareString",
    "ticketingOfficeCode"
})
public class PaxTicketDetailsType {

    @XmlElement(name = "TicketNumber", required = true)
    protected String ticketNumber;
    protected boolean isConjunction;
    @XmlElement(name = "OriginalTicketIssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalTicketIssueDate;
    @XmlElement(name = "EndorsementAndRestrictions")
    protected List<String> endorsementAndRestrictions;
    @XmlElement(name = "FareString")
    protected String fareString;
    @XmlElement(name = "TicketingOfficeCode")
    protected String ticketingOfficeCode;

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the isConjunction property.
     * 
     */
    public boolean isIsConjunction() {
        return isConjunction;
    }

    /**
     * Sets the value of the isConjunction property.
     * 
     */
    public void setIsConjunction(boolean value) {
        this.isConjunction = value;
    }

    /**
     * Gets the value of the originalTicketIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalTicketIssueDate() {
        return originalTicketIssueDate;
    }

    /**
     * Sets the value of the originalTicketIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalTicketIssueDate(XMLGregorianCalendar value) {
        this.originalTicketIssueDate = value;
    }

    /**
     * Gets the value of the endorsementAndRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementAndRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementAndRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEndorsementAndRestrictions() {
        if (endorsementAndRestrictions == null) {
            endorsementAndRestrictions = new ArrayList<String>();
        }
        return this.endorsementAndRestrictions;
    }

    /**
     * Gets the value of the fareString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareString() {
        return fareString;
    }

    /**
     * Sets the value of the fareString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareString(String value) {
        this.fareString = value;
    }

    /**
     * Gets the value of the ticketingOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingOfficeCode() {
        return ticketingOfficeCode;
    }

    /**
     * Sets the value of the ticketingOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingOfficeCode(String value) {
        this.ticketingOfficeCode = value;
    }

}
