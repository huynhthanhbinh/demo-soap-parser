
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
 * <p>Java class for GroupQuoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupQuoteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BasePnrRSType">
 *       &lt;sequence>
 *         &lt;element name="PointOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreationDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModfiedDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupQuoteStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItineraryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded"/>
 *         &lt;element name="ItinPrice" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItinPriceType" maxOccurs="unbounded"/>
 *         &lt;element name="TaxExemptions" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxExemptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GroupPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupPaxDetailsType"/>
 *         &lt;element name="GroupQuoteContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrContactType" maxOccurs="unbounded"/>
 *         &lt;element name="QuoteOption" type="{http://www.ibsplc.com/iRes/simpleTypes/}QuoteOption" minOccurs="0"/>
 *         &lt;element name="GroupQuoteComments" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupQuoteCommentsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepositAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountPaid" minOccurs="0"/>
 *         &lt;element name="GroupQuoteAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupQuoteAmount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreatorChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatorChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationdateinAgentOfficeTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="modifiedDateInAgentOfficeTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupQuoteType", propOrder = {
    "pointOfSale",
    "iPaddress",
    "pnrNumber",
    "creationDateAndTime",
    "creationDateTimeZone",
    "lastModifiedDateAndTime",
    "lastModfiedDateTimeZone",
    "groupQuoteStatus",
    "itineraryDetails",
    "itinPrice",
    "taxExemptions",
    "groupPaxDetails",
    "groupQuoteContact",
    "quoteOption",
    "groupQuoteComments",
    "promoCode",
    "depositAmount",
    "groupQuoteAmount",
    "creatorChannelCode",
    "creatorChannelType",
    "creationdateinAgentOfficeTimeZone",
    "modifiedDateInAgentOfficeTimeZone",
    "errorType"
})
public class GroupQuoteType
    extends BasePnrRSType
{

    @XmlElement(name = "PointOfSale")
    protected String pointOfSale;
    @XmlElement(name = "IPaddress")
    protected String iPaddress;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "CreationDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateAndTime;
    @XmlElement(name = "CreationDateTimeZone")
    protected String creationDateTimeZone;
    @XmlElement(name = "LastModifiedDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateAndTime;
    @XmlElement(name = "LastModfiedDateTimeZone")
    protected String lastModfiedDateTimeZone;
    @XmlElement(name = "GroupQuoteStatus", required = true)
    protected String groupQuoteStatus;
    @XmlElement(name = "ItineraryDetails", required = true)
    protected List<ItineraryDetailsType> itineraryDetails;
    @XmlElement(name = "ItinPrice", required = true)
    protected List<ItinPriceType> itinPrice;
    @XmlElement(name = "TaxExemptions")
    protected List<TaxExemptionType> taxExemptions;
    @XmlElement(name = "GroupPaxDetails", required = true)
    protected GroupPaxDetailsType groupPaxDetails;
    @XmlElement(name = "GroupQuoteContact", required = true)
    protected List<PnrContactType> groupQuoteContact;
    @XmlElement(name = "QuoteOption")
    @XmlSchemaType(name = "string")
    protected QuoteOption quoteOption;
    @XmlElement(name = "GroupQuoteComments")
    protected List<GroupQuoteCommentsType> groupQuoteComments;
    @XmlElement(name = "PromoCode")
    protected String promoCode;
    @XmlElement(name = "DepositAmount")
    protected TotalAmountPaid depositAmount;
    @XmlElement(name = "GroupQuoteAmount")
    protected List<GroupQuoteAmount> groupQuoteAmount;
    @XmlElement(name = "CreatorChannelCode")
    protected String creatorChannelCode;
    @XmlElement(name = "CreatorChannelType")
    protected String creatorChannelType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdateinAgentOfficeTimeZone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateInAgentOfficeTimeZone;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSale(String value) {
        this.pointOfSale = value;
    }

    /**
     * Gets the value of the iPaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPaddress() {
        return iPaddress;
    }

    /**
     * Sets the value of the iPaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPaddress(String value) {
        this.iPaddress = value;
    }

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
     * Gets the value of the creationDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateAndTime() {
        return creationDateAndTime;
    }

    /**
     * Sets the value of the creationDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateAndTime(XMLGregorianCalendar value) {
        this.creationDateAndTime = value;
    }

    /**
     * Gets the value of the creationDateTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateTimeZone() {
        return creationDateTimeZone;
    }

    /**
     * Sets the value of the creationDateTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTimeZone(String value) {
        this.creationDateTimeZone = value;
    }

    /**
     * Gets the value of the lastModifiedDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateAndTime() {
        return lastModifiedDateAndTime;
    }

    /**
     * Sets the value of the lastModifiedDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateAndTime(XMLGregorianCalendar value) {
        this.lastModifiedDateAndTime = value;
    }

    /**
     * Gets the value of the lastModfiedDateTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModfiedDateTimeZone() {
        return lastModfiedDateTimeZone;
    }

    /**
     * Sets the value of the lastModfiedDateTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModfiedDateTimeZone(String value) {
        this.lastModfiedDateTimeZone = value;
    }

    /**
     * Gets the value of the groupQuoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupQuoteStatus() {
        return groupQuoteStatus;
    }

    /**
     * Sets the value of the groupQuoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupQuoteStatus(String value) {
        this.groupQuoteStatus = value;
    }

    /**
     * Gets the value of the itineraryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDetailsType }
     * 
     * 
     */
    public List<ItineraryDetailsType> getItineraryDetails() {
        if (itineraryDetails == null) {
            itineraryDetails = new ArrayList<ItineraryDetailsType>();
        }
        return this.itineraryDetails;
    }

    /**
     * Gets the value of the itinPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItinPriceType }
     * 
     * 
     */
    public List<ItinPriceType> getItinPrice() {
        if (itinPrice == null) {
            itinPrice = new ArrayList<ItinPriceType>();
        }
        return this.itinPrice;
    }

    /**
     * Gets the value of the taxExemptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExemptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptionType }
     * 
     * 
     */
    public List<TaxExemptionType> getTaxExemptions() {
        if (taxExemptions == null) {
            taxExemptions = new ArrayList<TaxExemptionType>();
        }
        return this.taxExemptions;
    }

    /**
     * Gets the value of the groupPaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GroupPaxDetailsType }
     *     
     */
    public GroupPaxDetailsType getGroupPaxDetails() {
        return groupPaxDetails;
    }

    /**
     * Sets the value of the groupPaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupPaxDetailsType }
     *     
     */
    public void setGroupPaxDetails(GroupPaxDetailsType value) {
        this.groupPaxDetails = value;
    }

    /**
     * Gets the value of the groupQuoteContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupQuoteContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupQuoteContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrContactType }
     * 
     * 
     */
    public List<PnrContactType> getGroupQuoteContact() {
        if (groupQuoteContact == null) {
            groupQuoteContact = new ArrayList<PnrContactType>();
        }
        return this.groupQuoteContact;
    }

    /**
     * Gets the value of the quoteOption property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteOption }
     *     
     */
    public QuoteOption getQuoteOption() {
        return quoteOption;
    }

    /**
     * Sets the value of the quoteOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteOption }
     *     
     */
    public void setQuoteOption(QuoteOption value) {
        this.quoteOption = value;
    }

    /**
     * Gets the value of the groupQuoteComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupQuoteComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupQuoteComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupQuoteCommentsType }
     * 
     * 
     */
    public List<GroupQuoteCommentsType> getGroupQuoteComments() {
        if (groupQuoteComments == null) {
            groupQuoteComments = new ArrayList<GroupQuoteCommentsType>();
        }
        return this.groupQuoteComments;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountPaid }
     *     
     */
    public TotalAmountPaid getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountPaid }
     *     
     */
    public void setDepositAmount(TotalAmountPaid value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the groupQuoteAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupQuoteAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupQuoteAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupQuoteAmount }
     * 
     * 
     */
    public List<GroupQuoteAmount> getGroupQuoteAmount() {
        if (groupQuoteAmount == null) {
            groupQuoteAmount = new ArrayList<GroupQuoteAmount>();
        }
        return this.groupQuoteAmount;
    }

    /**
     * Gets the value of the creatorChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorChannelCode() {
        return creatorChannelCode;
    }

    /**
     * Sets the value of the creatorChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorChannelCode(String value) {
        this.creatorChannelCode = value;
    }

    /**
     * Gets the value of the creatorChannelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorChannelType() {
        return creatorChannelType;
    }

    /**
     * Sets the value of the creatorChannelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorChannelType(String value) {
        this.creatorChannelType = value;
    }

    /**
     * Gets the value of the creationdateinAgentOfficeTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationdateinAgentOfficeTimeZone() {
        return creationdateinAgentOfficeTimeZone;
    }

    /**
     * Sets the value of the creationdateinAgentOfficeTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationdateinAgentOfficeTimeZone(XMLGregorianCalendar value) {
        this.creationdateinAgentOfficeTimeZone = value;
    }

    /**
     * Gets the value of the modifiedDateInAgentOfficeTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDateInAgentOfficeTimeZone() {
        return modifiedDateInAgentOfficeTimeZone;
    }

    /**
     * Sets the value of the modifiedDateInAgentOfficeTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDateInAgentOfficeTimeZone(XMLGregorianCalendar value) {
        this.modifiedDateInAgentOfficeTimeZone = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setErrorType(ErrorType value) {
        this.errorType = value;
    }

}
