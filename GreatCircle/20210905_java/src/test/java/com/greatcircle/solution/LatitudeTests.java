package com.greatcircle.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LatitudeTests {

    @Test
    void createLatitude() {
        Latitude latitude = new Latitude(5, 25, 0, Hemisphere.NORTH);
    }

    @Test
    void northLatitudesArePositive() {
        Latitude latitude = new Latitude(5, 25, 0, Hemisphere.NORTH);
        Assertions.assertTrue(latitude.getDegrees() > 0);
    }

    @Test
    void southLatitudesAreNegative() {
        Latitude latitude = new Latitude(5, 25, 0, Hemisphere.SOUTH);
        Assertions.assertTrue(latitude.getDegrees() < 0);
    }

}
