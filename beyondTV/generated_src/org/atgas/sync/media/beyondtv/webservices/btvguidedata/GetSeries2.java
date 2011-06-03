
package org.atgas.sync.media.beyondtv.webservices.btvguidedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uiStart" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="uiResults" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authTicket",
    "uiStart",
    "uiResults"
})
@XmlRootElement(name = "GetSeries2")
public class GetSeries2 {

    protected String authTicket;
    @XmlSchemaType(name = "unsignedInt")
    protected long uiStart;
    @XmlSchemaType(name = "unsignedInt")
    protected long uiResults;

    /**
     * Gets the value of the authTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTicket() {
        return authTicket;
    }

    /**
     * Sets the value of the authTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTicket(String value) {
        this.authTicket = value;
    }

    /**
     * Gets the value of the uiStart property.
     * 
     */
    public long getUiStart() {
        return uiStart;
    }

    /**
     * Sets the value of the uiStart property.
     * 
     */
    public void setUiStart(long value) {
        this.uiStart = value;
    }

    /**
     * Gets the value of the uiResults property.
     * 
     */
    public long getUiResults() {
        return uiResults;
    }

    /**
     * Sets the value of the uiResults property.
     * 
     */
    public void setUiResults(long value) {
        this.uiResults = value;
    }

}
