
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSRInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSRInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IataSsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssrRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSRId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ssrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssrDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSRStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SsrAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubSsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfRequests" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SSRComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SsrFieldDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrFieldDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChildSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}ChildSsrsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IsParentSSR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParentSSRId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SeatId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SsrFieldMetaData" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrFieldMetaDataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SSRInformationType", propOrder = {
    "ssrCode",
    "iataSsrCode",
    "ssrType",
    "ssrRemarks",
    "ssrId",
    "ssrName",
    "ssrDescription",
    "ssrStatus",
    "ssrAirlineCode",
    "subSsrCode",
    "numberOfRequests",
    "ssrComments",
    "guestId",
    "ssrFieldDetailsType",
    "segmentId",
    "childSsrs",
    "isParentSSR",
    "parentSSRId",
    "seatId",
    "ssrFieldMetaData"
})
public class SSRInformationType {

    @XmlElement(required = true)
    protected String ssrCode;
    @XmlElement(name = "IataSsrCode")
    protected String iataSsrCode;
    protected String ssrType;
    protected String ssrRemarks;
    @XmlElement(name = "SSRId")
    protected Long ssrId;
    protected String ssrName;
    protected String ssrDescription;
    @XmlElement(name = "SSRStatus")
    protected String ssrStatus;
    @XmlElement(name = "SsrAirlineCode")
    protected String ssrAirlineCode;
    @XmlElement(name = "SubSsrCode")
    protected String subSsrCode;
    @XmlElement(name = "NumberOfRequests")
    protected Integer numberOfRequests;
    @XmlElement(name = "SSRComments")
    protected String ssrComments;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "SsrFieldDetailsType")
    protected List<SsrFieldDetailsType> ssrFieldDetailsType;
    @XmlElement(name = "SegmentId")
    protected List<String> segmentId;
    @XmlElement(name = "ChildSsrs")
    protected List<ChildSsrsType> childSsrs;
    @XmlElement(name = "IsParentSSR")
    protected Boolean isParentSSR;
    @XmlElement(name = "ParentSSRId")
    protected Long parentSSRId;
    @XmlElement(name = "SeatId")
    protected Long seatId;
    @XmlElement(name = "SsrFieldMetaData")
    protected List<SsrFieldMetaDataType> ssrFieldMetaData;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrCode(String value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the iataSsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataSsrCode() {
        return iataSsrCode;
    }

    /**
     * Sets the value of the iataSsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataSsrCode(String value) {
        this.iataSsrCode = value;
    }

    /**
     * Gets the value of the ssrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrType() {
        return ssrType;
    }

    /**
     * Sets the value of the ssrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrType(String value) {
        this.ssrType = value;
    }

    /**
     * Gets the value of the ssrRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrRemarks() {
        return ssrRemarks;
    }

    /**
     * Sets the value of the ssrRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrRemarks(String value) {
        this.ssrRemarks = value;
    }

    /**
     * Gets the value of the ssrId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSSRId() {
        return ssrId;
    }

    /**
     * Sets the value of the ssrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSSRId(Long value) {
        this.ssrId = value;
    }

    /**
     * Gets the value of the ssrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrName() {
        return ssrName;
    }

    /**
     * Sets the value of the ssrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrName(String value) {
        this.ssrName = value;
    }

    /**
     * Gets the value of the ssrDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrDescription() {
        return ssrDescription;
    }

    /**
     * Sets the value of the ssrDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrDescription(String value) {
        this.ssrDescription = value;
    }

    /**
     * Gets the value of the ssrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRStatus() {
        return ssrStatus;
    }

    /**
     * Sets the value of the ssrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRStatus(String value) {
        this.ssrStatus = value;
    }

    /**
     * Gets the value of the ssrAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrAirlineCode() {
        return ssrAirlineCode;
    }

    /**
     * Sets the value of the ssrAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrAirlineCode(String value) {
        this.ssrAirlineCode = value;
    }

    /**
     * Gets the value of the subSsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSsrCode() {
        return subSsrCode;
    }

    /**
     * Sets the value of the subSsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSsrCode(String value) {
        this.subSsrCode = value;
    }

    /**
     * Gets the value of the numberOfRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRequests() {
        return numberOfRequests;
    }

    /**
     * Sets the value of the numberOfRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRequests(Integer value) {
        this.numberOfRequests = value;
    }

    /**
     * Gets the value of the ssrComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRComments() {
        return ssrComments;
    }

    /**
     * Sets the value of the ssrComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRComments(String value) {
        this.ssrComments = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the ssrFieldDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrFieldDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrFieldDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrFieldDetailsType }
     * 
     * 
     */
    public List<SsrFieldDetailsType> getSsrFieldDetailsType() {
        if (ssrFieldDetailsType == null) {
            ssrFieldDetailsType = new ArrayList<SsrFieldDetailsType>();
        }
        return this.ssrFieldDetailsType;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSegmentId() {
        if (segmentId == null) {
            segmentId = new ArrayList<String>();
        }
        return this.segmentId;
    }

    /**
     * Gets the value of the childSsrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childSsrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildSsrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildSsrsType }
     * 
     * 
     */
    public List<ChildSsrsType> getChildSsrs() {
        if (childSsrs == null) {
            childSsrs = new ArrayList<ChildSsrsType>();
        }
        return this.childSsrs;
    }

    /**
     * Gets the value of the isParentSSR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsParentSSR() {
        return isParentSSR;
    }

    /**
     * Sets the value of the isParentSSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsParentSSR(Boolean value) {
        this.isParentSSR = value;
    }

    /**
     * Gets the value of the parentSSRId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentSSRId() {
        return parentSSRId;
    }

    /**
     * Sets the value of the parentSSRId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentSSRId(Long value) {
        this.parentSSRId = value;
    }

    /**
     * Gets the value of the seatId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeatId() {
        return seatId;
    }

    /**
     * Sets the value of the seatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeatId(Long value) {
        this.seatId = value;
    }

    /**
     * Gets the value of the ssrFieldMetaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrFieldMetaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrFieldMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrFieldMetaDataType }
     * 
     * 
     */
    public List<SsrFieldMetaDataType> getSsrFieldMetaData() {
        if (ssrFieldMetaData == null) {
            ssrFieldMetaData = new ArrayList<SsrFieldMetaDataType>();
        }
        return this.ssrFieldMetaData;
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
