package se.umu.cedar.scrabble;

public class Rack {
    private String letters;

    public Rack(String letters) {
        this.letters = letters;
    }

    public boolean pick(String word) {
        if(!allowPicking(word)) {
            return false;
        }
        for (char letterInWord : word.toCharArray()) {
            String letter = String.valueOf(letterInWord);
            letters = letters.replaceFirst(letter, "");
        }
        return true;
    }

    public void add(String added) {
        letters = letters + added;
    }

    public boolean allowPicking(String word) {
        return isMadeUpOfAvailableLetters(word, letters) && isLongEnough(word);
    }

    private boolean isLongEnough(String word) {
        return word.length() > 0;
    }

    private boolean isMadeUpOfAvailableLetters(String word, String availableLetters) {
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

    public String inspect() {
        return letters;
    }
}
