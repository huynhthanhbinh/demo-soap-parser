
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ancillary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ancillary">
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
 *         &lt;element name="IncludedAncillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}IncludedAncillariesType" minOccurs="0"/>
 *         &lt;element name="SubSSRList" type="{http://www.ibsplc.com/iRes/simpleTypes/}SubSSRListType" minOccurs="0"/>
 *         &lt;element name="Fee" type="{http://www.ibsplc.com/iRes/simpleTypes/}Fee" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.ibsplc.com/iRes/simpleTypes/}Tax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AncillarySegmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillarySegmentDetailType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsSubSsrPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsBundle" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BundlePriority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsFeePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MetaDataRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PaxRefID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ancillary", propOrder = {
    "serviceCode",
    "serviceName",
    "serviceCategory",
    "serviceKeyword",
    "settlementCode",
    "rficCode",
    "rficSubCode",
    "feeMethod",
    "subCodeDescription",
    "includedAncillaries",
    "subSSRList",
    "fee",
    "tax",
    "ancillarySegmentDetails"
})
public class Ancillary {

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
    @XmlElement(name = "IncludedAncillaries")
    protected IncludedAncillariesType includedAncillaries;
    @XmlElement(name = "SubSSRList")
    protected SubSSRListType subSSRList;
    @XmlElement(name = "Fee")
    protected Fee fee;
    @XmlElement(name = "Tax")
    protected List<Tax> tax;
    @XmlElement(name = "AncillarySegmentDetails", required = true)
    protected List<AncillarySegmentDetailType> ancillarySegmentDetails;
    @XmlAttribute(name = "IsSubSsrPresent")
    protected Boolean isSubSsrPresent;
    @XmlAttribute(name = "IsBundle")
    protected Boolean isBundle;
    @XmlAttribute(name = "BundlePriority")
    protected String bundlePriority;
    @XmlAttribute(name = "IsFeePresent")
    protected Boolean isFeePresent;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;
    @XmlAttribute(name = "MetaDataRef")
    protected String metaDataRef;
    @XmlAttribute(name = "PaxRefID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> paxRefID;

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
     * Gets the value of the includedAncillaries property.
     * 
     * @return
     *     possible object is
     *     {@link IncludedAncillariesType }
     *     
     */
    public IncludedAncillariesType getIncludedAncillaries() {
        return includedAncillaries;
    }

    /**
     * Sets the value of the includedAncillaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludedAncillariesType }
     *     
     */
    public void setIncludedAncillaries(IncludedAncillariesType value) {
        this.includedAncillaries = value;
    }

    /**
     * Gets the value of the subSSRList property.
     * 
     * @return
     *     possible object is
     *     {@link SubSSRListType }
     *     
     */
    public SubSSRListType getSubSSRList() {
        return subSSRList;
    }

    /**
     * Sets the value of the subSSRList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubSSRListType }
     *     
     */
    public void setSubSSRList(SubSSRListType value) {
        this.subSSRList = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Fee }
     *     
     */
    public Fee getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fee }
     *     
     */
    public void setFee(Fee value) {
        this.fee = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax }
     * 
     * 
     */
    public List<Tax> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax>();
        }
        return this.tax;
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
     * Gets the value of the isSubSsrPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubSsrPresent() {
        return isSubSsrPresent;
    }

    /**
     * Sets the value of the isSubSsrPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubSsrPresent(Boolean value) {
        this.isSubSsrPresent = value;
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
     * Gets the value of the isFeePresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeePresent() {
        return isFeePresent;
    }

    /**
     * Sets the value of the isFeePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeePresent(Boolean value) {
        this.isFeePresent = value;
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

    /**
     * Gets the value of the metaDataRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataRef() {
        return metaDataRef;
    }

    /**
     * Sets the value of the metaDataRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataRef(String value) {
        this.metaDataRef = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<Object>();
        }
        return this.paxRefID;
    }

}
