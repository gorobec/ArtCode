package week1.day1;

/**
 * Created by gorobec on 03.09.16.
 */
public class _02DataTypeBinaryOperations {
    public static void main(String[] args) {
        int a = 25;
        int b = 76;

//        addition
//      DON'T do this
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        c = 34;
        System.out.println(c);

        int z = b - a;

        int y = b * a;

        int div1 = 7;
        int div2 = 3;

        System.out.println(div1 / div2);
        System.out.println(div1 % div2);


        int number = 15;
        int number2 = 14;

        number += number2;


//        number *= number2;
        number = number * number2;

        System.out.println(number + number2 + "");


    }
}
