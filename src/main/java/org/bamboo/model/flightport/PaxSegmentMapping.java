
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxSegmentMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxSegmentMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaxType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType" minOccurs="0"/>
 *         &lt;element name="ItineraryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SSRSegmentMapping" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRSegmentMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxSegmentMapping", propOrder = {
    "paxID",
    "paxType",
    "itineraryInfo",
    "ssrSegmentMapping"
})
public class PaxSegmentMapping {

    @XmlElement(name = "PaxID")
    protected long paxID;
    @XmlElement(name = "PaxType")
    @XmlSchemaType(name = "string")
    protected GuestType paxType;
    @XmlElement(name = "ItineraryInfo")
    protected List<ItineraryInfo> itineraryInfo;
    @XmlElement(name = "SSRSegmentMapping")
    protected List<SSRSegmentMapping> ssrSegmentMapping;

    /**
     * Gets the value of the paxID property.
     * 
     */
    public long getPaxID() {
        return paxID;
    }

    /**
     * Sets the value of the paxID property.
     * 
     */
    public void setPaxID(long value) {
        this.paxID = value;
    }

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link GuestType }
     *     
     */
    public GuestType getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestType }
     *     
     */
    public void setPaxType(GuestType value) {
        this.paxType = value;
    }

    /**
     * Gets the value of the itineraryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryInfo }
     * 
     * 
     */
    public List<ItineraryInfo> getItineraryInfo() {
        if (itineraryInfo == null) {
            itineraryInfo = new ArrayList<ItineraryInfo>();
        }
        return this.itineraryInfo;
    }

    /**
     * Gets the value of the ssrSegmentMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrSegmentMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRSegmentMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRSegmentMapping }
     * 
     * 
     */
    public List<SSRSegmentMapping> getSSRSegmentMapping() {
        if (ssrSegmentMapping == null) {
            ssrSegmentMapping = new ArrayList<SSRSegmentMapping>();
        }
        return this.ssrSegmentMapping;
    }

}
