
package org.bamboo.model.flightport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FlightPort", targetNamespace = "http://www.ibsplc.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FlightPort {


    /**
     * 
     * @param flightInfoRequest
     * @return
     *     returns org.bamboo.model.flightport.FlightInfoRS
     */
    @WebMethod(action = "urn:#getFlightInformation")
    @WebResult(name = "FlightInfoRS", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "FlightInfoResponse")
    public FlightInfoRS getFlightInformation(
        @WebParam(name = "FlightInfoRQ", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "FlightInfoRequest")
        FlightInfoRQ flightInfoRequest);

    /**
     * 
     * @param getFlightDataElementsRequest
     * @return
     *     returns org.bamboo.model.flightport.GetFlightDataElementsRS
     */
    @WebMethod(action = "urn:#getFlightDataElements")
    @WebResult(name = "GetFlightDataElementsRS", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "GetFlightDataElementsResponse")
    public GetFlightDataElementsRS getFlightDataElements(
        @WebParam(name = "GetFlightDataElementsRQ", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "GetFlightDataElementsRequest")
        GetFlightDataElementsRQ getFlightDataElementsRequest);

    /**
     * 
     * @param retrieveFlightScheduleRequest
     * @return
     *     returns org.bamboo.model.flightport.RetrieveFlightScheduleRS
     */
    @WebMethod(action = "urn:#getFlightSchedule")
    @WebResult(name = "RetrieveFlightScheduleRS", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "RetrieveFlightScheduleResponse")
    public RetrieveFlightScheduleRS getFlightSchedule(
        @WebParam(name = "RetrieveFlightScheduleRQ", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "RetrieveFlightScheduleRequest")
        RetrieveFlightScheduleRQ retrieveFlightScheduleRequest);

    /**
     * 
     * @param throughFlightDetailsRequest
     * @return
     *     returns org.bamboo.model.flightport.ThroughFlightDetailsRS
     */
    @WebMethod(action = "urn:#getThroughFlightDetails")
    @WebResult(name = "ThroughFlightDetailsRS", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "ThroughFlightDetailsResponse")
    public ThroughFlightDetailsRS getThroughFlightDetails(
        @WebParam(name = "ThroughFlightDetailsRQ", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "ThroughFlightDetailsRequest")
        ThroughFlightDetailsRQ throughFlightDetailsRequest);

    /**
     * This service retrieves the full manifest for the flight.
     * 		
     * 
     * @param retrieveFlightManifestRequest
     * @return
     *     returns org.bamboo.model.flightport.RetrieveFlightManifestRS
     */
    @WebMethod(action = "urn:#retrieveFlightManifest")
    @WebResult(name = "RetrieveFlightManifestRS", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "parameter")
    public RetrieveFlightManifestRS retrieveFlightManifest(
        @WebParam(name = "RetrieveFlightManifestRQ", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "RetrieveFlightManifestRequest")
        RetrieveFlightManifestRQ retrieveFlightManifestRequest);

    /**
     * This service retrieves the passenger details including the home contact details, passenger name and passenger type corresponding to the flight number, flight date and agency details. The listing is for all the PNRs booked in the flight booked by the agency given in the search criteria.
     * 		
     * 
     * @param retrievePassengerManifestRequest
     * @return
     *     returns org.bamboo.model.flightport.RetrievePassengerManifestRS
     */
    @WebMethod(action = "urn:#retrievePassengerManifest")
    @WebResult(name = "RetrievePassengerManifestRS", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "RetrievePassengerManifestResponse")
    public RetrievePassengerManifestRS retrievePassengerManifest(
        @WebParam(name = "RetrievePassengerManifestRQ", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "RetrievePassengerManifestRequest")
        RetrievePassengerManifestRQ retrievePassengerManifestRequest);

    /**
     * 
     * @param validateMctRequest
     * @return
     *     returns org.bamboo.model.flightport.ValidateMctRS
     */
    @WebMethod(action = "urn:#validateMinConnectionTime")
    @WebResult(name = "ValidateMctRS", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "ValidateMctResponse")
    public ValidateMctRS validateMinConnectionTime(
        @WebParam(name = "ValidateMctRQ", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "ValidateMctRequest")
        ValidateMctRQ validateMctRequest);

    /**
     * Retrieves the seat map for the flight segment.
     * 		
     * 
     * @param showSeatMapRequest
     * @return
     *     returns org.bamboo.model.flightport.ShowSeatMapRS
     */
    @WebMethod(action = "urn:#showSeatMap")
    @WebResult(name = "ShowSeatMapRS", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "ShowSeatMapResponse")
    public ShowSeatMapRS showSeatMap(
        @WebParam(name = "ShowSeatMapRQ", targetNamespace = "http://www.ibsplc.com/iRes/simpleTypes/", partName = "ShowSeatMapRequest")
        ShowSeatMapRQ showSeatMapRequest);

}