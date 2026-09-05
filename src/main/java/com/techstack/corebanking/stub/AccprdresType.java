
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccprdresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccprdresType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="PRDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DRTTXN" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType" minOccurs="0"/>
 *         <element name="CRTXN" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccprdresType", propOrder = {
    "prd",
    "prddesc",
    "drttxn",
    "crtxn"
})
public class AccprdresType {

    @XmlElement(name = "PRD", required = true)
    protected String prd;
    @XmlElement(name = "PRDDESC")
    protected String prddesc;
    @XmlElement(name = "DRTTXN")
    @XmlSchemaType(name = "string")
    protected YesNoType drttxn;
    @XmlElement(name = "CRTXN")
    @XmlSchemaType(name = "string")
    protected YesNoType crtxn;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRD() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRD(String value) {
        this.prd = value;
    }

    /**
     * Gets the value of the prddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDDESC() {
        return prddesc;
    }

    /**
     * Sets the value of the prddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDDESC(String value) {
        this.prddesc = value;
    }

    /**
     * Gets the value of the drttxn property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getDRTTXN() {
        return drttxn;
    }

    /**
     * Sets the value of the drttxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setDRTTXN(YesNoType value) {
        this.drttxn = value;
    }

    /**
     * Gets the value of the crtxn property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getCRTXN() {
        return crtxn;
    }

    /**
     * Sets the value of the crtxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setCRTXN(YesNoType value) {
        this.crtxn = value;
    }

}
