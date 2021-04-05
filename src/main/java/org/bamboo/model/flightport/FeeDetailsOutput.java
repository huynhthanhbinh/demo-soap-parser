
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeDetailsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDetailsOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeAmountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeAmountDetailsType" minOccurs="0"/>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeErrorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDetailsOutput", propOrder = {
    "feeAmountDetails",
    "feeCode",
    "feeErrorType"
})
public class FeeDetailsOutput {

    @XmlElement(name = "FeeAmountDetails")
    protected FeeAmountDetailsType feeAmountDetails;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "FeeErrorType")
    protected String feeErrorType;

    /**
     * Gets the value of the feeAmountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmountDetailsType }
     *     
     */
    public FeeAmountDetailsType getFeeAmountDetails() {
        return feeAmountDetails;
    }

    /**
     * Sets the value of the feeAmountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmountDetailsType }
     *     
     */
    public void setFeeAmountDetails(FeeAmountDetailsType value) {
        this.feeAmountDetails = value;
    }

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
     * Gets the value of the feeErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeErrorType() {
        return feeErrorType;
    }

    /**
     * Sets the value of the feeErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeErrorType(String value) {
        this.feeErrorType = value;
    }

}
