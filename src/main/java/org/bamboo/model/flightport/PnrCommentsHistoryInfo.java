
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnrCommentsHistoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrCommentsHistoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElementAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnrComments" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrCommentsHistoryInfo", propOrder = {
    "elementAction",
    "pnrComments"
})
public class PnrCommentsHistoryInfo {

    @XmlElement(name = "ElementAction")
    protected String elementAction;
    @XmlElement(name = "PnrComments")
    protected List<CommentDetailsType> pnrComments;

    /**
     * Gets the value of the elementAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementAction() {
        return elementAction;
    }

    /**
     * Sets the value of the elementAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementAction(String value) {
        this.elementAction = value;
    }

    /**
     * Gets the value of the pnrComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentDetailsType }
     * 
     * 
     */
    public List<CommentDetailsType> getPnrComments() {
        if (pnrComments == null) {
            pnrComments = new ArrayList<CommentDetailsType>();
        }
        return this.pnrComments;
    }

}
