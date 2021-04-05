
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OandDFeeDetailsInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OandDFeeDetailsInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OandDSequenceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OandDId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StandByCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentFeeDetailsInputType" maxOccurs="unbounded"/>
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OandDFeeDetailsInputType", propOrder = {
    "origin",
    "destination",
    "fareBasisCode",
    "airlineCompany",
    "oandDSequenceID",
    "oandDId",
    "standByCode",
    "segmentFeeDetails",
    "ssrCode"
})
public class OandDFeeDetailsInputType {

    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "FareBasisCode")
    protected String fareBasisCode;
    @XmlElement(name = "AirlineCompany")
    protected String airlineCompany;
    @XmlElement(name = "OandDSequenceID")
    protected long oandDSequenceID;
    @XmlElement(name = "OandDId")
    protected long oandDId;
    @XmlElement(name = "StandByCode")
    protected String standByCode;
    @XmlElement(name = "SegmentFeeDetails", required = true)
    protected List<SegmentFeeDetailsInputType> segmentFeeDetails;
    @XmlElement(name = "SSRCode")
    protected List<String> ssrCode;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the airlineCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCompany() {
        return airlineCompany;
    }

    /**
     * Sets the value of the airlineCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCompany(String value) {
        this.airlineCompany = value;
    }

    /**
     * Gets the value of the oandDSequenceID property.
     * 
     */
    public long getOandDSequenceID() {
        return oandDSequenceID;
    }

    /**
     * Sets the value of the oandDSequenceID property.
     * 
     */
    public void setOandDSequenceID(long value) {
        this.oandDSequenceID = value;
    }

    /**
     * Gets the value of the oandDId property.
     * 
     */
    public long getOandDId() {
        return oandDId;
    }

    /**
     * Sets the value of the oandDId property.
     * 
     */
    public void setOandDId(long value) {
        this.oandDId = value;
    }

    /**
     * Gets the value of the standByCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandByCode() {
        return standByCode;
    }

    /**
     * Sets the value of the standByCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandByCode(String value) {
        this.standByCode = value;
    }

    /**
     * Gets the value of the segmentFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentFeeDetailsInputType }
     * 
     * 
     */
    public List<SegmentFeeDetailsInputType> getSegmentFeeDetails() {
        if (segmentFeeDetails == null) {
            segmentFeeDetails = new ArrayList<SegmentFeeDetailsInputType>();
        }
        return this.segmentFeeDetails;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSSRCode() {
        if (ssrCode == null) {
            ssrCode = new ArrayList<String>();
        }
        return this.ssrCode;
    }

}
