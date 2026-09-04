
package com.bayeesoft.AccFinService.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EFFDTMAPSTATType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EFFDTMAPSTATType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="O"/>
 *     <enumeration value="C"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EFFDTMAPSTATType")
@XmlEnum
public enum EFFDTMAPSTATType {

    O,
    C;

    public String value() {
        return name();
    }

    public static EFFDTMAPSTATType fromValue(String v) {
        return valueOf(v);
    }

}
