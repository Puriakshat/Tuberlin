
package flightHotelCar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HotelCarPort", targetNamespace = "HotelCar")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HotelCarPort {


    /**
     * 
     * @param gcdRequestParamA
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HotelCarcalc")
    @WebResult(name = "HotelCarResponse", partName = "HotelCarResponse")
    @Action(input = "HotelCar/HotelCarPort/HotelCarcalcRequest", output = "HotelCar/HotelCarPort/HotelCarcalcResponse")
    public String hotelCarcalc(
        @WebParam(name = "GCDRequest_paramA", partName = "GCDRequest_paramA")
        String gcdRequestParamA);

}