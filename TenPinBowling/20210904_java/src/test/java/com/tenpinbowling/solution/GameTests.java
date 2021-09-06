package com.tenpinbowling.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTests {

    Game game;

    @BeforeEach
    void setup() {
        game = new Game();
    }

    @Test
    void scoreAllGutterBalls() {
        rollGutterFrames(10);
        Assertions.assertEquals(0, game.score());
    }

    @Test
    void scoreOnePinDown() {
        game.addFrame(new Frame(1, 0));
        rollGutterFrames(9);

        Assertions.assertEquals(1, game.score());
    }

    @Test
    void scoreAllOnes() {
        game.addFrame(new Frame(1, 1));
        game.addFrame(new Frame(1, 1));
        game.addFrame(new Frame(1, 1));
        game.addFrame(new Frame(1, 1));
        game.addFrame(new Frame(1, 1));
        game.addFrame(new Frame(1, 1));
        game.addFrame(new Frame(1, 1));
        game.addFrame(new Frame(1, 1));
        game.addFrame(new Frame(1, 1));
        game.addFrame(new Frame(1, 1));

        Assertions.assertEquals(20, game.score());
    }

    @Test
    void scoreOneSpare() {
        game.addFrame(new Frame(5, 5));
        game.addFrame(new Frame(1, 0));
        rollGutterFrames(8);

        Assertions.assertEquals(12, game.score());
    }

    @Test
    void scoreStrikeFollowedByGutter() {
        rollStrikeFrames(1);
        rollGutterFrames(9);

        Assertions.assertEquals(10, game.score());
    }

    @Test
    void scoreStrikeFollowedByTwoOnes() {
        rollStrikeFrames(1);
        game.addFrame(new Frame(1, 1));
        rollGutterFrames(8);

        Assertions.assertEquals(14, game.score());
    }

    @Test
    void scoreStrikeFollowedByStrikeAndGutters() {
        rollStrikeFrames(2);
        rollGutterFrames(8);

        Assertions.assertEquals(30, game.score());
    }

    @Test
    void scoreStrikeOnLastFrame() {
        rollGutterFrames(9);
        game.addFrame(new Frame(10, 0, 0));

        Assertions.assertEquals(10, game.score());
    }

    @Test
    void scoreStrikesOnLastTwoFrames() {
        rollGutterFrames(8);
        rollStrikeFrames(1);
        game.addFrame(new Frame(10, 0, 0));

        Assertions.assertEquals(30, game.score());
    }

    private void rollGutterFrames(int times) {
        for (int i = 0; i < times; i++) {
            game.addFrame(new Frame(0, 0));
        }
    }

    private void rollStrikeFrames(int times) {
        for (int i = 0; i < times; i++) {
            game.addFrame(new Frame(10, 0));
        }
    }

}
