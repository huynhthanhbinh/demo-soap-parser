
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupPaxDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupPaxDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupLeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeaderTitle" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameTitle_Type" minOccurs="0"/>
 *         &lt;element name="LeaderFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LeaderMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LeaderLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SpecialHandlingReqdIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasGroupFormReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GroupQuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupPaxDetailsType", propOrder = {
    "groupName",
    "groupType",
    "groupLeader",
    "profileId",
    "profileAlias",
    "guestProfileId",
    "leaderTitle",
    "leaderFirstName",
    "leaderMiddleName",
    "leaderLastName",
    "specialHandlingReqdIndicator",
    "hasGroupFormReceived",
    "groupQuoteNumber"
})
public class GroupPaxDetailsType {

    @XmlElement(name = "GroupName", required = true)
    protected String groupName;
    @XmlElement(name = "GroupType", required = true)
    protected String groupType;
    @XmlElement(name = "GroupLeader")
    protected String groupLeader;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "ProfileAlias")
    protected String profileAlias;
    @XmlElement(name = "GuestProfileId")
    protected String guestProfileId;
    @XmlElement(name = "LeaderTitle")
    @XmlSchemaType(name = "string")
    protected NameTitleType leaderTitle;
    @XmlElement(name = "LeaderFirstName", required = true)
    protected String leaderFirstName;
    @XmlElement(name = "LeaderMiddleName", required = true)
    protected String leaderMiddleName;
    @XmlElement(name = "LeaderLastName", required = true)
    protected String leaderLastName;
    @XmlElement(name = "SpecialHandlingReqdIndicator")
    protected boolean specialHandlingReqdIndicator;
    @XmlElement(name = "HasGroupFormReceived")
    protected boolean hasGroupFormReceived;
    @XmlElement(name = "GroupQuoteNumber")
    protected String groupQuoteNumber;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the groupLeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLeader() {
        return groupLeader;
    }

    /**
     * Sets the value of the groupLeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLeader(String value) {
        this.groupLeader = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the profileAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileAlias() {
        return profileAlias;
    }

    /**
     * Sets the value of the profileAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileAlias(String value) {
        this.profileAlias = value;
    }

    /**
     * Gets the value of the guestProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestProfileId() {
        return guestProfileId;
    }

    /**
     * Sets the value of the guestProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestProfileId(String value) {
        this.guestProfileId = value;
    }

    /**
     * Gets the value of the leaderTitle property.
     * 
     * @return
     *     possible object is
     *     {@link NameTitleType }
     *     
     */
    public NameTitleType getLeaderTitle() {
        return leaderTitle;
    }

    /**
     * Sets the value of the leaderTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTitleType }
     *     
     */
    public void setLeaderTitle(NameTitleType value) {
        this.leaderTitle = value;
    }

    /**
     * Gets the value of the leaderFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderFirstName() {
        return leaderFirstName;
    }

    /**
     * Sets the value of the leaderFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderFirstName(String value) {
        this.leaderFirstName = value;
    }

    /**
     * Gets the value of the leaderMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderMiddleName() {
        return leaderMiddleName;
    }

    /**
     * Sets the value of the leaderMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderMiddleName(String value) {
        this.leaderMiddleName = value;
    }

    /**
     * Gets the value of the leaderLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderLastName() {
        return leaderLastName;
    }

    /**
     * Sets the value of the leaderLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderLastName(String value) {
        this.leaderLastName = value;
    }

    /**
     * Gets the value of the specialHandlingReqdIndicator property.
     * 
     */
    public boolean isSpecialHandlingReqdIndicator() {
        return specialHandlingReqdIndicator;
    }

    /**
     * Sets the value of the specialHandlingReqdIndicator property.
     * 
     */
    public void setSpecialHandlingReqdIndicator(boolean value) {
        this.specialHandlingReqdIndicator = value;
    }

    /**
     * Gets the value of the hasGroupFormReceived property.
     * 
     */
    public boolean isHasGroupFormReceived() {
        return hasGroupFormReceived;
    }

    /**
     * Sets the value of the hasGroupFormReceived property.
     * 
     */
    public void setHasGroupFormReceived(boolean value) {
        this.hasGroupFormReceived = value;
    }

    /**
     * Gets the value of the groupQuoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupQuoteNumber() {
        return groupQuoteNumber;
    }

    /**
     * Sets the value of the groupQuoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupQuoteNumber(String value) {
        this.groupQuoteNumber = value;
    }

}
