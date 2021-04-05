
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VPPDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VPPDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VPPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesManagerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionableAt" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommissionableAt"/>
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/>
 *         &lt;element name="EndDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/>
 *         &lt;element name="ContactType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ContactInformation"/>
 *         &lt;element name="VPPStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}VPPStatus"/>
 *         &lt;element name="SingleGVInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BulkGVInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyRegionalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DenominationType" type="{http://www.ibsplc.com/iRes/simpleTypes/}DenominationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VPPDetails", propOrder = {
    "airlineCode",
    "vppid",
    "companyName",
    "salesManagerID",
    "commissionableAt",
    "agencyCode",
    "startDate",
    "endDate",
    "contactType",
    "vppStatus",
    "singleGVInd",
    "bulkGVInd",
    "agencyName",
    "agencyRegionalName",
    "denominationType"
})
public class VPPDetails {

    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "VPPID", required = true)
    protected String vppid;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "SalesManagerID")
    protected String salesManagerID;
    @XmlElement(name = "CommissionableAt", required = true)
    @XmlSchemaType(name = "string")
    protected CommissionableAt commissionableAt;
    @XmlElement(name = "AgencyCode", required = true)
    protected String agencyCode;
    @XmlElement(name = "StartDate", required = true)
    protected DateOnlyType startDate;
    @XmlElement(name = "EndDate")
    protected DateOnlyType endDate;
    @XmlElement(name = "ContactType", required = true)
    protected ContactInformation contactType;
    @XmlElement(name = "VPPStatus", required = true)
    @XmlSchemaType(name = "string")
    protected VPPStatus vppStatus;
    @XmlElement(name = "SingleGVInd")
    protected String singleGVInd;
    @XmlElement(name = "BulkGVInd")
    protected String bulkGVInd;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "AgencyRegionalName")
    protected String agencyRegionalName;
    @XmlElement(name = "DenominationType", required = true)
    protected List<DenominationType> denominationType;

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the vppid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVPPID() {
        return vppid;
    }

    /**
     * Sets the value of the vppid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVPPID(String value) {
        this.vppid = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the salesManagerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesManagerID() {
        return salesManagerID;
    }

    /**
     * Sets the value of the salesManagerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesManagerID(String value) {
        this.salesManagerID = value;
    }

    /**
     * Gets the value of the commissionableAt property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionableAt }
     *     
     */
    public CommissionableAt getCommissionableAt() {
        return commissionableAt;
    }

    /**
     * Sets the value of the commissionableAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionableAt }
     *     
     */
    public void setCommissionableAt(CommissionableAt value) {
        this.commissionableAt = value;
    }

    /**
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setStartDate(DateOnlyType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setEndDate(DateOnlyType value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactType(ContactInformation value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the vppStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VPPStatus }
     *     
     */
    public VPPStatus getVPPStatus() {
        return vppStatus;
    }

    /**
     * Sets the value of the vppStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VPPStatus }
     *     
     */
    public void setVPPStatus(VPPStatus value) {
        this.vppStatus = value;
    }

    /**
     * Gets the value of the singleGVInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleGVInd() {
        return singleGVInd;
    }

    /**
     * Sets the value of the singleGVInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleGVInd(String value) {
        this.singleGVInd = value;
    }

    /**
     * Gets the value of the bulkGVInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkGVInd() {
        return bulkGVInd;
    }

    /**
     * Sets the value of the bulkGVInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkGVInd(String value) {
        this.bulkGVInd = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the agencyRegionalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyRegionalName() {
        return agencyRegionalName;
    }

    /**
     * Sets the value of the agencyRegionalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyRegionalName(String value) {
        this.agencyRegionalName = value;
    }

    /**
     * Gets the value of the denominationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the denominationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDenominationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DenominationType }
     * 
     * 
     */
    public List<DenominationType> getDenominationType() {
        if (denominationType == null) {
            denominationType = new ArrayList<DenominationType>();
        }
        return this.denominationType;
    }

}
