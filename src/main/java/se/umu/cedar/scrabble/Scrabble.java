package se.umu.cedar.scrabble;

public class Scrabble {
    public boolean allowCombining(String word, String availableLetters) {
        return wordIsMadeUpOfAvailableLetters(word, availableLetters) && wordIsLongEnough(word);
    }

    private boolean wordIsLongEnough(String word) {
        return word.length() >= 2;
    }

    private boolean wordIsMadeUpOfAvailableLetters(String word, String availableLetters) {
        for (char letterInWord : word.toCharArray()) {
            if (availableLetters.indexOf(letterInWord) < 0) {
                return false;
            } else {
                String letter = String.valueOf(letterInWord);
                availableLetters = availableLetters.replaceFirst(letter, "");
            }
        }
        return true;
    }
}
