package week5.day2.iterator;


import week4.linked_list.MyIterable;
import week4.linked_list.MyLinkedList;

import java.util.Iterator;

public class YevhenGroup implements MyIterable{
    private MyLinkedList<Student> students;

    public YevhenGroup() {
        this.students = new MyLinkedList<>();
        students.add(new Student("Oleg", 23, 5));
        students.add(new Student("Bogdan", 23, 5));
        students.add(new Student("Tanja", 23, 5));

    }

    /*public MyLinkedList<Student> getStudents(){
        return students;
    }*/

    @Override
    public Iterator createIterator() {
        return students.iterator();
    }
}
