
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompartmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompartmentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompartmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartRow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EndRow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SeatConfiguration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InternalSeatConfiguration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SeatDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatDetailsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentDetailsType", propOrder = {
    "compartmentId",
    "startRow",
    "endRow",
    "seatConfiguration",
    "internalSeatConfiguration",
    "seatDetails"
})
public class CompartmentDetailsType {

    @XmlElement(name = "CompartmentId")
    protected String compartmentId;
    @XmlElement(name = "StartRow", required = true)
    protected String startRow;
    @XmlElement(name = "EndRow", required = true)
    protected String endRow;
    @XmlElement(name = "SeatConfiguration", required = true)
    protected String seatConfiguration;
    @XmlElement(name = "InternalSeatConfiguration", required = true)
    protected String internalSeatConfiguration;
    @XmlElement(name = "SeatDetails", required = true)
    protected List<SeatDetailsType> seatDetails;

    /**
     * Gets the value of the compartmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Sets the value of the compartmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompartmentId(String value) {
        this.compartmentId = value;
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
     * Gets the value of the seatConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatConfiguration() {
        return seatConfiguration;
    }

    /**
     * Sets the value of the seatConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatConfiguration(String value) {
        this.seatConfiguration = value;
    }

    /**
     * Gets the value of the internalSeatConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalSeatConfiguration() {
        return internalSeatConfiguration;
    }

    /**
     * Sets the value of the internalSeatConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalSeatConfiguration(String value) {
        this.internalSeatConfiguration = value;
    }

    /**
     * Gets the value of the seatDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatDetailsType }
     * 
     * 
     */
    public List<SeatDetailsType> getSeatDetails() {
        if (seatDetails == null) {
            seatDetails = new ArrayList<SeatDetailsType>();
        }
        return this.seatDetails;
    }

}
