
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayOptType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PayOptType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="G"/>
 *     <enumeration value="C"/>
 *     <enumeration value="S"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PayOptType")
@XmlEnum
public enum PayOptType {

    G,
    C,
    S;

    public String value() {
        return name();
    }

    public static PayOptType fromValue(String v) {
        return valueOf(v);
    }

}
