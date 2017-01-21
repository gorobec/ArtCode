package final_task;

/**
 * Created by gorobec on 25.12.16.
 */
public class LotteryUtils {
    public static int[] generateSixNumbers(int from, int till) {

        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            int number;
            while (true){
                number = from + (int)(Math.random() * (till + 1 - from));
                if(!contains(array, number)) break;
            }
            array[i] = number;
        }
        return array;
    }

    private static boolean contains(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) return true;
        }
        return false;
    }

    public static int[] enterSixNumbers(int from, int till) {
        return new int[0];
    }

    public static int countSameNumbers(int[] lotteryNumbers, int[] userNumbers) {
        return 0;
    }

    public static String congrate(int count) {
        return null;
    }
}
