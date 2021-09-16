package com.marsrover.solution;

import java.util.EnumMap;
import java.util.Map;

public class Rover {

    private Pose pose;

    public Rover(Pose pose) {
        this.pose = pose;
    }

    public Pose getPose() {
        return this.pose;
    }

    public void execute(Instruction instruction) {
        Map<Instruction, InstructionStrategy> strategies = new EnumMap<>(Instruction.class);
        strategies.put(Instruction.FORWARD, new ForwardStrategy());
        strategies.put(Instruction.REVERSE, new ReverseStrategy());
        strategies.put(Instruction.RIGHT, new RightStrategy());
        strategies.put(Instruction.LEFT, new LeftStrategy());
        this.pose = strategies.get(instruction).execute(this.pose);
    }
}
