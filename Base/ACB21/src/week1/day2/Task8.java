package week1.day2;

/**
 * 2.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
 124    4    -   true
 1456   567  -   false
 1      2    -   false
 18     98   -   true
 */
public class Task8 {
    public static void main(String[] args) {

        int a = 3;
        int b = 5843;


        int lastA = a % 10;
        int lastB = b % 10;

        System.out.println(lastA == lastB);


    }
}
