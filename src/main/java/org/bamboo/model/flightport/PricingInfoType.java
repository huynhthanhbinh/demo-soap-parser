
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxPricingInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxPricingInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PricingComponentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PricingComponentInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentReferenceInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentReferenceInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TripRefIndex" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OfferTLRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AncillaryServicesRefIndex" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingInfoType", propOrder = {
    "paxPricingInfo",
    "pricingComponentInfo",
    "segmentReferenceInfo"
})
public class PricingInfoType {

    @XmlElement(name = "PaxPricingInfo")
    protected List<PaxPricingInfoType> paxPricingInfo;
    @XmlElement(name = "PricingComponentInfo")
    protected List<PricingComponentInfoType> pricingComponentInfo;
    @XmlElement(name = "SegmentReferenceInfo")
    protected List<SegmentReferenceInfoType> segmentReferenceInfo;
    @XmlAttribute(name = "TripRefIndex")
    protected Long tripRefIndex;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;
    @XmlAttribute(name = "OfferTLRef")
    protected String offerTLRef;
    @XmlAttribute(name = "AncillaryServicesRefIndex")
    protected Long ancillaryServicesRefIndex;

    /**
     * Gets the value of the paxPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxPricingInfoType }
     * 
     * 
     */
    public List<PaxPricingInfoType> getPaxPricingInfo() {
        if (paxPricingInfo == null) {
            paxPricingInfo = new ArrayList<PaxPricingInfoType>();
        }
        return this.paxPricingInfo;
    }

    /**
     * Gets the value of the pricingComponentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingComponentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingComponentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingComponentInfoType }
     * 
     * 
     */
    public List<PricingComponentInfoType> getPricingComponentInfo() {
        if (pricingComponentInfo == null) {
            pricingComponentInfo = new ArrayList<PricingComponentInfoType>();
        }
        return this.pricingComponentInfo;
    }

    /**
     * Gets the value of the segmentReferenceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentReferenceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentReferenceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentReferenceInfoType }
     * 
     * 
     */
    public List<SegmentReferenceInfoType> getSegmentReferenceInfo() {
        if (segmentReferenceInfo == null) {
            segmentReferenceInfo = new ArrayList<SegmentReferenceInfoType>();
        }
        return this.segmentReferenceInfo;
    }

    /**
     * Gets the value of the tripRefIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTripRefIndex() {
        return tripRefIndex;
    }

    /**
     * Sets the value of the tripRefIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTripRefIndex(Long value) {
        this.tripRefIndex = value;
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
     * Gets the value of the offerTLRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTLRef() {
        return offerTLRef;
    }

    /**
     * Sets the value of the offerTLRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTLRef(String value) {
        this.offerTLRef = value;
    }

    /**
     * Gets the value of the ancillaryServicesRefIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAncillaryServicesRefIndex() {
        return ancillaryServicesRefIndex;
    }

    /**
     * Sets the value of the ancillaryServicesRefIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAncillaryServicesRefIndex(Long value) {
        this.ancillaryServicesRefIndex = value;
    }

}
