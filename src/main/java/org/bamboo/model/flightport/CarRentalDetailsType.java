
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CarRentalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarRentalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarVendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CarVendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PickUpDropOff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PickUpTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DropOffDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DropOffTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CarGroupDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CarGroupType"/>
 *         &lt;element name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarRentalDetailsType", propOrder = {
    "carVendorCode",
    "carVendorName",
    "pickUpDropOff",
    "pickUpDate",
    "pickUpTime",
    "dropOffDate",
    "dropOffTime",
    "carGroupDetails",
    "numberOfDays"
})
public class CarRentalDetailsType {

    @XmlElement(name = "CarVendorCode", required = true)
    protected String carVendorCode;
    @XmlElement(name = "CarVendorName", required = true)
    protected String carVendorName;
    @XmlElement(name = "PickUpDropOff", required = true)
    protected String pickUpDropOff;
    @XmlElement(name = "PickUpDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pickUpDate;
    @XmlElement(name = "PickUpTime", required = true)
    protected String pickUpTime;
    @XmlElement(name = "DropOffDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dropOffDate;
    @XmlElement(name = "DropOffTime", required = true)
    protected String dropOffTime;
    @XmlElement(name = "CarGroupDetails", required = true)
    protected CarGroupType carGroupDetails;
    @XmlElement(name = "NumberOfDays")
    protected long numberOfDays;

    /**
     * Gets the value of the carVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarVendorCode() {
        return carVendorCode;
    }

    /**
     * Sets the value of the carVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarVendorCode(String value) {
        this.carVendorCode = value;
    }

    /**
     * Gets the value of the carVendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarVendorName() {
        return carVendorName;
    }

    /**
     * Sets the value of the carVendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarVendorName(String value) {
        this.carVendorName = value;
    }

    /**
     * Gets the value of the pickUpDropOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDropOff() {
        return pickUpDropOff;
    }

    /**
     * Sets the value of the pickUpDropOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDropOff(String value) {
        this.pickUpDropOff = value;
    }

    /**
     * Gets the value of the pickUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDate() {
        return pickUpDate;
    }

    /**
     * Sets the value of the pickUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDate(XMLGregorianCalendar value) {
        this.pickUpDate = value;
    }

    /**
     * Gets the value of the pickUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpTime() {
        return pickUpTime;
    }

    /**
     * Sets the value of the pickUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpTime(String value) {
        this.pickUpTime = value;
    }

    /**
     * Gets the value of the dropOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDropOffDate() {
        return dropOffDate;
    }

    /**
     * Sets the value of the dropOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDropOffDate(XMLGregorianCalendar value) {
        this.dropOffDate = value;
    }

    /**
     * Gets the value of the dropOffTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffTime() {
        return dropOffTime;
    }

    /**
     * Sets the value of the dropOffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffTime(String value) {
        this.dropOffTime = value;
    }

    /**
     * Gets the value of the carGroupDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CarGroupType }
     *     
     */
    public CarGroupType getCarGroupDetails() {
        return carGroupDetails;
    }

    /**
     * Sets the value of the carGroupDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarGroupType }
     *     
     */
    public void setCarGroupDetails(CarGroupType value) {
        this.carGroupDetails = value;
    }

    /**
     * Gets the value of the numberOfDays property.
     * 
     */
    public long getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     */
    public void setNumberOfDays(long value) {
        this.numberOfDays = value;
    }

}
