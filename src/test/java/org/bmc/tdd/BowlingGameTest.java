package org.bmc.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class BowlingGameTest {

    BowlingGame theGame;

    @BeforeEach
    void setUp() {
        theGame = new BowlingGame();
    }

    @Test
    public void shouldScoreOneWhenNoRolls() {

        assertThat(theGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScore0WhenNoPinDown20Times() {
        int numberOfThrows = 20;
        int pins = 0;
        roll(numberOfThrows, pins);
        assertThat(theGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScore20WhenOnePinDown20Times() {
        roll(20, 1);
        assertThat(theGame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldScoreSpere() {
        roll(2,5);
        roll(1,4);
        roll(17,0);
        assertThat(theGame.getScore()).isEqualTo(18);
    }

    private void roll(int numberOfThrows, int pins) {
        for (int i = 0; i < numberOfThrows; i++) {
            theGame.roll(pins);
        }
    }
}