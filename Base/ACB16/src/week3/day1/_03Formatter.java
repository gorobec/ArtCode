package week3.day1;

/**
 * Created by gorobec on 04.06.16.
 */
public class _03Formatter {
    public static void main(String[] args) {
        int age = 25;
        String name = "John";
        String surname = "Snow";
        double salary = 5000 / 3;


       /* System.out.println("My name is " + name + ", my surname - " + surname +
        ", age - " + age + ", salary - " + salary);*/

        System.out.printf("My name is %1$s, my surname - %3$s, age - %4$d, salary - %2$.1f\n", name, salary, surname, age);
    }
}
