package se.umu.cedar.scrabble;

public class HasbroBoard implements Board {
    private final char[][] squares;

    public HasbroBoard(int size) {
        squares = new char[size][size];
        for (int i = 0; i < squares[0].length; i++) {
            for (int j = 0; j < squares[0].length; j++) {
                squares[i][j] = '.';
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char[] row : squares) {
            for (char letter : row) {
                sb.append(letter);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void placeWord(String word, Reading direction, int row, int column) throws IllegalArgumentException {
        for (char letter : word.toCharArray()) {
            try {
                squares[row][column] = letter;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IllegalArgumentException(e);
            }
            switch (direction) {
                case ACROSS:
                    column++;
                    break;
                case DOWN:
                    row++;
                    break;
            }
        }
    }

    public void placeWord(Play play) {
        placeWord(play.getWord(), play.getDirection(), play.getRow(), play.getColumn());
    }
}
