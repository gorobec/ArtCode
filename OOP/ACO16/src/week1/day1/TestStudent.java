package week1.day1;

import week1.day1.Student;

/**
 * Created by gorobec on 08.10.16.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Nick", "Smith", 25);

        System.out.println(student.getAge());

        student.setAge(35);


        System.out.println(student);

    }
}
