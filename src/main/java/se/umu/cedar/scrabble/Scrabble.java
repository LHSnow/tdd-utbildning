package se.umu.cedar.scrabble;

public class Scrabble
{
    public boolean allowCombining(String word, String playerLetters) {
        for(char c : word.toCharArray()) {
            if(playerLetters.indexOf(c) < 0) {
                return false;
            } else {
                playerLetters = playerLetters.replaceFirst(""+c, "");
            }
        }
        return true;
    }
}
