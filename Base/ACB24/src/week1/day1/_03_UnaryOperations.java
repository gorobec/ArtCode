package week1.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class _03_UnaryOperations {
    public static void main(String[] args) {
        int i = 15;

        i = i + 1;

        i += 1;
        i++;
        i--;
        ++i;

        int a = 5;
//        read a -> write a to b -> increment a
        int b = a++;
        /*int b = a;
        a = a + 1;*/
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int c = 5;
//        read c -> increment c -> write c to d
        int d = ++c;

        /*c = c + 1;
        int d = c;*/
        System.out.println("c=" + c);
        System.out.println("d=" + d);
    }
}
