
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
@WebServiceClient(name = "BTVTaskListProcessor", targetNamespace = "http://www.snapstream.com/WebService", wsdlLocation = "http://localhost:8129/wsdl/BTVBatchProcessor.asmx")
public class BTVTaskListProcessor
    extends Service
{

    private final static URL BTVTASKLISTPROCESSOR_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.atgas.media.beyondtv.webservices.BTVTaskListProcessor.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.atgas.media.beyondtv.webservices.BTVTaskListProcessor.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8129/wsdl/BTVBatchProcessor.asmx");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8129/wsdl/BTVBatchProcessor.asmx', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BTVTASKLISTPROCESSOR_WSDL_LOCATION = url;
    }

    public BTVTaskListProcessor(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BTVTaskListProcessor() {
        super(BTVTASKLISTPROCESSOR_WSDL_LOCATION, new QName("http://www.snapstream.com/WebService", "BTVTaskListProcessor"));
    }

    /**
     * 
     * @return
     *     returns BTVTaskListProcessorSoap
     */
    @WebEndpoint(name = "BTVTaskListProcessorSoap")
    public BTVTaskListProcessorSoap getBTVTaskListProcessorSoap() {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVTaskListProcessorSoap"), BTVTaskListProcessorSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BTVTaskListProcessorSoap
     */
    @WebEndpoint(name = "BTVTaskListProcessorSoap")
    public BTVTaskListProcessorSoap getBTVTaskListProcessorSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVTaskListProcessorSoap"), BTVTaskListProcessorSoap.class, features);
    }

}