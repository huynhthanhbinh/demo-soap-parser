
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PNRTimeLimitDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRTimeLimitDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeLimitAction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeLimitType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeLimitLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TimeLimitUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TimeLimitTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tltTimeInAgentOfficeTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRTimeLimitDetailsType", propOrder = {
    "timeLimitAction",
    "timeLimitType",
    "timeLimitLTC",
    "timeLimitUTC",
    "timeLimitTimeZone",
    "tltTimeInAgentOfficeTimeZone"
})
public class PNRTimeLimitDetailsType {

    @XmlElement(name = "TimeLimitAction", required = true)
    protected String timeLimitAction;
    @XmlElement(name = "TimeLimitType", required = true)
    protected String timeLimitType;
    @XmlElement(name = "TimeLimitLTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLimitLTC;
    @XmlElement(name = "TimeLimitUTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLimitUTC;
    @XmlElement(name = "TimeLimitTimeZone")
    protected String timeLimitTimeZone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tltTimeInAgentOfficeTimeZone;

    /**
     * Gets the value of the timeLimitAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeLimitAction() {
        return timeLimitAction;
    }

    /**
     * Sets the value of the timeLimitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLimitAction(String value) {
        this.timeLimitAction = value;
    }

    /**
     * Gets the value of the timeLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeLimitType() {
        return timeLimitType;
    }

    /**
     * Sets the value of the timeLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLimitType(String value) {
        this.timeLimitType = value;
    }

    /**
     * Gets the value of the timeLimitLTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLimitLTC() {
        return timeLimitLTC;
    }

    /**
     * Sets the value of the timeLimitLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLimitLTC(XMLGregorianCalendar value) {
        this.timeLimitLTC = value;
    }

    /**
     * Gets the value of the timeLimitUTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLimitUTC() {
        return timeLimitUTC;
    }

    /**
     * Sets the value of the timeLimitUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLimitUTC(XMLGregorianCalendar value) {
        this.timeLimitUTC = value;
    }

    /**
     * Gets the value of the timeLimitTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeLimitTimeZone() {
        return timeLimitTimeZone;
    }

    /**
     * Sets the value of the timeLimitTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLimitTimeZone(String value) {
        this.timeLimitTimeZone = value;
    }

    /**
     * Gets the value of the tltTimeInAgentOfficeTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTltTimeInAgentOfficeTimeZone() {
        return tltTimeInAgentOfficeTimeZone;
    }

    /**
     * Sets the value of the tltTimeInAgentOfficeTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTltTimeInAgentOfficeTimeZone(XMLGregorianCalendar value) {
        this.tltTimeInAgentOfficeTimeZone = value;
    }

}
