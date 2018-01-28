package week3.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class StringVsStringBuilder {

    public static void main(String[] args) {
        String s = "";

        for (int i = 0; i < 1_000_000; i++) {
            s += i;
        }
        System.out.println(s);


    }
}
