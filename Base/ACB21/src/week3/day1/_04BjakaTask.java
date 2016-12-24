package week3.day1;

import utils.ArrayUtils;

/**
 * Created by gorobec on 24.12.16.
 */
public class _04BjakaTask {
    public static void main(String[] args) {
        String text = "Hello my bjaka name is bjaka Vova";

        String[] words = text.split(" ");

        String censoredText = ArrayUtils.censored(words);
        System.out.println(censoredText);
    }
}
