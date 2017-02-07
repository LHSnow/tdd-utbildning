package se.umu.cedar.scrabble;

public class Board {
    private final char[][] squares;

    public Board(int size) {
        squares = new char[size][size];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(char[] r : squares) {
            for(char c : r) {
                if(c == Character.MIN_VALUE) {
                    sb.append('.');
                } else {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void placeWordAcrossAt(String word, int row, int column) {
        for(char letter : word.toCharArray()) {
            squares[row][column] = letter;
            column++;
        }
    }

    public void placeWordDownAt(String word, int row, int column) {
        for(char letter : word.toCharArray()) {
            squares[row][column] = letter;
            row++;
        }
    }
}
