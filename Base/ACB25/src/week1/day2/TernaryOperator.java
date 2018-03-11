package week1.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int age = 14;

        String result;

        if(age >= 18) {
            result = "You are allowed";
        } else {
            result = "You are not allowed";
        }

        System.out.println(result);

//        if ? then : else;

        result = age >= 18 ? "You are allowed" : "You are not allowed";
        System.out.println(result);
    }
}
