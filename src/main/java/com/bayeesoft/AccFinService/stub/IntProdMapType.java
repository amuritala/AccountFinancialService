
package com.bayeesoft.AccFinService.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntProdMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntProdMapType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="WAIVEPROD" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType"/>
 *         <element name="GENUDECHNGADV" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType"/>
 *         <element name="PRODMAPSTAT" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType"/>
 *         <element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ILPRODUCT" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}YesNoType"/>
 *         <element name="DISPILTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Inteffdtmap" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *                   <element name="EFFDTMAPSTAT" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}EFFDTMAPSTATType"/>
 *                   <element name="Intsde" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}IntsdeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "IntProdMapType", propOrder = {
    "intprod",
    "waiveprod",
    "genudechngadv",
    "prodmapstat",
    "udeccy",
    "ilproduct",
    "dispiltype",
    "inteffdtmap"
})
public class IntProdMapType {

    @XmlElement(name = "INTPROD", required = true)
    protected String intprod;
    @XmlElement(name = "WAIVEPROD", required = true)
    @XmlSchemaType(name = "string")
    protected YesNoType waiveprod;
    @XmlElement(name = "GENUDECHNGADV", required = true)
    @XmlSchemaType(name = "string")
    protected YesNoType genudechngadv;
    @XmlElement(name = "PRODMAPSTAT", required = true)
    @XmlSchemaType(name = "string")
    protected YesNoType prodmapstat;
    @XmlElement(name = "UDECCY", required = true)
    protected String udeccy;
    @XmlElement(name = "ILPRODUCT", required = true)
    @XmlSchemaType(name = "string")
    protected YesNoType ilproduct;
    @XmlElement(name = "DISPILTYPE", required = true)
    protected String dispiltype;
    @XmlElement(name = "Inteffdtmap")
    protected List<IntProdMapType.Inteffdtmap> inteffdtmap;

    /**
     * Gets the value of the intprod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTPROD() {
        return intprod;
    }

    /**
     * Sets the value of the intprod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTPROD(String value) {
        this.intprod = value;
    }

    /**
     * Gets the value of the waiveprod property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getWAIVEPROD() {
        return waiveprod;
    }

    /**
     * Sets the value of the waiveprod property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setWAIVEPROD(YesNoType value) {
        this.waiveprod = value;
    }

    /**
     * Gets the value of the genudechngadv property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getGENUDECHNGADV() {
        return genudechngadv;
    }

    /**
     * Sets the value of the genudechngadv property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setGENUDECHNGADV(YesNoType value) {
        this.genudechngadv = value;
    }

    /**
     * Gets the value of the prodmapstat property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getPRODMAPSTAT() {
        return prodmapstat;
    }

    /**
     * Sets the value of the prodmapstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setPRODMAPSTAT(YesNoType value) {
        this.prodmapstat = value;
    }

    /**
     * Gets the value of the udeccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDECCY() {
        return udeccy;
    }

    /**
     * Sets the value of the udeccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDECCY(String value) {
        this.udeccy = value;
    }

    /**
     * Gets the value of the ilproduct property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getILPRODUCT() {
        return ilproduct;
    }

    /**
     * Sets the value of the ilproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setILPRODUCT(YesNoType value) {
        this.ilproduct = value;
    }

    /**
     * Gets the value of the dispiltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPILTYPE() {
        return dispiltype;
    }

    /**
     * Sets the value of the dispiltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPILTYPE(String value) {
        this.dispiltype = value;
    }

    /**
     * Gets the value of the inteffdtmap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the inteffdtmap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteffdtmap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntProdMapType.Inteffdtmap }
     * 
     * 
     * @return
     *     The value of the inteffdtmap property.
     */
    public List<IntProdMapType.Inteffdtmap> getInteffdtmap() {
        if (inteffdtmap == null) {
            inteffdtmap = new ArrayList<>();
        }
        return this.inteffdtmap;
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
     *         <element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
     *         <element name="EFFDTMAPSTAT" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}EFFDTMAPSTATType"/>
     *         <element name="Intsde" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}IntsdeType" maxOccurs="unbounded" minOccurs="0"/>
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
        "udeeffdt",
        "effdtmapstat",
        "intsde"
    })
    public static class Inteffdtmap {

        @XmlElement(name = "UDEEFFDT", required = true)
        protected Object udeeffdt;
        @XmlElement(name = "EFFDTMAPSTAT", required = true)
        @XmlSchemaType(name = "string")
        protected EFFDTMAPSTATType effdtmapstat;
        @XmlElement(name = "Intsde")
        protected List<IntsdeType> intsde;

        /**
         * Gets the value of the udeeffdt property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUDEEFFDT() {
            return udeeffdt;
        }

        /**
         * Sets the value of the udeeffdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUDEEFFDT(Object value) {
            this.udeeffdt = value;
        }

        /**
         * Gets the value of the effdtmapstat property.
         * 
         * @return
         *     possible object is
         *     {@link EFFDTMAPSTATType }
         *     
         */
        public EFFDTMAPSTATType getEFFDTMAPSTAT() {
            return effdtmapstat;
        }

        /**
         * Sets the value of the effdtmapstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link EFFDTMAPSTATType }
         *     
         */
        public void setEFFDTMAPSTAT(EFFDTMAPSTATType value) {
            this.effdtmapstat = value;
        }

        /**
         * Gets the value of the intsde property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the intsde property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntsde().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntsdeType }
         * 
         * 
         * @return
         *     The value of the intsde property.
         */
        public List<IntsdeType> getIntsde() {
            if (intsde == null) {
                intsde = new ArrayList<>();
            }
            return this.intsde;
        }

    }

}
