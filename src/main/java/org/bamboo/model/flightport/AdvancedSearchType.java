
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvancedSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvancedSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxNumOfFlights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxNumOfStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxFareAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypesOfService" type="{http://www.ibsplc.com/iRes/simpleTypes/}ServiceTypes" minOccurs="0"/>
 *         &lt;element name="PreferredConnections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCodeShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvancedSearchType", propOrder = {
    "searchType",
    "maxNumOfFlights",
    "maxNumOfStops",
    "maxFareAmount",
    "fareClass",
    "typesOfService",
    "preferredConnections",
    "isCodeShare"
})
public class AdvancedSearchType {

    @XmlElement(name = "SearchType")
    protected String searchType;
    @XmlElement(name = "MaxNumOfFlights")
    protected Integer maxNumOfFlights;
    @XmlElement(name = "MaxNumOfStops")
    protected Integer maxNumOfStops;
    @XmlElement(name = "MaxFareAmount")
    protected int maxFareAmount;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "TypesOfService")
    protected ServiceTypes typesOfService;
    @XmlElement(name = "PreferredConnections")
    protected String preferredConnections;
    @XmlElement(name = "IsCodeShare")
    protected Boolean isCodeShare;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the maxNumOfFlights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumOfFlights() {
        return maxNumOfFlights;
    }

    /**
     * Sets the value of the maxNumOfFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumOfFlights(Integer value) {
        this.maxNumOfFlights = value;
    }

    /**
     * Gets the value of the maxNumOfStops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumOfStops() {
        return maxNumOfStops;
    }

    /**
     * Sets the value of the maxNumOfStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumOfStops(Integer value) {
        this.maxNumOfStops = value;
    }

    /**
     * Gets the value of the maxFareAmount property.
     * 
     */
    public int getMaxFareAmount() {
        return maxFareAmount;
    }

    /**
     * Sets the value of the maxFareAmount property.
     * 
     */
    public void setMaxFareAmount(int value) {
        this.maxFareAmount = value;
    }

    /**
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the typesOfService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTypes }
     *     
     */
    public ServiceTypes getTypesOfService() {
        return typesOfService;
    }

    /**
     * Sets the value of the typesOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTypes }
     *     
     */
    public void setTypesOfService(ServiceTypes value) {
        this.typesOfService = value;
    }

    /**
     * Gets the value of the preferredConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredConnections() {
        return preferredConnections;
    }

    /**
     * Sets the value of the preferredConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredConnections(String value) {
        this.preferredConnections = value;
    }

    /**
     * Gets the value of the isCodeShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCodeShare() {
        return isCodeShare;
    }

    /**
     * Sets the value of the isCodeShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCodeShare(Boolean value) {
        this.isCodeShare = value;
    }

}
