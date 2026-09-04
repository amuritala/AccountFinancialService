
package com.bayeesoft.AccFinService.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdhocStmtResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdhocStmtResType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DCN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocStmtResType", propOrder = {
    "xref",
    "dcn"
})
public class AdhocStmtResType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "DCN", required = true)
    protected String dcn;

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXREF() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXREF(String value) {
        this.xref = value;
    }

    /**
     * Gets the value of the dcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCN() {
        return dcn;
    }

    /**
     * Sets the value of the dcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCN(String value) {
        this.dcn = value;
    }

}
