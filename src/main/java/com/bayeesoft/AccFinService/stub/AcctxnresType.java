
package com.bayeesoft.AccFinService.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctxnresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcctxnresType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TXNCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DRTTXN" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType" minOccurs="0"/>
 *         <element name="CRTXN" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType" minOccurs="0"/>
 *         <element name="TXNDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctxnresType", propOrder = {
    "txncd",
    "drttxn",
    "crtxn",
    "txndesc"
})
public class AcctxnresType {

    @XmlElement(name = "TXNCD", required = true)
    protected String txncd;
    @XmlElement(name = "DRTTXN")
    @XmlSchemaType(name = "string")
    protected YesNoType drttxn;
    @XmlElement(name = "CRTXN")
    @XmlSchemaType(name = "string")
    protected YesNoType crtxn;
    @XmlElement(name = "TXNDESC")
    protected String txndesc;

    /**
     * Gets the value of the txncd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNCD() {
        return txncd;
    }

    /**
     * Sets the value of the txncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNCD(String value) {
        this.txncd = value;
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

    /**
     * Gets the value of the txndesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNDESC() {
        return txndesc;
    }

    /**
     * Sets the value of the txndesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNDESC(String value) {
        this.txndesc = value;
    }

}
