package week1.day1;

/**
 * Created by Gorobec on 09.04.2016.
 */
public class _04BinaryOperations {
    public static void main(String[] args) {
//        adding
        int age1 = 25;
        int age2 = 36;
        int sum = age1 + age2 + 15;
        System.out.println(sum);

//        multiply
        int multi = age1 * age2;
        System.out.println(multi);

//        dividing

        int num = 10;
        int div1 = 10 / 3;
//        num = num / 3;
        num /= 3;
        System.out.println(num);
        System.out.println(div1);
        int div2 = 10 % 3;
        System.out.println(div2);

        double d = 10.0 / 3;
        System.out.println(d);

        int odd = age1 % 2;
        System.out.println(odd);
    }
}
