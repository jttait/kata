package com.marsrover.solution;

public class LeftStrategy implements Strategy {
    @Override
    public Pose execute(Pose pose) {
        return pose.rotateAntiClockwise();
    }
}
