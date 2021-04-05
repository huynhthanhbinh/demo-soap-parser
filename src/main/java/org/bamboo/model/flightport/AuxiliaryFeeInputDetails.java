
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
 * <p>Java class for AuxiliaryFeeInputDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuxiliaryFeeInputDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpDateLTC" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PickUpTimeLTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DropOffDateLTC" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DropOffTimeLTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Weights" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxSegmentMapping" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxSegmentMapping" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuxiliaryFeeInputDetails", propOrder = {
    "feeCode",
    "currency",
    "vendorCode",
    "carGroup",
    "pickUpDateLTC",
    "pickUpTimeLTC",
    "dropOffDateLTC",
    "dropOffTimeLTC",
    "pieces",
    "weights",
    "units",
    "serviceType",
    "nationality",
    "paxSegmentMapping"
})
public class AuxiliaryFeeInputDetails {

    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "VendorCode")
    protected String vendorCode;
    @XmlElement(name = "CarGroup")
    protected String carGroup;
    @XmlElement(name = "PickUpDateLTC")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pickUpDateLTC;
    @XmlElement(name = "PickUpTimeLTC")
    protected String pickUpTimeLTC;
    @XmlElement(name = "DropOffDateLTC")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dropOffDateLTC;
    @XmlElement(name = "DropOffTimeLTC")
    protected String dropOffTimeLTC;
    @XmlElement(name = "Pieces")
    protected Integer pieces;
    @XmlElement(name = "Weights")
    protected Double weights;
    @XmlElement(name = "Units")
    protected String units;
    @XmlElement(name = "ServiceType")
    protected String serviceType;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "PaxSegmentMapping", required = true)
    protected List<PaxSegmentMapping> paxSegmentMapping;

    /**
     * Gets the value of the feeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

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
     * Gets the value of the carGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarGroup() {
        return carGroup;
    }

    /**
     * Sets the value of the carGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarGroup(String value) {
        this.carGroup = value;
    }

    /**
     * Gets the value of the pickUpDateLTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDateLTC() {
        return pickUpDateLTC;
    }

    /**
     * Sets the value of the pickUpDateLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDateLTC(XMLGregorianCalendar value) {
        this.pickUpDateLTC = value;
    }

    /**
     * Gets the value of the pickUpTimeLTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpTimeLTC() {
        return pickUpTimeLTC;
    }

    /**
     * Sets the value of the pickUpTimeLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpTimeLTC(String value) {
        this.pickUpTimeLTC = value;
    }

    /**
     * Gets the value of the dropOffDateLTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDropOffDateLTC() {
        return dropOffDateLTC;
    }

    /**
     * Sets the value of the dropOffDateLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDropOffDateLTC(XMLGregorianCalendar value) {
        this.dropOffDateLTC = value;
    }

    /**
     * Gets the value of the dropOffTimeLTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffTimeLTC() {
        return dropOffTimeLTC;
    }

    /**
     * Sets the value of the dropOffTimeLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffTimeLTC(String value) {
        this.dropOffTimeLTC = value;
    }

    /**
     * Gets the value of the pieces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPieces() {
        return pieces;
    }

    /**
     * Sets the value of the pieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPieces(Integer value) {
        this.pieces = value;
    }

    /**
     * Gets the value of the weights property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeights() {
        return weights;
    }

    /**
     * Sets the value of the weights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeights(Double value) {
        this.weights = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the paxSegmentMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegmentMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSegmentMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSegmentMapping }
     * 
     * 
     */
    public List<PaxSegmentMapping> getPaxSegmentMapping() {
        if (paxSegmentMapping == null) {
            paxSegmentMapping = new ArrayList<PaxSegmentMapping>();
        }
        return this.paxSegmentMapping;
    }

}
