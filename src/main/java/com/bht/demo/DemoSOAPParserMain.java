package com.bht.demo;

import com.bht.demo.parser.SOAPParser;
import org.bamboo.model.flightport.*;

import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author binhhuynh1
 */
public class DemoSOAPParserMain {

    /**
     * SeatMapConfiguration: X - Y - X ('-' stands for the aisle)
     * For Example:
     * BOEING A320
     *      - BUSINESS: 2-0-2 (DEC: A - C-D - F)
     *      - ECONOMY:  3-0-3 (DEC: A-B-C-D-E-F)
     * BOEING A787
     */
    public static void main(String[] args) throws JAXBException {
        List<Character> DECAlphabets = Arrays.asList('A','B','C','D','E','F','H','J','K','L','M','N','P','R','S','T','U','V');
        InputStream inputStream = DemoSOAPParserMain.class.getClassLoader()
                .getResourceAsStream("bamboo_seat_res.xml");
        String xmlString = new BufferedReader(new InputStreamReader(Objects
                .requireNonNull(inputStream), StandardCharsets.UTF_8))
                .lines().collect(Collectors.joining("\n"))
                .replaceAll("\\s*[\\r\\n]+\\s*", "");

        ShowSeatMapRS showSeatMapRS = SOAPParser.toObject(xmlString, ShowSeatMapRS.class);
        SeatMapInformation seatMapInformation = Objects.requireNonNull(showSeatMapRS).getSeatMapInformation();
        List<String> attachedSsr = seatMapInformation.getAttachedSsr();
        List<String> zoneAttributes = seatMapInformation.getZoneAttributes();

        /**
         *  'W': window seat
         *  'A': aisle seat
         */
        List<String> locationAttribute = seatMapInformation.getLocationAttribute();
        List<String> seatPriorityAttributes = seatMapInformation.getSeatPriorityAttributes();
        BigInteger maxInfantsPerUnit = seatMapInformation.getMaximumInfantsPerUnit();
        SeatMapDetailsType seatMapdetails = seatMapInformation.getSeatMapdetails();
        DeckDetailsType deckDetailsType = seatMapdetails.getDeckDetails().get(0);
        Integer totalSeats = deckDetailsType.getTotalSeats();
        List<SeatAttributesPositionType> seatAttributesPositionTypes = deckDetailsType.getSeatAttributesPosition();
        List<CabinDetailsType> cabinDetailsTypes = deckDetailsType.getCabinDetails();
        System.out.println(cabinDetailsTypes);
    }
}