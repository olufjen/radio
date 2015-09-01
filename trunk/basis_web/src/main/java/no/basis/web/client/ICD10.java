
package no.basis.web.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * ICD-10-CM CLASSIFICATION OF DISEASES AND INJURIES
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ICD10", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "http://www.webservicex.net/icd10.asmx?WSDL")
public class ICD10
    extends Service
{

    private final static URL ICD10_WSDL_LOCATION;
    private final static WebServiceException ICD10_EXCEPTION;
    private final static QName ICD10_QNAME = new QName("http://www.webserviceX.NET", "ICD10");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/icd10.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ICD10_WSDL_LOCATION = url;
        ICD10_EXCEPTION = e;
    }

    public ICD10() {
        super(__getWsdlLocation(), ICD10_QNAME);
    }

    public ICD10(WebServiceFeature... features) {
        super(__getWsdlLocation(), ICD10_QNAME, features);
    }

    public ICD10(URL wsdlLocation) {
        super(wsdlLocation, ICD10_QNAME);
    }

    public ICD10(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ICD10_QNAME, features);
    }

    public ICD10(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ICD10(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ICD10Soap
     */
    @WebEndpoint(name = "ICD10Soap")
    public ICD10Soap getICD10Soap() {
        return super.getPort(new QName("http://www.webserviceX.NET", "ICD10Soap"), ICD10Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICD10Soap
     */
    @WebEndpoint(name = "ICD10Soap")
    public ICD10Soap getICD10Soap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "ICD10Soap"), ICD10Soap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ICD10_EXCEPTION!= null) {
            throw ICD10_EXCEPTION;
        }
        return ICD10_WSDL_LOCATION;
    }

}
