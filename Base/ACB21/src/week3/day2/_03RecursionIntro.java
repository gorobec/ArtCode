package week3.day2;

/**
 * Created by gorobec on 25.12.16.
 */
public class _03RecursionIntro {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        System.out.println("Inside A");
        a();
    }
}
