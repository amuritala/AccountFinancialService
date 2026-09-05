
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StmtType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StmtType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="S"/>
 *     <enumeration value="D"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StmtType")
@XmlEnum
public enum StmtType {

    S,
    D;

    public String value() {
        return name();
    }

    public static StmtType fromValue(String v) {
        return valueOf(v);
    }

}
