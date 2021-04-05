
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsrFeeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsrFeeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeDetailsOutput" minOccurs="0"/>
 *         &lt;element name="SsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsrFeeDetailsType", propOrder = {
    "feeDetails",
    "ssrCode"
})
public class SsrFeeDetailsType {

    @XmlElement(name = "FeeDetails")
    protected FeeDetailsOutput feeDetails;
    @XmlElement(name = "SsrCode")
    protected String ssrCode;

    /**
     * Gets the value of the feeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FeeDetailsOutput }
     *     
     */
    public FeeDetailsOutput getFeeDetails() {
        return feeDetails;
    }

    /**
     * Sets the value of the feeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeDetailsOutput }
     *     
     */
    public void setFeeDetails(FeeDetailsOutput value) {
        this.feeDetails = value;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrCode(String value) {
        this.ssrCode = value;
    }

}
