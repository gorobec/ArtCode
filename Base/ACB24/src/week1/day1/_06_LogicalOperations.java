package week1.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class _06_LogicalOperations {
    public static void main(String[] args) {

        int salary = 1000;
        int divider = 0;
        int limit = 16;

        boolean result = divider > 0 && limit < (salary / divider);

        System.out.println(result);
    }
}
