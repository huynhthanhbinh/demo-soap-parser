
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatMapDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SMTCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChildBoardPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildOffPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeckDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DeckDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChildSegmentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapDetailsType", propOrder = {
    "smtCode",
    "offPoint",
    "boardPoint",
    "childBoardPoint",
    "childOffPoint",
    "deckDetails",
    "childSegmentInfo",
    "flightIdentifier"
})
public class SeatMapDetailsType {

    @XmlElement(name = "SMTCode", required = true)
    protected String smtCode;
    @XmlElement(name = "OffPoint", required = true)
    protected String offPoint;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "ChildBoardPoint")
    protected String childBoardPoint;
    @XmlElement(name = "ChildOffPoint")
    protected String childOffPoint;
    @XmlElement(name = "DeckDetails")
    protected List<DeckDetailsType> deckDetails;
    @XmlElement(name = "ChildSegmentInfo")
    protected List<SegmentInfo> childSegmentInfo;
    @XmlElement(name = "FlightIdentifier", required = true)
    protected FlightIdentifierType flightIdentifier;

    /**
     * Gets the value of the smtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMTCode() {
        return smtCode;
    }

    /**
     * Sets the value of the smtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMTCode(String value) {
        this.smtCode = value;
    }

    /**
     * Gets the value of the offPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * Gets the value of the boardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * Sets the value of the boardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * Gets the value of the childBoardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildBoardPoint() {
        return childBoardPoint;
    }

    /**
     * Sets the value of the childBoardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildBoardPoint(String value) {
        this.childBoardPoint = value;
    }

    /**
     * Gets the value of the childOffPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildOffPoint() {
        return childOffPoint;
    }

    /**
     * Sets the value of the childOffPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildOffPoint(String value) {
        this.childOffPoint = value;
    }

    /**
     * Gets the value of the deckDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deckDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeckDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeckDetailsType }
     * 
     * 
     */
    public List<DeckDetailsType> getDeckDetails() {
        if (deckDetails == null) {
            deckDetails = new ArrayList<DeckDetailsType>();
        }
        return this.deckDetails;
    }

    /**
     * Gets the value of the childSegmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childSegmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildSegmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentInfo }
     * 
     * 
     */
    public List<SegmentInfo> getChildSegmentInfo() {
        if (childSegmentInfo == null) {
            childSegmentInfo = new ArrayList<SegmentInfo>();
        }
        return this.childSegmentInfo;
    }

    /**
     * Gets the value of the flightIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifier() {
        return flightIdentifier;
    }

    /**
     * Sets the value of the flightIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifier(FlightIdentifierType value) {
        this.flightIdentifier = value;
    }

}
