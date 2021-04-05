
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContinentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContinentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContinentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContinentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CountryDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContinentDetailsType", propOrder = {
    "continentCode",
    "continentName",
    "countryDetails"
})
public class ContinentDetailsType {

    @XmlElement(name = "ContinentCode", required = true)
    protected String continentCode;
    @XmlElement(name = "ContinentName")
    protected String continentName;
    @XmlElement(name = "CountryDetails")
    protected List<CountryDetailsType> countryDetails;

    /**
     * Gets the value of the continentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinentCode() {
        return continentCode;
    }

    /**
     * Sets the value of the continentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinentCode(String value) {
        this.continentCode = value;
    }

    /**
     * Gets the value of the continentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinentName() {
        return continentName;
    }

    /**
     * Sets the value of the continentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinentName(String value) {
        this.continentName = value;
    }

    /**
     * Gets the value of the countryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryDetailsType }
     * 
     * 
     */
    public List<CountryDetailsType> getCountryDetails() {
        if (countryDetails == null) {
            countryDetails = new ArrayList<CountryDetailsType>();
        }
        return this.countryDetails;
    }

}
