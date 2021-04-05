
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds the segment specific ancillary count
 * 
 * <p>Java class for AncillarySegmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillarySegmentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SegmentId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="AvailableCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillarySegmentInfo")
public class AncillarySegmentInfo {

    @XmlAttribute(name = "SegmentId", required = true)
    protected long segmentId;
    @XmlAttribute(name = "AvailableCount", required = true)
    protected int availableCount;

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
     * Gets the value of the availableCount property.
     * 
     */
    public int getAvailableCount() {
        return availableCount;
    }

    /**
     * Sets the value of the availableCount property.
     * 
     */
    public void setAvailableCount(int value) {
        this.availableCount = value;
    }

}
