
package org.atgas.sync.media.beyondtv.webservices.btvbatchprocessor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ProgressByIDResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "progressByIDResult"
})
@XmlRootElement(name = "ProgressByIDResponse")
public class ProgressByIDResponse {

    @XmlElement(name = "ProgressByIDResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long progressByIDResult;

    /**
     * Gets the value of the progressByIDResult property.
     * 
     */
    public long getProgressByIDResult() {
        return progressByIDResult;
    }

    /**
     * Sets the value of the progressByIDResult property.
     * 
     */
    public void setProgressByIDResult(long value) {
        this.progressByIDResult = value;
    }

}
