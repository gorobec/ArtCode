package week1.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class ConditionalStatements {
    public static void main(String[] args) {
        int time = 15;

        if (time >= 9 && time <= 18) {
            System.out.println("I'm at work");
        } else if (time <= 24 && time >= 0){
            System.out.println("I'm at home");
        } else {
            System.out.println("Wrong input!");
        }

        String result = time >= 9 && time <= 18 ? "I'm at work" :
                time <= 24 && time >= 0 ? "I'm at home" : "Wrong input!";

        System.out.println(result);
    }
}
