
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountCouponChangeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountCouponChangeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ActionType"/>
 *         &lt;element name="OldCouponDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DiscountCouponDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NewCouponDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DiscountCouponDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountCouponChangeDetails", propOrder = {
    "actionType",
    "oldCouponDetails",
    "newCouponDetails"
})
public class DiscountCouponChangeDetails {

    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType actionType;
    @XmlElement(name = "OldCouponDetails")
    protected List<DiscountCouponDetails> oldCouponDetails;
    @XmlElement(name = "NewCouponDetails")
    protected List<DiscountCouponDetails> newCouponDetails;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setActionType(ActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the oldCouponDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oldCouponDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOldCouponDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCouponDetails }
     * 
     * 
     */
    public List<DiscountCouponDetails> getOldCouponDetails() {
        if (oldCouponDetails == null) {
            oldCouponDetails = new ArrayList<DiscountCouponDetails>();
        }
        return this.oldCouponDetails;
    }

    /**
     * Gets the value of the newCouponDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newCouponDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewCouponDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCouponDetails }
     * 
     * 
     */
    public List<DiscountCouponDetails> getNewCouponDetails() {
        if (newCouponDetails == null) {
            newCouponDetails = new ArrayList<DiscountCouponDetails>();
        }
        return this.newCouponDetails;
    }

}
