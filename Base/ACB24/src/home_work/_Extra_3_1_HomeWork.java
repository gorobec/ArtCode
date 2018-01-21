package home_work;

import java.util.Scanner;

/*
* Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
* */
public class _Extra_3_1_HomeWork {
    public static void main(String[] args){
        int enteredNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        enteredNumber = sc.nextInt();
        int count = 0;
        int divisor = 1;
        final int i = 10;
        while (enteredNumber != 0){
            //System.out.println("/ = " + enteredNumber / divisor);
            //System.out.println("% = " + enteredNumber / divisor % i);
            if(enteredNumber / divisor % i == 8){
                count++;
            }
            enteredNumber /= 10;
        }
        System.out.println("Count of symbol '8':" + count);
    }
}