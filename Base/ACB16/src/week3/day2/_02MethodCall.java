package week3.day2;

/**
 * Created by gorobec on 05.06.16.
 */
public class _02MethodCall {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        b();
        System.out.println("Inside A");
    }

    public static void b() {
        c();
        System.out.println("Inside B");
    }

    public static void c() {
        System.out.println("Inside C");
    }
}
