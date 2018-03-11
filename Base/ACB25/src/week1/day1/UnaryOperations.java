package week1.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class UnaryOperations {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a++;
        System.out.println(a);

        int b = 6;

        b--;
        System.out.println(b);


        int c = 10;

//        read variable c -> write value to variable d -> increment c
        int d = c++;

        System.out.println("c = " + c);
        System.out.println("d = " + d);


        int e = 10;

//        read variable e -> increment e -> write value to variable f
        int f = ++e;

        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
