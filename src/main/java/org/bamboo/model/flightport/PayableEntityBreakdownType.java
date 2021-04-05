
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayableEntityBreakdownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayableEntityBreakdownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fare" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareEntityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxEntityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Surcharge" type="{http://www.ibsplc.com/iRes/simpleTypes/}SurchargeEntityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fee" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeEntityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayableEntityBreakdownType", propOrder = {
    "fare",
    "tax",
    "surcharge",
    "fee"
})
public class PayableEntityBreakdownType {

    @XmlElement(name = "Fare")
    protected List<FareEntityType> fare;
    @XmlElement(name = "Tax")
    protected List<TaxEntityType> tax;
    @XmlElement(name = "Surcharge")
    protected List<SurchargeEntityType> surcharge;
    @XmlElement(name = "Fee")
    protected List<FeeEntityType> fee;

    /**
     * Gets the value of the fare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareEntityType }
     * 
     * 
     */
    public List<FareEntityType> getFare() {
        if (fare == null) {
            fare = new ArrayList<FareEntityType>();
        }
        return this.fare;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxEntityType }
     * 
     * 
     */
    public List<TaxEntityType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxEntityType>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurchargeEntityType }
     * 
     * 
     */
    public List<SurchargeEntityType> getSurcharge() {
        if (surcharge == null) {
            surcharge = new ArrayList<SurchargeEntityType>();
        }
        return this.surcharge;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeEntityType }
     * 
     * 
     */
    public List<FeeEntityType> getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeEntityType>();
        }
        return this.fee;
    }

}
