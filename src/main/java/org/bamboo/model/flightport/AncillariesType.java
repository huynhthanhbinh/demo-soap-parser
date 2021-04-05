
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillariesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillariesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleableSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableSsrsType" minOccurs="0"/>
 *         &lt;element name="SaleableAuxs" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableAuxsType" minOccurs="0"/>
 *         &lt;element name="NotifiableSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}NotifiableSsrsType" minOccurs="0"/>
 *         &lt;element name="NotofiableAuxs" type="{http://www.ibsplc.com/iRes/simpleTypes/}NotofiableAuxsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillariesType", propOrder = {
    "saleableSsrs",
    "saleableAuxs",
    "notifiableSsrs",
    "notofiableAuxs"
})
public class AncillariesType {

    @XmlElement(name = "SaleableSsrs")
    protected SaleableSsrsType saleableSsrs;
    @XmlElement(name = "SaleableAuxs")
    protected SaleableAuxsType saleableAuxs;
    @XmlElement(name = "NotifiableSsrs")
    protected NotifiableSsrsType notifiableSsrs;
    @XmlElement(name = "NotofiableAuxs")
    protected NotofiableAuxsType notofiableAuxs;

    /**
     * Gets the value of the saleableSsrs property.
     * 
     * @return
     *     possible object is
     *     {@link SaleableSsrsType }
     *     
     */
    public SaleableSsrsType getSaleableSsrs() {
        return saleableSsrs;
    }

    /**
     * Sets the value of the saleableSsrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleableSsrsType }
     *     
     */
    public void setSaleableSsrs(SaleableSsrsType value) {
        this.saleableSsrs = value;
    }

    /**
     * Gets the value of the saleableAuxs property.
     * 
     * @return
     *     possible object is
     *     {@link SaleableAuxsType }
     *     
     */
    public SaleableAuxsType getSaleableAuxs() {
        return saleableAuxs;
    }

    /**
     * Sets the value of the saleableAuxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleableAuxsType }
     *     
     */
    public void setSaleableAuxs(SaleableAuxsType value) {
        this.saleableAuxs = value;
    }

    /**
     * Gets the value of the notifiableSsrs property.
     * 
     * @return
     *     possible object is
     *     {@link NotifiableSsrsType }
     *     
     */
    public NotifiableSsrsType getNotifiableSsrs() {
        return notifiableSsrs;
    }

    /**
     * Sets the value of the notifiableSsrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifiableSsrsType }
     *     
     */
    public void setNotifiableSsrs(NotifiableSsrsType value) {
        this.notifiableSsrs = value;
    }

    /**
     * Gets the value of the notofiableAuxs property.
     * 
     * @return
     *     possible object is
     *     {@link NotofiableAuxsType }
     *     
     */
    public NotofiableAuxsType getNotofiableAuxs() {
        return notofiableAuxs;
    }

    /**
     * Sets the value of the notofiableAuxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotofiableAuxsType }
     *     
     */
    public void setNotofiableAuxs(NotofiableAuxsType value) {
        this.notofiableAuxs = value;
    }

}
