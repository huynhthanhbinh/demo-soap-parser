
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This contains the DEI code and the corresponding value.
 * 
 * <p>Java class for FlightSegmentDataElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentDataElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegmentIdentifierDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentIdentifierType" minOccurs="0"/>
 *         &lt;element name="DataElements" type="{http://www.ibsplc.com/iRes/simpleTypes/}DataElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}DataElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CannedFacts" type="{http://www.ibsplc.com/iRes/simpleTypes/}DataElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodeShareInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}DataElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentDataElementType", propOrder = {
    "flightSegmentIdentifierDetails",
    "dataElements",
    "mealCode",
    "cannedFacts",
    "codeShareInfo"
})
public class FlightSegmentDataElementType {

    @XmlElement(name = "FlightSegmentIdentifierDetails")
    protected FlightSegmentIdentifierType flightSegmentIdentifierDetails;
    @XmlElement(name = "DataElements")
    protected List<DataElementType> dataElements;
    @XmlElement(name = "MealCode")
    protected List<DataElementType> mealCode;
    @XmlElement(name = "CannedFacts")
    protected List<DataElementType> cannedFacts;
    @XmlElement(name = "CodeShareInfo")
    protected List<DataElementType> codeShareInfo;

    /**
     * Gets the value of the flightSegmentIdentifierDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentIdentifierType }
     *     
     */
    public FlightSegmentIdentifierType getFlightSegmentIdentifierDetails() {
        return flightSegmentIdentifierDetails;
    }

    /**
     * Sets the value of the flightSegmentIdentifierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentIdentifierType }
     *     
     */
    public void setFlightSegmentIdentifierDetails(FlightSegmentIdentifierType value) {
        this.flightSegmentIdentifierDetails = value;
    }

    /**
     * Gets the value of the dataElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementType }
     * 
     * 
     */
    public List<DataElementType> getDataElements() {
        if (dataElements == null) {
            dataElements = new ArrayList<DataElementType>();
        }
        return this.dataElements;
    }

    /**
     * Gets the value of the mealCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementType }
     * 
     * 
     */
    public List<DataElementType> getMealCode() {
        if (mealCode == null) {
            mealCode = new ArrayList<DataElementType>();
        }
        return this.mealCode;
    }

    /**
     * Gets the value of the cannedFacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cannedFacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCannedFacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementType }
     * 
     * 
     */
    public List<DataElementType> getCannedFacts() {
        if (cannedFacts == null) {
            cannedFacts = new ArrayList<DataElementType>();
        }
        return this.cannedFacts;
    }

    /**
     * Gets the value of the codeShareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeShareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeShareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementType }
     * 
     * 
     */
    public List<DataElementType> getCodeShareInfo() {
        if (codeShareInfo == null) {
            codeShareInfo = new ArrayList<DataElementType>();
        }
        return this.codeShareInfo;
    }

}
