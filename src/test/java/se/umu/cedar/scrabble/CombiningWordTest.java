package se.umu.cedar.scrabble;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CombiningWordTest {

    private Rack rack;

    @Before
    public void in_a_scrabble_game() {
        rack = new Rack("ABCDEFG");
    }

    /* #1
            The first player combines two or more of his or her letters to form a word and places it on the board to read
            either across or down with one letter on the center square. Diagonal words are not allowed.
        */
    @Test
    public void one_combines_letters_to_form_a_word() {
        assertTrue(rack.allowCombining("BAG", "ABCDEFG"));
    }

    @Test
    public void single_letter_words_are_not_allowed() {
        assertFalse(rack.allowCombining("A", "ABCDEFG"));
    }

    @Test
    public void zero_letter_words_are_not_allowed() {
        assertFalse(rack.allowCombining("", "ABCDEFG"));
    }

    @Test
    public void combining_words_with_non_existent_letters_is_not_allowed() {
        assertFalse(rack.allowCombining("BAGS", "ABCDEFG"));
    }

    @Test
    public void using_the_same_letter_twice_is_not_allowed() {
        assertFalse(rack.allowCombining("EDGE", "ABCDEFG"));
    }

    @Test
    public void using_two_of_the_same_letter_is_allowed() {
        assertTrue(rack.allowCombining("EDGE", "DEEEEEG"));
    }
}
