package week2.day1.inheritance;

/**
 * Created by gorobec on 28.05.16.
 */
public class Coder extends Employee{
    private  String programmingLanguage;

    public Coder(int age, String name, String surname, String programmingLanguage) {

        super(age, name, surname);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("I'm making art");
    }

    public void writeCode(){
        System.out.println("codding");
    }

    public String asString(){
        return String.format("%s, language - %s", super.asString(), programmingLanguage);
    }
}
