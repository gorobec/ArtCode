package week2;

/**
 * Created by gorobec on 25.10.15.
 */
public class _05CharArray {

    public static void main(String[] args) {
        char[] letters = {'a','b', 'c'};

        char d = 'd';

        char[] newLetters = new char[letters.length + 1];

        for (int i = 0; i < newLetters.length - 1; i++) {
            newLetters[i] = letters[i];
        }

        newLetters[newLetters.length-1] = d;


    }
}
