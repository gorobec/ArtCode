package week3.day2.overloading;


public class OverloadTest_4 {
    public static void main(String[] args) {
        Example_4 .process("asd");
        Example_4 .process("asd", "asd");
        Example_4 .process("asd", "asd", "asd");
    }
}
class Example_4 {
    public static void process(String... s) {
        System.out.print("*");
    }
    public static void process(String s) {
        System.out.print("1");
    }
    public static void process(String s, String a) {
        System.out.print("2");
    }
//    public static void process(String s, String... a) {
//        System.out.print("3");
//    }

}