package se.umu.cedar.scrabble;

public class PlayBuilder {
    private String word;
    private Reading direction = Reading.ACROSS;
    private int row;
    private int column;
    private String player;

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
        return new Play(player,word,direction,row,column);
    }

    public PlayBuilder asPlayer(String playerName) {
        this.player = playerName;
        return this;
    }

    public PlayBuilder across() {
        this.direction = Reading.ACROSS;
        return this;
    }
}
