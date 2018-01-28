package week3.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < 1_000_000; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}
