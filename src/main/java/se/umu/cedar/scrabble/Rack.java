package se.umu.cedar.scrabble;

public class Rack {
    private String letters;

    public Rack(String letters) {
        this.letters = letters;
    }

    public String pick(String word) {
        return null;
    }

    public void add(String letters) {

    }

    public boolean allowPicking(String word) {
        return wordIsMadeUpOfAvailableLetters(word, letters) && wordIsLongEnough(word);
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
