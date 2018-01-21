package week2.day2;

import java.util.Scanner;

/**
 *  Вычислить факториал числа.
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");

        int number = scanner.nextInt();

        int counter = 1;

        int factorial = 1;

        while (counter <= number){
            factorial = counter * factorial;
            counter++;
        }

        System.out.printf("%d! = %d", number, factorial);
    }
}
