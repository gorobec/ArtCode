package week1.day1;

/**
 * Created by gorobec on 21.05.16.
 */
public class _03BinaryOperations {
    public static void main(String[] args) {
        int i = 37;
        int b = 7;
//  addition
        int result = i + b;
        System.out.println(result);

//        multi
        result = i * b;
        System.out.println(result);

        result = i - b;
        System.out.println(result);

        result = i / b;
        System.out.println(result);



        result = i % b;
        System.out.println(result);

        int isPair = result % 2;
        System.out.println(isPair);



    }
}
