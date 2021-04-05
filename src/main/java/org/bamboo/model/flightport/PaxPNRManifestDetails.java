
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxPNRManifestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxPNRManifestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PNRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PassengerManifestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PassengerManifestDetails" maxOccurs="unbounded"/>
 *         &lt;element name="ContactInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}ContactInfoPaxManifest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelDocuments" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocumentsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxPNRManifestDetails", propOrder = {
    "pnrNumber",
    "passengerManifestDetails",
    "contactInformation",
    "travelDocuments"
})
public class PaxPNRManifestDetails {

    @XmlElement(name = "PNRNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "PassengerManifestDetails", required = true)
    protected List<PassengerManifestDetails> passengerManifestDetails;
    @XmlElement(name = "ContactInformation")
    protected List<ContactInfoPaxManifest> contactInformation;
    @XmlElement(name = "TravelDocuments")
    protected List<TravelDocumentsType> travelDocuments;

    /**
     * Gets the value of the pnrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRNumber() {
        return pnrNumber;
    }

    /**
     * Sets the value of the pnrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * Gets the value of the passengerManifestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerManifestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerManifestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerManifestDetails }
     * 
     * 
     */
    public List<PassengerManifestDetails> getPassengerManifestDetails() {
        if (passengerManifestDetails == null) {
            passengerManifestDetails = new ArrayList<PassengerManifestDetails>();
        }
        return this.passengerManifestDetails;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoPaxManifest }
     * 
     * 
     */
    public List<ContactInfoPaxManifest> getContactInformation() {
        if (contactInformation == null) {
            contactInformation = new ArrayList<ContactInfoPaxManifest>();
        }
        return this.contactInformation;
    }

    /**
     * Gets the value of the travelDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocumentsType }
     * 
     * 
     */
    public List<TravelDocumentsType> getTravelDocuments() {
        if (travelDocuments == null) {
            travelDocuments = new ArrayList<TravelDocumentsType>();
        }
        return this.travelDocuments;
    }

}
