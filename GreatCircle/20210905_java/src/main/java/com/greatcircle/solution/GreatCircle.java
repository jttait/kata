package com.greatcircle.solution;

public class GreatCircle {
    private final Point point1;
    private final Point point2;
    private final double RADIUS = 6371.0;

    public GreatCircle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getKilometres() {
        double sinLatitude = Math.sin((point2.getLatitudeRadians() - point1.getLatitudeRadians()) / 2);
        double sin2Latitude = sinLatitude * sinLatitude;
        double sinLongitude = Math.sin((point2.getLongitudeRadians() - point1.getLongitudeRadians()) / 2);
        double sin2Longitude = sinLongitude * sinLongitude;
        double cosLatitude1 = Math.cos(point1.getLatitudeRadians());
        double cosLatitude2 = Math.cos(point2.getLatitudeRadians());

        return 2 * RADIUS * Math.asin(Math.sqrt(sin2Latitude + cosLatitude1 * cosLatitude2 * sin2Longitude));
    }

    public double getNauticalMiles() {
        return getKilometres() / 1.852;
    }
}
