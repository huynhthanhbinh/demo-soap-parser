
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomNameFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomNameFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROFILE_TYPE"/>
 *     &lt;enumeration value="CARD_SEQ_NUM"/>
 *     &lt;enumeration value="TRANSACTION_ID"/>
 *     &lt;enumeration value="IS_ADC"/>
 *     &lt;enumeration value="TRIP_TYPE"/>
 *     &lt;enumeration value="PAYMENT_REQ_EXTRA_PARAMS"/>
 *     &lt;enumeration value="PROFILE_ID"/>
 *     &lt;enumeration value="PAYMENT_TOKEN_ID"/>
 *     &lt;enumeration value="LOYALTY_ID"/>
 *     &lt;enumeration value="CUSTOMER_CARD_ID"/>
 *     &lt;enumeration value="PARTIALLY_FLOWN_IND"/>
 *     &lt;enumeration value="REPRICE_DATE_GMT"/>
 *     &lt;enumeration value="REPRICE_DATE_GMT_NON_TKTED"/>
 *     &lt;enumeration value="TOKEN_GENERATION_KEY"/>
 *     &lt;enumeration value="TOKEN_GENERATION_URL"/>
 *     &lt;enumeration value="PAYMENT_ORDER_ID"/>
 *     &lt;enumeration value="PAYBACK_CARD_NUM"/>
 *     &lt;enumeration value="PAYBACK_COUPON_NUM"/>
 *     &lt;enumeration value="OFFER_META_DATA"/>
 *     &lt;enumeration value="ANCILLARY_OFFERMETA_DATA"/>
 *     &lt;enumeration value="SUCCESS_URL"/>
 *     &lt;enumeration value="FAILURE_URL"/>
 *     &lt;enumeration value="LOCALE_COUNTRY_CODE"/>
 *     &lt;enumeration value="IS_MOTO_TX"/>
 *     &lt;enumeration value="PAYMENT_GATEWAY_SUPPLEMENTARY_INFO"/>
 *     &lt;enumeration value="PNR_NUMBER"/>
 *     &lt;enumeration value="RLOC"/>
 *     &lt;enumeration value="INTERLINE_PARTNER_TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomNameFieldType")
@XmlEnum
public enum CustomNameFieldType {

    PROFILE_TYPE,
    CARD_SEQ_NUM,
    TRANSACTION_ID,
    IS_ADC,
    TRIP_TYPE,
    PAYMENT_REQ_EXTRA_PARAMS,
    PROFILE_ID,
    PAYMENT_TOKEN_ID,
    LOYALTY_ID,
    CUSTOMER_CARD_ID,
    PARTIALLY_FLOWN_IND,
    REPRICE_DATE_GMT,
    REPRICE_DATE_GMT_NON_TKTED,
    TOKEN_GENERATION_KEY,
    TOKEN_GENERATION_URL,
    PAYMENT_ORDER_ID,
    PAYBACK_CARD_NUM,
    PAYBACK_COUPON_NUM,
    OFFER_META_DATA,
    ANCILLARY_OFFERMETA_DATA,
    SUCCESS_URL,
    FAILURE_URL,
    LOCALE_COUNTRY_CODE,
    IS_MOTO_TX,
    PAYMENT_GATEWAY_SUPPLEMENTARY_INFO,
    PNR_NUMBER,
    RLOC,
    INTERLINE_PARTNER_TYPE;

    public String value() {
        return name();
    }

    public static CustomNameFieldType fromValue(String v) {
        return valueOf(v);
    }

}
