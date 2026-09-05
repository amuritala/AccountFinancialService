
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JNTHLDTYPType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="JNTHLDTYPType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUS"/>
 *     <enumeration value="CON"/>
 *     <enumeration value="CUS"/>
 *     <enumeration value="DEV"/>
 *     <enumeration value="GUA"/>
 *     <enumeration value="GUR"/>
 *     <enumeration value="JAF"/>
 *     <enumeration value="JAO"/>
 *     <enumeration value="JOF"/>
 *     <enumeration value="JOO"/>
 *     <enumeration value="NOM"/>
 *     <enumeration value="REL"/>
 *     <enumeration value="SOL"/>
 *     <enumeration value="SOW"/>
 *     <enumeration value="THR"/>
 *     <enumeration value="TRU"/>
 *     <enumeration value="VAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "JNTHLDTYPType")
@XmlEnum
public enum JNTHLDTYPType {

    AUS,
    CON,
    CUS,
    DEV,
    GUA,
    GUR,
    JAF,
    JAO,
    JOF,
    JOO,
    NOM,
    REL,
    SOL,
    SOW,
    THR,
    TRU,
    VAL;

    public String value() {
        return name();
    }

    public static JNTHLDTYPType fromValue(String v) {
        return valueOf(v);
    }

}
