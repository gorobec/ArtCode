package week5.recursion;



public class RecursionTest {
    public static void main(String[] args) {
        f(1);
    }
    public static void f(int i) {
        if (i < 10) {
            System.out.print(i + " ");
            f(++i);
            System.out.print(i + " ");
        }
    }
}