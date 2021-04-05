
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
 * <p>Java class for FeeDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airlineCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apiFeeCodeCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="travelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="agentIataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corpAcctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pnrCreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="feeAmountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeAmountDetails" minOccurs="0"/>
 *         &lt;element name="OandDFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDFeeDetailsResponse"/>
 *         &lt;element name="paxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDetailsResponse", propOrder = {
    "feeCode",
    "applicationType",
    "airlineCompanyCode",
    "apiFeeCodeCurrency",
    "channel",
    "travelType",
    "pointOfPurchase",
    "saleDate",
    "agentIataCode",
    "corpAcctId",
    "ruleId",
    "pnrCreationDate",
    "feeAmountDetails",
    "oandDFeeDetails",
    "paxType",
    "ssrCode"
})
public class FeeDetailsResponse {

    @XmlElement(name = "FeeCode")
    protected String feeCode;
    protected String applicationType;
    protected String airlineCompanyCode;
    protected String apiFeeCodeCurrency;
    protected String channel;
    protected String travelType;
    protected String pointOfPurchase;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    protected String agentIataCode;
    protected String corpAcctId;
    protected Long ruleId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pnrCreationDate;
    protected FeeAmountDetails feeAmountDetails;
    @XmlElement(name = "OandDFeeDetails", required = true)
    protected OandDFeeDetailsResponse oandDFeeDetails;
    protected String paxType;
    @XmlElement(name = "SSRCode")
    protected List<String> ssrCode;

    /**
     * Gets the value of the feeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationType(String value) {
        this.applicationType = value;
    }

    /**
     * Gets the value of the airlineCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCompanyCode() {
        return airlineCompanyCode;
    }

    /**
     * Sets the value of the airlineCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCompanyCode(String value) {
        this.airlineCompanyCode = value;
    }

    /**
     * Gets the value of the apiFeeCodeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiFeeCodeCurrency() {
        return apiFeeCodeCurrency;
    }

    /**
     * Sets the value of the apiFeeCodeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiFeeCodeCurrency(String value) {
        this.apiFeeCodeCurrency = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the travelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelType() {
        return travelType;
    }

    /**
     * Sets the value of the travelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelType(String value) {
        this.travelType = value;
    }

    /**
     * Gets the value of the pointOfPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfPurchase() {
        return pointOfPurchase;
    }

    /**
     * Sets the value of the pointOfPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfPurchase(String value) {
        this.pointOfPurchase = value;
    }

    /**
     * Gets the value of the saleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * Sets the value of the saleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
    }

    /**
     * Gets the value of the agentIataCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentIataCode() {
        return agentIataCode;
    }

    /**
     * Sets the value of the agentIataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentIataCode(String value) {
        this.agentIataCode = value;
    }

    /**
     * Gets the value of the corpAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpAcctId() {
        return corpAcctId;
    }

    /**
     * Sets the value of the corpAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpAcctId(String value) {
        this.corpAcctId = value;
    }

    /**
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRuleId(Long value) {
        this.ruleId = value;
    }

    /**
     * Gets the value of the pnrCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPnrCreationDate() {
        return pnrCreationDate;
    }

    /**
     * Sets the value of the pnrCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPnrCreationDate(XMLGregorianCalendar value) {
        this.pnrCreationDate = value;
    }

    /**
     * Gets the value of the feeAmountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmountDetails }
     *     
     */
    public FeeAmountDetails getFeeAmountDetails() {
        return feeAmountDetails;
    }

    /**
     * Sets the value of the feeAmountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmountDetails }
     *     
     */
    public void setFeeAmountDetails(FeeAmountDetails value) {
        this.feeAmountDetails = value;
    }

    /**
     * Gets the value of the oandDFeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OandDFeeDetailsResponse }
     *     
     */
    public OandDFeeDetailsResponse getOandDFeeDetails() {
        return oandDFeeDetails;
    }

    /**
     * Sets the value of the oandDFeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OandDFeeDetailsResponse }
     *     
     */
    public void setOandDFeeDetails(OandDFeeDetailsResponse value) {
        this.oandDFeeDetails = value;
    }

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSSRCode() {
        if (ssrCode == null) {
            ssrCode = new ArrayList<String>();
        }
        return this.ssrCode;
    }

}
