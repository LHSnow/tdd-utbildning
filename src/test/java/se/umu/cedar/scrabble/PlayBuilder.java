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

    public Play build() {
        return new Play(word,direction,row,column);
    }

    public PlayBuilder across() {
        this.direction = Reading.ACROSS;
        return this;
    }

    public PlayBuilder down() {
        this.direction = Reading.DOWN;
        return this;
    }

    public PlayBuilder atRow(int row) {
        this.row = row;
        return this;
    }

    public PlayBuilder atColumn(int column) {
        this.column = column;
        return this;
    }
}
