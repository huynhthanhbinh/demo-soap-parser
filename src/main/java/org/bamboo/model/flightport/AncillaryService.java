
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceKeyword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SettlementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFICCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFICSubCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBundle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BundlePriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludedAncillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}IncludedAncillaries" minOccurs="0"/>
 *         &lt;element name="IsFreeBaggageAllowance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation"/>
 *         &lt;element name="TaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetailsPerGuest" maxOccurs="unbounded"/>
 *         &lt;element name="PassengerList" type="{http://www.ibsplc.com/iRes/simpleTypes/}PassengerList"/>
 *         &lt;element name="SegmentIds" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentIds"/>
 *         &lt;element name="AncillarySegmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillarySegmentDetailType" maxOccurs="unbounded"/>
 *         &lt;element name="CheckedBaggageDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckedBaggageDetails"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryService", propOrder = {
    "serviceCode",
    "serviceName",
    "serviceCategory",
    "serviceKeyword",
    "settlementCode",
    "rficCode",
    "rficSubCode",
    "feeMethod",
    "subCodeDescription",
    "isBundle",
    "bundlePriority",
    "includedAncillaries",
    "isFreeBaggageAllowance",
    "feeInformation",
    "taxDetails",
    "passengerList",
    "segmentIds",
    "ancillarySegmentDetails",
    "checkedBaggageDetails"
})
public class AncillaryService {

    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "ServiceCategory")
    protected String serviceCategory;
    @XmlElement(name = "ServiceKeyword", required = true)
    protected String serviceKeyword;
    @XmlElement(name = "SettlementCode")
    protected String settlementCode;
    @XmlElement(name = "RFICCode")
    protected String rficCode;
    @XmlElement(name = "RFICSubCode", required = true)
    protected String rficSubCode;
    @XmlElement(name = "FeeMethod")
    protected String feeMethod;
    @XmlElement(name = "SubCodeDescription")
    protected String subCodeDescription;
    @XmlElement(name = "IsBundle")
    protected Boolean isBundle;
    @XmlElement(name = "BundlePriority")
    protected String bundlePriority;
    @XmlElement(name = "IncludedAncillaries")
    protected IncludedAncillaries includedAncillaries;
    @XmlElement(name = "IsFreeBaggageAllowance")
    protected Boolean isFreeBaggageAllowance;
    @XmlElement(name = "FeeInformation", required = true)
    protected FeeInformation feeInformation;
    @XmlElement(name = "TaxDetails", required = true)
    protected List<TaxDetailsPerGuest> taxDetails;
    @XmlElement(name = "PassengerList", required = true)
    protected PassengerList passengerList;
    @XmlElement(name = "SegmentIds", required = true)
    protected SegmentIds segmentIds;
    @XmlElement(name = "AncillarySegmentDetails", required = true)
    protected List<AncillarySegmentDetailType> ancillarySegmentDetails;
    @XmlElement(name = "CheckedBaggageDetails", required = true)
    protected CheckedBaggageDetails checkedBaggageDetails;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategory(String value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the serviceKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceKeyword() {
        return serviceKeyword;
    }

    /**
     * Sets the value of the serviceKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceKeyword(String value) {
        this.serviceKeyword = value;
    }

    /**
     * Gets the value of the settlementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCode() {
        return settlementCode;
    }

    /**
     * Sets the value of the settlementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCode(String value) {
        this.settlementCode = value;
    }

    /**
     * Gets the value of the rficCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFICCode() {
        return rficCode;
    }

    /**
     * Sets the value of the rficCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFICCode(String value) {
        this.rficCode = value;
    }

    /**
     * Gets the value of the rficSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFICSubCode() {
        return rficSubCode;
    }

    /**
     * Sets the value of the rficSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFICSubCode(String value) {
        this.rficSubCode = value;
    }

    /**
     * Gets the value of the feeMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeMethod() {
        return feeMethod;
    }

    /**
     * Sets the value of the feeMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeMethod(String value) {
        this.feeMethod = value;
    }

    /**
     * Gets the value of the subCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCodeDescription() {
        return subCodeDescription;
    }

    /**
     * Sets the value of the subCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCodeDescription(String value) {
        this.subCodeDescription = value;
    }

    /**
     * Gets the value of the isBundle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBundle() {
        return isBundle;
    }

    /**
     * Sets the value of the isBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBundle(Boolean value) {
        this.isBundle = value;
    }

    /**
     * Gets the value of the bundlePriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundlePriority() {
        return bundlePriority;
    }

    /**
     * Sets the value of the bundlePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundlePriority(String value) {
        this.bundlePriority = value;
    }

    /**
     * Gets the value of the includedAncillaries property.
     * 
     * @return
     *     possible object is
     *     {@link IncludedAncillaries }
     *     
     */
    public IncludedAncillaries getIncludedAncillaries() {
        return includedAncillaries;
    }

    /**
     * Sets the value of the includedAncillaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludedAncillaries }
     *     
     */
    public void setIncludedAncillaries(IncludedAncillaries value) {
        this.includedAncillaries = value;
    }

    /**
     * Gets the value of the isFreeBaggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFreeBaggageAllowance() {
        return isFreeBaggageAllowance;
    }

    /**
     * Sets the value of the isFreeBaggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFreeBaggageAllowance(Boolean value) {
        this.isFreeBaggageAllowance = value;
    }

    /**
     * Gets the value of the feeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FeeInformation }
     *     
     */
    public FeeInformation getFeeInformation() {
        return feeInformation;
    }

    /**
     * Sets the value of the feeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInformation }
     *     
     */
    public void setFeeInformation(FeeInformation value) {
        this.feeInformation = value;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailsPerGuest }
     * 
     * 
     */
    public List<TaxDetailsPerGuest> getTaxDetails() {
        if (taxDetails == null) {
            taxDetails = new ArrayList<TaxDetailsPerGuest>();
        }
        return this.taxDetails;
    }

    /**
     * Gets the value of the passengerList property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerList }
     *     
     */
    public PassengerList getPassengerList() {
        return passengerList;
    }

    /**
     * Sets the value of the passengerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerList }
     *     
     */
    public void setPassengerList(PassengerList value) {
        this.passengerList = value;
    }

    /**
     * Gets the value of the segmentIds property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentIds }
     *     
     */
    public SegmentIds getSegmentIds() {
        return segmentIds;
    }

    /**
     * Sets the value of the segmentIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentIds }
     *     
     */
    public void setSegmentIds(SegmentIds value) {
        this.segmentIds = value;
    }

    /**
     * Gets the value of the ancillarySegmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillarySegmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillarySegmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillarySegmentDetailType }
     * 
     * 
     */
    public List<AncillarySegmentDetailType> getAncillarySegmentDetails() {
        if (ancillarySegmentDetails == null) {
            ancillarySegmentDetails = new ArrayList<AncillarySegmentDetailType>();
        }
        return this.ancillarySegmentDetails;
    }

    /**
     * Gets the value of the checkedBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CheckedBaggageDetails }
     *     
     */
    public CheckedBaggageDetails getCheckedBaggageDetails() {
        return checkedBaggageDetails;
    }

    /**
     * Sets the value of the checkedBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckedBaggageDetails }
     *     
     */
    public void setCheckedBaggageDetails(CheckedBaggageDetails value) {
        this.checkedBaggageDetails = value;
    }

    /**
     * Gets the value of the richContentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichContentRef() {
        return richContentRef;
    }

    /**
     * Sets the value of the richContentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichContentRef(String value) {
        this.richContentRef = value;
    }

}
