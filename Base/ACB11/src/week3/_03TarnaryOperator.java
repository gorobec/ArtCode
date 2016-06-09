package week3;

public class _03TarnaryOperator {
    public static void main(String[] args) {

        int i = 10;
        /*int b;
        if (i > 5) {
            b = 6;
        }else {
            b = 9;
        }*/
        int b = i > 5 ? 6 : 9;

        System.out.println(b);


        int age = 30;

        String s = age > 30 ? "You're too old" : "You're young";
        System.out.println(s);

    }


}
