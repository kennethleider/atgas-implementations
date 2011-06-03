
package org.atgas.sync.media.beyondtv.webservices.btvdispatcher;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="uniqueChannelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "uniqueChannelID"
})
@XmlRootElement(name = "GetActiveRecordingsWithChannel")
public class GetActiveRecordingsWithChannel {

    protected String authTicket;
    protected String uniqueChannelID;

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
     * Gets the value of the uniqueChannelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueChannelID() {
        return uniqueChannelID;
    }

    /**
     * Sets the value of the uniqueChannelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueChannelID(String value) {
        this.uniqueChannelID = value;
    }

}
