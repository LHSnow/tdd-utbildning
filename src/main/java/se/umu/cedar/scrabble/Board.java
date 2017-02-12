package se.umu.cedar.scrabble;

import java.util.List;

public interface Board {
    public List<String> placeWord(String word, Reading direction, int row, int column);

    public List<String> placeWord(WordPlacement play);
}
