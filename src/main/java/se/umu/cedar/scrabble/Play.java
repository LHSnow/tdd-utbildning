package se.umu.cedar.scrabble;

public class Play {
    private final String word;
    private final Reading direction;
    private final int row;
    private final int column;
    private String player;

    public Play(String word, Reading direction, int row, int column) {
        this.word = word;
        this.direction = direction;
        this.row = row;
        this.column = column;
    }

    public Play(String player, String word, Reading direction, int row, int column) {
        this(word,direction,row,column);
        this.player = player;
    }

    public String getWord() {
        return word;
    }

    public Reading getDirection() {
        return direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getPlayer() {
        return player;
    }
}
