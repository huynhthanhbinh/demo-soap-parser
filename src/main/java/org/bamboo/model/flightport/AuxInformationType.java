
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuxInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuxInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuxId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AuxKeyword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AuxCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuxFieldDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxFieldDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxStatusDetails_Type" minOccurs="0"/>
 *         &lt;element name="CanSendMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AuxInformationType", propOrder = {
    "auxId",
    "auxKeyword",
    "auxCategory",
    "remarks",
    "auxFieldDetailsType",
    "guestId",
    "status",
    "canSendMail",
    "emailAddress",
    "segmentId"
})
public class AuxInformationType {

    @XmlElement(name = "AuxId")
    protected Long auxId;
    @XmlElement(name = "AuxKeyword", required = true)
    protected String auxKeyword;
    @XmlElement(name = "AuxCategory", required = true)
    protected String auxCategory;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "AuxFieldDetailsType")
    protected List<AuxFieldDetailsType> auxFieldDetailsType;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected AuxStatusDetailsType status;
    @XmlElement(name = "CanSendMail")
    protected Boolean canSendMail;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "SegmentId")
    protected String segmentId;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * Gets the value of the auxId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuxId() {
        return auxId;
    }

    /**
     * Sets the value of the auxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuxId(Long value) {
        this.auxId = value;
    }

    /**
     * Gets the value of the auxKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxKeyword() {
        return auxKeyword;
    }

    /**
     * Sets the value of the auxKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxKeyword(String value) {
        this.auxKeyword = value;
    }

    /**
     * Gets the value of the auxCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxCategory() {
        return auxCategory;
    }

    /**
     * Sets the value of the auxCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxCategory(String value) {
        this.auxCategory = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the auxFieldDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxFieldDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxFieldDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxFieldDetailsType }
     * 
     * 
     */
    public List<AuxFieldDetailsType> getAuxFieldDetailsType() {
        if (auxFieldDetailsType == null) {
            auxFieldDetailsType = new ArrayList<AuxFieldDetailsType>();
        }
        return this.auxFieldDetailsType;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AuxStatusDetailsType }
     *     
     */
    public AuxStatusDetailsType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuxStatusDetailsType }
     *     
     */
    public void setStatus(AuxStatusDetailsType value) {
        this.status = value;
    }

    /**
     * Gets the value of the canSendMail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSendMail() {
        return canSendMail;
    }

    /**
     * Sets the value of the canSendMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSendMail(Boolean value) {
        this.canSendMail = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
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
