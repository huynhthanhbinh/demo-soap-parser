
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommentTypeCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentTypeCode"/>
 *         &lt;element name="CommentValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentAddedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CommentAddedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentType", propOrder = {
    "commentTypeCode",
    "commentValue",
    "commentId",
    "commentAddedTime",
    "commentAddedUser",
    "segmentIds"
})
public class CommentType {

    @XmlElement(name = "CommentTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected CommentTypeCode commentTypeCode;
    @XmlElement(name = "CommentValue", required = true)
    protected String commentValue;
    @XmlElement(name = "CommentId")
    protected String commentId;
    @XmlElement(name = "CommentAddedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentAddedTime;
    @XmlElement(name = "CommentAddedUser")
    protected String commentAddedUser;
    @XmlElement(name = "SegmentIds", type = Long.class)
    protected List<Long> segmentIds;

    /**
     * Gets the value of the commentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CommentTypeCode }
     *     
     */
    public CommentTypeCode getCommentTypeCode() {
        return commentTypeCode;
    }

    /**
     * Sets the value of the commentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentTypeCode }
     *     
     */
    public void setCommentTypeCode(CommentTypeCode value) {
        this.commentTypeCode = value;
    }

    /**
     * Gets the value of the commentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentValue() {
        return commentValue;
    }

    /**
     * Sets the value of the commentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentValue(String value) {
        this.commentValue = value;
    }

    /**
     * Gets the value of the commentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets the value of the commentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentId(String value) {
        this.commentId = value;
    }

    /**
     * Gets the value of the commentAddedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommentAddedTime() {
        return commentAddedTime;
    }

    /**
     * Sets the value of the commentAddedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommentAddedTime(XMLGregorianCalendar value) {
        this.commentAddedTime = value;
    }

    /**
     * Gets the value of the commentAddedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentAddedUser() {
        return commentAddedUser;
    }

    /**
     * Sets the value of the commentAddedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentAddedUser(String value) {
        this.commentAddedUser = value;
    }

    /**
     * Gets the value of the segmentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSegmentIds() {
        if (segmentIds == null) {
            segmentIds = new ArrayList<Long>();
        }
        return this.segmentIds;
    }

}
