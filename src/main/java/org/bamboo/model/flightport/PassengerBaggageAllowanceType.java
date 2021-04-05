
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds the Pax Baggage Allowance Information such as Weight Allowance and Piece Allowance.
 * 
 * <p>Java class for PassengerBaggageAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerBaggageAllowanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WeightAllowance" type="{http://www.ibsplc.com/iRes/simpleTypes/}WeightAllowanceType"/>
 *         &lt;element name="PieceAllowance" type="{http://www.ibsplc.com/iRes/simpleTypes/}MaximumAllowanceType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerBaggageAllowanceType", propOrder = {
    "baggageCategory",
    "weightAllowance",
    "pieceAllowance"
})
public class PassengerBaggageAllowanceType {

    @XmlElement(name = "BaggageCategory", required = true)
    protected String baggageCategory;
    @XmlElement(name = "WeightAllowance", required = true)
    protected WeightAllowanceType weightAllowance;
    @XmlElement(name = "PieceAllowance", required = true)
    protected MaximumAllowanceType pieceAllowance;
    @XmlAttribute(name = "PaxType")
    protected String paxType;

    /**
     * Gets the value of the baggageCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageCategory() {
        return baggageCategory;
    }

    /**
     * Sets the value of the baggageCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageCategory(String value) {
        this.baggageCategory = value;
    }

    /**
     * Gets the value of the weightAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link WeightAllowanceType }
     *     
     */
    public WeightAllowanceType getWeightAllowance() {
        return weightAllowance;
    }

    /**
     * Sets the value of the weightAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightAllowanceType }
     *     
     */
    public void setWeightAllowance(WeightAllowanceType value) {
        this.weightAllowance = value;
    }

    /**
     * Gets the value of the pieceAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAllowanceType }
     *     
     */
    public MaximumAllowanceType getPieceAllowance() {
        return pieceAllowance;
    }

    /**
     * Sets the value of the pieceAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAllowanceType }
     *     
     */
    public void setPieceAllowance(MaximumAllowanceType value) {
        this.pieceAllowance = value;
    }

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

}
