
package lifecoach.businesslogic.soap.ws;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BusinessLogic", targetNamespace = "http://ws.soap.businesslogic.lifecoach/", wsdlLocation = "https://virtual-lifecoach-business.herokuapp.com/ws/business?wsdl")
public class BusinessLogic_Service
    extends Service
{

    private final static URL BUSINESSLOGIC_WSDL_LOCATION;
    private final static WebServiceException BUSINESSLOGIC_EXCEPTION;
    private final static QName BUSINESSLOGIC_QNAME = new QName("http://ws.soap.businesslogic.lifecoach/", "BusinessLogic");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://virtual-lifecoach-business.herokuapp.com/ws/business?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BUSINESSLOGIC_WSDL_LOCATION = url;
        BUSINESSLOGIC_EXCEPTION = e;
    }

    public BusinessLogic_Service() {
        super(__getWsdlLocation(), BUSINESSLOGIC_QNAME);
    }

    public BusinessLogic_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BUSINESSLOGIC_QNAME, features);
    }

    public BusinessLogic_Service(URL wsdlLocation) {
        super(wsdlLocation, BUSINESSLOGIC_QNAME);
    }

    public BusinessLogic_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BUSINESSLOGIC_QNAME, features);
    }

    public BusinessLogic_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BusinessLogic_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BusinessLogic
     */
    @WebEndpoint(name = "BusinessLogicImplPort")
    public BusinessLogic getBusinessLogicImplPort() {
        return super.getPort(new QName("http://ws.soap.businesslogic.lifecoach/", "BusinessLogicImplPort"), BusinessLogic.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BusinessLogic
     */
    @WebEndpoint(name = "BusinessLogicImplPort")
    public BusinessLogic getBusinessLogicImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.soap.businesslogic.lifecoach/", "BusinessLogicImplPort"), BusinessLogic.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BUSINESSLOGIC_EXCEPTION!= null) {
            throw BUSINESSLOGIC_EXCEPTION;
        }
        return BUSINESSLOGIC_WSDL_LOCATION;
    }

}
