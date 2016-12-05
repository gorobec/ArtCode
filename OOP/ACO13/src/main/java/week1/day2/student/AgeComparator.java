package week1.day2.student;

import java.util.Comparator;

/**
 * Created by gorobec on 04.06.16.
 */
public class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {


        return s1.getBirthDay().compareTo(s2.getBirthDay());
    }
}
