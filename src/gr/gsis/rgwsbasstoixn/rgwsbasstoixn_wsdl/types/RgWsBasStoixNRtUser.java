
package gr.gsis.rgwsbasstoixn.rgwsbasstoixn_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RgWsBasStoixNRtUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RgWsBasStoixNRtUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gr/gsis/rgwsbasstoixn/RgWsBasStoixN.wsdl/types/}RgWsBasStoixNRtBase">
 *       &lt;sequence>
 *         &lt;element name="actLongDescr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postalZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="facActivity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="registDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="stopDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="doyDescr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deactivationFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postalAddressNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postalAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firmPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="onomasia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firmFax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="afm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commerTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RgWsBasStoixNRtUser", propOrder = {
    "actLongDescr",
    "postalZipCode",
    "facActivity",
    "registDate",
    "stopDate",
    "doyDescr",
    "parDescription",
    "deactivationFlag",
    "postalAddressNo",
    "postalAddress",
    "doy",
    "firmPhone",
    "onomasia",
    "firmFax",
    "afm",
    "commerTitle"
})
public class RgWsBasStoixNRtUser
    extends RgWsBasStoixNRtBase
{

    @XmlElement(required = true, nillable = true)
    protected String actLongDescr;
    @XmlElement(required = true, nillable = true)
    protected String postalZipCode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal facActivity;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopDate;
    @XmlElement(required = true, nillable = true)
    protected String doyDescr;
    @XmlElement(required = true, nillable = true)
    protected String parDescription;
    @XmlElement(required = true, nillable = true)
    protected String deactivationFlag;
    @XmlElement(required = true, nillable = true)
    protected String postalAddressNo;
    @XmlElement(required = true, nillable = true)
    protected String postalAddress;
    @XmlElement(required = true, nillable = true)
    protected String doy;
    @XmlElement(required = true, nillable = true)
    protected String firmPhone;
    @XmlElement(required = true, nillable = true)
    protected String onomasia;
    @XmlElement(required = true, nillable = true)
    protected String firmFax;
    @XmlElement(required = true, nillable = true)
    protected String afm;
    @XmlElement(required = true, nillable = true)
    protected String commerTitle;

    /**
     * Gets the value of the actLongDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActLongDescr() {
        return actLongDescr;
    }

    /**
     * Sets the value of the actLongDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActLongDescr(String value) {
        this.actLongDescr = value;
    }

    /**
     * Gets the value of the postalZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalZipCode() {
        return postalZipCode;
    }

    /**
     * Sets the value of the postalZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalZipCode(String value) {
        this.postalZipCode = value;
    }

    /**
     * Gets the value of the facActivity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFacActivity() {
        return facActivity;
    }

    /**
     * Sets the value of the facActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFacActivity(BigDecimal value) {
        this.facActivity = value;
    }

    /**
     * Gets the value of the registDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistDate() {
        return registDate;
    }

    /**
     * Sets the value of the registDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistDate(XMLGregorianCalendar value) {
        this.registDate = value;
    }

    /**
     * Gets the value of the stopDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStopDate() {
        return stopDate;
    }

    /**
     * Sets the value of the stopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStopDate(XMLGregorianCalendar value) {
        this.stopDate = value;
    }

    /**
     * Gets the value of the doyDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoyDescr() {
        return doyDescr;
    }

    /**
     * Sets the value of the doyDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoyDescr(String value) {
        this.doyDescr = value;
    }

    /**
     * Gets the value of the parDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParDescription() {
        return parDescription;
    }

    /**
     * Sets the value of the parDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParDescription(String value) {
        this.parDescription = value;
    }

    /**
     * Gets the value of the deactivationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeactivationFlag() {
        return deactivationFlag;
    }

    /**
     * Sets the value of the deactivationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivationFlag(String value) {
        this.deactivationFlag = value;
    }

    /**
     * Gets the value of the postalAddressNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddressNo() {
        return postalAddressNo;
    }

    /**
     * Sets the value of the postalAddressNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddressNo(String value) {
        this.postalAddressNo = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddress(String value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the doy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoy() {
        return doy;
    }

    /**
     * Sets the value of the doy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoy(String value) {
        this.doy = value;
    }

    /**
     * Gets the value of the firmPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmPhone() {
        return firmPhone;
    }

    /**
     * Sets the value of the firmPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmPhone(String value) {
        this.firmPhone = value;
    }

    /**
     * Gets the value of the onomasia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnomasia() {
        return onomasia;
    }

    /**
     * Sets the value of the onomasia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnomasia(String value) {
        this.onomasia = value;
    }

    /**
     * Gets the value of the firmFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmFax() {
        return firmFax;
    }

    /**
     * Sets the value of the firmFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmFax(String value) {
        this.firmFax = value;
    }

    /**
     * Gets the value of the afm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfm() {
        return afm;
    }

    /**
     * Sets the value of the afm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfm(String value) {
        this.afm = value;
    }

    /**
     * Gets the value of the commerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerTitle() {
        return commerTitle;
    }

    /**
     * Sets the value of the commerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerTitle(String value) {
        this.commerTitle = value;
    }

}
