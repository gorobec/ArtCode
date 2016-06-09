package week2.day2;


import utils.ArrayUtils;

public class _01CharArray {
    public static void main(String[] args) {
        char[] letters = {'a','b', 'c'};
        char letter = 'd';
        char[] newLetters = new char[letters.length + 1];
        for (int i = 0; i < letters.length; i++) {
            newLetters[i] = letters[i];
        }
        newLetters[3] = letter;
        ArrayUtils.showArray(newLetters);
    }
}
