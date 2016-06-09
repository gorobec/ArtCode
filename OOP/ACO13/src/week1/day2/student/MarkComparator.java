package week1.day2.student;

import java.util.Comparator;

/**
 * Created by gorobec on 04.06.16.
 */
public class MarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.getAverageMark() - o2.getAverageMark());
    }
}
