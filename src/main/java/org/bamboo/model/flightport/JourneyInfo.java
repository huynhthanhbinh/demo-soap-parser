
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JourneyID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OandDInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyInfo", propOrder = {
    "journeyID",
    "oandDInfo"
})
public class JourneyInfo {

    @XmlElement(name = "JourneyID")
    protected long journeyID;
    @XmlElement(name = "OandDInfo", required = true)
    protected List<OandDInfo> oandDInfo;

    /**
     * Gets the value of the journeyID property.
     * 
     */
    public long getJourneyID() {
        return journeyID;
    }

    /**
     * Sets the value of the journeyID property.
     * 
     */
    public void setJourneyID(long value) {
        this.journeyID = value;
    }

    /**
     * Gets the value of the oandDInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oandDInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOandDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDInfo }
     * 
     * 
     */
    public List<OandDInfo> getOandDInfo() {
        if (oandDInfo == null) {
            oandDInfo = new ArrayList<OandDInfo>();
        }
        return this.oandDInfo;
    }

}
