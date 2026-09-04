
package com.bayeesoft.AccFinService.stub;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccCrDrLmtsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccCrDrLmtsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CRDRCCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CRLMTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="DRLMTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccCrDrLmtsType", propOrder = {
    "crdrccy",
    "crlmtamt",
    "drlmtamt"
})
public class AccCrDrLmtsType {

    @XmlElement(name = "CRDRCCY", required = true)
    protected String crdrccy;
    @XmlElement(name = "CRLMTAMT")
    protected BigDecimal crlmtamt;
    @XmlElement(name = "DRLMTAMT")
    protected BigDecimal drlmtamt;

    /**
     * Gets the value of the crdrccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDRCCY() {
        return crdrccy;
    }

    /**
     * Sets the value of the crdrccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDRCCY(String value) {
        this.crdrccy = value;
    }

    /**
     * Gets the value of the crlmtamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRLMTAMT() {
        return crlmtamt;
    }

    /**
     * Sets the value of the crlmtamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRLMTAMT(BigDecimal value) {
        this.crlmtamt = value;
    }

    /**
     * Gets the value of the drlmtamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRLMTAMT() {
        return drlmtamt;
    }

    /**
     * Sets the value of the drlmtamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRLMTAMT(BigDecimal value) {
        this.drlmtamt = value;
    }

}
