package se.umu.cedar.scrabble;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GamePlayAcceptanceTest {
    private Scrabble scrabble;
    /*
        The first player combines two or more of his or her letters to form a word and places it on the board to read
        either across or down with one letter on the center square. Diagonal words are not allowed.
        Complete your turn by counting and announcing your score for that turn.
        Then draw as many new letters as you played;
        always keep seven letters on your rack, as long as there are enough tiles left in the bag.
    */

    @Before
    public void anEnglishScrabbleGameWithTwoPlayers() throws Exception {
        scrabble = new Scrabble();
        //All players should agree upon the dictionary that they will use
        scrabble.setDictionary(new EnglishDictionary());
        //You should have...
        //* a game board (with its placement of bonus squares)
        scrabble.setBoard(new HasbroBoard(5));
        //* 100 letter replacementTiles (language specific scoring)
        //* a letter bag (with letter distribution allowing random draws)
        scrabble.setScoring(new EnglishLetterValues());
        scrabble.setLetterBag(new EnglishLetterBag());

        //* up to four racks (one for each player)
        scrabble.addRack("Alice", new Rack("HORNARY"));
        scrabble.addRack("Bob", new Rack("FARMLLA"));
    }

    @Test
    public void alice_the_first_player_plays_HORN_across_scoring_14_points_and_getting_4_new_tiles() {
        Play play = new PlayBuilder()
                .asPlayer("Alice")
                .playingLetters("HORN")
                .inDirection(Reading.ACROSS)
                .startingAt(2,1)
                .build();

        Outcome outcome = scrabble.play(play);
        assertEquals(14, outcome.getTotalScore());
        assertEquals(1, outcome.getCreatedWords().size());
        assertTrue(outcome.getCreatedWords().contains("HORN"));
        assertEquals("HORN".length(), outcome.getReplacementTiles().length());
    }
}