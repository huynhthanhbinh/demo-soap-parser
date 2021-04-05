
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
 * <p>Java class for PnrSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlightSegmentSummaryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentSummaryDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PnrGuestSummaryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrGuestSummaryDetails" maxOccurs="unbounded"/>
 *         &lt;element name="PnrCreationTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PnrStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AmountPaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalAmountToBePaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimeLimitDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TimeLimitDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationTimeInAgentsTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedDateAndTimeInAgentTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrSummary", propOrder = {
    "pnrNumber",
    "flightSegmentSummaryDetails",
    "pnrGuestSummaryDetails",
    "pnrCreationTime",
    "pnrStatus",
    "amountPaid",
    "totalAmountToBePaid",
    "timeLimitDetails",
    "paymentStatus",
    "pnrType",
    "creationTimeInAgentsTimeZone",
    "lastModifiedDateAndTimeInAgentTimeZone",
    "groupName",
    "groupType"
})
public class PnrSummary {

    @XmlElement(name = "PnrNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "FlightSegmentSummaryDetails")
    protected List<FlightSegmentSummaryDetails> flightSegmentSummaryDetails;
    @XmlElement(name = "PnrGuestSummaryDetails", required = true)
    protected List<PnrGuestSummaryDetails> pnrGuestSummaryDetails;
    @XmlElement(name = "PnrCreationTime", required = true)
    protected String pnrCreationTime;
    @XmlElement(name = "PnrStatus", required = true)
    protected String pnrStatus;
    @XmlElement(name = "AmountPaid")
    protected List<PnrPayment> amountPaid;
    @XmlElement(name = "TotalAmountToBePaid")
    protected List<PnrPayment> totalAmountToBePaid;
    @XmlElement(name = "TimeLimitDetails")
    protected List<TimeLimitDetailsType> timeLimitDetails;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "PnrType")
    protected String pnrType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimeInAgentsTimeZone;
    @XmlElement(name = "LastModifiedDateAndTimeInAgentTimeZone", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateAndTimeInAgentTimeZone;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "GroupType")
    protected String groupType;

    /**
     * Gets the value of the pnrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrNumber() {
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
    public void setPnrNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * Gets the value of the flightSegmentSummaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentSummaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentSummaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentSummaryDetails }
     * 
     * 
     */
    public List<FlightSegmentSummaryDetails> getFlightSegmentSummaryDetails() {
        if (flightSegmentSummaryDetails == null) {
            flightSegmentSummaryDetails = new ArrayList<FlightSegmentSummaryDetails>();
        }
        return this.flightSegmentSummaryDetails;
    }

    /**
     * Gets the value of the pnrGuestSummaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrGuestSummaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrGuestSummaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrGuestSummaryDetails }
     * 
     * 
     */
    public List<PnrGuestSummaryDetails> getPnrGuestSummaryDetails() {
        if (pnrGuestSummaryDetails == null) {
            pnrGuestSummaryDetails = new ArrayList<PnrGuestSummaryDetails>();
        }
        return this.pnrGuestSummaryDetails;
    }

    /**
     * Gets the value of the pnrCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrCreationTime() {
        return pnrCreationTime;
    }

    /**
     * Sets the value of the pnrCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrCreationTime(String value) {
        this.pnrCreationTime = value;
    }

    /**
     * Gets the value of the pnrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrStatus() {
        return pnrStatus;
    }

    /**
     * Sets the value of the pnrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrStatus(String value) {
        this.pnrStatus = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountPaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountPaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrPayment }
     * 
     * 
     */
    public List<PnrPayment> getAmountPaid() {
        if (amountPaid == null) {
            amountPaid = new ArrayList<PnrPayment>();
        }
        return this.amountPaid;
    }

    /**
     * Gets the value of the totalAmountToBePaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalAmountToBePaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalAmountToBePaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrPayment }
     * 
     * 
     */
    public List<PnrPayment> getTotalAmountToBePaid() {
        if (totalAmountToBePaid == null) {
            totalAmountToBePaid = new ArrayList<PnrPayment>();
        }
        return this.totalAmountToBePaid;
    }

    /**
     * Gets the value of the timeLimitDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeLimitDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLimitDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeLimitDetailsType }
     * 
     * 
     */
    public List<TimeLimitDetailsType> getTimeLimitDetails() {
        if (timeLimitDetails == null) {
            timeLimitDetails = new ArrayList<TimeLimitDetailsType>();
        }
        return this.timeLimitDetails;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the pnrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrType() {
        return pnrType;
    }

    /**
     * Sets the value of the pnrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrType(String value) {
        this.pnrType = value;
    }

    /**
     * Gets the value of the creationTimeInAgentsTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimeInAgentsTimeZone() {
        return creationTimeInAgentsTimeZone;
    }

    /**
     * Sets the value of the creationTimeInAgentsTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimeInAgentsTimeZone(XMLGregorianCalendar value) {
        this.creationTimeInAgentsTimeZone = value;
    }

    /**
     * Gets the value of the lastModifiedDateAndTimeInAgentTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateAndTimeInAgentTimeZone() {
        return lastModifiedDateAndTimeInAgentTimeZone;
    }

    /**
     * Sets the value of the lastModifiedDateAndTimeInAgentTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateAndTimeInAgentTimeZone(XMLGregorianCalendar value) {
        this.lastModifiedDateAndTimeInAgentTimeZone = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

}
