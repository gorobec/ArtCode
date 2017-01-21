package week1.day1;

/**
 * Created by gorobec on 21.01.17.
 */
public class Student {
    String name;
    String surname;
    int age;
    double averageMark;
    Cat cat;

//    public Student(){}

    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String asString(){
//        return "Student name - " + name + ", age - " + age;
        return String.format("Student name - %s, age - %d, cat - %s", name, age, cat.asString());
    }
}
