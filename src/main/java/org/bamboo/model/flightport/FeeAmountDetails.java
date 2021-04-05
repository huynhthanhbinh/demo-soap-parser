
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeAmountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeAmountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeAmountDetail" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeAmountDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeAmountDetails", propOrder = {
    "feeAmountDetail"
})
public class FeeAmountDetails {

    @XmlElement(name = "FeeAmountDetail")
    protected List<FeeAmountDetailsType> feeAmountDetail;

    /**
     * Gets the value of the feeAmountDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeAmountDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeAmountDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeAmountDetailsType }
     * 
     * 
     */
    public List<FeeAmountDetailsType> getFeeAmountDetail() {
        if (feeAmountDetail == null) {
            feeAmountDetail = new ArrayList<FeeAmountDetailsType>();
        }
        return this.feeAmountDetail;
    }

}
