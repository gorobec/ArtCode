package week2.day1.inheritance;

/**
 * Created by gorobec on 28.05.16.
 */
public class Middle extends Coder {


    public Middle(int age, String name, String surname, String programmingLanguage) {
        super(age, name, surname, programmingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I can make art better than junior");
    }
}
