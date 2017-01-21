package oop_intro;

/**
 * Created by user on 04.01.2017.
 */
public class Dog {
    String name;
    int age;

    public void init(String dogName, int dogAge){
        name = dogName;
        age = dogAge;
    }

    public String asString(){
        return String.format("Dog %s, age - %d\n", name, age);
    }
}
