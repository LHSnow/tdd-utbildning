package se.umu.cedar.scrabble;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ScrabbleTest {
    @Test
    public void canary() {
        assertTrue(true);
    }

    /* #1
        The first player combines two or more of his or her letters to form a word and places it on the board to read
        either across or down with one letter on the center square. Diagonal words are not allowed.
    */
    @Test
    public void combine_letters_to_word() {
        Scrabble scrabble = new Scrabble();
        String withLetters = "ABCDEFG";
        String word = "BAG";
        assertTrue(scrabble.allowCombining(word, withLetters));
    }

    @Test
    public void combining_words_with_non_existent_letters_is_not_allowed() {
        Scrabble scrabble = new Scrabble();
        String withLetters = "ABCDEFG";
        String word = "BAGS";
        assertFalse(scrabble.allowCombining(word, withLetters));
    }

    @Test
    public void using_the_same_letter_twice_is_not_allowed() {
        Scrabble scrabble = new Scrabble();
        String withLetters = "ABCDEFG";
        String word = "EDGE";
        assertFalse(scrabble.allowCombining(word, withLetters));
    }

    @Test
    public void using_two_of_the_same_letter_is_allowed() {
        Scrabble scrabble = new Scrabble();
        String withLetters = "DEEEEEG";
        String word = "EDGE";
        assertTrue(scrabble.allowCombining(word, withLetters));
    }

    @Test
    public void the_game_board_is_an_empty_square_of_given_size() {
        Board board = new Board(5);
        assertEquals(
                  ".....\n"
                + ".....\n"
                + ".....\n"
                + ".....\n"
                + ".....\n"
                , board.toString());
    }

    @Test
    public void place_word_across_on_board() {
        Board board = new Board(5);
        board.placeWordAcrossAt("EDGE",2,1);
        assertEquals(
                  ".....\n"
                + ".....\n"
                + ".EDGE\n"
                + ".....\n"
                + ".....\n"
                , board.toString());
    }

    @Test
    public void place_word_down_on_board() {
        Board board = new Board(5);
        board.placeWordDownAt("EDGE",1,2);
        assertEquals(
                  ".....\n"
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
