package week1.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class _07_StringIntro {
    public static void main(String[] args) {
        char a = 'H';
        char b = 'e';
        char c = 'l';
        char d = 'o';
        char e = d;

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(c);
        System.out.print(d);
        System.out.println();

        String name = "Yevhen";
        String name2 = "Yevhen";
        String name3 = new String("Yevhen");

        System.out.println("Hello " + name + (15 + 15));
    }
}
