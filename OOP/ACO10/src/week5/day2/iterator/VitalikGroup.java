package week5.day2.iterator;

import week4.linked_list.MyIterable;

import java.util.ArrayList;
import java.util.Iterator;

public class VitalikGroup implements MyIterable{
    private ArrayList<Student> students;

    public VitalikGroup() {
        this.students = new ArrayList<>();
        students.add(new Student("Roma", 23, 5));
        students.add(new Student("Nastja", 23, 5));
        students.add(new Student("Gavriil", 23, 5));

    }

    /*public ArrayList<Student> getStudents(){
        return students;
    }
*/
    @Override
    public Iterator createIterator() {
        return students.iterator();
    }
}
