
package com.techstack.corebanking.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingPrefType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CONSOLACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BILLIQD" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}BILLIQDType" minOccurs="0"/>
 *         <element name="SETLMTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DIRDEBIT" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType" minOccurs="0"/>
 *         <element name="DDBNKCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DDACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AGREMNTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SETLACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SETLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CONSOLACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CONSOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Billingproducts" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="BILLPRODCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="BILLPRDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingPrefType", propOrder = {
    "consolacc",
    "billiqd",
    "setlmtacc",
    "dirdebit",
    "ddbnkcd",
    "ddaccno",
    "name",
    "agremntid",
    "setlaccbrn",
    "setlccy",
    "consolaccbrn",
    "consolccy",
    "billingproducts"
})
public class BillingPrefType {

    @XmlElement(name = "CONSOLACC")
    protected String consolacc;
    @XmlElement(name = "BILLIQD")
    @XmlSchemaType(name = "string")
    protected BILLIQDType billiqd;
    @XmlElement(name = "SETLMTACC")
    protected String setlmtacc;
    @XmlElement(name = "DIRDEBIT")
    @XmlSchemaType(name = "string")
    protected YesNoType dirdebit;
    @XmlElement(name = "DDBNKCD")
    protected String ddbnkcd;
    @XmlElement(name = "DDACCNO")
    protected String ddaccno;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "AGREMNTID")
    protected String agremntid;
    @XmlElement(name = "SETLACCBRN")
    protected String setlaccbrn;
    @XmlElement(name = "SETLCCY")
    protected String setlccy;
    @XmlElement(name = "CONSOLACCBRN")
    protected String consolaccbrn;
    @XmlElement(name = "CONSOLCCY")
    protected String consolccy;
    @XmlElement(name = "Billingproducts")
    protected List<BillingPrefType.Billingproducts> billingproducts;

    /**
     * Gets the value of the consolacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSOLACC() {
        return consolacc;
    }

    /**
     * Sets the value of the consolacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSOLACC(String value) {
        this.consolacc = value;
    }

    /**
     * Gets the value of the billiqd property.
     * 
     * @return
     *     possible object is
     *     {@link BILLIQDType }
     *     
     */
    public BILLIQDType getBILLIQD() {
        return billiqd;
    }

    /**
     * Sets the value of the billiqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BILLIQDType }
     *     
     */
    public void setBILLIQD(BILLIQDType value) {
        this.billiqd = value;
    }

    /**
     * Gets the value of the setlmtacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETLMTACC() {
        return setlmtacc;
    }

    /**
     * Sets the value of the setlmtacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETLMTACC(String value) {
        this.setlmtacc = value;
    }

    /**
     * Gets the value of the dirdebit property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getDIRDEBIT() {
        return dirdebit;
    }

    /**
     * Sets the value of the dirdebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setDIRDEBIT(YesNoType value) {
        this.dirdebit = value;
    }

    /**
     * Gets the value of the ddbnkcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDBNKCD() {
        return ddbnkcd;
    }

    /**
     * Sets the value of the ddbnkcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDBNKCD(String value) {
        this.ddbnkcd = value;
    }

    /**
     * Gets the value of the ddaccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDACCNO() {
        return ddaccno;
    }

    /**
     * Sets the value of the ddaccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDACCNO(String value) {
        this.ddaccno = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the agremntid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGREMNTID() {
        return agremntid;
    }

    /**
     * Sets the value of the agremntid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGREMNTID(String value) {
        this.agremntid = value;
    }

    /**
     * Gets the value of the setlaccbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETLACCBRN() {
        return setlaccbrn;
    }

    /**
     * Sets the value of the setlaccbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETLACCBRN(String value) {
        this.setlaccbrn = value;
    }

    /**
     * Gets the value of the setlccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETLCCY() {
        return setlccy;
    }

    /**
     * Sets the value of the setlccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETLCCY(String value) {
        this.setlccy = value;
    }

    /**
     * Gets the value of the consolaccbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSOLACCBRN() {
        return consolaccbrn;
    }

    /**
     * Sets the value of the consolaccbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSOLACCBRN(String value) {
        this.consolaccbrn = value;
    }

    /**
     * Gets the value of the consolccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSOLCCY() {
        return consolccy;
    }

    /**
     * Sets the value of the consolccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSOLCCY(String value) {
        this.consolccy = value;
    }

    /**
     * Gets the value of the billingproducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the billingproducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingproducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingPrefType.Billingproducts }
     * 
     * 
     * @return
     *     The value of the billingproducts property.
     */
    public List<BillingPrefType.Billingproducts> getBillingproducts() {
        if (billingproducts == null) {
            billingproducts = new ArrayList<>();
        }
        return this.billingproducts;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="BILLPRODCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="BILLPRDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "billprodcd",
        "billprddesc"
    })
    public static class Billingproducts {

        @XmlElement(name = "BILLPRODCD")
        protected String billprodcd;
        @XmlElement(name = "BILLPRDDESC")
        protected String billprddesc;

        /**
         * Gets the value of the billprodcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBILLPRODCD() {
            return billprodcd;
        }

        /**
         * Sets the value of the billprodcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBILLPRODCD(String value) {
            this.billprodcd = value;
        }

        /**
         * Gets the value of the billprddesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBILLPRDDESC() {
            return billprddesc;
        }

        /**
         * Sets the value of the billprddesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBILLPRDDESC(String value) {
            this.billprddesc = value;
        }

    }

}
