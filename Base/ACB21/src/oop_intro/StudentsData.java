package oop_intro;

import java.util.Scanner;

/**
 * Created by user on 04.01.2017.
 */
public class StudentsData {
    public static void main(String[] args) {
        String student = "Name = Marina, age = 18, phone = 0956565665";
        String student2 = "Name = Marina, age = 18, phone = 0956565665";
        String student3 = "Name = Marina, age = 18, phone = 0956565665";

        Scanner sc = new Scanner(System.in);

        String str = new String();

        Student std = new Student();
        Student.printId();

        std.init("Marina", 18, null);

        Student std2 = new Student();

        std2.init("Yevhen", 27, null);


//        std.asString();
//        std2.asString();

        std2.name = "Dima";
//        std2.asString();

        Student[] students = new Student[2];

        students[0] = std;
        students[1] = std2;

        for (int i = 0; i < students.length; i++) {
            students[i].asString();
        }

        Dog dog = new Dog();

        dog.init("Jack", 5);
        System.out.println(dog.asString());

        std.dog = dog;

        std.asString();


        Student.printId();
    }
}
