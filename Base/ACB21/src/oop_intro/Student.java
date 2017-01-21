package oop_intro;

/**
 * Created by user on 04.01.2017.
 */
public class Student {
    static int id;

    String name;
    int age;
    String phone;
    Dog dog;


    public void init(String studentName, int studentAge, String studentPhone){
        name = studentName;
        age = studentAge;
        phone = studentPhone;
        id++;
    }


    public void asString(){
        System.out.printf("Student name - %s, age - %d, phone - %s , pet - %s\n",
                            name, age, phone, dog == null ? "null" : dog.asString());
    }

    public static void printId(){
        System.out.println(id);
    }
}
