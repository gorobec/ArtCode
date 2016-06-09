package week2.day2;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by gorobec on 17.04.16.
 */
public class _06SimpleSort {
    public static void main(String[] args) {
        char[] letters = {'d', 'a', 'c', 'b'};

        for (int i = 0; i < letters.length - 1; i++) {
            if(letters[i] > letters[i + 1]){
//                swap
                char tmp = letters[i + 1];
                letters[i + 1] = letters[i];
                letters[i] = tmp;
            }
        }
        ArrayUtils.printArray(letters);
    }
}
