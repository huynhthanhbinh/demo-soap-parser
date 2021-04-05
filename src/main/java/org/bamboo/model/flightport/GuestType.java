
package org.bamboo.model.flightport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADULT"/>
 *     &lt;enumeration value="CHILD"/>
 *     &lt;enumeration value="INFANT"/>
 *     &lt;enumeration value="MILITARY"/>
 *     &lt;enumeration value="SENIOR"/>
 *     &lt;enumeration value="YOUTH"/>
 *     &lt;enumeration value="CBBG"/>
 *     &lt;enumeration value="SROVR65"/>
 *     &lt;enumeration value="EXST"/>
 *     &lt;enumeration value="CIP"/>
 *     &lt;enumeration value="EMBASSY"/>
 *     &lt;enumeration value="BUSTRP"/>
 *     &lt;enumeration value="FAMEVNT"/>
 *     &lt;enumeration value="AFFILIATES"/>
 *     &lt;enumeration value="AFFCH"/>
 *     &lt;enumeration value="CHJERES"/>
 *     &lt;enumeration value="JEJURES"/>
 *     &lt;enumeration value="MLTRYOTRS"/>
 *     &lt;enumeration value="USAMIL"/>
 *     &lt;enumeration value="PACCINDM"/>
 *     &lt;enumeration value="INDM"/>
 *     &lt;enumeration value="PNMER"/>
 *     &lt;enumeration value="HNDPCH1TO4"/>
 *     &lt;enumeration value="HDCPADL5TO6"/>
 *     &lt;enumeration value="HDCPADL1TO4"/>
 *     &lt;enumeration value="MDISC"/>
 *     &lt;enumeration value="DEFOLIANTS"/>
 *     &lt;enumeration value="STUDENT"/>
 *     &lt;enumeration value="DDHDCRW"/>
 *     &lt;enumeration value="YOUT11TO24"/>
 *     &lt;enumeration value="VACATION"/>
 *     &lt;enumeration value="VACATIONCH"/>
 *     &lt;enumeration value="HNDCAPGUR"/>
 *     &lt;enumeration value="HNDCPGUR"/>
 *     &lt;enumeration value="VACATIONCH50"/>
 *     &lt;enumeration value="EMABSSY"/>
 *     &lt;enumeration value="VACATION50"/>
 *     &lt;enumeration value="AFFILIATE"/>
 *     &lt;enumeration value="AHHCH"/>
 *     &lt;enumeration value="JEJURESCH"/>
 *     &lt;enumeration value="HNDCPCH1TO4"/>
 *     &lt;enumeration value="DVNM1TO3"/>
 *     &lt;enumeration value="DVNM"/>
 *     &lt;enumeration value="YOU11TO24"/>
 *     &lt;enumeration value="ADT"/>
 *     &lt;enumeration value="COB"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="CE"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="CG00"/>
 *     &lt;enumeration value="DG"/>
 *     &lt;enumeration value="DP"/>
 *     &lt;enumeration value="IB00"/>
 *     &lt;enumeration value="IC00"/>
 *     &lt;enumeration value="IC50"/>
 *     &lt;enumeration value="ID00"/>
 *     &lt;enumeration value="ID50"/>
 *     &lt;enumeration value="IF00"/>
 *     &lt;enumeration value="IG20"/>
 *     &lt;enumeration value="II00"/>
 *     &lt;enumeration value="IU20"/>
 *     &lt;enumeration value="IZ00"/>
 *     &lt;enumeration value="JC"/>
 *     &lt;enumeration value="JU"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="MU"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="NN"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="RD"/>
 *     &lt;enumeration value="RG"/>
 *     &lt;enumeration value="RR"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="XX"/>
 *     &lt;enumeration value="ZZ"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="IC90"/>
 *     &lt;enumeration value="IC75"/>
 *     &lt;enumeration value="HC00"/>
 *     &lt;enumeration value="ID90"/>
 *     &lt;enumeration value="ID75"/>
 *     &lt;enumeration value="II90"/>
 *     &lt;enumeration value="II75"/>
 *     &lt;enumeration value="HANDICAPPED"/>
 *     &lt;enumeration value="ISLANDER"/>
 *     &lt;enumeration value="ZED"/>
 *     &lt;enumeration value="ZEA"/>
 *     &lt;enumeration value="ZEC"/>
 *     &lt;enumeration value="ZEI"/>
 *     &lt;enumeration value="ZSP"/>
 *     &lt;enumeration value="ZCS"/>
 *     &lt;enumeration value="ZSO"/>
 *     &lt;enumeration value="ZSS"/>
 *     &lt;enumeration value="ZCO"/>
 *     &lt;enumeration value="ZEP"/>
 *     &lt;enumeration value="ZPS"/>
 *     &lt;enumeration value="ZPM"/>
 *     &lt;enumeration value="ZES"/>
 *     &lt;enumeration value="ZSA"/>
 *     &lt;enumeration value="ZMA"/>
 *     &lt;enumeration value="ZEF"/>
 *     &lt;enumeration value="ZPC"/>
 *     &lt;enumeration value="ZPA"/>
 *     &lt;enumeration value="ZWA"/>
 *     &lt;enumeration value="HANDICAP"/>
 *     &lt;enumeration value="RB"/>
 *     &lt;enumeration value="ZPL"/>
 *     &lt;enumeration value="HDH"/>
 *     &lt;enumeration value="HDC"/>
 *     &lt;enumeration value="HDL"/>
 *     &lt;enumeration value="HDA"/>
 *     &lt;enumeration value="HDJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuestType")
@XmlEnum
public enum GuestType {

    ADULT("ADULT"),
    CHILD("CHILD"),
    INFANT("INFANT"),
    MILITARY("MILITARY"),
    SENIOR("SENIOR"),
    YOUTH("YOUTH"),
    CBBG("CBBG"),
    @XmlEnumValue("SROVR65")
    SROVR_65("SROVR65"),
    EXST("EXST"),
    CIP("CIP"),
    EMBASSY("EMBASSY"),
    BUSTRP("BUSTRP"),
    FAMEVNT("FAMEVNT"),
    AFFILIATES("AFFILIATES"),
    AFFCH("AFFCH"),
    CHJERES("CHJERES"),
    JEJURES("JEJURES"),
    MLTRYOTRS("MLTRYOTRS"),
    USAMIL("USAMIL"),
    PACCINDM("PACCINDM"),
    INDM("INDM"),
    PNMER("PNMER"),
    @XmlEnumValue("HNDPCH1TO4")
    HNDPCH_1_TO_4("HNDPCH1TO4"),
    @XmlEnumValue("HDCPADL5TO6")
    HDCPADL_5_TO_6("HDCPADL5TO6"),
    @XmlEnumValue("HDCPADL1TO4")
    HDCPADL_1_TO_4("HDCPADL1TO4"),
    MDISC("MDISC"),
    DEFOLIANTS("DEFOLIANTS"),
    STUDENT("STUDENT"),
    DDHDCRW("DDHDCRW"),
    @XmlEnumValue("YOUT11TO24")
    YOUT_11_TO_24("YOUT11TO24"),
    VACATION("VACATION"),
    VACATIONCH("VACATIONCH"),
    HNDCAPGUR("HNDCAPGUR"),
    HNDCPGUR("HNDCPGUR"),
    @XmlEnumValue("VACATIONCH50")
    VACATIONCH_50("VACATIONCH50"),
    EMABSSY("EMABSSY"),
    @XmlEnumValue("VACATION50")
    VACATION_50("VACATION50"),
    AFFILIATE("AFFILIATE"),
    AHHCH("AHHCH"),
    JEJURESCH("JEJURESCH"),
    @XmlEnumValue("HNDCPCH1TO4")
    HNDCPCH_1_TO_4("HNDCPCH1TO4"),
    @XmlEnumValue("DVNM1TO3")
    DVNM_1_TO_3("DVNM1TO3"),
    DVNM("DVNM"),
    @XmlEnumValue("YOU11TO24")
    YOU_11_TO_24("YOU11TO24"),
    ADT("ADT"),
    COB("COB"),
    CD("CD"),
    CE("CE"),
    CH("CH"),
    @XmlEnumValue("CG00")
    CG_00("CG00"),
    DG("DG"),
    DP("DP"),
    @XmlEnumValue("IB00")
    IB_00("IB00"),
    @XmlEnumValue("IC00")
    IC_00("IC00"),
    @XmlEnumValue("IC50")
    IC_50("IC50"),
    @XmlEnumValue("ID00")
    ID_00("ID00"),
    @XmlEnumValue("ID50")
    ID_50("ID50"),
    @XmlEnumValue("IF00")
    IF_00("IF00"),
    @XmlEnumValue("IG20")
    IG_20("IG20"),
    @XmlEnumValue("II00")
    II_00("II00"),
    @XmlEnumValue("IU20")
    IU_20("IU20"),
    @XmlEnumValue("IZ00")
    IZ_00("IZ00"),
    JC("JC"),
    JU("JU"),
    MM("MM"),
    MU("MU"),
    NA("NA"),
    ND("ND"),
    NN("NN"),
    PA("PA"),
    PC("PC"),
    PO("PO"),
    PR("PR"),
    RA("RA"),
    RD("RD"),
    RG("RG"),
    RR("RR"),
    SD("SD"),
    XX("XX"),
    ZZ("ZZ"),
    CI("CI"),
    @XmlEnumValue("IC90")
    IC_90("IC90"),
    @XmlEnumValue("IC75")
    IC_75("IC75"),
    @XmlEnumValue("HC00")
    HC_00("HC00"),
    @XmlEnumValue("ID90")
    ID_90("ID90"),
    @XmlEnumValue("ID75")
    ID_75("ID75"),
    @XmlEnumValue("II90")
    II_90("II90"),
    @XmlEnumValue("II75")
    II_75("II75"),
    HANDICAPPED("HANDICAPPED"),
    ISLANDER("ISLANDER"),
    ZED("ZED"),
    ZEA("ZEA"),
    ZEC("ZEC"),
    ZEI("ZEI"),
    ZSP("ZSP"),
    ZCS("ZCS"),
    ZSO("ZSO"),
    ZSS("ZSS"),
    ZCO("ZCO"),
    ZEP("ZEP"),
    ZPS("ZPS"),
    ZPM("ZPM"),
    ZES("ZES"),
    ZSA("ZSA"),
    ZMA("ZMA"),
    ZEF("ZEF"),
    ZPC("ZPC"),
    ZPA("ZPA"),
    ZWA("ZWA"),
    HANDICAP("HANDICAP"),
    RB("RB"),
    ZPL("ZPL"),
    HDH("HDH"),
    HDC("HDC"),
    HDL("HDL"),
    HDA("HDA"),
    HDJ("HDJ");
    private final String value;

    GuestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestType fromValue(String v) {
        for (GuestType c: GuestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
