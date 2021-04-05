
package org.bamboo.model.flightport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Denotes the details of SSR Field Information.
 * 
 * <p>Java class for SsrFieldMetaDataListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsrFieldMetaDataListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SsrFieldMetaData" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrFieldsMetaDataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsrFieldMetaDataListType", propOrder = {
    "ssrFieldMetaData"
})
public class SsrFieldMetaDataListType {

    @XmlElement(name = "SsrFieldMetaData")
    protected List<SsrFieldsMetaDataType> ssrFieldMetaData;

    /**
     * Gets the value of the ssrFieldMetaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrFieldMetaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrFieldMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrFieldsMetaDataType }
     * 
     * 
     */
    public List<SsrFieldsMetaDataType> getSsrFieldMetaData() {
        if (ssrFieldMetaData == null) {
            ssrFieldMetaData = new ArrayList<SsrFieldsMetaDataType>();
        }
        return this.ssrFieldMetaData;
    }

}
