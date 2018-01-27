package week3.day1;

import week2.day1.Lottery;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class LoterryTest {
    public static void main(String[] args) {
        generateRandomNumbersSuccessfulTest();
//        generateRandomNumbersWrongSizeTest();
        generateRandomNumbersCheckValuesTest();

    }

    private static void generateRandomNumbersSuccessfulTest() {
        int size = 6;
        int min = 1;
        int max = 42;
        int[] result = Lottery.generateRandomNumbers(size, min, max);

        boolean actual = result.length == size;
        boolean expected = true;

        System.out.printf("Expected result- %b, actual result - %b, Passed - %b\n",
                expected, actual, expected == actual);
    }

    private static void generateRandomNumbersWrongSizeTest() {
        int size = -5;
        int min = 1;
        int max = 42;
        int[] result = Lottery.generateRandomNumbers(size, min, max);

        boolean actual = result.length == size;
        boolean expected = true;

        System.out.printf("Expected result- %b, actual result - %b, Passed - %b\n",
                expected, actual, expected == actual);
    }


    private static void generateRandomNumbersCheckValuesTest() {
        int size = 6;
        int min = 1;
        int max = 92;
        int[] result = Lottery.generateRandomNumbers(size, min, max);

        boolean expected = true;
        for (int i = 0; i < result.length; i++) {
            boolean actual = result[i] >= min && result[i] <= max;
            if(!actual) {
                System.out.printf("Value - %d. Expected result- %b, actual result - %b, Passed - %b\n",
                        result[i], expected, actual, expected == actual);
                return;
            }

        }
        System.out.printf("generateRandomNumbersCheckValuesTest Passed - %b\n",
               expected);




    }
}
