
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorEmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanSendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AirportCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsFeeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CarGroupDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CarGroupDetailsType" maxOccurs="unbounded"/>
 *         &lt;element name="TravelInsuranceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelInsuranceDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CountryCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaxTripLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxSaleTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorDetailsType", propOrder = {
    "vendorCode",
    "vendorName",
    "vendorEmailID",
    "canSendEmail",
    "airportCodes",
    "startTime",
    "endTime",
    "isFeeRequired",
    "carGroupDetails",
    "travelInsuranceDetails",
    "countryCodes",
    "maxTripLength",
    "maxSaleTime"
})
public class VendorDetailsType {

    @XmlElement(name = "VendorCode", required = true)
    protected String vendorCode;
    @XmlElement(name = "VendorName")
    protected String vendorName;
    @XmlElement(name = "VendorEmailID")
    protected String vendorEmailID;
    @XmlElement(name = "CanSendEmail")
    protected Boolean canSendEmail;
    @XmlElement(name = "AirportCodes")
    protected List<String> airportCodes;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "EndTime")
    protected String endTime;
    @XmlElement(name = "IsFeeRequired")
    protected Boolean isFeeRequired;
    @XmlElement(name = "CarGroupDetails", required = true)
    protected List<CarGroupDetailsType> carGroupDetails;
    @XmlElement(name = "TravelInsuranceDetails")
    protected List<TravelInsuranceDetailsType> travelInsuranceDetails;
    @XmlElement(name = "CountryCodes")
    protected List<String> countryCodes;
    @XmlElement(name = "MaxTripLength")
    protected String maxTripLength;
    @XmlElement(name = "MaxSaleTime")
    protected String maxSaleTime;

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the vendorEmailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorEmailID() {
        return vendorEmailID;
    }

    /**
     * Sets the value of the vendorEmailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorEmailID(String value) {
        this.vendorEmailID = value;
    }

    /**
     * Gets the value of the canSendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSendEmail() {
        return canSendEmail;
    }

    /**
     * Sets the value of the canSendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSendEmail(Boolean value) {
        this.canSendEmail = value;
    }

    /**
     * Gets the value of the airportCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAirportCodes() {
        if (airportCodes == null) {
            airportCodes = new ArrayList<String>();
        }
        return this.airportCodes;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the isFeeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeeRequired() {
        return isFeeRequired;
    }

    /**
     * Sets the value of the isFeeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeeRequired(Boolean value) {
        this.isFeeRequired = value;
    }

    /**
     * Gets the value of the carGroupDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carGroupDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarGroupDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarGroupDetailsType }
     * 
     * 
     */
    public List<CarGroupDetailsType> getCarGroupDetails() {
        if (carGroupDetails == null) {
            carGroupDetails = new ArrayList<CarGroupDetailsType>();
        }
        return this.carGroupDetails;
    }

    /**
     * Gets the value of the travelInsuranceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelInsuranceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelInsuranceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelInsuranceDetailsType }
     * 
     * 
     */
    public List<TravelInsuranceDetailsType> getTravelInsuranceDetails() {
        if (travelInsuranceDetails == null) {
            travelInsuranceDetails = new ArrayList<TravelInsuranceDetailsType>();
        }
        return this.travelInsuranceDetails;
    }

    /**
     * Gets the value of the countryCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryCodes() {
        if (countryCodes == null) {
            countryCodes = new ArrayList<String>();
        }
        return this.countryCodes;
    }

    /**
     * Gets the value of the maxTripLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxTripLength() {
        return maxTripLength;
    }

    /**
     * Sets the value of the maxTripLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxTripLength(String value) {
        this.maxTripLength = value;
    }

    /**
     * Gets the value of the maxSaleTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSaleTime() {
        return maxSaleTime;
    }

    /**
     * Sets the value of the maxSaleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSaleTime(String value) {
        this.maxSaleTime = value;
    }

}
