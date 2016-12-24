package week3.day1;

/**
 * Created by gorobec on 24.12.16.
 */
public class _07Formatter {
    public static void main(String[] args) {
        String name = "Yevhen";
        String surname = "Vorobiei";
        String name2 = "Serhii";
        String surname2 = "Bilobrov";
        String name3 = "Max";
        String surname3 = "Muzichenko";
        int age = 27;
        double health = 95.5;
        String phone = "+380632555855";

        /*System.out.println("Hello " + name + " "
                + surname + "\n" + "You are " + age + " years old. Health - " + health
                    + " Your phone - " + phone);*/

        System.out.printf("Hello %5$s %2$s\nYou are %3$d years old. Health - %4$.1f Your phone - %1$s",
                                    phone, surname, age, health, name);

        /*System.out.printf("%-10s %-10s\n", name, surname);
        System.out.printf("%-10s %-10s\n", name2, surname2);
        System.out.printf("%-10s %-10s\n", name3, surname3);*/



    }
}
