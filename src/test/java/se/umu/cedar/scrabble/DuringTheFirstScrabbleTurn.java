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
    private Board board;

    @Before
    public void setUp() throws Exception {
        scrabble = new Scrabble();
        scrabble.setBoard(board);
    }

    @Test
    public void the_word_is_placed_on_the_board() {
        Play play = new PlayBuilder()
                .playingLetters("HORN")
                .inDirection(Reading.ACROSS)
                .startingAt(2,1)
                .build();

        scrabble.play(play);
        verify(board).placeWord("HORN", Reading.ACROSS, 2, 1);
    }

//    @Test
//    public void the_word_is_scored() {
//
//    }
//
//    @Test
//    public void new_tiles_are_added_to_the_player_rack() {
//
//    }
}