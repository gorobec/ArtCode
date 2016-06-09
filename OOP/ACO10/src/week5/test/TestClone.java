package week5.test;
public class TestClone {
    public static void main(String[] args)
            throws CloneNotSupportedException {
        Kitten vaska = new Kitten("Васька", 1);
        Cat myrka = new Cat("Мурка", 5, vaska);
        Cat clone = myrka.clone();

        vaska.setName("Петька");
        vaska.setAge(2);

        System.out.println(myrka);
        System.out.println(clone);
    }
}
class Cat {

    private String name;
    private int age;
    private Kitten kitten;

    public Cat(String name, int age, Kitten kitten) {
        this.name = name;
        this.age = age;
        this.kitten = kitten;
    }

    @Override
    protected Cat clone() throws CloneNotSupportedException {
        return this;
    }

    @Override
    public String toString() {
        return String.format("Cat - %s, age - %d. ", name, age) + kitten;
    }
}
class Kitten {

    private String name;
    private int age;

    public Kitten(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Kitten - %s, age - %d", name, age);
    }
}