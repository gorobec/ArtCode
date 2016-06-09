package week2.day1;

/**
 * Created by gorobec on 16.04.16.
 */
public class _04WhileLoop {
    public static void main(String[] args) throws InterruptedException {
//        start -> condition -> way

        int account = 2000;
        int years = 0;
        while (account < 100000){
            Thread.sleep(1000);
            System.out.println(years);
            years++;
            account += 20000;
        }

        System.out.println("Passed " + years + " years");
    }
}
