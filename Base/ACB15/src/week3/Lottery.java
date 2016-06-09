package week3;

import utils.ArrayUtils;

/**
 * Created by gorobec on 24.04.16.
 */
public class Lottery {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateLottery();
//        int[] lotteryTicket = createTicket();
        int[] lotteryTicket = {9, 6, 13, 39, 36, 40};
        ArrayUtils.bubbleSort(lotteryNumbers);
        ArrayUtils.printArray(lotteryNumbers);
        int guessNumbers = compareNumbers(lotteryNumbers, lotteryTicket);
        printCongrats(guessNumbers);
    }

    private static void printCongrats(int guessNumbers) {
        switch (guessNumbers){

            case 3:
                System.out.printf("You've guess %d digits. Congrats!", guessNumbers);

                break;
            case 4:
                System.out.printf("You've guess %d digits. Nice try!", guessNumbers);

                break;
            case 5:
                System.out.printf("You've guess %d digits. Congratulation, almost jackpot...", guessNumbers);
                break;
            case 6:
                System.out.printf("You've guess %d digits. Jackpot!!!", guessNumbers);

                break;
            default:
                System.out.printf("You've guess %d digits. Loose...", guessNumbers);
                break;
        }
    }

    private static int compareNumbers(int[] lotteryNumbers, int[] lotteryTicket) {

        int count = 0;
        for (int i = 0; i < lotteryNumbers.length; i++) {
            for (int j = 0; j < lotteryTicket.length; j++) {
                if(lotteryNumbers[i] == lotteryTicket[j]) count++;
            }
        }
        return count;
    }

    private static int[] generateLottery() {
        int[] lotteryNumbers = new int[6];
        for (int i = 0; i < lotteryNumbers.length; i++) {
            int random;
            while (true){
                random = 1 + (int)(Math.random() * (43 - 1));
                if(!contains(lotteryNumbers, random)) break;
            }

            lotteryNumbers[i] = random;
        }

        return lotteryNumbers;
    }

    private static boolean contains(int[] lotteryNumbers, int random) {
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if(lotteryNumbers[i] == random) return true;
        }
        return false;
    }
}
