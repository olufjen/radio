
package no.basis.web.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICD10Soap", targetNamespace = "http://www.webserviceX.NET")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ICD10Soap {


    /**
     * ICD-10-CM CLASSIFICATION OF DISEASES AND INJURIES
     * 
     * @param icd10Code
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetICD10", action = "http://www.webserviceX.NET/GetICD10")
    @WebResult(name = "GetICD10Result", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetICD10", targetNamespace = "http://www.webserviceX.NET", className = "client.GetICD10")
    @ResponseWrapper(localName = "GetICD10Response", targetNamespace = "http://www.webserviceX.NET", className = "client.GetICD10Response")
    public String getICD10(
        @WebParam(name = "ICD10Code", targetNamespace = "http://www.webserviceX.NET")
        String icd10Code);

    /**
     * ICD-10-CM CLASSIFICATION OF DISEASES AND INJURIES by description
     * 
     * @param icd10Description
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetICD10ByDescription", action = "http://www.webserviceX.NET/GetICD10ByDescription")
    @WebResult(name = "GetICD10ByDescriptionResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetICD10ByDescription", targetNamespace = "http://www.webserviceX.NET", className = "client.GetICD10ByDescription")
    @ResponseWrapper(localName = "GetICD10ByDescriptionResponse", targetNamespace = "http://www.webserviceX.NET", className = "client.GetICD10ByDescriptionResponse")
    public String getICD10ByDescription(
        @WebParam(name = "ICD10Description", targetNamespace = "http://www.webserviceX.NET")
        String icd10Description);

}
