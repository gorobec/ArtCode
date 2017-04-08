package week2.day1;

/**
 * Created by gorobec on 08.04.17.
 */
public abstract class Coder extends Employee {

    private String language;

    public Coder(String name, String surname, int age, String language) {
        super(name, surname, age);
        this.language = language;
    }

    @Override
    public String toString() {
        return String.format("Coder %s, language - %s", super.toString(), language);
    }



    public void code(){
        System.out.println("Searching for bugs....");
    }
}
