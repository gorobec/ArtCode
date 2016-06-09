package week3;

import utils.ArrayUtils;

/**
 * "Лотерея"

 Програма генерирует шесть случайных, целых чисел в диапазоне от 1 до 42 (включительно).

 Числа не должны совпадать!!! (сделать отдельным методом в классе ArrayUtils)

 Пользователь вводит 6 разных чисел в диапазоне от 1 до 42 (включительно). (сделать отдельным методом)

 Программа выводит в консоль выпавшые номера в порядке возрастания

 (использовать один из методов в Вашем классе ArrayUtils).

 И показывает количество угаданных пользователем чисел. (сделать отдельным методом)

 Придумать варианты поздравлений на случаи совпадений (3 из 6, 4 из 6, 5 из 6, 6 из 6, прочие).
 */
public class Lottery {
    public static void main(String[] args) {

        int[] lotteryNumbers = generateNumbers(1, 42);


//        int[] gamerNumbers = enterNumbers(1, 42);
        int[] gamerNumbers = {5, 6, 13, 23, 2, 42};


        System.out.print("Lottery numbers ");
        showNumbers(lotteryNumbers);
        System.out.print("Gamer numbers ");
        showNumbers(gamerNumbers);

        int guessedNumbers = countSamesArrays(lotteryNumbers, gamerNumbers);


        showCongrats(guessedNumbers);



    }

    private static void showCongrats(int guessedNumbers) {
            switch (guessedNumbers){
                case 4:
                    System.out.printf("Your guess %d numbers", guessedNumbers);
                    break;
                case 5:
                    System.out.printf("Your guess %d numbers", guessedNumbers);
                    break;
                case 6:
                    System.out.printf("Your guess %d numbers", guessedNumbers);
                    break;
                default:
                    System.out.println("Looser! You guess " + guessedNumbers);
            }


    }

    private static int countSamesArrays(int[] lotteryNumbers, int[] gamerNumbers) {

        int counter = 0;

        for (int i = 0; i < lotteryNumbers.length; i++) {
            for (int j = 0; j < gamerNumbers.length; j++) {
                if(lotteryNumbers[i] == gamerNumbers[j]) counter++;
            }
        }
        return counter;
    }

    private static void showNumbers(int[] lotteryNumbers) {

        ArrayUtils.sort(lotteryNumbers);
        ArrayUtils.printArray(lotteryNumbers);

    }

    private static int[] enterNumbers(int i, int i1) {
        return new int[0];


    }

    private static int[] generateNumbers(int min, int max) {
        final int size = 6;
        int[] lotteryNumbers = new int[size];

        for (int i = 0; i < size; i++) {

            int randomNumber = (int) (Math.random() * (max + 1 - min) + min);

            while (contains(lotteryNumbers, randomNumber)) {
                randomNumber = (int) (Math.random() * (max + 1 - min) + min);
            }

            lotteryNumbers[i] = randomNumber;

        }

        return lotteryNumbers;
    }

    private static boolean contains(int[] lotteryNumbers, int randomNumber) {

        for (int i = 0; i < lotteryNumbers.length; i++) {
            if(lotteryNumbers[i] == randomNumber) return true;
        }
        return false;
    }
}
