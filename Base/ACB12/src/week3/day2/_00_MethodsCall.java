package week3.day2;

public class _00_MethodsCall {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
        System.out.println("Hello, I'm a");

    }

    private static void b() {
        c();
        System.out.println("Hello, I'm b");

    }

    private static void c() {
        System.out.println("Hello, I'm c");
    }

}
