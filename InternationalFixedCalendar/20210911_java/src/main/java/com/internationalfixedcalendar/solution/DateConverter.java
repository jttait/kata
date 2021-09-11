package com.internationalfixedcalendar.solution;

public class DateConverter {
    public static IfcDate convert(GregorianDate gregorian) {
        int year = gregorian.getYear();
        int index = gregorian.getIndex();
        return new IfcDate(year, index);
    }

    public static GregorianDate convert(IfcDate ifc) {
        int year = ifc.getYear();
        int index = ifc.getIndex();
        return new GregorianDate(year, index);
    }
}
