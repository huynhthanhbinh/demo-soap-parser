
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNRRefundDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRRefundDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentProcessingType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaymentProcessingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RefundType" type="{http://www.ibsplc.com/iRes/simpleTypes/}RefundType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRRefundDetails", propOrder = {
    "paymentStatus",
    "paymentProcessingType",
    "refundType"
})
public class PNRRefundDetails {

    @XmlElement(name = "PaymentStatus", required = true)
    protected String paymentStatus;
    @XmlElement(name = "PaymentProcessingType")
    protected List<PaymentProcessingType> paymentProcessingType;
    @XmlElement(name = "RefundType")
    protected List<RefundType> refundType;

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the paymentProcessingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentProcessingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentProcessingType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentProcessingType }
     * 
     * 
     */
    public List<PaymentProcessingType> getPaymentProcessingType() {
        if (paymentProcessingType == null) {
            paymentProcessingType = new ArrayList<PaymentProcessingType>();
        }
        return this.paymentProcessingType;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundType }
     * 
     * 
     */
    public List<RefundType> getRefundType() {
        if (refundType == null) {
            refundType = new ArrayList<RefundType>();
        }
        return this.refundType;
    }

}
