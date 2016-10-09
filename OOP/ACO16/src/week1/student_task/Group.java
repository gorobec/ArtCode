package week1.student_task;

import java.util.Arrays;

/**
 * Created by gorobec on 09.10.16.
 */
public class Group {

    private String name;
    private Student[] students;
    private int studentsCount;

    public Group(String name, int groupSize) {
        this.name = name;
        students = new Student[groupSize];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean addStudent(Student student){
        if (studentsCount == students.length || student == null) return false;

        students[studentsCount] = student;
        studentsCount++;
        return true;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public void showStudents() {
        for (int i = 0; i < studentsCount; i++) {
            System.out.println(students[i]);
        }

    }
}
