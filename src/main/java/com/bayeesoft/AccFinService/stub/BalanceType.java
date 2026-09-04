
package com.bayeesoft.AccFinService.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BalanceType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="B"/>
 *     <enumeration value="V"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BalanceType")
@XmlEnum
public enum BalanceType {

    B,
    V;

    public String value() {
        return name();
    }

    public static BalanceType fromValue(String v) {
        return valueOf(v);
    }

}
