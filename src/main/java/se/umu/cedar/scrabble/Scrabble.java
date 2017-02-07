package se.umu.cedar.scrabble;

public class Scrabble
{
    public boolean allowCombining(String word, String availableLetters) {
        for(char letterInWord : word.toCharArray()) {
            if(availableLetters.indexOf(letterInWord) < 0) {
                return false;
            } else {
                availableLetters = availableLetters.replaceFirst(""+letterInWord, "");
            }
        }
        return word.length() >= 2;
    }
}
