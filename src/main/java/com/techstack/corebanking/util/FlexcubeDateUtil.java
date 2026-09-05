package com.techstack.corebanking.util;


import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;
import java.util.Date;
public class FlexcubeDateUtil {

    public static XMLGregorianCalendar convertToXmlCalendar(Date date) throws Exception {
        GregorianCalendar gCal = new GregorianCalendar();

        gCal.setTime(date);

        XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);

        xmlCalendar.setHour(DatatypeConstants.FIELD_UNDEFINED);
        xmlCalendar.setMinute(DatatypeConstants.FIELD_UNDEFINED);
        xmlCalendar.setSecond(DatatypeConstants.FIELD_UNDEFINED);
        xmlCalendar.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
        xmlCalendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);

        return xmlCalendar ;
       // return DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
    }
}
