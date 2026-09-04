
package com.bayeesoft.AccFinService.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUTHSTATType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AUTHSTATType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A"/>
 *     <enumeration value="U"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AUTHSTATType")
@XmlEnum
public enum AUTHSTATType {

    A,
    U;

    public String value() {
        return name();
    }

    public static AUTHSTATType fromValue(String v) {
        return valueOf(v);
    }

}
