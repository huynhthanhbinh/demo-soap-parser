
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingSegments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingSegments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OAndDId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingSegments", propOrder = {
    "oAndDId",
    "segmentId"
})
public class BookingSegments {

    @XmlElement(name = "OAndDId")
    protected long oAndDId;
    @XmlElement(name = "SegmentId")
    protected long segmentId;

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

}
