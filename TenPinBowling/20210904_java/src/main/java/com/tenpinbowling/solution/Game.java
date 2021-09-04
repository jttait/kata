package com.tenpinbowling.solution;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Frame> frames;

    public Game() {
        this.frames = new ArrayList<>();
    }

    public int score() {
        int score = 0;
        for (int i = 0; i < 9; i++) {
            Frame frame = frames.get(i);
            score += frame.sumOfRolls();
            if (frame.wasSpare()) {
                score += frames.get(i + 1).getFirst();
            }
            if (frame.wasStrike()) {
                score += frames.get(i + 1).getFirst();
                if (frames.get(i + 1).wasStrike() && i != 8) {
                    score += frames.get(i + 2).getFirst();
                } else {
                    score += frames.get(i + 1).getSecond();
                }
            }
        }
        Frame tenthFrame = frames.get(9);
        score += tenthFrame.sumOfRolls();
        return score;
    }

    public void addFrame(Frame frame) {
        this.frames.add(frame);
    }
}
