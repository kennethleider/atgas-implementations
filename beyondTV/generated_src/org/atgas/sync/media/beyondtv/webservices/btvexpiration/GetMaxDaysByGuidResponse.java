
package org.atgas.sync.media.beyondtv.webservices.btvexpiration;

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
 *         &lt;element name="GetMaxDaysByGuidResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getMaxDaysByGuidResult"
})
@XmlRootElement(name = "GetMaxDaysByGuidResponse")
public class GetMaxDaysByGuidResponse {

    @XmlElement(name = "GetMaxDaysByGuidResult")
    protected int getMaxDaysByGuidResult;

    /**
     * Gets the value of the getMaxDaysByGuidResult property.
     * 
     */
    public int getGetMaxDaysByGuidResult() {
        return getMaxDaysByGuidResult;
    }

    /**
     * Sets the value of the getMaxDaysByGuidResult property.
     * 
     */
    public void setGetMaxDaysByGuidResult(int value) {
        this.getMaxDaysByGuidResult = value;
    }

}
