package se.umu.cedar.scrabble;

public class Board {
    private final char[][] squares;

    public Board(int size) {
        squares = new char[size][size];
        for(int i = 0; i < squares[0].length; i++) {
            for(int j = 0; j < squares[0].length; j++) {
                squares[i][j] = '.';
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(char[] row : squares) {
            for(char letter : row) {
                sb.append(letter);
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
