package lottery;

import java.util.Scanner;

/**
 * Created by gorobec on 18.09.16.
 */
public class LotteryUtils {

    public static int[] generateLotteryNumbers(int size, int min, int max) {

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            int random = generateRandomNumber(min, max);
            while (isPresentInArray(array, random)){
                random = generateRandomNumber(min, max);
            }
            array[i] = random;
        }


        return array;
    }

    private static boolean isPresentInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) return true;
        }
        return false;
    }

    private static int generateRandomNumber(int min, int max) {
        return min + (int)(Math.random() * (max - min + 1));
    }

    public static int[] enterNumbers(int size, int min, int max) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            while (true){
                System.out.printf("Enter number from %d till %d: ", min, max);
                int enteredNumber = sc.nextInt();
                if(enteredNumber > max || enteredNumber < min){
                    System.out.printf("\nNumber must be in range from %d till %d\n", min, max);
                } else if(isPresentInArray(array, enteredNumber)){
                    System.out.println("\nNumber has already been entered");
                } else {
                    array[i] = enteredNumber;
                    break;
                }
            }
        }
        return array;
    }

    public static int countSameNumbers(int[] lotteryNumbers, int[] userNumbers) {

        if(lotteryNumbers == null ||
                        userNumbers == null ||
                            lotteryNumbers.length != userNumbers.length) return -1;

        int counter = 0;

        for (int i = 0; i < lotteryNumbers.length; i++) {
            for (int j = 0; j < userNumbers.length; j++) {
                if(lotteryNumbers[i] == userNumbers[j])  counter++;
            }
        }
        return counter;
    }

    public static String generateGreeting(int count) {
        String greeting;

        switch (count){
            case 6:
                greeting = String.format("You guess all %d numbers!!! Jackpot!!!", count);
                break;

            case 5:
                greeting = String.format("You guess all %d numbers!!! Almost jackpot!!!", count);
                break;

            case 4:
                greeting = String.format("You guess all %d numbers!!! Very good!!!", count);
                break;

            case 3:
                greeting = String.format("You guess all %d numbers!!! Good job!", count);
                break;

            default:
                greeting = String.format("You guess %d numbers. Maybe next time.", count);
                break;

        }
        return greeting;
    }
}
