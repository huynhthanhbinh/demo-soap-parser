
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckedBaggageDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckedBaggageDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExcessWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WeightAllowance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaxWeightPerBag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaxTotalweightAllowed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaxPieceAllowance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExcessPieces" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Pieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckedBaggageDetails", propOrder = {
    "excessWeight",
    "weightAllowance",
    "maxWeightPerBag",
    "maxTotalweightAllowed",
    "maxPieceAllowance",
    "excessPieces",
    "pieces",
    "unit",
    "serviceCode"
})
public class CheckedBaggageDetails {

    @XmlElement(name = "ExcessWeight")
    protected Double excessWeight;
    @XmlElement(name = "WeightAllowance")
    protected Double weightAllowance;
    @XmlElement(name = "MaxWeightPerBag")
    protected Double maxWeightPerBag;
    @XmlElement(name = "MaxTotalweightAllowed")
    protected Double maxTotalweightAllowed;
    @XmlElement(name = "MaxPieceAllowance")
    protected Integer maxPieceAllowance;
    @XmlElement(name = "ExcessPieces")
    protected Double excessPieces;
    @XmlElement(name = "Pieces")
    protected Integer pieces;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;

    /**
     * Gets the value of the excessWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExcessWeight() {
        return excessWeight;
    }

    /**
     * Sets the value of the excessWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExcessWeight(Double value) {
        this.excessWeight = value;
    }

    /**
     * Gets the value of the weightAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightAllowance() {
        return weightAllowance;
    }

    /**
     * Sets the value of the weightAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightAllowance(Double value) {
        this.weightAllowance = value;
    }

    /**
     * Gets the value of the maxWeightPerBag property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxWeightPerBag() {
        return maxWeightPerBag;
    }

    /**
     * Sets the value of the maxWeightPerBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxWeightPerBag(Double value) {
        this.maxWeightPerBag = value;
    }

    /**
     * Gets the value of the maxTotalweightAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxTotalweightAllowed() {
        return maxTotalweightAllowed;
    }

    /**
     * Sets the value of the maxTotalweightAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxTotalweightAllowed(Double value) {
        this.maxTotalweightAllowed = value;
    }

    /**
     * Gets the value of the maxPieceAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPieceAllowance() {
        return maxPieceAllowance;
    }

    /**
     * Sets the value of the maxPieceAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPieceAllowance(Integer value) {
        this.maxPieceAllowance = value;
    }

    /**
     * Gets the value of the excessPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExcessPieces() {
        return excessPieces;
    }

    /**
     * Sets the value of the excessPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExcessPieces(Double value) {
        this.excessPieces = value;
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
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

}
