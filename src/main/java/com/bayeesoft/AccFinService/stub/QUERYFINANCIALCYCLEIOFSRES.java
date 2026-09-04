
package com.bayeesoft.AccFinService.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="FCUBS_HEADER" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}FCUBS_HEADERType"/>
 *         <element name="FCUBS_BODY">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Stfincle-IO" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}FinancialCycle-Query-IO-Type" minOccurs="0"/>
 *                   <element name="Stfincle-Full" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}FinancialCycle-Full-Type" minOccurs="0"/>
 *                   <element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}ERRORType" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "fcubsheader",
    "fcubsbody"
})
@XmlRootElement(name = "QUERYFINANCIALCYCLE_IOFS_RES")
public class QUERYFINANCIALCYCLEIOFSRES {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected QUERYFINANCIALCYCLEIOFSRES.FCUBSBODY fcubsbody;

    /**
     * Gets the value of the fcubsheader property.
     * 
     * @return
     *     possible object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public FCUBSHEADERType getFCUBSHEADER() {
        return fcubsheader;
    }

    /**
     * Sets the value of the fcubsheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public void setFCUBSHEADER(FCUBSHEADERType value) {
        this.fcubsheader = value;
    }

    /**
     * Gets the value of the fcubsbody property.
     * 
     * @return
     *     possible object is
     *     {@link QUERYFINANCIALCYCLEIOFSRES.FCUBSBODY }
     *     
     */
    public QUERYFINANCIALCYCLEIOFSRES.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUERYFINANCIALCYCLEIOFSRES.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(QUERYFINANCIALCYCLEIOFSRES.FCUBSBODY value) {
        this.fcubsbody = value;
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
     *         <element name="Stfincle-IO" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}FinancialCycle-Query-IO-Type" minOccurs="0"/>
     *         <element name="Stfincle-Full" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}FinancialCycle-Full-Type" minOccurs="0"/>
     *         <element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}ERRORType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/>
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
        "stfincleIO",
        "stfincleFull",
        "fcubserrorresp",
        "fcubswarningresp"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Stfincle-IO")
        protected FinancialCycleQueryIOType stfincleIO;
        @XmlElement(name = "Stfincle-Full")
        protected FinancialCycleFullType stfincleFull;
        @XmlElement(name = "FCUBS_ERROR_RESP")
        protected List<ERRORType> fcubserrorresp;
        @XmlElement(name = "FCUBS_WARNING_RESP")
        protected List<WARNINGType> fcubswarningresp;

        /**
         * Gets the value of the stfincleIO property.
         * 
         * @return
         *     possible object is
         *     {@link FinancialCycleQueryIOType }
         *     
         */
        public FinancialCycleQueryIOType getStfincleIO() {
            return stfincleIO;
        }

        /**
         * Sets the value of the stfincleIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link FinancialCycleQueryIOType }
         *     
         */
        public void setStfincleIO(FinancialCycleQueryIOType value) {
            this.stfincleIO = value;
        }

        /**
         * Gets the value of the stfincleFull property.
         * 
         * @return
         *     possible object is
         *     {@link FinancialCycleFullType }
         *     
         */
        public FinancialCycleFullType getStfincleFull() {
            return stfincleFull;
        }

        /**
         * Sets the value of the stfincleFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link FinancialCycleFullType }
         *     
         */
        public void setStfincleFull(FinancialCycleFullType value) {
            this.stfincleFull = value;
        }

        /**
         * Gets the value of the fcubserrorresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the fcubserrorresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSERRORRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ERRORType }
         * 
         * 
         * @return
         *     The value of the fcubserrorresp property.
         */
        public List<ERRORType> getFCUBSERRORRESP() {
            if (fcubserrorresp == null) {
                fcubserrorresp = new ArrayList<>();
            }
            return this.fcubserrorresp;
        }

        /**
         * Gets the value of the fcubswarningresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the fcubswarningresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSWARNINGRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WARNINGType }
         * 
         * 
         * @return
         *     The value of the fcubswarningresp property.
         */
        public List<WARNINGType> getFCUBSWARNINGRESP() {
            if (fcubswarningresp == null) {
                fcubswarningresp = new ArrayList<>();
            }
            return this.fcubswarningresp;
        }

    }

}
