package week3.day1;

/**
 * Created by gorobec on 17.09.16.
 */
public class _03Formatter {
    public static void main(String[] args) {
        int age = 27;
        String name = "Jenja";
        double cash = 25.8969696;
        double cash2 = 2445.8969696;
        double cash3 = 254545.8969696;
        double cash4 = 5.8969696;
        double cash5 = 2665.8969696;

        System.out.println("Hello " + name + " you are " + age + " years old.");
        System.out.printf("Hello %2$s you are %1$d years old. Your card account contains %3$(10.2f$\n", age, name, cash);
        System.out.printf("Hello %s you are %d years old. Your card account contains %-10.2f$\n", name, age, cash2);
        System.out.printf("Hello %s you are %d years old. Your card account contains %-10.2f$\n", name, age, cash3);
        System.out.printf("Hello %s you are %d years old. Your card account contains %-10.2f$\n", name, age, cash4);
        System.out.printf("Hello %s you are %d years old. Your card account contains %-10.2f$\n", name, age, cash5);
    }
}
