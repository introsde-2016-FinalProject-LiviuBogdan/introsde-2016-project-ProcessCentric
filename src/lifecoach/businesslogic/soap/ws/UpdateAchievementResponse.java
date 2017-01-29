
package lifecoach.businesslogic.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import lifecoach.localdb.soap.ws.Achievement;


/**
 * <p>Java class for updateAchievementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateAchievementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="achievement" type="{http://ws.soap.localdb.lifecoach/}achievement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAchievementResponse", propOrder = {
    "achievement"
})
public class UpdateAchievementResponse {

    protected Achievement achievement;

    /**
     * Gets the value of the achievement property.
     * 
     * @return
     *     possible object is
     *     {@link Achievement }
     *     
     */
    public Achievement getAchievement() {
        return achievement;
    }

    /**
     * Sets the value of the achievement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Achievement }
     *     
     */
    public void setAchievement(Achievement value) {
        this.achievement = value;
    }

}
