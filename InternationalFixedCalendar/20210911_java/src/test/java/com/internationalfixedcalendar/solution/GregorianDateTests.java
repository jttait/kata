package com.internationalfixedcalendar.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GregorianDateTests {

    @Test
    void indexOf1() {
        GregorianDate dateFromIndex = new GregorianDate(1900, 1);
        GregorianDate dateFromYMD = new GregorianDate(1900, 1, 1);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf31() {
        GregorianDate dateFromIndex = new GregorianDate(1900, 31);
        GregorianDate dateFromYMD = new GregorianDate(1900, 1, 31);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf32() {
        GregorianDate dateFromIndex = new GregorianDate(1900, 32);
        GregorianDate dateFromYMD = new GregorianDate(1900, 2, 1);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf59() {
        GregorianDate dateFromIndex = new GregorianDate(1900, 59);
        GregorianDate dateFromYMD = new GregorianDate(1900, 2, 28);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf60() {
        GregorianDate dateFromIndex = new GregorianDate(1900, 60);
        GregorianDate dateFromYMD = new GregorianDate(1900, 3, 1);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf60inLeapYear() {
        GregorianDate dateFromIndex = new GregorianDate(1904, 60);
        GregorianDate dateFromYMD = new GregorianDate(1904, 2, 29);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }
}
