package week3.day1;

/**
 * Created by gorobec on 04.06.16.
 */
public class _07TryStringMethods {
    public static void main(String[] args) {
        String word = "ababagalamaga";
        char[] symbols = word.toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            if(i % 2 == 0) {
//                toUpperCase
                symbols[i] =  Character.toUpperCase(symbols[i]);
            } else {
//                toLowerCase
                symbols[i] =  Character.toLowerCase(symbols[i]);
            }
        }

        String result = new String(symbols);
        System.out.println(result);
    }
}
