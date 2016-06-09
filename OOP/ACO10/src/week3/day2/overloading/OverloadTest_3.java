package week3.day2.overloading;


public class OverloadTest_3 {
    public static void main(String[] args) {
        Example_3.print(1);
        Example_3.print(null);
    }
}

class Example_3 {
    public static void print(Object o) {
        System.out.println(o);
    }

    public static void print(String s) {
        System.out.println(s);
    }


}