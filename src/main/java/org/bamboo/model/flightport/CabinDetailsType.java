
package org.bamboo.model.flightport;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CabinId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartRow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EndRow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalSeats" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CompartmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CompartmentDetailsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDetailsType", propOrder = {
    "cabinName",
    "cabinId",
    "startRow",
    "endRow",
    "totalSeats",
    "compartmentDetails"
})
public class CabinDetailsType {

    @XmlElement(name = "CabinName", required = true)
    protected String cabinName;
    @XmlElement(name = "CabinId", required = true)
    protected String cabinId;
    @XmlElement(name = "StartRow", required = true)
    protected String startRow;
    @XmlElement(name = "EndRow", required = true)
    protected String endRow;
    @XmlElement(name = "TotalSeats", required = true)
    protected BigInteger totalSeats;
    @XmlElement(name = "CompartmentDetails", required = true)
    protected List<CompartmentDetailsType> compartmentDetails;

    /**
     * Gets the value of the cabinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinName() {
        return cabinName;
    }

    /**
     * Sets the value of the cabinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinName(String value) {
        this.cabinName = value;
    }

    /**
     * Gets the value of the cabinId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinId() {
        return cabinId;
    }

    /**
     * Sets the value of the cabinId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinId(String value) {
        this.cabinId = value;
    }

    /**
     * Gets the value of the startRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartRow(String value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the endRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndRow() {
        return endRow;
    }

    /**
     * Sets the value of the endRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndRow(String value) {
        this.endRow = value;
    }

    /**
     * Gets the value of the totalSeats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSeats() {
        return totalSeats;
    }

    /**
     * Sets the value of the totalSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSeats(BigInteger value) {
        this.totalSeats = value;
    }

    /**
     * Gets the value of the compartmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compartmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompartmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompartmentDetailsType }
     * 
     * 
     */
    public List<CompartmentDetailsType> getCompartmentDetails() {
        if (compartmentDetails == null) {
            compartmentDetails = new ArrayList<CompartmentDetailsType>();
        }
        return this.compartmentDetails;
    }

}
