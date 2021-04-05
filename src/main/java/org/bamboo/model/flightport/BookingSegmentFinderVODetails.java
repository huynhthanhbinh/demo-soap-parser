
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingSegmentFinderVODetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingSegmentFinderVODetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OAndDId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaxFinderVOs" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxFinderVODetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingSegmentFinderVODetails", propOrder = {
    "oAndDId",
    "segmentId",
    "paxFinderVOs"
})
public class BookingSegmentFinderVODetails {

    @XmlElement(name = "OAndDId")
    protected long oAndDId;
    @XmlElement(name = "SegmentId")
    protected long segmentId;
    @XmlElement(name = "PaxFinderVOs", required = true)
    protected List<PaxFinderVODetails> paxFinderVOs;

    /**
     * Gets the value of the oAndDId property.
     * 
     */
    public long getOAndDId() {
        return oAndDId;
    }

    /**
     * Sets the value of the oAndDId property.
     * 
     */
    public void setOAndDId(long value) {
        this.oAndDId = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     */
    public long getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     */
    public void setSegmentId(long value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the paxFinderVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxFinderVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxFinderVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxFinderVODetails }
     * 
     * 
     */
    public List<PaxFinderVODetails> getPaxFinderVOs() {
        if (paxFinderVOs == null) {
            paxFinderVOs = new ArrayList<PaxFinderVODetails>();
        }
        return this.paxFinderVOs;
    }

}
