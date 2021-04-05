
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleableAncillaries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleableAncillaries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleableSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableSsrs" minOccurs="0"/>
 *         &lt;element name="SaleableAuxs" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableAuxs" minOccurs="0"/>
 *         &lt;element name="AirportAncillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportAncillaries" minOccurs="0"/>
 *         &lt;element name="NotifiableSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}NotifiableSsrs" minOccurs="0"/>
 *         &lt;element name="NotofiableAuxs" type="{http://www.ibsplc.com/iRes/simpleTypes/}NotofiableAuxs" minOccurs="0"/>
 *         &lt;element name="SegmentIds" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentIds" minOccurs="0"/>
 *         &lt;element name="OandDId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Itinerary" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleableAncillaries", propOrder = {
    "saleableSsrs",
    "saleableAuxs",
    "airportAncillaries",
    "notifiableSsrs",
    "notofiableAuxs",
    "segmentIds",
    "oandDId",
    "itinerary"
})
public class SaleableAncillaries {

    @XmlElement(name = "SaleableSsrs")
    protected SaleableSsrs saleableSsrs;
    @XmlElement(name = "SaleableAuxs")
    protected SaleableAuxs saleableAuxs;
    @XmlElement(name = "AirportAncillaries")
    protected AirportAncillaries airportAncillaries;
    @XmlElement(name = "NotifiableSsrs")
    protected NotifiableSsrs notifiableSsrs;
    @XmlElement(name = "NotofiableAuxs")
    protected NotofiableAuxs notofiableAuxs;
    @XmlElement(name = "SegmentIds")
    protected SegmentIds segmentIds;
    @XmlElement(name = "OandDId")
    protected Long oandDId;
    @XmlElement(name = "Itinerary")
    protected List<ItineraryDetailsType> itinerary;

    /**
     * Gets the value of the saleableSsrs property.
     * 
     * @return
     *     possible object is
     *     {@link SaleableSsrs }
     *     
     */
    public SaleableSsrs getSaleableSsrs() {
        return saleableSsrs;
    }

    /**
     * Sets the value of the saleableSsrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleableSsrs }
     *     
     */
    public void setSaleableSsrs(SaleableSsrs value) {
        this.saleableSsrs = value;
    }

    /**
     * Gets the value of the saleableAuxs property.
     * 
     * @return
     *     possible object is
     *     {@link SaleableAuxs }
     *     
     */
    public SaleableAuxs getSaleableAuxs() {
        return saleableAuxs;
    }

    /**
     * Sets the value of the saleableAuxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleableAuxs }
     *     
     */
    public void setSaleableAuxs(SaleableAuxs value) {
        this.saleableAuxs = value;
    }

    /**
     * Gets the value of the airportAncillaries property.
     * 
     * @return
     *     possible object is
     *     {@link AirportAncillaries }
     *     
     */
    public AirportAncillaries getAirportAncillaries() {
        return airportAncillaries;
    }

    /**
     * Sets the value of the airportAncillaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportAncillaries }
     *     
     */
    public void setAirportAncillaries(AirportAncillaries value) {
        this.airportAncillaries = value;
    }

    /**
     * Gets the value of the notifiableSsrs property.
     * 
     * @return
     *     possible object is
     *     {@link NotifiableSsrs }
     *     
     */
    public NotifiableSsrs getNotifiableSsrs() {
        return notifiableSsrs;
    }

    /**
     * Sets the value of the notifiableSsrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifiableSsrs }
     *     
     */
    public void setNotifiableSsrs(NotifiableSsrs value) {
        this.notifiableSsrs = value;
    }

    /**
     * Gets the value of the notofiableAuxs property.
     * 
     * @return
     *     possible object is
     *     {@link NotofiableAuxs }
     *     
     */
    public NotofiableAuxs getNotofiableAuxs() {
        return notofiableAuxs;
    }

    /**
     * Sets the value of the notofiableAuxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotofiableAuxs }
     *     
     */
    public void setNotofiableAuxs(NotofiableAuxs value) {
        this.notofiableAuxs = value;
    }

    /**
     * Gets the value of the segmentIds property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentIds }
     *     
     */
    public SegmentIds getSegmentIds() {
        return segmentIds;
    }

    /**
     * Sets the value of the segmentIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentIds }
     *     
     */
    public void setSegmentIds(SegmentIds value) {
        this.segmentIds = value;
    }

    /**
     * Gets the value of the oandDId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOandDId() {
        return oandDId;
    }

    /**
     * Sets the value of the oandDId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOandDId(Long value) {
        this.oandDId = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDetailsType }
     * 
     * 
     */
    public List<ItineraryDetailsType> getItinerary() {
        if (itinerary == null) {
            itinerary = new ArrayList<ItineraryDetailsType>();
        }
        return this.itinerary;
    }

}
