package se.umu.cedar.scrabble;

public class Scrabble
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public boolean combine(String word, String withLetters) {
        for(char c : word.toCharArray()) {
            if(withLetters.indexOf(c) < 0) {
                return false;
            }
        }
        return true;
    }
}
