package week3.day2.overloading;


public class OverloadTest_3 {
    public static void main(String[] args) {
        print(1);
        print(null);
    }
    public static void print(Object o) {
        System.out.println(o);
    }

    public static void print(String s) {
        System.out.println(s);
}
}

