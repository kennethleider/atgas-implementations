
package org.atgas.sync.media.beyondtv.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BTVLicenseManager", targetNamespace = "http://www.snapstream.com/WebService", wsdlLocation = "http://localhost:8129/wsdl/BTVLicenseManager.asmx")
public class BTVLicenseManager
    extends Service
{

    private final static URL BTVLICENSEMANAGER_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.atgas.sync.media.beyondtv.webservices.BTVLicenseManager.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.atgas.sync.media.beyondtv.webservices.BTVLicenseManager.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8129/wsdl/BTVLicenseManager.asmx");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8129/wsdl/BTVLicenseManager.asmx', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BTVLICENSEMANAGER_WSDL_LOCATION = url;
    }

    public BTVLicenseManager(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BTVLicenseManager() {
        super(BTVLICENSEMANAGER_WSDL_LOCATION, new QName("http://www.snapstream.com/WebService", "BTVLicenseManager"));
    }

    /**
     * 
     * @return
     *     returns BTVLicenseManagerSoap
     */
    @WebEndpoint(name = "BTVLicenseManagerSoap")
    public BTVLicenseManagerSoap getBTVLicenseManagerSoap() {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVLicenseManagerSoap"), BTVLicenseManagerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BTVLicenseManagerSoap
     */
    @WebEndpoint(name = "BTVLicenseManagerSoap")
    public BTVLicenseManagerSoap getBTVLicenseManagerSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVLicenseManagerSoap"), BTVLicenseManagerSoap.class, features);
    }

}