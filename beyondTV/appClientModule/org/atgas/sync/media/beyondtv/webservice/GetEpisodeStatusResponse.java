
package com.snapstream.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.snapstream.types.PVSPropertyBag;


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
 *         &lt;element name="GetEpisodeStatusResult" type="{http://www.snapstream.com/types}PVSPropertyBag" minOccurs="0"/>
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
    "getEpisodeStatusResult"
})
@XmlRootElement(name = "GetEpisodeStatusResponse")
public class GetEpisodeStatusResponse {

    @XmlElement(name = "GetEpisodeStatusResult")
    protected PVSPropertyBag getEpisodeStatusResult;

    /**
     * Gets the value of the getEpisodeStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link PVSPropertyBag }
     *     
     */
    public PVSPropertyBag getGetEpisodeStatusResult() {
        return getEpisodeStatusResult;
    }

    /**
     * Sets the value of the getEpisodeStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PVSPropertyBag }
     *     
     */
    public void setGetEpisodeStatusResult(PVSPropertyBag value) {
        this.getEpisodeStatusResult = value;
    }

}
