
package cliente;

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
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ClienteWebService", targetNamespace = "http://cliente/", wsdlLocation = "http://localhost:8080/ServicioWeb/ClienteWebService?WSDL")
public class ClienteWebService_Service
    extends Service
{

    private final static URL CLIENTEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException CLIENTEWEBSERVICE_EXCEPTION;
    private final static QName CLIENTEWEBSERVICE_QNAME = new QName("http://cliente/", "ClienteWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServicioWeb/ClienteWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTEWEBSERVICE_WSDL_LOCATION = url;
        CLIENTEWEBSERVICE_EXCEPTION = e;
    }

    public ClienteWebService_Service() {
        super(__getWsdlLocation(), CLIENTEWEBSERVICE_QNAME);
    }

    public ClienteWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLIENTEWEBSERVICE_QNAME, features);
    }

    public ClienteWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, CLIENTEWEBSERVICE_QNAME);
    }

    public ClienteWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLIENTEWEBSERVICE_QNAME, features);
    }

    public ClienteWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClienteWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClienteWebService
     */
    @WebEndpoint(name = "ClienteWebServicePort")
    public ClienteWebService getClienteWebServicePort() {
        return super.getPort(new QName("http://cliente/", "ClienteWebServicePort"), ClienteWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClienteWebService
     */
    @WebEndpoint(name = "ClienteWebServicePort")
    public ClienteWebService getClienteWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cliente/", "ClienteWebServicePort"), ClienteWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTEWEBSERVICE_EXCEPTION!= null) {
            throw CLIENTEWEBSERVICE_EXCEPTION;
        }
        return CLIENTEWEBSERVICE_WSDL_LOCATION;
    }

}