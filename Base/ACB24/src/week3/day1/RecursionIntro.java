package week3.day1;

/**
 * Created by gorobec on 25.12.16.
 */
public class RecursionIntro {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        a();
        System.out.println("Inside A");
    }
    /*private static void b() {
        c();
        System.out.println("Inside B");
    }
    private static void c() {
        System.out.println("Inside C");
    }*/
}
