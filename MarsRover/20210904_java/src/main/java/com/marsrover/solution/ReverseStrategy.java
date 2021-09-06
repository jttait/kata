package com.marsrover.solution;

public class ReverseStrategy implements Strategy {
    @Override
    public Pose execute(Pose pose) {
        if (pose.isFacingNorth()) {
            return pose.translateSouth();
        } else if (pose.isFacingEast()) {
            return pose.translateWest();
        } else if (pose.isFacingSouth()) {
            return pose.translateNorth();
        }
        return pose.translateEast();
    }
}
