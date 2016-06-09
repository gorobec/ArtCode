package week1.day2;

/**
 * Created by gorobec on 17.01.16.
 */
public class LogicalOperations {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
//        if one of operand is true, result - true
//        otherwise result - false;
        boolean c = a | b;
        System.out.println(c);
//        if each operand is true, result - true
//        otherwise result - false;
        boolean d = a & b;
        System.out.println(d);

        boolean f = 3 > 5 & 3 != 5;
        System.out.println(f);
    }
}
