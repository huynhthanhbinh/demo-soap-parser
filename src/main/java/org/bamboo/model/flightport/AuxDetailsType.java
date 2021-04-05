
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuxDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuxDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuxId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AuxKeyword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AuxCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CarRentalDetailsType" minOccurs="0"/>
 *         &lt;element name="InsuranceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}InsuranceDetailsType" minOccurs="0"/>
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxStatusType" minOccurs="0"/>
 *         &lt;element name="CanSendMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuxDetailsType", propOrder = {
    "auxId",
    "auxKeyword",
    "auxCategory",
    "remarks",
    "carDetails",
    "insuranceDetails",
    "feeInformation",
    "status",
    "canSendMail",
    "emailAddress",
    "guestID"
})
public class AuxDetailsType {

    @XmlElement(name = "AuxId")
    protected Long auxId;
    @XmlElement(name = "AuxKeyword", required = true)
    protected String auxKeyword;
    @XmlElement(name = "AuxCategory", required = true)
    protected String auxCategory;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "CarDetails")
    protected CarRentalDetailsType carDetails;
    @XmlElement(name = "InsuranceDetails")
    protected InsuranceDetailsType insuranceDetails;
    @XmlElement(name = "FeeInformation")
    protected FeeInformation feeInformation;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected AuxStatusType status;
    @XmlElement(name = "CanSendMail")
    protected Boolean canSendMail;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "GuestID")
    protected String guestID;

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
     * Gets the value of the carDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CarRentalDetailsType }
     *     
     */
    public CarRentalDetailsType getCarDetails() {
        return carDetails;
    }

    /**
     * Sets the value of the carDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarRentalDetailsType }
     *     
     */
    public void setCarDetails(CarRentalDetailsType value) {
        this.carDetails = value;
    }

    /**
     * Gets the value of the insuranceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceDetailsType }
     *     
     */
    public InsuranceDetailsType getInsuranceDetails() {
        return insuranceDetails;
    }

    /**
     * Sets the value of the insuranceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceDetailsType }
     *     
     */
    public void setInsuranceDetails(InsuranceDetailsType value) {
        this.insuranceDetails = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AuxStatusType }
     *     
     */
    public AuxStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuxStatusType }
     *     
     */
    public void setStatus(AuxStatusType value) {
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
     * Gets the value of the guestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestID() {
        return guestID;
    }

    /**
     * Sets the value of the guestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestID(String value) {
        this.guestID = value;
    }

}
