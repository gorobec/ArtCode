package week2.day1;

/**
 * Created by gorobec on 10.09.16.
 */
public class _11ContinueInWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100){
            if (i == 6 || i == 13) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
