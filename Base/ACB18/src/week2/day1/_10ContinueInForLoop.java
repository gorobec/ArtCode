package week2.day1;

/**
 * Created by gorobec on 10.09.16.
 */
public class _10ContinueInForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i == 6 || i == 13)
                continue;
            System.out.println(i);
        }
    }
}
