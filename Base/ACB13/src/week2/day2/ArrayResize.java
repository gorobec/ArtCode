package week2.day2;

import utils.ArrayUtils;


public class ArrayResize {
    public static void main(String[] args) {
        char[] alphabet = {'a', 'b', 'c'};
        ArrayUtils.showArray(alphabet);
        char d = 'd';
        char[] newAlphabet = new char[alphabet.length + 1];
        /*for (int i = 0; i < alphabet.length; i++) {
            newAlphabet[i] = alphabet[i];
        }*/

        ArrayUtils.copyArray(alphabet, newAlphabet);

        /*newAlphabet[0] = alphabet[0];
        newAlphabet[1] = alphabet[1];
        newAlphabet[2] = alphabet[2];*/
        newAlphabet[3] = d;

        ArrayUtils.showArray(newAlphabet);
    }
}
