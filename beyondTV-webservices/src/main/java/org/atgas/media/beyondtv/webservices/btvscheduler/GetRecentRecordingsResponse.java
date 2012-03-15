
package org.atgas.media.beyondtv.webservices.btvscheduler;

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
 *         &lt;element name="GetRecentRecordingsResult" type="{http://www.snapstream.com/WebService}ArrayOfPVSPropertyBag" minOccurs="0"/>
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
    "getRecentRecordingsResult"
})
@XmlRootElement(name = "GetRecentRecordingsResponse")
public class GetRecentRecordingsResponse {

    @XmlElement(name = "GetRecentRecordingsResult")
    protected ArrayOfPVSPropertyBag getRecentRecordingsResult;

    /**
     * Gets the value of the getRecentRecordingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public ArrayOfPVSPropertyBag getGetRecentRecordingsResult() {
        return getRecentRecordingsResult;
    }

    /**
     * Sets the value of the getRecentRecordingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPVSPropertyBag }
     *     
     */
    public void setGetRecentRecordingsResult(ArrayOfPVSPropertyBag value) {
        this.getRecentRecordingsResult = value;
    }

}