package week2.day1.inheritance;

/**
 * Created by gorobec on 28.05.16.
 */
public class Junior extends Coder {


    public Junior(int age, String name, String surname, String programmingLanguage) {
        super(age, name, surname, programmingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I'm only trying to make art");
    }
}
