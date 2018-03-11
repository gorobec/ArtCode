package week1.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class LogicalOperations {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;


        System.out.println(a || b || c);

        System.out.println(a && b && c);

        boolean d = 5 > 7; // false
        boolean e = 6 != 8; // true
        boolean f = 9 <= 11; // true

        boolean result1 = d || e || f; // true
        boolean result2 = d && e && f; // false

        System.out.println(result1);

        System.out.println(result2);


        int number = 25;
        int divider = 0;

        boolean result = divider != 0 && number / divider > 5;

        System.out.println(result);

    }
}
