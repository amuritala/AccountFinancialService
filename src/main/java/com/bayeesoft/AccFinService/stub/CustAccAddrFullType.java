
package com.bayeesoft.AccFinService.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustAccAddrFullType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustAccAddrFullType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CUSTACCADDRESS" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}AccAddrType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAccAddrFullType", propOrder = {
    "xref",
    "custacno",
    "brn",
    "custaccaddress"
})
public class CustAccAddrFullType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "CUSTACNO")
    protected String custacno;
    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "CUSTACCADDRESS", required = true)
    protected AccAddrType custaccaddress;

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
     * Gets the value of the custacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTACNO() {
        return custacno;
    }

    /**
     * Sets the value of the custacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTACNO(String value) {
        this.custacno = value;
    }

    /**
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
    }

    /**
     * Gets the value of the custaccaddress property.
     * 
     * @return
     *     possible object is
     *     {@link AccAddrType }
     *     
     */
    public AccAddrType getCUSTACCADDRESS() {
        return custaccaddress;
    }

    /**
     * Sets the value of the custaccaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccAddrType }
     *     
     */
    public void setCUSTACCADDRESS(AccAddrType value) {
        this.custaccaddress = value;
    }

}
