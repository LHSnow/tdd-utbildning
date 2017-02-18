package se.umu.cedar.scrabble;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RackTest {

    private Rack rack;

    // From the Scrabble rules:
    // [#1 The player] combines two or more of his or her letters to form a word

    @Before
    public void in_a_scrabble_game() {
        rack = new Rack("ABCDEFG");
    }

    //The "Some" test, placed first as it describes the general idea of the class
    @Test
    public void  it_is_allowed_to_combine_letters_from_a_rack_to_form_a_word() {
        assertTrue(rack.pick("BAG"));
    }

    //"Zero"
    @Test
    public void picking_zero_letters_is_not_allowed() {
        assertFalse(rack.pick(""));
    }

    @Test
    //It is allowed to pick one letter from the rack, but not in the first turn
    public void picking_one_letter_removes_it_from_the_rack() {
        rack.pick("C");
        //These two asserts represent testing the same concept, that the letter C has been removed from the rack letters
        //on a successful pick. Note that it does not also test if such a pick is allowed.
        assertFalse(rack.inspect().contains("C"));
        assertEquals("ABDEFG", rack.inspect());
    }

    @Test
    public void adding_a_letter_makes_the_rack_contain_it() {
        rack = new Rack("ABCDEF");
        rack.add("Z");
        assertTrue("Expected " + rack.inspect() + " to contain Z", rack.inspect().contains("Z"));
    }

    @Test
    public void combining_words_with_non_existent_letters_is_not_allowed() {
        assertFalse(rack.pick("BAGS"));
    }

    @Test
    public void picking_the_same_letter_twice_is_not_allowed() {
        assertFalse(rack.pick("EDGE"));
    }

    @Test
    public void picking_two_of_the_same_letter_is_allowed_when_rack_contains_them_all() {
        rack = new Rack("DEEEEEG");
        assertTrue(rack.pick("EDGE"));
    }

    @Test
    public void picking_two_letters_removes_them_both_from_the_rack() {
        rack.pick("CG");
        assertEquals("ABDEF", rack.inspect());
    }

    @Test
    public void picking_letters_that_are_not_allowed_does_not_change_the_state_of_the_rack() {
        rack.pick("Z");
        assertEquals("ABCDEFG", rack.inspect());
    }

    //"OOPS!"
    @Test(expected = IllegalArgumentException.class)
    public void adding_letters_to_a_full_rack_throws_exception() {
        rack.add("X");
    }
}
