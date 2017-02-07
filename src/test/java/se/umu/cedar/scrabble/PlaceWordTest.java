package se.umu.cedar.scrabble;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaceWordTest {
    @Test
    public void the_game_board_is_an_empty_square_of_given_size() {
        Board board = new Board(5);
        assertEquals(""
                    + ".....\n"
                    + ".....\n"
                    + ".....\n"
                    + ".....\n"
                    + ".....\n"
                , board.toString());
    }

    @Test
    public void place_word_across_on_board() {
        Board board = new Board(5);
        board.placeWord("EDGE", Reading.ACROSS,2,1);
        assertEquals(""
                    + ".....\n"
                    + ".....\n"
                    + ".EDGE\n"
                    + ".....\n"
                    + ".....\n"
                , board.toString());
    }

    @Test
    public void place_word_down_on_board() {
        Board board = new Board(5);
        board.placeWord("EDGE", Reading.DOWN,1,2);
        assertEquals(""
                    + ".....\n"
                    + "..E..\n"
                    + "..D..\n"
                    + "..G..\n"
                    + "..E..\n"
                , board.toString());
    }

    @Test
    @Ignore("Not possible to place diagonals, but this rule might need revisiting later")
    public void diagonal_words_are_not_allowed() {

    }
}