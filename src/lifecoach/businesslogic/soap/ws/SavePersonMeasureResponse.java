
package lifecoach.businesslogic.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savePersonMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savePersonMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person" type="{http://ws.soap.businesslogic.lifecoach/}feedback" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePersonMeasureResponse", propOrder = {
    "person"
})
public class SavePersonMeasureResponse {

    protected Feedback person;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Feedback }
     *     
     */
    public Feedback getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feedback }
     *     
     */
    public void setPerson(Feedback value) {
        this.person = value;
    }

}
