package week1.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class _01_ternary {
    public static void main(String[] args) {
        int age = 13;

        String answer;

       /* if(age > 18) {
            answer = "Allowed";
        } else {
            answer = "Not allowed";
        }
*/

       answer = age > 18 ? "Allowed" : "Not allowed";
        System.out.println("You are " + answer + " to visit this page!");
    }
}
