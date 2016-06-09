package week4.clone;


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
        return String.format("Man - %s, age %d, wife %s", getName(), getAge(), wife);
    }

    @Override
    public Man clone() throws CloneNotSupportedException {
        return new Man(getName(), getAge(), wife.clone());
    }
}
