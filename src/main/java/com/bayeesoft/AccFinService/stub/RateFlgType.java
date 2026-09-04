
package com.bayeesoft.AccFinService.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateFlgType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RateFlgType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="N"/>
 *     <enumeration value="Y"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RateFlgType")
@XmlEnum
public enum RateFlgType {

    N,
    Y;

    public String value() {
        return name();
    }

    public static RateFlgType fromValue(String v) {
        return valueOf(v);
    }

}
