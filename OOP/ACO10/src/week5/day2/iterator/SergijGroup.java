package week5.day2.iterator;


import week4.linked_list.MyIterable;

import java.util.Arrays;
import java.util.Iterator;

public class SergijGroup implements MyIterable{
    private Student[] students;

    public SergijGroup() {
        this.students = new Student[3];
        students[0] = new Student("Artem", 23, 5);
        students[1] = new Student("Kate", 25, 5);
        students[2] = new Student("Sergij", 20, 5);
    }

    /*public Student[] getStudents(){
        return students;
    }*/

    @Override
    public Iterator createIterator() {
        return Arrays.asList(students).iterator();
    }
}
