
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnrQueueDetailsInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrQueueDetailsInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="QueueDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}QueueDetailsInputType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrQueueDetailsInputType", propOrder = {
    "pnrNumber",
    "queueDetails"
})
public class PnrQueueDetailsInputType {

    @XmlElement(name = "PnrNumber", required = true)
    protected List<String> pnrNumber;
    @XmlElement(name = "QueueDetails", required = true)
    protected QueueDetailsInputType queueDetails;

    /**
     * Gets the value of the pnrNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPnrNumber() {
        if (pnrNumber == null) {
            pnrNumber = new ArrayList<String>();
        }
        return this.pnrNumber;
    }

    /**
     * Gets the value of the queueDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QueueDetailsInputType }
     *     
     */
    public QueueDetailsInputType getQueueDetails() {
        return queueDetails;
    }

    /**
     * Sets the value of the queueDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueDetailsInputType }
     *     
     */
    public void setQueueDetails(QueueDetailsInputType value) {
        this.queueDetails = value;
    }

}
