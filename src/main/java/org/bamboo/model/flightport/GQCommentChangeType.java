
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GQCommentChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GQCommentChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PnrActionType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrActionType"/>
 *         &lt;element name="GroupQuoteCommentsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupQuoteCommentsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GQCommentChangeType", propOrder = {
    "pnrActionType",
    "groupQuoteCommentsType"
})
public class GQCommentChangeType {

    @XmlElement(name = "PnrActionType", required = true)
    @XmlSchemaType(name = "string")
    protected PnrActionType pnrActionType;
    @XmlElement(name = "GroupQuoteCommentsType")
    protected GroupQuoteCommentsType groupQuoteCommentsType;

    /**
     * Gets the value of the pnrActionType property.
     * 
     * @return
     *     possible object is
     *     {@link PnrActionType }
     *     
     */
    public PnrActionType getPnrActionType() {
        return pnrActionType;
    }

    /**
     * Sets the value of the pnrActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnrActionType }
     *     
     */
    public void setPnrActionType(PnrActionType value) {
        this.pnrActionType = value;
    }

    /**
     * Gets the value of the groupQuoteCommentsType property.
     * 
     * @return
     *     possible object is
     *     {@link GroupQuoteCommentsType }
     *     
     */
    public GroupQuoteCommentsType getGroupQuoteCommentsType() {
        return groupQuoteCommentsType;
    }

    /**
     * Sets the value of the groupQuoteCommentsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupQuoteCommentsType }
     *     
     */
    public void setGroupQuoteCommentsType(GroupQuoteCommentsType value) {
        this.groupQuoteCommentsType = value;
    }

}
