
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RolloverType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RolloverType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="P"/>
 *     <enumeration value="I"/>
 *     <enumeration value="S"/>
 *     <enumeration value="T"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RolloverType")
@XmlEnum
public enum RolloverType {

    P,
    I,
    S,
    T;

    public String value() {
        return name();
    }

    public static RolloverType fromValue(String v) {
        return valueOf(v);
    }

}
