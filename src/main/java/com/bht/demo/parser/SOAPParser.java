package com.bht.demo.parser;

import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.MessageFormat;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SOAPParser {

    private static final Map<String, JAXBContext> jaxbContextMap = new ConcurrentHashMap<>();
    private static final String FAULT_PATTERN = "<(\\w+:)?Fault(.*)Fault>";
    private static final String SOAP_BODY_PATTERN = "<(\\w+:)?soap:Body(.*)soap:Body>";
    public static final String EXCLUDE_STRING = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";

    private SOAPParser() {
    }

    public static <T> String toXML(T object, Class<?> clazz) throws JAXBException {
        JAXBContext contextForRequest = getJAXBContext(clazz);
        Marshaller m = contextForRequest.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter stringWriter = new StringWriter();
        m.marshal(object, stringWriter);
        return stringWriter.toString()
                .replaceAll("\\s*[\\r\\n]+\\s*", "")
                .replace(EXCLUDE_STRING, "")
                .trim();
    }

    @SuppressWarnings("unchecked")
    public static <T> T toObject(String xmlString, Class<T> clazz) throws JAXBException {
        XmlRootElement xmlRootElement = clazz.getAnnotation(XmlRootElement.class);
        if (Objects.isNull(xmlRootElement)) {
            throw new IllegalArgumentException("Missing \"XmlRootElement\" in " + clazz.getSimpleName());
        }
        String pattern = MessageFormat.format("<(\\w+:)?{0}(.*){0}>", xmlRootElement.name());
        Matcher matcher = Pattern.compile(pattern).matcher(xmlString);
        Matcher bodyMatcher = Pattern.compile(SOAP_BODY_PATTERN).matcher(xmlString);
        Matcher matcherFault = Pattern.compile(FAULT_PATTERN).matcher(xmlString);
        if (bodyMatcher.find() && matcher.find()) {
            JAXBContext jaxbContext = getJAXBContext(clazz);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader stringReader = new StringReader(matcher.group());
            InputSource inputSource = new InputSource(stringReader);
            return (T) unmarshaller.unmarshal(inputSource);
        } else if (matcherFault.find()) {
            throw new IllegalArgumentException(matcherFault.group());
        }
        return null;
    }

    private static JAXBContext getJAXBContext(Class<?> clazz) {
        String key = clazz.getCanonicalName();
        jaxbContextMap.computeIfAbsent(key, missingKey -> {
            try {
                return JAXBContext.newInstance(clazz);
            } catch (JAXBException e) {
                e.printStackTrace();
            }
            return null;
        });
        return jaxbContextMap.get(key);
    }
}