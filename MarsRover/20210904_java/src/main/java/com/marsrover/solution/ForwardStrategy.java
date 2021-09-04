package com.marsrover.solution;

public class ForwardStrategy implements Strategy {
    @Override
    public Pose execute(Pose pose) {
        if (pose.isFacingNorth()) {
            return pose.translateNorth();
        } else if (pose.isFacingEast()) {
            return pose.translateEast();
        } else if (pose.isFacingSouth()) {
            return pose.translateSouth();
        }
        return pose.translateWest();
    }
}
