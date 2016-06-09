package week1.day2;

/**
 * Created by gorobec on 22.05.16.
 */
public class _01UnaryOperations {
    public static void main(String[] args) {
        int i = 15;
        System.out.println(i);
//        take i -> i + 1 -> rewrite i
        i = i + 1;

        System.out.println(i + 1);
        System.out.println(i);


        i += 6;
//        i = i + 6;
        i *= 5;
//        i = i * 5;
        i -= 3;
//        i = i - 3;
        i /= 9;
//        i = i / 9;


//        i = i + 1;
//        rewrite i
        i++;
//        but i + 1 don't rewrite i
//        if you want to rewrite use i = i + 1;





    }
}
