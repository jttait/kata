package com.greatcircle.solution;

public class Point {
    private final Latitude latitude;
    private final Longitude longitude;

    public Point(Latitude latitude, Longitude longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitudeRadians() {
        return this.latitude.getRadians();
    }

    public double getLongitudeRadians() {
        return this.longitude.getRadians();
    }
}
