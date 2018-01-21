package home_work;

import java.util.Scanner;

/**
 * Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
 * 5678  -   1
 * 5889  -   2
 * 8888  -   4
 * 989990  - 1
 *
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class CountEight {

    public static void main(String[] args) {

        int eight = 8;

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int buffer = number;

        int counter = 0;


        while (buffer != 0){
            if(buffer % 10 == eight){
                counter++;
            }

            buffer = buffer / 10;
        }

        System.out.printf("Number %d has %d eight digits", number, counter);

    }
}
