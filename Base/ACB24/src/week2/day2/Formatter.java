package week2.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Formatter {
    public static void main(String[] args) {
        int age = 18;
        String name = "John";
        double salary = 1500.58965896;

//        System.out.println("Hello " + name + ". You are " + age + " years old.");
        System.out.printf("Hello %3$s. You are %1$d years old. Your salary is %2$-20.2f bla-bla\n", age, salary, name);

    }
}
