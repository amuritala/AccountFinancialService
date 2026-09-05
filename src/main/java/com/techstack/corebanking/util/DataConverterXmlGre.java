package com.techstack.corebanking.util;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;

public class DataConverterXmlGre {

    public static XMLGregorianCalendar convertToXmlCalendar(XMLGregorianCalendar xmlCalendar) throws Exception {

        xmlCalendar.setHour(DatatypeConstants.FIELD_UNDEFINED);
        xmlCalendar.setMinute(DatatypeConstants.FIELD_UNDEFINED);
        xmlCalendar.setSecond(DatatypeConstants.FIELD_UNDEFINED);
        xmlCalendar.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
        xmlCalendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
        return xmlCalendar;


    }
}