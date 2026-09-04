
package com.bayeesoft.AccFinService.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgAddrsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MsgAddrsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MODULE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="MSGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="COPIES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PRADD" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgAddrsType", propOrder = {
    "module",
    "msgtype",
    "copies",
    "format",
    "pradd"
})
public class MsgAddrsType {

    @XmlElement(name = "MODULE", required = true)
    protected String module;
    @XmlElement(name = "MSGTYPE")
    protected String msgtype;
    @XmlElement(name = "COPIES")
    protected BigInteger copies;
    @XmlElement(name = "FORMAT")
    protected String format;
    @XmlElement(name = "PRADD")
    @XmlSchemaType(name = "string")
    protected YesNoType pradd;

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODULE() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODULE(String value) {
        this.module = value;
    }

    /**
     * Gets the value of the msgtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGTYPE() {
        return msgtype;
    }

    /**
     * Sets the value of the msgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGTYPE(String value) {
        this.msgtype = value;
    }

    /**
     * Gets the value of the copies property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCOPIES() {
        return copies;
    }

    /**
     * Sets the value of the copies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCOPIES(BigInteger value) {
        this.copies = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMAT() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMAT(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the pradd property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getPRADD() {
        return pradd;
    }

    /**
     * Sets the value of the pradd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setPRADD(YesNoType value) {
        this.pradd = value;
    }

}
