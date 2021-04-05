package org.bamboo.model.flightport;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Tax complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Tax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *                 &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax", propOrder = {
        "amount",
        "taxCode",
        "taxName",
        "type"
})
public class Tax {

    @XmlElement(name = "Amount", required = true)
    protected Amount amount;
    @XmlElement(name = "TaxCode", required = true)
    protected String taxCode;
    @XmlElement(name = "TaxName", required = true)
    protected String taxName;
    @XmlElement(name = "Type", required = true)
    protected String type;

    /**
     * Gets the value of the amount property.
     *
     * @return possible object is
     * {@link Amount }
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     *
     * @param value allowed object is
     *              {@link Amount }
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the taxCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * Sets the value of the taxName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
     *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    public static class Amount {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "Currency")
        protected String currency;

        /**
         * Gets the value of the value property.
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

    }

}
