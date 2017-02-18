package se.umu.cedar.scrabble;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scrabble {

    private Dictionary dictionary;
    private Board board;
    private Scoring scoring;
    private LetterBag letterBag;
    private Map<String, Rack> racks = new HashMap<String, Rack>();

    public Outcome play(Play play) {
        Rack rack = racks.get(play.getPlayer());
        String playedWord = play.getWord();
        rack.pick(playedWord);

        List<String> words = board.placeWord(play);
        Outcome outcome = new Outcome();
        outcome.setTotalScore(scoring.score(playedWord));
        outcome.setCreatedWords(words);

        String drawnLetters = letterBag.draw(playedWord.length());
        rack.add(drawnLetters);
        outcome.setReplacementTiles(drawnLetters);

        return outcome;
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
