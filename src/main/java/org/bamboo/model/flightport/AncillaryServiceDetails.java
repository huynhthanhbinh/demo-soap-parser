
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryServiceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncludedAncillariesInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}IncludedAncillariesInfo" maxOccurs="unbounded"/>
 *         &lt;element name="AncillaryFeeInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillaryFeeInfo"/>
 *         &lt;element name="AncillarySegmentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillarySegmentInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ServiceCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceCategory" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsBundle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BundlePriority" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryServiceDetails", propOrder = {
    "includedAncillariesInfo",
    "ancillaryFeeInfo",
    "ancillarySegmentInfo"
})
public class AncillaryServiceDetails {

    @XmlElement(name = "IncludedAncillariesInfo", required = true)
    protected List<IncludedAncillariesInfo> includedAncillariesInfo;
    @XmlElement(name = "AncillaryFeeInfo", required = true)
    protected AncillaryFeeInfo ancillaryFeeInfo;
    @XmlElement(name = "AncillarySegmentInfo", required = true)
    protected List<AncillarySegmentInfo> ancillarySegmentInfo;
    @XmlAttribute(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlAttribute(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlAttribute(name = "ServiceCategory", required = true)
    protected String serviceCategory;
    @XmlAttribute(name = "IsBundle", required = true)
    protected boolean isBundle;
    @XmlAttribute(name = "BundlePriority", required = true)
    protected String bundlePriority;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * Gets the value of the includedAncillariesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedAncillariesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedAncillariesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludedAncillariesInfo }
     * 
     * 
     */
    public List<IncludedAncillariesInfo> getIncludedAncillariesInfo() {
        if (includedAncillariesInfo == null) {
            includedAncillariesInfo = new ArrayList<IncludedAncillariesInfo>();
        }
        return this.includedAncillariesInfo;
    }

    /**
     * Gets the value of the ancillaryFeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryFeeInfo }
     *     
     */
    public AncillaryFeeInfo getAncillaryFeeInfo() {
        return ancillaryFeeInfo;
    }

    /**
     * Sets the value of the ancillaryFeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryFeeInfo }
     *     
     */
    public void setAncillaryFeeInfo(AncillaryFeeInfo value) {
        this.ancillaryFeeInfo = value;
    }

    /**
     * Gets the value of the ancillarySegmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillarySegmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillarySegmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillarySegmentInfo }
     * 
     * 
     */
    public List<AncillarySegmentInfo> getAncillarySegmentInfo() {
        if (ancillarySegmentInfo == null) {
            ancillarySegmentInfo = new ArrayList<AncillarySegmentInfo>();
        }
        return this.ancillarySegmentInfo;
    }

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
     * Gets the value of the isBundle property.
     * 
     */
    public boolean isIsBundle() {
        return isBundle;
    }

    /**
     * Sets the value of the isBundle property.
     * 
     */
    public void setIsBundle(boolean value) {
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
