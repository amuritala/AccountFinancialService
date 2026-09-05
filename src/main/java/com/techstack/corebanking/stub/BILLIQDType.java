
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BILLIQDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BILLIQDType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A"/>
 *     <enumeration value="M"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BILLIQDType")
@XmlEnum
public enum BILLIQDType {

    A,
    M;

    public String value() {
        return name();
    }

    public static BILLIQDType fromValue(String v) {
        return valueOf(v);
    }

}
