package week1.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class DataTypeCasting {
    public static void main(String[] args) {
        byte smallNumber = 6;

        int bigNumber = smallNumber;

        int veryBigNumber = 3000;

        byte verySmallNumber = (byte) veryBigNumber;

        System.out.println(bigNumber);
        System.out.println(verySmallNumber);
    }
}
