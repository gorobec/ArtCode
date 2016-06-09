package week1.day2;

/**
 * Created by gorobec on 22.05.16.
 */
public class _06RelationalAndLogical {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;


        int c = 18;
        int d = 1;

        boolean res1 = a > b; // false
        boolean res2 = c != d;// true

        boolean result = res1 | res2;// true


        result = a > b | c != d;

        System.out.println(result);

    }
}
