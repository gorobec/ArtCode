package lottery;

/**
 * Created by gorobec on 18.09.16.
 */
public class LotteryUtilsTest {

    public static void test_loterry_number_generation(){
        int[] actual = LotteryUtils.generateLotteryNumbers(6, 1, 42);
        boolean result = false;

        if(actual != null && actual.length == 6){
            out: for (int i = 0; i < actual.length; i++) {
                    if(actual[i] < 1 || actual[i] > 42) break;
                    for (int j = i + 1; j < actual.length; j++) {
                        if(actual[i] == actual[j]) break out;
                    }
            }
            result = true;
        }
        System.out.printf("test_loterry_number_generation result - %s\n", result);
    }

    public static void test_count_same_numbers(){
        int[] array1 = {1, 6, 13, 56, 111, 200};
        int[] array2 = {1, 7, 13, 83, 111, 89};
        int actual = LotteryUtils.countSameNumbers(array1, array2);
        int expected = 3;
        System.out.printf("test_count_same_numbers expected - %d, actual - %d, result -%s\n", expected, actual, expected == actual);
    }
}
