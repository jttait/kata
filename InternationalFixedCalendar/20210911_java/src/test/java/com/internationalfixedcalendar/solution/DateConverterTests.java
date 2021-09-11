package com.internationalfixedcalendar.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DateConverterTests {

    @Test
    void january01() {
        GregorianDate gregorian = new GregorianDate(1900, 1, 1);
        IfcDate ifc = DateConverter.convert(gregorian);
        Assertions.assertEquals(new IfcDate(1900, 1, 1), ifc);
    }

    @Test
    void january29() {
        GregorianDate gregorian = new GregorianDate(1900, 1,29);
        IfcDate ifc = DateConverter.convert(gregorian);
        Assertions.assertEquals(new IfcDate(1900, 2,1), ifc);
    }

    @Test
    void december31() {
        GregorianDate gregorian = new GregorianDate(1900, 12, 31);
        IfcDate ifc = DateConverter.convert(gregorian);
        Assertions.assertEquals(new IfcDate(1900, 14,1), ifc);
    }

    @Test
    void february26() {
        GregorianDate gregorian = new GregorianDate(1900, 2, 26);
        IfcDate ifc = DateConverter.convert(gregorian);
        Assertions.assertEquals(new IfcDate(1900, 3,1), ifc);
    }

    @Test
    void march26() {
        GregorianDate gregorian = new GregorianDate(1900, 3, 26);
        IfcDate ifc = DateConverter.convert(gregorian);
        Assertions.assertEquals(new IfcDate(1900, 4,1), ifc);
    }
}
