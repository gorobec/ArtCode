package week5.recursion;

/**
 * Created by gorobec on 05.11.16.
 */
public class Rec1 {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int i) {
        if(i > 10) return;
        System.out.println(i);
        f(i + 1);
        System.out.println(i);
    }
}
