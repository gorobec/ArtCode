package week3.day1;

import week1.student_task.Student;

import java.util.Arrays;

/**
 * Created by gorobec on 22.10.16.
 */
public class FinalWord {
    private final String name;
    private final int age;
    private final Student[] students;




    public FinalWord(String name, int age, Student[] students) {
        this.name = name;
        this.age = age;
        this.students = students;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public Student[] getStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "FinalWord{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
