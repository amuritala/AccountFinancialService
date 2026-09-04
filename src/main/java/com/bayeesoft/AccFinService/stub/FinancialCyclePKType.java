
package com.bayeesoft.AccFinService.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialCycle-PK-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialCycle-PK-Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FINCLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialCycle-PK-Type", propOrder = {
    "fincle"
})
public class FinancialCyclePKType {

    @XmlElement(name = "FINCLE", required = true)
    protected String fincle;

    /**
     * Gets the value of the fincle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINCLE() {
        return fincle;
    }

    /**
     * Sets the value of the fincle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINCLE(String value) {
        this.fincle = value;
    }

}
