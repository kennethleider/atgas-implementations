
package org.atgas.sync.media.beyondtv.webservices.btvguidedata;

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
 *         &lt;element name="GetEpisodesByStationResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getEpisodesByStationResult"
})
@XmlRootElement(name = "GetEpisodesByStationResponse")
public class GetEpisodesByStationResponse {

    @XmlElement(name = "GetEpisodesByStationResult")
    protected ArrayOfPVSPropertyBag getEpisodesByStationResult;

    /**
     * Gets the value of the getEpisodesByStationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetEpisodesByStationResult() {
        return getEpisodesByStationResult;
    }

    /**
     * Sets the value of the getEpisodesByStationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetEpisodesByStationResult(ArrayOfPVSPropertyBag value) {
        this.getEpisodesByStationResult = value;
    }

}
