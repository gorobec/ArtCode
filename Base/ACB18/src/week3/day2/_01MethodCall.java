package week3.day2;

/**
 * Created by gorobec on 18.09.16.
 */
public class _01MethodCall {
    public static void main(String[] args) throws InterruptedException {
        a();
    }
    public static void a() throws InterruptedException {
        System.out.println("Inside A");
        b();
        System.out.println("Left method A");

    }

    private static void b() throws InterruptedException {
        System.out.println("Inside B");
        c();
        System.out.println("Left method B");

    }

    private static void c() throws InterruptedException {
        System.out.println("Inside C");
        Thread.sleep(2000);
        System.out.println("Left method C");
    }
}
