
package org.atgas.sync.media.beyondTV.webservices.btvlivetvmanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="NewSessionResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "newSessionResult"
})
@XmlRootElement(name = "NewSessionResponse")
public class NewSessionResponse {

    @XmlElement(name = "NewSessionResult", required = true)
    protected String newSessionResult;

    /**
     * Gets the value of the newSessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSessionResult() {
        return newSessionResult;
    }

    /**
     * Sets the value of the newSessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSessionResult(String value) {
        this.newSessionResult = value;
    }

}