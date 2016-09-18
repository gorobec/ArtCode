package lottery;

import utils.ArrayUtils;

/**
 * "Лотерея"

 Програма генерирует шесть случайных, целых чисел в диапазоне от 1 до 42 (включительно).

 Числа не должны совпадать!!! (сделать отдельным методом в классе ArrayUtils)

 Пользователь вводит 6 разных чисел в диапазоне от 1 до 42 (включительно). (сделать отдельным методом)

 Программа вывод в консоль выпавшые номера в порядке возрастания

 (использовать один из методов в Вашем классе ArrayUtils).

 И показывает количество угаданных пользователем чисел. (сделать отдельным методом)

 Придумать варианты поздравлений на случаи совпадений (3 из 6, 4 из 6, 5 из 6, 6 из 6, прочие).

 */
public class Lottery {
    public static void main(String[] args) {

        int[] lotteryNumbers = LotteryUtils.generateLotteryNumbers(6, 1, 42);
        int[] userNumbers = LotteryUtils.enterNumbers(6, 1, 42);
        lotteryNumbers = ArrayUtils.bubbleSort(lotteryNumbers);
        userNumbers = ArrayUtils.bubbleSort(userNumbers);
        int count = LotteryUtils.countSameNumbers(lotteryNumbers, userNumbers);
        String greeting = LotteryUtils.generateGreeting(count);
        System.out.println(greeting);
        System.out.printf("Lottery numbers - %s\n", ArrayUtils.arrayToStringUsingBuilder(lotteryNumbers));
        System.out.printf("User numbers - %s\n", ArrayUtils.arrayToStringUsingBuilder(userNumbers));
    }
}
