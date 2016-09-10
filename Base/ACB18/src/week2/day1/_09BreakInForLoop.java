package week2.day1;

/**
 * Created by gorobec on 10.09.16.
 */
public class _09BreakInForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if(i == 95){
                break;
            }
            System.out.println(i);
        }
    }
}
