
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of the Board Point.
 * 
 * <p>Java class for ArrivalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivalFlightTimeInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightTimeInfoType"/>
 *         &lt;element name="OnGround" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalType", propOrder = {
    "arrivalFlightTimeInfo",
    "onGround",
    "inBlock"
})
public class ArrivalType {

    @XmlElement(name = "ArrivalFlightTimeInfo", required = true)
    protected FlightTimeInfoType arrivalFlightTimeInfo;
    @XmlElement(name = "OnGround")
    protected String onGround;
    @XmlElement(name = "InBlock")
    protected String inBlock;

    /**
     * Gets the value of the arrivalFlightTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeInfoType }
     *     
     */
    public FlightTimeInfoType getArrivalFlightTimeInfo() {
        return arrivalFlightTimeInfo;
    }

    /**
     * Sets the value of the arrivalFlightTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeInfoType }
     *     
     */
    public void setArrivalFlightTimeInfo(FlightTimeInfoType value) {
        this.arrivalFlightTimeInfo = value;
    }

    /**
     * Gets the value of the onGround property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnGround() {
        return onGround;
    }

    /**
     * Sets the value of the onGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnGround(String value) {
        this.onGround = value;
    }

    /**
     * Gets the value of the inBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlock() {
        return inBlock;
    }

    /**
     * Sets the value of the inBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlock(String value) {
        this.inBlock = value;
    }

}
