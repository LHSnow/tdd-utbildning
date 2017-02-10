package se.umu.cedar.scrabble;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DuringTheFirstScrabbleTurn {
    private Scrabble scrabble;
    @Mock
    private Rack rack;

    @Before
    public void setUp() throws Exception {
        scrabble = new Scrabble();
        scrabble.addRack("player1", rack);
    }

    @Test
    public void the_letters_of_the_word_are_picked_from_the_player1_rack() {
        Play firstPlay = new LetterPlacement()
                .playingLetters("BAG").play();
        scrabble.play(firstPlay);
        verify(rack).pick("BAG");
    }

    @Test
    public void the_word_is_placed_on_the_board() {

    }

    @Test
    public void the_word_is_scored() {

    }

    @Test
    public void new_tiles_are_added_to_the_player_rack() {

    }
}