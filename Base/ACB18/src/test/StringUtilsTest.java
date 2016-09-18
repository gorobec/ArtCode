package test;

import utils.StringUtils;

/**
 * Created by gorobec on 18.09.16.
 */
public class StringUtilsTest {

    public void test_word_invertion(){

        String word = "Java";

        String actual =  StringUtils.wordInvertion(word);
        String expected = "avaJ";

        System.out.printf("Test test_word_invertion: expected - %s, actual - %s, result - %s\n",
                                                expected, actual, expected.equals(actual));
    }

    public void test_letter_deletion(){

        String word = "Java";

        String actual =  StringUtils.deleteEvenLetter(word);
        String expected = "aa";

        System.out.printf("Test test_letter_deletion: expected - %s, actual - %s, result - %s\n",
                                                expected, actual, expected.equals(actual));
    }

}
