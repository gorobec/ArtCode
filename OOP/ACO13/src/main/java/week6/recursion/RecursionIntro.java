package week6.recursion;

/**
 * Created by gorobec on 02.07.16.
 */
public class RecursionIntro {
    public static void main(String[] args) {
        a(15);
    }

    private static void a(int i) {
//        while(true)

        if(i == 0) return;

        System.out.println(i);

        a(i - 1);

        System.out.println(i);

    }
}
