package com.internationalfixedcalendar.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IfcDateTests {

    @Test
    void indexOf1() {
        IfcDate dateFromIndex = new IfcDate(1900, 1);
        IfcDate dateFromYMD = new IfcDate(1900, 1, 1);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf28() {
        IfcDate dateFromIndex = new IfcDate(1900, 28);
        IfcDate dateFromYMD = new IfcDate(1900, 1, 28);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf29() {
        IfcDate dateFromIndex = new IfcDate(1900, 29);
        IfcDate dateFromYMD = new IfcDate(1900, 2, 1);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf168() {
        IfcDate dateFromIndex = new IfcDate(1900, 168);
        IfcDate dateFromYMD = new IfcDate(1900, 6, 28);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf169() {
        IfcDate dateFromIndex = new IfcDate(1900, 169);
        IfcDate dateFromYMD = new IfcDate(1900, 7, 1);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf169inLeapYer() {
        IfcDate dateFromIndex = new IfcDate(1904, 169);
        IfcDate dateFromYMD = new IfcDate(1904, 6, 29);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf364() {
        IfcDate dateFromIndex = new IfcDate(1900, 364);
        IfcDate dateFromYMD = new IfcDate(1900, 13, 28);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }

    @Test
    void indexOf365() {
        IfcDate dateFromIndex = new IfcDate(1900, 365);
        IfcDate dateFromYMD = new IfcDate(1900, 14, 1);
        Assertions.assertEquals(dateFromIndex, dateFromYMD);
    }
}
