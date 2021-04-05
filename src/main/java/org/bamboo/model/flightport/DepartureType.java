
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of the Board Point.
 * 
 * <p>Java class for DepartureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureFlightTimeInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightTimeInfoType"/>
 *         &lt;element name="OffBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffGround" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartureType", propOrder = {
    "departureFlightTimeInfo",
    "offBlock",
    "offGround"
})
public class DepartureType {

    @XmlElement(name = "DepartureFlightTimeInfo", required = true)
    protected FlightTimeInfoType departureFlightTimeInfo;
    @XmlElement(name = "OffBlock")
    protected String offBlock;
    @XmlElement(name = "OffGround")
    protected String offGround;

    /**
     * Gets the value of the departureFlightTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeInfoType }
     *     
     */
    public FlightTimeInfoType getDepartureFlightTimeInfo() {
        return departureFlightTimeInfo;
    }

    /**
     * Sets the value of the departureFlightTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeInfoType }
     *     
     */
    public void setDepartureFlightTimeInfo(FlightTimeInfoType value) {
        this.departureFlightTimeInfo = value;
    }

    /**
     * Gets the value of the offBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffBlock() {
        return offBlock;
    }

    /**
     * Sets the value of the offBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffBlock(String value) {
        this.offBlock = value;
    }

    /**
     * Gets the value of the offGround property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffGround() {
        return offGround;
    }

    /**
     * Sets the value of the offGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffGround(String value) {
        this.offGround = value;
    }

}
