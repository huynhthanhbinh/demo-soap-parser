
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeckDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeckDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeckName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SeatAttributesPosition" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAttributesPositionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CabinDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CabinDetailsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckDetailsType", propOrder = {
    "deckName",
    "totalSeats",
    "seatAttributesPosition",
    "cabinDetails"
})
public class DeckDetailsType {

    @XmlElement(name = "DeckName", required = true)
    protected String deckName;
    @XmlElement(name = "TotalSeats")
    protected int totalSeats;
    @XmlElement(name = "SeatAttributesPosition")
    protected List<SeatAttributesPositionType> seatAttributesPosition;
    @XmlElement(name = "CabinDetails", required = true)
    protected List<CabinDetailsType> cabinDetails;

    /**
     * Gets the value of the deckName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckName() {
        return deckName;
    }

    /**
     * Sets the value of the deckName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckName(String value) {
        this.deckName = value;
    }

    /**
     * Gets the value of the totalSeats property.
     * 
     */
    public int getTotalSeats() {
        return totalSeats;
    }

    /**
     * Sets the value of the totalSeats property.
     * 
     */
    public void setTotalSeats(int value) {
        this.totalSeats = value;
    }

    /**
     * Gets the value of the seatAttributesPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAttributesPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAttributesPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAttributesPositionType }
     * 
     * 
     */
    public List<SeatAttributesPositionType> getSeatAttributesPosition() {
        if (seatAttributesPosition == null) {
            seatAttributesPosition = new ArrayList<SeatAttributesPositionType>();
        }
        return this.seatAttributesPosition;
    }

    /**
     * Gets the value of the cabinDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinDetailsType }
     * 
     * 
     */
    public List<CabinDetailsType> getCabinDetails() {
        if (cabinDetails == null) {
            cabinDetails = new ArrayList<CabinDetailsType>();
        }
        return this.cabinDetails;
    }

}
