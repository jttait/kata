package com.marsrover.solution;

public class RightStrategy implements Strategy {
    @Override
    public Pose execute(Pose pose) {
        return pose.rotateClockwise();
    }
}
