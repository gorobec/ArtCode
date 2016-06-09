package week3.day2.overloading;


public class OverloadTest_2 {
    public static void main(String[] args) {
        Example_2.print((byte) 1);
        Example_2.print(1);
    }
}

class Example_2 {
    public static void print(short n) {
        System.out.println(n);
    }

    public static void print(Integer n) {
        System.out.println(n);
    }
}