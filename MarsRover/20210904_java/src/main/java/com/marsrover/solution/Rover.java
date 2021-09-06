package com.marsrover.solution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rover {
    private Pose pose;

    public Rover(Pose pose) {
        this.pose = pose;
    }

    public void execute(List<Command> commands) {
        Map<Command, Strategy> strategies = new HashMap<>();
        strategies.put(Command.FORWARD, new ForwardStrategy());
        strategies.put(Command.REVERSE, new ReverseStrategy());
        strategies.put(Command.RIGHT, new RightStrategy());
        strategies.put(Command.LEFT, new LeftStrategy());
        for (Command command : commands) {
            this.pose = strategies.get(command).execute(this.pose);
        }
    }

    public Pose getPose() {
        return this.pose;
    }
}
