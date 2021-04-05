
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OandDInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OandDInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OandDID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SegmentDetailsInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentDetailsInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OandDInfo", propOrder = {
    "oandDID",
    "segmentDetailsInfo"
})
public class OandDInfo {

    @XmlElement(name = "OandDID")
    protected long oandDID;
    @XmlElement(name = "SegmentDetailsInfo", required = true)
    protected List<SegmentDetailsInfo> segmentDetailsInfo;

    /**
     * Gets the value of the oandDID property.
     * 
     */
    public long getOandDID() {
        return oandDID;
    }

    /**
     * Sets the value of the oandDID property.
     * 
     */
    public void setOandDID(long value) {
        this.oandDID = value;
    }

    /**
     * Gets the value of the segmentDetailsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentDetailsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentDetailsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentDetailsInfo }
     * 
     * 
     */
    public List<SegmentDetailsInfo> getSegmentDetailsInfo() {
        if (segmentDetailsInfo == null) {
            segmentDetailsInfo = new ArrayList<SegmentDetailsInfo>();
        }
        return this.segmentDetailsInfo;
    }

}
