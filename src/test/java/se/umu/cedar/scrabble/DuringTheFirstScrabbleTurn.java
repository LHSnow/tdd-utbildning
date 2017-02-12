package se.umu.cedar.scrabble;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DuringTheFirstScrabbleTurn {
    private Scrabble scrabble;
    @Mock
    private Board board;
    private Play play;
    @Mock
    private Scoring scoring;

    @Before
    public void setUp() throws Exception {
        scrabble = new Scrabble();
        scrabble.setBoard(board);
        scrabble.setScoring(scoring);
        play = new PlayBuilder()
                .playingLetters("HORN")
                .inDirection(Reading.ACROSS)
                .startingAt(2,1)
                .build();
    }

    @Test
    public void the_word_is_placed_on_the_board() {
        scrabble.play(play);
        verify(board).placeWord(play);
    }

    @Test
    public void the_word_scoring_is_added_to_the_outcome() {
        when(scoring.score("HORN")).thenReturn(14);
        Outcome outcome = scrabble.play(play);
        assertEquals(14, outcome.totalScore());
        verify(scoring).score("HORN");
    }
//
//    @Test
//    public void new_tiles_are_added_to_the_player_rack() {
//
//    }
}