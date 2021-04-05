package org.bamboo.model.flightport;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Fee complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Fee">
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
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee", propOrder = {
        "amount",
        "feeCode"
})
public class Fee {

    @XmlElement(name = "Amount", required = true, defaultValue = "0")
    protected Amount amount;
    @XmlElement(name = "FeeCode", required = true)
    protected String feeCode;

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
     * Gets the value of the feeCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
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
