package com.techstack.corebanking.util;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

public class DateConverter2 {

    public static Date toDate(XMLGregorianCalendar xmlCalendar) {
        if (xmlCalendar == null) {
            return null;
        }
        return xmlCalendar.toGregorianCalendar().getTime();
    }
}
