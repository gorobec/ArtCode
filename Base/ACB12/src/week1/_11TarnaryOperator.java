package week1;

public class _11TarnaryOperator {
    public static void main(String[] args) {
        int age = 35;
//        String message = "";
        /*if(age > 60){
            message = "old";
        }
        else {
            message = "young";
        }*/
//      return something
//        condition ? statement1(true) : statement2(false)
        String message = age > 60 ? "old" : "young";

        System.out.println(message);
    }
}
