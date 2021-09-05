package com.greatcircle.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GreatCircleTests {

    @Test
    void createGreatCircle() {
        Latitude latitude = new Latitude(5, 25, 0, Hemisphere.NORTH);
        Longitude longitude = new Longitude(5, 25, 0, Hemisphere.EAST);
        Point point1 = new Point(latitude, longitude);
        Point point2 = new Point(latitude, longitude);
        GreatCircle greatCircle = new GreatCircle(point1, point2);
    }

    @Test
    void distanceForSameTwoPointsIsZero() {
        Latitude latitude = new Latitude(5, 25, 0, Hemisphere.NORTH);
        Longitude longitude = new Longitude(5, 25, 0, Hemisphere.EAST);
        Point point1 = new Point(latitude, longitude);
        Point point2 = new Point(latitude, longitude);
        GreatCircle greatCircle = new GreatCircle(point1, point2);
        Assertions.assertEquals(0.0, greatCircle.getKilometres());
    }

    @Test
    void distanceGreaterThanZeroForDifferentPoints() {
        Latitude latitude = new Latitude(5, 25, 0, Hemisphere.NORTH);
        Longitude longitude1 = new Longitude(5, 25, 0, Hemisphere.EAST);
        Longitude longitude2 = new Longitude(5, 30, 0, Hemisphere.EAST);
        Point point1 = new Point(latitude, longitude1);
        Point point2 = new Point(latitude, longitude2);
        GreatCircle greatCircle = new GreatCircle(point1, point2);
        Assertions.assertTrue(greatCircle.getKilometres() > 0.0);
    }

    @Test
    void distanceFromIstanbulToTorontoInKilometres() {
        Latitude istanbulLatitude = new Latitude(41, 0, 49, Hemisphere.NORTH);
        Longitude istanbulLongitude = new Longitude(28, 57, 18, Hemisphere.EAST);
        Latitude torontoLatitude = new Latitude(43, 44, 30, Hemisphere.NORTH);
        Longitude torontoLongitude = new Longitude(79, 22, 24, Hemisphere.WEST);
        Point istanbul = new Point(istanbulLatitude, istanbulLongitude);
        Point toronto = new Point(torontoLatitude, torontoLongitude);
        GreatCircle greatCircle = new GreatCircle(istanbul, toronto);
        Assertions.assertEquals(8179.0, greatCircle.getKilometres(), 50.0);
    }

    @Test
    void distanceFromIstanbulToTorontoInNauticalMiles() {
        Latitude istanbulLatitude = new Latitude(41, 0, 49, Hemisphere.NORTH);
        Longitude istanbulLongitude = new Longitude(28, 57, 18, Hemisphere.EAST);
        Latitude torontoLatitude = new Latitude(43, 44, 30, Hemisphere.NORTH);
        Longitude torontoLongitude = new Longitude(79, 22, 24, Hemisphere.WEST);
        Point istanbul = new Point(istanbulLatitude, istanbulLongitude);
        Point toronto = new Point(torontoLatitude, torontoLongitude);
        GreatCircle greatCircle = new GreatCircle(istanbul, toronto);
        Assertions.assertEquals(4416.0, greatCircle.getNauticalMiles(), 50.0);
    }
}
