package week2.day1;

/**
 * Created by gorobec on 16.04.16.
 */
public class _01TarnaryOperator {
    public static void main(String[] args) {
        int a  = 5;
        String answer;
        if(a > 3){
            answer = "Yes";
        } else {
            answer = "No";
        }
//                        true          false
//        <condition> ? <statement1> : <statement2>
//        ?:
        answer = a > 3 ? "Yes" : "No";

        System.out.println(answer);
    }
}
