package com.internationalfixedcalendar.solution;

public class DateConverter {
    public static IfcDate convert(GregorianDate gregorian) {
        int year = gregorian.getYear();
        int index = gregorian.getIndex();
        return new IfcDate(year, index);
    }
}
