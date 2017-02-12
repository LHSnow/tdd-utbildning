package se.umu.cedar.scrabble;

import java.util.Collection;
import java.util.List;

public class Outcome {
    private int totalScore;
    private List<String> createdWords;
    private String replacementTiles;

    public Collection<String> getCreatedWords() {
        return createdWords;
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

    public void setReplacementTiles(String drawnLetters) {
        this.replacementTiles = drawnLetters;
    }

    public String getReplacementTiles() {
        return replacementTiles;
    }
}
