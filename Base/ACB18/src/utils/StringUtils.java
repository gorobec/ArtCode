package utils;

/**
 * Created by gorobec on 18.09.16.
 */
public class StringUtils {
    public static String wordInvertion(String word) {
            char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length / 2; i++) {
            swap(letters, i, letters.length - i - 1);
        }
        return new String(letters);
    }

    private static void swap(char[] letters, int i, int j) {
        char tmp = letters[i];
        letters[i] = letters[j];
        letters[j] = tmp;
    }

    public static String deleteEvenLetter(String word) {
        char[] letters = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            if(i % 2 != 0){
                sb.append(letters[i]);
            }
        }
        return sb.toString();
    }
}
