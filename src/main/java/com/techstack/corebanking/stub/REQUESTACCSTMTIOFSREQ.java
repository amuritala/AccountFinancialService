
package com.techstack.corebanking.stub;

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
 *                   <element name="CustAccStmtAdhocRequest" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}AdhocStmtReqType"/>
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
@XmlRootElement(name = "REQUESTACCSTMT_IOFS_REQ")
public class REQUESTACCSTMTIOFSREQ {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected REQUESTACCSTMTIOFSREQ.FCUBSBODY fcubsbody;

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
     *     {@link REQUESTACCSTMTIOFSREQ.FCUBSBODY }
     *     
     */
    public REQUESTACCSTMTIOFSREQ.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTACCSTMTIOFSREQ.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(REQUESTACCSTMTIOFSREQ.FCUBSBODY value) {
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
     *         <element name="CustAccStmtAdhocRequest" type="{http://fcubs.ofss.com/service/FCUBSAccFinService}AdhocStmtReqType"/>
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
        "custAccStmtAdhocRequest"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "CustAccStmtAdhocRequest", required = true)
        protected AdhocStmtReqType custAccStmtAdhocRequest;

        /**
         * Gets the value of the custAccStmtAdhocRequest property.
         * 
         * @return
         *     possible object is
         *     {@link AdhocStmtReqType }
         *     
         */
        public AdhocStmtReqType getCustAccStmtAdhocRequest() {
            return custAccStmtAdhocRequest;
        }

        /**
         * Sets the value of the custAccStmtAdhocRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdhocStmtReqType }
         *     
         */
        public void setCustAccStmtAdhocRequest(AdhocStmtReqType value) {
            this.custAccStmtAdhocRequest = value;
        }

    }

}
