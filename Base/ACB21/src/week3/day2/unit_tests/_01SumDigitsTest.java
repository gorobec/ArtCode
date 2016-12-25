package week3.day2.unit_tests;

/**
 * Given a non-negative int n, return the sum of its digits recursively
 * (no loops).
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 *
 * sumDigits(126) → 9
 * sumDigits(49) → 13
 * sumDigits(12) → 3
 *
 */
public class _01SumDigitsTest {

    public static void main(String[] args) {

        test1();
        test2();
        test3();

    }

    private static void test3() {
        int number = 49;
        int expected = 13;
        int actual = sumDigits(number);
        System.out.printf("sumDigits(%d) expected -> %d, actual -> %d. Result %b\n",
                number, expected, actual, expected == actual);

    }

    private static void test2() {
        int number = 12;
        int expected = 3;
        int actual = sumDigits(number);
        System.out.printf("sumDigits(%d) expected -> %d, actual -> %d. Result %b\n",
                number, expected, actual, expected == actual);

    }

    private static void test1() {
        int number = 126;
        int expected = 9;
        int actual = sumDigits(number);
        System.out.printf("sumDigits(%d) expected -> %d, actual -> %d. Result %b\n",
                                number, expected, actual, expected == actual);

    }

    private static int sumDigits(int number) {

      /*  int sum = 0;

        while (number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;*/


      if(number == 0) return 0;
      return number % 10 + sumDigits(number / 10);
    }
}
