package se.umu.cedar.scrabble;

public class PlayBuilder {
    private String word;
    private Reading direction = Reading.ACROSS;
    private int row;
    private int column;

    public PlayBuilder playingLetters(String word) {
        this.word = word;
        return this;
    }

    public PlayBuilder inDirection(Reading direction) {
        this.direction = direction;
        return this;
    }

    public PlayBuilder startingAt(int row, int column) {
        this.row = row;
        this.column = column;
        return this;
    }

    public Play build() {
        return new Play(word,direction,row,column);
    }
}
