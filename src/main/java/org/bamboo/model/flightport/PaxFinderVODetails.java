
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxFinderVODetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxFinderVODetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxFinderVODetails", propOrder = {
    "familyId",
    "guestId"
})
public class PaxFinderVODetails {

    @XmlElement(name = "FamilyId")
    protected long familyId;
    @XmlElement(name = "GuestId")
    protected long guestId;

    /**
     * Gets the value of the familyId property.
     * 
     */
    public long getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     */
    public void setFamilyId(long value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     */
    public long getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     */
    public void setGuestId(long value) {
        this.guestId = value;
    }

}
