
package carSixt;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CarSixt", targetNamespace = "CarSixt", wsdlLocation = "file:/home/dafarache/NetBeansProjects/DsSys_Assignment2_Client/wsdlFile/CarSixt.wsdl")
public class CarSixt
    extends Service
{

    private final static URL CARSIXT_WSDL_LOCATION;
    private final static WebServiceException CARSIXT_EXCEPTION;
    private final static QName CARSIXT_QNAME = new QName("CarSixt", "CarSixt");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/dafarache/NetBeansProjects/DsSys_Assignment2_Client/wsdlFile/CarSixt.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CARSIXT_WSDL_LOCATION = url;
        CARSIXT_EXCEPTION = e;
    }

    public CarSixt() {
        super(__getWsdlLocation(), CARSIXT_QNAME);
    }

    public CarSixt(WebServiceFeature... features) {
        super(__getWsdlLocation(), CARSIXT_QNAME, features);
    }

    public CarSixt(URL wsdlLocation) {
        super(wsdlLocation, CARSIXT_QNAME);
    }

    public CarSixt(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CARSIXT_QNAME, features);
    }

    public CarSixt(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CarSixt(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CarSixtPort
     */
    @WebEndpoint(name = "CarSixtBinding")
    public CarSixtPort getCarSixtBinding() {
        return super.getPort(new QName("CarSixt", "CarSixtBinding"), CarSixtPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CarSixtPort
     */
    @WebEndpoint(name = "CarSixtBinding")
    public CarSixtPort getCarSixtBinding(WebServiceFeature... features) {
        return super.getPort(new QName("CarSixt", "CarSixtBinding"), CarSixtPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CARSIXT_EXCEPTION!= null) {
            throw CARSIXT_EXCEPTION;
        }
        return CARSIXT_WSDL_LOCATION;
    }

}
