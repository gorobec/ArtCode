package week3.day2.overloading;


public class OverloadTest_1 {

    public static void main(String[] args) {
        Example.print(1);
        Example.print((byte) 1);
//        Example.print("1");
        Example.print((Integer)null);
    }

}

class Example {
    public static void print(short n) {
        System.out.println(n);
    }

    public static void print(long n) {
        System.out.println(n);
    }

    public static void print(Integer n) {
        System.out.println(n);
    }

    public static void print(String s) {
        System.out.println(s);
    }

}