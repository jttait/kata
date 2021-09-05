package com.greatcircle.solution;

public class Longitude {
    private final double degrees;
    private final double radians;

    public Longitude(int degrees, int minutes, int seconds, Hemisphere hemisphere) {
        double doubleDegrees = degrees + (minutes / 60.0) + (seconds / 3600.0);
        int sign = (hemisphere == Hemisphere.EAST) ? 1 : -1;
        this.degrees = doubleDegrees * sign;
        this.radians = this.degrees * 0.017453;
    }

    public double getDegrees() {
        return this.degrees;
    }

    public double getRadians() {
        return this.radians;
    }
}
