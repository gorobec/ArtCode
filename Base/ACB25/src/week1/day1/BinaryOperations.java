package week1.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class BinaryOperations {
    public static void main(String[] args) {

        int z = 11;
        int b = 5;

        int c = z + b;

        System.out.println(c);

        int d = z - b;
        System.out.println(d);

        int e = d + z;

        System.out.println(z * b);

        int f = z / b;

        System.out.println(f);

        int g = z % b;

        System.out.println(g);

        double result = 11.0 / 5;

        System.out.println(result);

        System.out.println(18 % 2);

        char letter = 'A';

        System.out.println(letter + z);

//        z = z + b;
        z += 6;

        System.out.println(z);
    }
}
