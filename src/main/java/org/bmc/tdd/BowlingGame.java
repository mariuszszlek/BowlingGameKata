package org.bmc.tdd;

public class BowlingGame {

    int roll = 0;
    private int[] rolls = new int[21];

    public int getScore() {
        int score = 0;
        int coursor = 0;
        for (int i = 0; i < 10; i++) {
            if (rolls[coursor] + rolls[coursor+1] == 10) {
                score += 10 + rolls[coursor+2];
                coursor +=2;
            } else{
                score += rolls[coursor] + rolls[coursor+1];
                coursor+=2;
            }
        }
        return score;
    }

    public void roll(int pins) {
        rolls[roll++] = pins;
    }
}
