package se.umu.cedar.scrabble;

import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    private Dictionary dictionary;
    private Board board;
    private Scoring scoring;
    private LetterBag letterBag;
    private Map<String, Rack> racks = new HashMap<String, Rack>();

    public boolean allowCombining(String word, String availableLetters) {
        return wordIsMadeUpOfAvailableLetters(word, availableLetters) && wordIsLongEnough(word);
    }

    private boolean wordIsLongEnough(String word) {
        return word.length() >= 2;
    }

    private boolean wordIsMadeUpOfAvailableLetters(String word, String availableLetters) {
        for (char letterInWord : word.toCharArray()) {
            if (availableLetters.indexOf(letterInWord) < 0) {
                return false;
            } else {
                String letter = String.valueOf(letterInWord);
                availableLetters = availableLetters.replaceFirst(letter, "");
            }
        }
        return true;
    }

    public Outcome play(Play play) {
        return new Outcome();
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setScoring(Scoring scoring) {
        this.scoring = scoring;
    }

    public Scoring getScoring() {
        return scoring;
    }

    public void setLetterBag(LetterBag letterBag) {
        this.letterBag = letterBag;
    }

    public void addRack(String player, Rack rack) {
        racks.put(player, rack);
    }

}
