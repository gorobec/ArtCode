package week3.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class FormatterText {
    public static void main(String[] args) {
        int age = 28;
        String name = "Yevhen";


        System.out.println("Hello " + name + "! You are " + age + " years old.");


        System.out.printf("Hello %s! You are %d years old.%n", name, age);
        System.out.printf("Hello %s! You are %d years old.\n", name, age);

        System.out.println("\tPI = " + Math.PI);
        System.out.printf("PI = %08.2f%n", Math.PI);
        System.out.printf("PI = %08.4f%n", Math.PI);
        System.out.printf("PI = %08.6f%n", Math.PI);
        System.out.printf("PI = %08.3f%n", Math.PI);

    }
}
