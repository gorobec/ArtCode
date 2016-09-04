package week1.day2;

/**
 * Created by gorobec on 04.09.16.
 */
public class _10TernaryOperator {
    public static void main(String[] args) {
        int age = 25;
        String answer;

        int adultLimit = 18;

        /*if(age > adultLimit){
            answer = "Adult";
        } else{
            answer = "Young";
        }

        System.out.println(answer);*/
//                      true        false
//        condition ? statement1 : statement2

        answer = age > adultLimit ? "Adult" : "Young";
        System.out.println(answer);
    }
}
