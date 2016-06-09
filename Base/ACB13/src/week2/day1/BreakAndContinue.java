package week2.day1;

/**
 * Created by gorobec on 23.01.16.
 */
public class BreakAndContinue {
    public static void main(String[] args) {
       /* int count = 0;
        while (true){
            if(count == 10000) {
                break;
            }
            System.out.println(count);
            count++;
        }
*/
        for (int i = 0; i < 20; i++) {
            if(i == 13 | i == 16) {
                continue;
            }
            System.out.println(i);
        }
    }
}
