package week2.day2;

/**
 * Created by gorobec on 24.01.16.
 */
public class Formater {
    public static void main(String[] args) {
        double a = 13;
        double b = 6;
        double c = a / b;
        double d = 11 / 3;
        int age = 26;
        String name = "Jenja";
//        System.out.println(c);
        System.out.printf("My name is %s,\nI'm %d years old",name, age);
    }
}
