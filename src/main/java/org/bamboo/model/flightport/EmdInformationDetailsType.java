
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
 * <p>Java class for EmdInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmdInformationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RficCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponDetailsInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}CouponDetailsTypeInfo" maxOccurs="unbounded"/>
 *         &lt;element name="Paxid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmdInformationDetailsType", propOrder = {
    "rficCode",
    "emdType",
    "emdNumber",
    "couponDetailsInfo",
    "paxid",
    "issueDate"
})
public class EmdInformationDetailsType {

    @XmlElement(name = "RficCode", required = true)
    protected String rficCode;
    @XmlElement(name = "EMDType")
    protected String emdType;
    @XmlElement(name = "EMDNumber")
    protected String emdNumber;
    @XmlElement(name = "CouponDetailsInfo", required = true)
    protected List<CouponDetailsTypeInfo> couponDetailsInfo;
    @XmlElement(name = "Paxid")
    protected Long paxid;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;

    /**
     * Gets the value of the rficCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRficCode() {
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
    public void setRficCode(String value) {
        this.rficCode = value;
    }

    /**
     * Gets the value of the emdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDType() {
        return emdType;
    }

    /**
     * Sets the value of the emdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDType(String value) {
        this.emdType = value;
    }

    /**
     * Gets the value of the emdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDNumber() {
        return emdNumber;
    }

    /**
     * Sets the value of the emdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDNumber(String value) {
        this.emdNumber = value;
    }

    /**
     * Gets the value of the couponDetailsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponDetailsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponDetailsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponDetailsTypeInfo }
     * 
     * 
     */
    public List<CouponDetailsTypeInfo> getCouponDetailsInfo() {
        if (couponDetailsInfo == null) {
            couponDetailsInfo = new ArrayList<CouponDetailsTypeInfo>();
        }
        return this.couponDetailsInfo;
    }

    /**
     * Gets the value of the paxid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaxid() {
        return paxid;
    }

    /**
     * Sets the value of the paxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaxid(Long value) {
        this.paxid = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

}
