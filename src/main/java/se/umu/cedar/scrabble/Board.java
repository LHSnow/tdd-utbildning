package se.umu.cedar.scrabble;

public interface Board {
    public void placeWord(String word, Reading direction, int row, int column);
}
