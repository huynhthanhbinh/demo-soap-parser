
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginDestinationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TripInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}TripInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PricingInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PricingInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BestFareInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}BestFareInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TripDirection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsPartOfRoundTrip" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SearchIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PricingUnitID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationInfo", propOrder = {
    "tripInfo",
    "pricingInfo",
    "bestFareInfo"
})
public class OriginDestinationInfo {

    @XmlElement(name = "TripInfo")
    protected List<TripInfoType> tripInfo;
    @XmlElement(name = "PricingInfo")
    protected List<PricingInfoType> pricingInfo;
    @XmlElement(name = "BestFareInfo")
    protected List<BestFareInfo> bestFareInfo;
    @XmlAttribute(name = "TripDirection")
    protected String tripDirection;
    @XmlAttribute(name = "IsPartOfRoundTrip")
    protected Boolean isPartOfRoundTrip;
    @XmlAttribute(name = "SearchIndex")
    protected Integer searchIndex;
    @XmlAttribute(name = "PricingUnitID")
    protected Integer pricingUnitID;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;

    /**
     * Gets the value of the tripInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripInfoType }
     * 
     * 
     */
    public List<TripInfoType> getTripInfo() {
        if (tripInfo == null) {
            tripInfo = new ArrayList<TripInfoType>();
        }
        return this.tripInfo;
    }

    /**
     * Gets the value of the pricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingInfoType }
     * 
     * 
     */
    public List<PricingInfoType> getPricingInfo() {
        if (pricingInfo == null) {
            pricingInfo = new ArrayList<PricingInfoType>();
        }
        return this.pricingInfo;
    }

    /**
     * Gets the value of the bestFareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestFareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BestFareInfo }
     * 
     * 
     */
    public List<BestFareInfo> getBestFareInfo() {
        if (bestFareInfo == null) {
            bestFareInfo = new ArrayList<BestFareInfo>();
        }
        return this.bestFareInfo;
    }

    /**
     * Gets the value of the tripDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripDirection() {
        return tripDirection;
    }

    /**
     * Sets the value of the tripDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripDirection(String value) {
        this.tripDirection = value;
    }

    /**
     * Gets the value of the isPartOfRoundTrip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartOfRoundTrip() {
        return isPartOfRoundTrip;
    }

    /**
     * Sets the value of the isPartOfRoundTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartOfRoundTrip(Boolean value) {
        this.isPartOfRoundTrip = value;
    }

    /**
     * Gets the value of the searchIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchIndex() {
        return searchIndex;
    }

    /**
     * Sets the value of the searchIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchIndex(Integer value) {
        this.searchIndex = value;
    }

    /**
     * Gets the value of the pricingUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPricingUnitID() {
        return pricingUnitID;
    }

    /**
     * Sets the value of the pricingUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPricingUnitID(Integer value) {
        this.pricingUnitID = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

}
