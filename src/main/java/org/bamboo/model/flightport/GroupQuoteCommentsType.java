
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GroupQuoteCommentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupQuoteCommentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommentTypeCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentCode_Type"/>
 *         &lt;element name="CommentSubTypeCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentSubTypeCode"/>
 *         &lt;element name="CommentText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommentAddedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CommentAddedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentFirstReadBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupQuoteCommentsType", propOrder = {
    "action",
    "commentTypeCode",
    "commentSubTypeCode",
    "commentText",
    "commentId",
    "commentAddedTime",
    "commentAddedUser",
    "commentFirstReadBy"
})
public class GroupQuoteCommentsType {

    @XmlElement(name = "Action", required = true)
    protected String action;
    @XmlElement(name = "CommentTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected CommentCodeType commentTypeCode;
    @XmlElement(name = "CommentSubTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected CommentSubTypeCode commentSubTypeCode;
    @XmlElement(name = "CommentText", required = true)
    protected String commentText;
    @XmlElement(name = "CommentId", required = true)
    protected String commentId;
    @XmlElement(name = "CommentAddedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentAddedTime;
    @XmlElement(name = "CommentAddedUser")
    protected String commentAddedUser;
    @XmlElement(name = "CommentFirstReadBy")
    protected String commentFirstReadBy;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

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
     * Gets the value of the commentSubTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CommentSubTypeCode }
     *     
     */
    public CommentSubTypeCode getCommentSubTypeCode() {
        return commentSubTypeCode;
    }

    /**
     * Sets the value of the commentSubTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentSubTypeCode }
     *     
     */
    public void setCommentSubTypeCode(CommentSubTypeCode value) {
        this.commentSubTypeCode = value;
    }

    /**
     * Gets the value of the commentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentText(String value) {
        this.commentText = value;
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
     * Gets the value of the commentFirstReadBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentFirstReadBy() {
        return commentFirstReadBy;
    }

    /**
     * Sets the value of the commentFirstReadBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentFirstReadBy(String value) {
        this.commentFirstReadBy = value;
    }

}
