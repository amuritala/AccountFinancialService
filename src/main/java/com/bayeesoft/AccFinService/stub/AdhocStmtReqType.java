
package com.bayeesoft.AccFinService.stub;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdhocStmtReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdhocStmtReqType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FRMDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="TODT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="STMTTYPE" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}StmtType" minOccurs="0"/>
 *         <element name="BALANCETYPE" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}BalanceType" minOccurs="0"/>
 *         <element name="APPLYCHG" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocStmtReqType", propOrder = {
    "xref",
    "acc",
    "brn",
    "frmdt",
    "todt",
    "stmttype",
    "balancetype",
    "applychg"
})
public class AdhocStmtReqType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "FRMDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frmdt;
    @XmlElement(name = "TODT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar todt;
    @XmlElement(name = "STMTTYPE")
    @XmlSchemaType(name = "string")
    protected StmtType stmttype;
    @XmlElement(name = "BALANCETYPE")
    @XmlSchemaType(name = "string")
    protected BalanceType balancetype;
    @XmlElement(name = "APPLYCHG")
    @XmlSchemaType(name = "string")
    protected YesNoType applychg;

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
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC(String value) {
        this.acc = value;
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
     * Gets the value of the frmdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFRMDT() {
        return frmdt;
    }

    /**
     * Sets the value of the frmdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFRMDT(XMLGregorianCalendar value) {
        this.frmdt = value;
    }

    /**
     * Gets the value of the todt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTODT() {
        return todt;
    }

    /**
     * Sets the value of the todt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTODT(XMLGregorianCalendar value) {
        this.todt = value;
    }

    /**
     * Gets the value of the stmttype property.
     * 
     * @return
     *     possible object is
     *     {@link StmtType }
     *     
     */
    public StmtType getSTMTTYPE() {
        return stmttype;
    }

    /**
     * Sets the value of the stmttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtType }
     *     
     */
    public void setSTMTTYPE(StmtType value) {
        this.stmttype = value;
    }

    /**
     * Gets the value of the balancetype property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType }
     *     
     */
    public BalanceType getBALANCETYPE() {
        return balancetype;
    }

    /**
     * Sets the value of the balancetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType }
     *     
     */
    public void setBALANCETYPE(BalanceType value) {
        this.balancetype = value;
    }

    /**
     * Gets the value of the applychg property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getAPPLYCHG() {
        return applychg;
    }

    /**
     * Sets the value of the applychg property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setAPPLYCHG(YesNoType value) {
        this.applychg = value;
    }

}
