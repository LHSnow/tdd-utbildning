package se.umu.cedar.scrabble;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CombiningWordTest {

    private Scrabble scrabble;

    @Before
    public void in_a_scrabble_game() {
        scrabble = new Scrabble();
    }

    /* #1
            The first player combines two or more of his or her letters to form a word and places it on the board to read
            either across or down with one letter on the center square. Diagonal words are not allowed.
        */
    @Test
    public void combine_letters_to_word() {
        String withLetters = "ABCDEFG";
        String word = "BAG";
        assertTrue(scrabble.allowCombining(word, withLetters));
    }

    @Test
    public void single_letter_words_are_not_allowed() {
        String withLetters = "ABCDEFG";
        String word = "A";
        assertFalse(scrabble.allowCombining(word, withLetters));
    }

    @Test
    public void zero_letter_words_are_not_allowed() {
        String withLetters = "ABCDEFG";
        String word = "";
        assertFalse(scrabble.allowCombining(word, withLetters));
    }

    @Test
    public void combining_words_with_non_existent_letters_is_not_allowed() {
        String withLetters = "ABCDEFG";
        String word = "BAGS";
        assertFalse(scrabble.allowCombining(word, withLetters));
    }

    @Test
    public void using_the_same_letter_twice_is_not_allowed() {
        String withLetters = "ABCDEFG";
        String word = "EDGE";
        assertFalse(scrabble.allowCombining(word, withLetters));
    }

    @Test
    public void using_two_of_the_same_letter_is_allowed() {
        String withLetters = "DEEEEEG";
        String word = "EDGE";
        assertTrue(scrabble.allowCombining(word, withLetters));
    }
}
