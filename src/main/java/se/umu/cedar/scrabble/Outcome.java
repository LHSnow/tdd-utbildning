package se.umu.cedar.scrabble;

import java.util.Collection;

public class Outcome {
    private int totalScore;

    public int totalScore() {
        return totalScore;
    }

    public Collection<String> createdWords() {
        return null;
    }

    public String replacementTiles() {
        return "";
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
