
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDetails_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardDetails_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MASTERCARD"/>
 *     &lt;enumeration value="AMEX"/>
 *     &lt;enumeration value="UATP"/>
 *     &lt;enumeration value="DINERS"/>
 *     &lt;enumeration value="JCB"/>
 *     &lt;enumeration value="KOOKMIN"/>
 *     &lt;enumeration value="HYUNDAI"/>
 *     &lt;enumeration value="SHINHAN"/>
 *     &lt;enumeration value="EXBANK"/>
 *     &lt;enumeration value="LOTTE"/>
 *     &lt;enumeration value="SAMSUNG"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="CREDITCARD"/>
 *     &lt;enumeration value="HANASK"/>
 *     &lt;enumeration value="NONGHYUP"/>
 *     &lt;enumeration value="DUMMY"/>
 *     &lt;enumeration value="PAYPAL"/>
 *     &lt;enumeration value="KAKAOPAY"/>
 *     &lt;enumeration value="MOBILETMONEY"/>
 *     &lt;enumeration value="ALIPAY"/>
 *     &lt;enumeration value="TENPAY"/>
 *     &lt;enumeration value="UNIONPAY"/>
 *     &lt;enumeration value="PAYSBUY"/>
 *     &lt;enumeration value="AXESSCARD"/>
 *     &lt;enumeration value="BONUSCARD"/>
 *     &lt;enumeration value="WORLDCARD"/>
 *     &lt;enumeration value="MAXIMUMCARD"/>
 *     &lt;enumeration value="BKM"/>
 *     &lt;enumeration value="TROY"/>
 *     &lt;enumeration value="CVSPAYMENT"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="MOBILEPAY"/>
 *     &lt;enumeration value="PAYOO"/>
 *     &lt;enumeration value="ABBCREDIT"/>
 *     &lt;enumeration value="WPCREDIT"/>
 *     &lt;enumeration value="WECHATPAY"/>
 *     &lt;enumeration value="NAVERPAY"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="VBA"/>
 *     &lt;enumeration value="QUNAR"/>
 *     &lt;enumeration value="DCKRW"/>
 *     &lt;enumeration value="DCOTH"/>
 *     &lt;enumeration value="OCKRW"/>
 *     &lt;enumeration value="OCOTH"/>
 *     &lt;enumeration value="NTTDATACREDIT"/>
 *     &lt;enumeration value="VISAAPPLEPAY"/>
 *     &lt;enumeration value="MASTERAPPLEPAY"/>
 *     &lt;enumeration value="AMEXAPPLEPAY"/>
 *     &lt;enumeration value="ICCARD"/>
 *     &lt;enumeration value="PAYCO"/>
 *     &lt;enumeration value="TOSS"/>
 *     &lt;enumeration value="TWAYPAY"/>
 *     &lt;enumeration value="MISCELLANEOUS"/>
 *     &lt;enumeration value="DEBITCARD"/>
 *     &lt;enumeration value="NKAKAOPAY"/>
 *     &lt;enumeration value="PAYCO"/>
 *     &lt;enumeration value="LINEPAY"/>
 *     &lt;enumeration value="KBKOOKMIN"/>
 *     &lt;enumeration value="KEBHANA"/>
 *     &lt;enumeration value="VISAINTL"/>
 *     &lt;enumeration value="JCBINTL"/>
 *     &lt;enumeration value="DINERSCLUB"/>
 *     &lt;enumeration value="LOTTEINTL"/>
 *     &lt;enumeration value="MASTERINTL"/>
 *     &lt;enumeration value="CITI"/>
 *     &lt;enumeration value="WOORI"/>
 *     &lt;enumeration value="KWANGJU"/>
 *     &lt;enumeration value="SUHYUP"/>
 *     &lt;enumeration value="JEONBUK"/>
 *     &lt;enumeration value="JEJU"/>
 *     &lt;enumeration value="CHOHUNG"/>
 *     &lt;enumeration value="KDB"/>
 *     &lt;enumeration value="DBPAYMENT"/>
 *     &lt;enumeration value="CARDPAY"/>
 *     &lt;enumeration value="PAYSAFE"/>
 *     &lt;enumeration value="SMILEPAY"/>
 *     &lt;enumeration value="PAYPAY"/>
 *     &lt;enumeration value="SSGPAY"/>
 *     &lt;enumeration value="EASYWELLPOINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardDetails_Type")
@XmlEnum
public enum CardDetailsType {

    VISA,
    MASTERCARD,
    AMEX,
    UATP,
    DINERS,
    JCB,
    KOOKMIN,
    HYUNDAI,
    SHINHAN,
    EXBANK,
    LOTTE,
    SAMSUNG,
    BC,
    CREDITCARD,
    HANASK,
    NONGHYUP,
    DUMMY,
    PAYPAL,
    KAKAOPAY,
    MOBILETMONEY,
    ALIPAY,
    TENPAY,
    UNIONPAY,
    PAYSBUY,
    AXESSCARD,
    BONUSCARD,
    WORLDCARD,
    MAXIMUMCARD,
    BKM,
    TROY,
    CVSPAYMENT,
    EC,
    MOBILEPAY,
    PAYOO,
    ABBCREDIT,
    WPCREDIT,
    WECHATPAY,
    NAVERPAY,
    BA,
    VBA,
    QUNAR,
    DCKRW,
    DCOTH,
    OCKRW,
    OCOTH,
    NTTDATACREDIT,
    VISAAPPLEPAY,
    MASTERAPPLEPAY,
    AMEXAPPLEPAY,
    ICCARD,
    PAYCO,
    TOSS,
    TWAYPAY,
    MISCELLANEOUS,
    DEBITCARD,
    NKAKAOPAY,
    LINEPAY,
    KBKOOKMIN,
    KEBHANA,
    VISAINTL,
    JCBINTL,
    DINERSCLUB,
    LOTTEINTL,
    MASTERINTL,
    CITI,
    WOORI,
    KWANGJU,
    SUHYUP,
    JEONBUK,
    JEJU,
    CHOHUNG,
    KDB,
    DBPAYMENT,
    CARDPAY,
    PAYSAFE,
    SMILEPAY,
    PAYPAY,
    SSGPAY,
    EASYWELLPOINT;

    public String value() {
        return name();
    }

    public static CardDetailsType fromValue(String v) {
        return valueOf(v);
    }

}
