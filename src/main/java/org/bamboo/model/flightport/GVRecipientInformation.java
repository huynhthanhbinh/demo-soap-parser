
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GVRecipientInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GVRecipientInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameAndAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}GiftVoucherNameAndAddress"/>
 *         &lt;element name="recipientType" type="{http://www.ibsplc.com/iRes/simpleTypes/}RecipientType"/>
 *         &lt;element name="recipientProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="membershipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GVRecipientInformation", propOrder = {
    "nameAndAddress",
    "recipientType",
    "recipientProfileId",
    "membershipNumber",
    "password"
})
public class GVRecipientInformation {

    @XmlElement(required = true)
    protected GiftVoucherNameAndAddress nameAndAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RecipientType recipientType;
    protected String recipientProfileId;
    protected String membershipNumber;
    protected String password;

    /**
     * Gets the value of the nameAndAddress property.
     * 
     * @return
     *     possible object is
     *     {@link GiftVoucherNameAndAddress }
     *     
     */
    public GiftVoucherNameAndAddress getNameAndAddress() {
        return nameAndAddress;
    }

    /**
     * Sets the value of the nameAndAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftVoucherNameAndAddress }
     *     
     */
    public void setNameAndAddress(GiftVoucherNameAndAddress value) {
        this.nameAndAddress = value;
    }

    /**
     * Gets the value of the recipientType property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientType }
     *     
     */
    public RecipientType getRecipientType() {
        return recipientType;
    }

    /**
     * Sets the value of the recipientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientType }
     *     
     */
    public void setRecipientType(RecipientType value) {
        this.recipientType = value;
    }

    /**
     * Gets the value of the recipientProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientProfileId() {
        return recipientProfileId;
    }

    /**
     * Sets the value of the recipientProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientProfileId(String value) {
        this.recipientProfileId = value;
    }

    /**
     * Gets the value of the membershipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipNumber() {
        return membershipNumber;
    }

    /**
     * Sets the value of the membershipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipNumber(String value) {
        this.membershipNumber = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
