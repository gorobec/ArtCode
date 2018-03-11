package week1.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Dividing {
    public static void main(String[] args) {
        int num = 286396;

        int first = num / 100000;
        int second = num / 10000 % 10;
        int third = num / 1000 % 10;
        int fourth = num / 100 % 10;
        int fifth = num / 10 % 10;
        int sixth = num % 10;
    }
}
