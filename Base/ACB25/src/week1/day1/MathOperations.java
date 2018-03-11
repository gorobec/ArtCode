package week1.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class MathOperations {
    public static void main(String[] args) {
//        Math math = new Math();

        int res = (int)Math.sqrt(64);
        System.out.println(res);

        System.out.println((int)Math.pow(8, 2));
        System.out.println((int)Math.floor(63.9));
        System.out.println((int)Math.round(63.9));


//        (int)(min + Math.random() * (max - min))
        System.out.println((int)(25 + Math.random() * (125 - 25)));

    }
}
