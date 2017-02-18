package se.umu.cedar.scrabble;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PlaceWordTest {
    @Test
    public void placing_the_word_edge_across_the_board() {
        Play word = new PlayBuilder()
                .playingLetters("EDGE")
                .across()
                .atRow(2)
                .atColumn(1)
                .build();
    }
}