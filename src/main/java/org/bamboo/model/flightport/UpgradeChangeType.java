
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpgradeChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpgradeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}UpgradeDetails" maxOccurs="unbounded"/>
 *         &lt;element name="canContinueWithoutSsrs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeChangeType", propOrder = {
    "upgradeDetails",
    "canContinueWithoutSsrs"
})
public class UpgradeChangeType {

    @XmlElement(name = "UpgradeDetails", required = true)
    protected List<UpgradeDetails> upgradeDetails;
    protected boolean canContinueWithoutSsrs;

    /**
     * Gets the value of the upgradeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upgradeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpgradeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpgradeDetails }
     * 
     * 
     */
    public List<UpgradeDetails> getUpgradeDetails() {
        if (upgradeDetails == null) {
            upgradeDetails = new ArrayList<UpgradeDetails>();
        }
        return this.upgradeDetails;
    }

    /**
     * Gets the value of the canContinueWithoutSsrs property.
     * 
     */
    public boolean isCanContinueWithoutSsrs() {
        return canContinueWithoutSsrs;
    }

    /**
     * Sets the value of the canContinueWithoutSsrs property.
     * 
     */
    public void setCanContinueWithoutSsrs(boolean value) {
        this.canContinueWithoutSsrs = value;
    }

}
