package week5.clone;

/**
 * Created by gorobec on 05.11.16.
 */
public class Person implements Cloneable{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }



    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
