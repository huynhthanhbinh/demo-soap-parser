
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IvrSystemInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IvrSystemInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IvrSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IvrUniqueID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IvrUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxnTimeUTC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomInfoList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomInfoListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IvrSystemInfoType", propOrder = {
    "ivrSource",
    "ivrUniqueID",
    "ivrUser",
    "txnTimeUTC",
    "customInfoList"
})
public class IvrSystemInfoType {

    @XmlElement(name = "IvrSource", required = true)
    protected String ivrSource;
    @XmlElement(name = "IvrUniqueID", required = true)
    protected String ivrUniqueID;
    @XmlElement(name = "IvrUser", required = true)
    protected String ivrUser;
    @XmlElement(name = "TxnTimeUTC", required = true)
    protected String txnTimeUTC;
    @XmlElement(name = "CustomInfoList")
    protected List<CustomInfoListType> customInfoList;

    /**
     * Gets the value of the ivrSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrSource() {
        return ivrSource;
    }

    /**
     * Sets the value of the ivrSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrSource(String value) {
        this.ivrSource = value;
    }

    /**
     * Gets the value of the ivrUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrUniqueID() {
        return ivrUniqueID;
    }

    /**
     * Sets the value of the ivrUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrUniqueID(String value) {
        this.ivrUniqueID = value;
    }

    /**
     * Gets the value of the ivrUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrUser() {
        return ivrUser;
    }

    /**
     * Sets the value of the ivrUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrUser(String value) {
        this.ivrUser = value;
    }

    /**
     * Gets the value of the txnTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnTimeUTC() {
        return txnTimeUTC;
    }

    /**
     * Sets the value of the txnTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnTimeUTC(String value) {
        this.txnTimeUTC = value;
    }

    /**
     * Gets the value of the customInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomInfoListType }
     * 
     * 
     */
    public List<CustomInfoListType> getCustomInfoList() {
        if (customInfoList == null) {
            customInfoList = new ArrayList<CustomInfoListType>();
        }
        return this.customInfoList;
    }

}
