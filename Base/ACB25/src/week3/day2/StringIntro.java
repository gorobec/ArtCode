package week3.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class StringIntro {
    public static void main(String[] args) {
        String name = "Yevhen";

        String name2 = new String("Yevhen");

        char[] array = {'Y', 'e', 'v', 'h', 'e', 'n'};

        String name3 = new String(array);

        System.out.printf("Name - %s, name2 - %s, name3 - %s", name, name2, name3);
    }
}
