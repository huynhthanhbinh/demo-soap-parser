
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareComponentAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentAmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareComponentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaxFareComponentAmountDtlsTypes" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxFareComponentAmountDtlsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentAmountType", propOrder = {
    "fareComponentId",
    "paxFareComponentAmountDtlsTypes"
})
public class FareComponentAmountType {

    @XmlElement(name = "FareComponentId")
    protected long fareComponentId;
    @XmlElement(name = "PaxFareComponentAmountDtlsTypes", required = true)
    protected List<PaxFareComponentAmountDtlsType> paxFareComponentAmountDtlsTypes;

    /**
     * Gets the value of the fareComponentId property.
     * 
     */
    public long getFareComponentId() {
        return fareComponentId;
    }

    /**
     * Sets the value of the fareComponentId property.
     * 
     */
    public void setFareComponentId(long value) {
        this.fareComponentId = value;
    }

    /**
     * Gets the value of the paxFareComponentAmountDtlsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxFareComponentAmountDtlsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxFareComponentAmountDtlsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxFareComponentAmountDtlsType }
     * 
     * 
     */
    public List<PaxFareComponentAmountDtlsType> getPaxFareComponentAmountDtlsTypes() {
        if (paxFareComponentAmountDtlsTypes == null) {
            paxFareComponentAmountDtlsTypes = new ArrayList<PaxFareComponentAmountDtlsType>();
        }
        return this.paxFareComponentAmountDtlsTypes;
    }

}
