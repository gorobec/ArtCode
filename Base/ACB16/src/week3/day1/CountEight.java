package week3.day1;

import java.util.Scanner;

/**
 *5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
 5678  -   1
 5889  -   2
 8888  -   4
 989990  - 1
 */
public class CountEight {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number ");
       int number = Math.abs(sc.nextInt());

       int count = 0;

       while (number > 0){

           if(number % 10 == 8) count++;
           number /= 10;
       }
       System.out.println(count);
   }
}
