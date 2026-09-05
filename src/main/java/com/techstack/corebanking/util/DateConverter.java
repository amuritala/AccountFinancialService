package com.techstack.corebanking.util;


import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeConstants;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
public class DateConverter {

    public static XMLGregorianCalendar convertToXmlCalendar(Date LocalDate) throws Exception {



        LocalDate localDate = LocalDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(
                localDate.getYear(),
                localDate.getMonthValue(),
                localDate.getDayOfMonth(),
                DatatypeConstants.FIELD_UNDEFINED, // Hour
                DatatypeConstants.FIELD_UNDEFINED, // Minute
                DatatypeConstants.FIELD_UNDEFINED, // Second
                DatatypeConstants.FIELD_UNDEFINED, // Millisecond
                DatatypeConstants.FIELD_UNDEFINED  // Timezone (optional, omit for pure local date)
        );

        return xmlCalendar ;

    }

}
