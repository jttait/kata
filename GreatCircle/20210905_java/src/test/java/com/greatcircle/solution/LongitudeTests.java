package com.greatcircle.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongitudeTests {

    @Test
    void createLongitude() {
        Longitude longitude = new Longitude(5, 25, 0, Hemisphere.EAST);
    }

    @Test
    void eastLongitudesArePositive() {
        Longitude longitude = new Longitude(5, 25, 0, Hemisphere.EAST);
        Assertions.assertTrue(longitude.getDegrees() > 0);
    }

    @Test
    void westLongitudesAreNegative() {
        Longitude longitude = new Longitude(5, 25, 0, Hemisphere.WEST);
        Assertions.assertTrue(longitude.getDegrees() < 0);
    }
}
