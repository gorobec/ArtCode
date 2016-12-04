package week1.day2;

/**
 * Created by gorobec on 04.12.16.
 */
public class _03Math {
    public static void main(String[] args) {
        int i = (int)Math.pow(2, 15);
        System.out.println(i);

        int a = (int) Math.sqrt(121);
        System.out.println(a);


//        (int)(min + Math.random * (max - min)) -> int
        int random = (int) (20 + Math.random() * (200 - 20));
        System.out.println(random);

        System.out.println(Math.abs(-12));
    }
}
