package se.umu.cedar.scrabble;

public class LetterPlacement {
    private String word;
    private Reading direction;
    private int row;
    private int column;

    public LetterPlacement playingLetters(String word) {
        this.word = word;
        return this;
    }

    public LetterPlacement inDirection(Reading direction) {
        this.direction = direction;
        return this;
    }

    public LetterPlacement startingAt(int row, int column) {
        this.row = row;
        this.column = column;
        return this;
    }

    public Play play() {
        return new Play(word,direction,row,column);
    }
}
