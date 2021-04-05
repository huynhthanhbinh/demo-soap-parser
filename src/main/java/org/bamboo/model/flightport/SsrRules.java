
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsrRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsrRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SsrKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentNeedLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxNeedLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestCountNeedLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAllSegmentMandatoryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAllPaxmandatoryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMultipleRequestFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMultiPaxFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UncombinableSsrs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrerequisiteSsrs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BundledSsrs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubSSRCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SSRPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SsrRuleText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsrRules", propOrder = {
    "ssrKeyword",
    "segmentNeedLevel",
    "paxNeedLevel",
    "requestCountNeedLevel",
    "isAllSegmentMandatoryFlag",
    "isAllPaxmandatoryFlag",
    "isMultipleRequestFlag",
    "isMultiPaxFlag",
    "feeCode",
    "uncombinableSsrs",
    "prerequisiteSsrs",
    "bundledSsrs",
    "subSSRCodes",
    "ssrPriority",
    "ssrRuleText"
})
public class SsrRules {

    @XmlElement(name = "SsrKeyword")
    protected String ssrKeyword;
    @XmlElement(name = "SegmentNeedLevel")
    protected String segmentNeedLevel;
    @XmlElement(name = "PaxNeedLevel")
    protected String paxNeedLevel;
    @XmlElement(name = "RequestCountNeedLevel")
    protected String requestCountNeedLevel;
    @XmlElement(name = "IsAllSegmentMandatoryFlag")
    protected Boolean isAllSegmentMandatoryFlag;
    @XmlElement(name = "IsAllPaxmandatoryFlag")
    protected Boolean isAllPaxmandatoryFlag;
    @XmlElement(name = "IsMultipleRequestFlag")
    protected Boolean isMultipleRequestFlag;
    @XmlElement(name = "IsMultiPaxFlag")
    protected Boolean isMultiPaxFlag;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "UncombinableSsrs")
    protected List<String> uncombinableSsrs;
    @XmlElement(name = "PrerequisiteSsrs")
    protected List<String> prerequisiteSsrs;
    @XmlElement(name = "BundledSsrs")
    protected List<String> bundledSsrs;
    @XmlElement(name = "SubSSRCodes")
    protected List<String> subSSRCodes;
    @XmlElement(name = "SSRPriority")
    protected String ssrPriority;
    @XmlElement(name = "SsrRuleText")
    protected String ssrRuleText;

    /**
     * Gets the value of the ssrKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrKeyword() {
        return ssrKeyword;
    }

    /**
     * Sets the value of the ssrKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrKeyword(String value) {
        this.ssrKeyword = value;
    }

    /**
     * Gets the value of the segmentNeedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentNeedLevel() {
        return segmentNeedLevel;
    }

    /**
     * Sets the value of the segmentNeedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentNeedLevel(String value) {
        this.segmentNeedLevel = value;
    }

    /**
     * Gets the value of the paxNeedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxNeedLevel() {
        return paxNeedLevel;
    }

    /**
     * Sets the value of the paxNeedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxNeedLevel(String value) {
        this.paxNeedLevel = value;
    }

    /**
     * Gets the value of the requestCountNeedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCountNeedLevel() {
        return requestCountNeedLevel;
    }

    /**
     * Sets the value of the requestCountNeedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCountNeedLevel(String value) {
        this.requestCountNeedLevel = value;
    }

    /**
     * Gets the value of the isAllSegmentMandatoryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllSegmentMandatoryFlag() {
        return isAllSegmentMandatoryFlag;
    }

    /**
     * Sets the value of the isAllSegmentMandatoryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllSegmentMandatoryFlag(Boolean value) {
        this.isAllSegmentMandatoryFlag = value;
    }

    /**
     * Gets the value of the isAllPaxmandatoryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllPaxmandatoryFlag() {
        return isAllPaxmandatoryFlag;
    }

    /**
     * Sets the value of the isAllPaxmandatoryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllPaxmandatoryFlag(Boolean value) {
        this.isAllPaxmandatoryFlag = value;
    }

    /**
     * Gets the value of the isMultipleRequestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultipleRequestFlag() {
        return isMultipleRequestFlag;
    }

    /**
     * Sets the value of the isMultipleRequestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultipleRequestFlag(Boolean value) {
        this.isMultipleRequestFlag = value;
    }

    /**
     * Gets the value of the isMultiPaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiPaxFlag() {
        return isMultiPaxFlag;
    }

    /**
     * Sets the value of the isMultiPaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiPaxFlag(Boolean value) {
        this.isMultiPaxFlag = value;
    }

    /**
     * Gets the value of the feeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the uncombinableSsrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uncombinableSsrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUncombinableSsrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUncombinableSsrs() {
        if (uncombinableSsrs == null) {
            uncombinableSsrs = new ArrayList<String>();
        }
        return this.uncombinableSsrs;
    }

    /**
     * Gets the value of the prerequisiteSsrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prerequisiteSsrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrerequisiteSsrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrerequisiteSsrs() {
        if (prerequisiteSsrs == null) {
            prerequisiteSsrs = new ArrayList<String>();
        }
        return this.prerequisiteSsrs;
    }

    /**
     * Gets the value of the bundledSsrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundledSsrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundledSsrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBundledSsrs() {
        if (bundledSsrs == null) {
            bundledSsrs = new ArrayList<String>();
        }
        return this.bundledSsrs;
    }

    /**
     * Gets the value of the subSSRCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSSRCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSSRCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubSSRCodes() {
        if (subSSRCodes == null) {
            subSSRCodes = new ArrayList<String>();
        }
        return this.subSSRCodes;
    }

    /**
     * Gets the value of the ssrPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRPriority() {
        return ssrPriority;
    }

    /**
     * Sets the value of the ssrPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRPriority(String value) {
        this.ssrPriority = value;
    }

    /**
     * Gets the value of the ssrRuleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrRuleText() {
        return ssrRuleText;
    }

    /**
     * Sets the value of the ssrRuleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrRuleText(String value) {
        this.ssrRuleText = value;
    }

}
