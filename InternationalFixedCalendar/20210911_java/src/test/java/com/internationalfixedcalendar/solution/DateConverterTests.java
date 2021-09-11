package com.internationalfixedcalendar.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DateConverterTests {

    @Test
    void january01gregorianToIfc() {
        GregorianDate gregorian = new GregorianDate(1900, 1, 1);
        IfcDate ifc = DateConverter.convert(gregorian);
        Assertions.assertEquals(new IfcDate(1900, 1, 1), ifc);
    }

    @Test
    void january29gregorianToIfc() {
        GregorianDate gregorian = new GregorianDate(1900, 1,29);
        IfcDate ifc = DateConverter.convert(gregorian);
        Assertions.assertEquals(new IfcDate(1900, 2,1), ifc);
    }

    @Test
    void december31gregorianToIfc() {
        GregorianDate gregorian = new GregorianDate(1900, 12, 31);
        IfcDate ifc = DateConverter.convert(gregorian);
        Assertions.assertEquals(new IfcDate(1900, 14,1), ifc);
    }

    @Test
    void february26gregorianToIfc() {
        GregorianDate gregorian = new GregorianDate(1900, 2, 26);
        IfcDate ifc = DateConverter.convert(gregorian);
        Assertions.assertEquals(new IfcDate(1900, 3,1), ifc);
    }

    @Test
    void march26gregorianToIfc() {
        GregorianDate gregorian = new GregorianDate(1900, 3, 26);
        IfcDate ifc = DateConverter.convert(gregorian);
        Assertions.assertEquals(new IfcDate(1900, 4,1), ifc);
    }

    @Test
    void january01ifcToGregorian() {
        IfcDate ifc = new IfcDate(1900, 1, 1);
        GregorianDate gregorian = DateConverter.convert(ifc);
        Assertions.assertEquals(new GregorianDate(1900, 1,1), gregorian);
    }

    @Test
    void december31ifcToGregorian() {
        IfcDate ifc = new IfcDate(1900, 14, 1);
        GregorianDate gregorian = DateConverter.convert(ifc);
        Assertions.assertEquals(new GregorianDate(1900, 12,31), gregorian);
    }
}
