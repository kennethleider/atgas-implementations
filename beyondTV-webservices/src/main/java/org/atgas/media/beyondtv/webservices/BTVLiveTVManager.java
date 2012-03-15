
package org.atgas.media.beyondtv.webservices;

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
@WebServiceClient(name = "BTVLiveTVManager", targetNamespace = "http://www.snapstream.com/WebService", wsdlLocation = "http://localhost:8129/wsdl/BTVLiveTVManager.asmx")
public class BTVLiveTVManager
    extends Service
{

    private final static URL BTVLIVETVMANAGER_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.atgas.media.beyondtv.webservices.BTVLiveTVManager.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.atgas.media.beyondtv.webservices.BTVLiveTVManager.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8129/wsdl/BTVLiveTVManager.asmx");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8129/wsdl/BTVLiveTVManager.asmx', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BTVLIVETVMANAGER_WSDL_LOCATION = url;
    }

    public BTVLiveTVManager(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BTVLiveTVManager() {
        super(BTVLIVETVMANAGER_WSDL_LOCATION, new QName("http://www.snapstream.com/WebService", "BTVLiveTVManager"));
    }

    /**
     * 
     * @return
     *     returns BTVLiveTVManagerSoap
     */
    @WebEndpoint(name = "BTVLiveTVManagerSoap")
    public BTVLiveTVManagerSoap getBTVLiveTVManagerSoap() {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVLiveTVManagerSoap"), BTVLiveTVManagerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BTVLiveTVManagerSoap
     */
    @WebEndpoint(name = "BTVLiveTVManagerSoap")
    public BTVLiveTVManagerSoap getBTVLiveTVManagerSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVLiveTVManagerSoap"), BTVLiveTVManagerSoap.class, features);
    }

}