
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DateOfHireDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateOfHireDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateOfHire" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOfHireDetails", propOrder = {
    "paxId",
    "dateOfHire"
})
public class DateOfHireDetails {

    @XmlElement(name = "PaxId", required = true)
    protected String paxId;
    @XmlElement(name = "DateOfHire", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfHire;

    /**
     * Gets the value of the paxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxId() {
        return paxId;
    }

    /**
     * Sets the value of the paxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxId(String value) {
        this.paxId = value;
    }

    /**
     * Gets the value of the dateOfHire property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfHire() {
        return dateOfHire;
    }

    /**
     * Sets the value of the dateOfHire property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfHire(XMLGregorianCalendar value) {
        this.dateOfHire = value;
    }

}
