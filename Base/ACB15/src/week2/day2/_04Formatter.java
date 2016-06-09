package week2.day2;

/**
 * Created by gorobec on 17.04.16.
 */
public class _04Formatter {
    public static void main(String[] args) {
        double a = 15.3 / 6;
        int i = 15;
        String name = "Jenja";
    System.out.printf("My name is %1$s," +
            "My floating number is %3$.2f," +
            "my integer is %2$d!", name, i, a);
    }
}
