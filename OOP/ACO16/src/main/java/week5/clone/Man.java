package week5.clone;

/**
 * Created by gorobec on 05.11.16.
 */
public class Man extends Person{


    private Woman wife;


    public Man(String name, int age) {
        super(name, age);
    }

    public Man(String name, int age, Woman wife) {
        super(name, age);
        this.wife = wife;
    }

    public Woman getWife() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Man{" +
                "wife=" + wife +
                "} " + super.toString();
    }

    @Override
    public Man clone() throws CloneNotSupportedException {

        Man man = (Man) super.clone();

        man.setWife(wife.clone());

        return man;



    }
}
