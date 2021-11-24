
package com.dorayakisupplier;

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
@WebServiceClient(name = "DorayakiSupplierService", targetNamespace = "http://topdown.server.jaxws.baeldung.com/", wsdlLocation = "file:/D:/Users/USER/Documents/pertubesan/tubes-2-wbd/dorayaki-supplier/dorayaki-supplier.wsdl")
public class DorayakiSupplierService
    extends Service
{

    private final static URL DORAYAKISUPPLIERSERVICE_WSDL_LOCATION;
    private final static WebServiceException DORAYAKISUPPLIERSERVICE_EXCEPTION;
    private final static QName DORAYAKISUPPLIERSERVICE_QNAME = new QName("http://topdown.server.jaxws.baeldung.com/", "DorayakiSupplierService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Users/USER/Documents/pertubesan/tubes-2-wbd/dorayaki-supplier/dorayaki-supplier.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DORAYAKISUPPLIERSERVICE_WSDL_LOCATION = url;
        DORAYAKISUPPLIERSERVICE_EXCEPTION = e;
    }

    public DorayakiSupplierService() {
        super(__getWsdlLocation(), DORAYAKISUPPLIERSERVICE_QNAME);
    }

    public DorayakiSupplierService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DORAYAKISUPPLIERSERVICE_QNAME, features);
    }

    public DorayakiSupplierService(URL wsdlLocation) {
        super(wsdlLocation, DORAYAKISUPPLIERSERVICE_QNAME);
    }

    public DorayakiSupplierService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DORAYAKISUPPLIERSERVICE_QNAME, features);
    }

    public DorayakiSupplierService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DorayakiSupplierService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DorayakiSupplier
     */
    @WebEndpoint(name = "DorayakiSupplierSOAP")
    public DorayakiSupplier getDorayakiSupplierSOAP() {
        return super.getPort(new QName("http://topdown.server.jaxws.baeldung.com/", "DorayakiSupplierSOAP"), DorayakiSupplier.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DorayakiSupplier
     */
    @WebEndpoint(name = "DorayakiSupplierSOAP")
    public DorayakiSupplier getDorayakiSupplierSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://topdown.server.jaxws.baeldung.com/", "DorayakiSupplierSOAP"), DorayakiSupplier.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DORAYAKISUPPLIERSERVICE_EXCEPTION!= null) {
            throw DORAYAKISUPPLIERSERVICE_EXCEPTION;
        }
        return DORAYAKISUPPLIERSERVICE_WSDL_LOCATION;
    }

}