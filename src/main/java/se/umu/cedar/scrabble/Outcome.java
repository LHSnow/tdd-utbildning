package se.umu.cedar.scrabble;

import java.util.Collection;
import java.util.List;

public class Outcome {
    private int totalScore;
    private List<String> createdWords;

    public Collection<String> getCreatedWords() {
        return createdWords;
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

    public void setCreatedWords(List<String> createdWords) {
        this.createdWords = createdWords;
    }
}
