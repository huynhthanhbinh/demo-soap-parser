
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OandDFeeDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OandDFeeDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OandDFeeDetail" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDFeeDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OandDFeeDetailsResponse", propOrder = {
    "oandDFeeDetail"
})
public class OandDFeeDetailsResponse {

    @XmlElement(name = "OandDFeeDetail")
    protected List<OandDFeeDetailsType> oandDFeeDetail;

    /**
     * Gets the value of the oandDFeeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oandDFeeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOandDFeeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDFeeDetailsType }
     * 
     * 
     */
    public List<OandDFeeDetailsType> getOandDFeeDetail() {
        if (oandDFeeDetail == null) {
            oandDFeeDetail = new ArrayList<OandDFeeDetailsType>();
        }
        return this.oandDFeeDetail;
    }

}
