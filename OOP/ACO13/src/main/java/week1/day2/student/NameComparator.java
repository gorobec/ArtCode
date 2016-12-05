package week1.day2.student;

import java.util.Comparator;

/**
 * Created by gorobec on 04.06.16.
 */
public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
