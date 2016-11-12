package week1.student_task;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by gorobec on 09.10.16.
 */
public class Group implements Serializable{

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

    public void sort(){
        Arrays.sort(students);
    }
    public void sort(Comparator comparator){
        Arrays.sort(students, comparator);

    }

    public boolean addStudent(Student student){
        if (studentsCount == students.length || student == null) return false;

        for (int i = 0; i < studentsCount; i++) {
            if(student.equals(students[i])) return false;
        }

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
