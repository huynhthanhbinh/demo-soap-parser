
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommentTypeCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentCode_Type"/>
 *         &lt;element name="CommentValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommentAddedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CommentAddedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentDetailsType", propOrder = {
    "commentTypeCode",
    "commentValue",
    "commentId",
    "commentAddedTime",
    "commentAddedUser",
    "segmentId",
    "guestId"
})
public class CommentDetailsType {

    @XmlElement(name = "CommentTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected CommentCodeType commentTypeCode;
    @XmlElement(name = "CommentValue", required = true)
    protected String commentValue;
    @XmlElement(name = "CommentId", required = true)
    protected String commentId;
    @XmlElement(name = "CommentAddedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentAddedTime;
    @XmlElement(name = "CommentAddedUser")
    protected String commentAddedUser;
    @XmlElement(name = "SegmentId")
    protected String segmentId;
    @XmlElement(name = "GuestId")
    protected Long guestId;

    /**
     * Gets the value of the commentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CommentCodeType }
     *     
     */
    public CommentCodeType getCommentTypeCode() {
        return commentTypeCode;
    }

    /**
     * Sets the value of the commentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentCodeType }
     *     
     */
    public void setCommentTypeCode(CommentCodeType value) {
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
     * Gets the value of the segmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

}
