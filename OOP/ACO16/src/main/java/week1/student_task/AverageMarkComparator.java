package week1.student_task;

import java.util.Comparator;

/**
 * Created by gorobec on 16.10.16.
 */
public class AverageMarkComparator implements Comparator<Student> {


    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student1.getMark(),student2.getMark());
    }
}
