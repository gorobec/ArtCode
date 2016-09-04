package week1.day2;

/**
 * Created by gorobec on 04.09.16.
 */
public class _02RelationalOperations {
    public static void main(String[] args) {
        int a = 13;

        int b = 6;

        boolean answer = a == b;

        System.out.println(answer);

        answer = a != b;
        System.out.println("a != b " + answer);

        answer = a > b;
        System.out.println(answer);

        answer = a < b;
        System.out.println(answer);

        answer = a <= b;
        System.out.println(answer);

        answer = a >= b;
        System.out.println(answer);
    }
}
