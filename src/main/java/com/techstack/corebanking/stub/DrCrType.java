
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrCrType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DrCrType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="D"/>
 *     <enumeration value="C"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DrCrType")
@XmlEnum
public enum DrCrType {

    D,
    C;

    public String value() {
        return name();
    }

    public static DrCrType fromValue(String v) {
        return valueOf(v);
    }

}
