
package lifecoach.businesslogic.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import lifecoach.localdb.soap.ws.Measure;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BusinessLogic", targetNamespace = "http://ws.soap.businesslogic.lifecoach/")
@XmlSeeAlso({
    lifecoach.businesslogic.soap.ws.ObjectFactory.class,
    lifecoach.localdb.soap.ws.ObjectFactory.class
})
public interface BusinessLogic {


    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://ws.soap.businesslogic.lifecoach/", className = "lifecoach.businesslogic.soap.ws.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://ws.soap.businesslogic.lifecoach/", className = "lifecoach.businesslogic.soap.ws.SavePersonMeasureResponse")
    @Action(input = "http://ws.soap.businesslogic.lifecoach/BusinessLogic/savePersonMeasureRequest", output = "http://ws.soap.businesslogic.lifecoach/BusinessLogic/savePersonMeasureResponse")
    public String savePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure);

}
