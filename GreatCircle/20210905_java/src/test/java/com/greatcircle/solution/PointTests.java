package com.greatcircle.solution;

import org.junit.jupiter.api.Test;

class PointTests {

    @Test
    void createPoint() {
        Latitude latitude = new Latitude(5, 25, 0, Hemisphere.NORTH);
        Longitude longitude = new Longitude(5, 25, 0, Hemisphere.EAST);
        Point point = new Point(latitude, longitude);
    }

}
