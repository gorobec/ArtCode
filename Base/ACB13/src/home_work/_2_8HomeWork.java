package home_work;
/*2.8. Вводим два числа, сравнить последнии цифры этих чисел
(пользоваться оператором %)
        124    4    -   true
        1456   567  -   false
        1      2    -   false
        18     98   -   true*/

import java.util.Scanner;

public class _2_8HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int first = sc.nextInt();
        System.out.println("Enter second num");
        int second = sc.nextInt();

        first = first % 10;
        second = second % 10;

        boolean isEqual = first == second;

        System.out.println(isEqual);
    }
}
