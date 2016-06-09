package week3.day2;


public class _001_FirstRecursion {
    public static void main(String[] args) {
        a(1);
    }

    private static void a(int i) {
        if(i == 100) return;
        i += 1;
        System.out.println(i);
        a(i);
    }
}
