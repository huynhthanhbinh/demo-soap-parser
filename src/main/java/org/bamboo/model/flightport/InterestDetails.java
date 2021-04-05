
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterestType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Interest" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestDetails", propOrder = {
    "interestType",
    "interest"
})
public class InterestDetails {

    @XmlElement(name = "InterestType", required = true)
    protected String interestType;
    @XmlElement(name = "Interest", required = true)
    protected List<String> interest;

    /**
     * Gets the value of the interestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestType() {
        return interestType;
    }

    /**
     * Sets the value of the interestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestType(String value) {
        this.interestType = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInterest() {
        if (interest == null) {
            interest = new ArrayList<String>();
        }
        return this.interest;
    }

}
