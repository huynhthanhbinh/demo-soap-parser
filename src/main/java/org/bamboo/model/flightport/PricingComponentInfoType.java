
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingComponentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingComponentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxBaseFare" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxBaseFareType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentLinkInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentLinkInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingComponentIndex" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareSubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsReturnRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FareId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingComponentInfoType", propOrder = {
    "paxBaseFare",
    "segmentLinkInfo"
})
public class PricingComponentInfoType {

    @XmlElement(name = "PaxBaseFare")
    protected List<PaxBaseFareType> paxBaseFare;
    @XmlElement(name = "SegmentLinkInfo")
    protected List<SegmentLinkInfoType> segmentLinkInfo;
    @XmlAttribute(name = "PricingComponentIndex")
    protected Long pricingComponentIndex;
    @XmlAttribute(name = "FareLevel")
    protected String fareLevel;
    @XmlAttribute(name = "FareBasis")
    protected String fareBasis;
    @XmlAttribute(name = "FareType")
    protected String fareType;
    @XmlAttribute(name = "FareSubType")
    protected String fareSubType;
    @XmlAttribute(name = "IsReturnRestricted")
    protected Boolean isReturnRestricted;
    @XmlAttribute(name = "FareId")
    protected String fareId;

    /**
     * Gets the value of the paxBaseFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxBaseFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxBaseFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxBaseFareType }
     * 
     * 
     */
    public List<PaxBaseFareType> getPaxBaseFare() {
        if (paxBaseFare == null) {
            paxBaseFare = new ArrayList<PaxBaseFareType>();
        }
        return this.paxBaseFare;
    }

    /**
     * Gets the value of the segmentLinkInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentLinkInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentLinkInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentLinkInfoType }
     * 
     * 
     */
    public List<SegmentLinkInfoType> getSegmentLinkInfo() {
        if (segmentLinkInfo == null) {
            segmentLinkInfo = new ArrayList<SegmentLinkInfoType>();
        }
        return this.segmentLinkInfo;
    }

    /**
     * Gets the value of the pricingComponentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPricingComponentIndex() {
        return pricingComponentIndex;
    }

    /**
     * Sets the value of the pricingComponentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPricingComponentIndex(Long value) {
        this.pricingComponentIndex = value;
    }

    /**
     * Gets the value of the fareLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevel() {
        return fareLevel;
    }

    /**
     * Sets the value of the fareLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevel(String value) {
        this.fareLevel = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

    /**
     * Gets the value of the fareSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareSubType() {
        return fareSubType;
    }

    /**
     * Sets the value of the fareSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareSubType(String value) {
        this.fareSubType = value;
    }

    /**
     * Gets the value of the isReturnRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReturnRestricted() {
        return isReturnRestricted;
    }

    /**
     * Sets the value of the isReturnRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReturnRestricted(Boolean value) {
        this.isReturnRestricted = value;
    }

    /**
     * Gets the value of the fareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareId() {
        return fareId;
    }

    /**
     * Sets the value of the fareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareId(String value) {
        this.fareId = value;
    }

}
