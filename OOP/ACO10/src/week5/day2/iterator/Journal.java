package week5.day2.iterator;


import week4.linked_list.MyIterable;
import week4.linked_list.MyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class Journal {
    MyIterable sergijGroup;
    MyIterable vitalikGroup;
    MyIterable yevhenGroup;

    public Journal(MyIterable sergijGroup, MyIterable vitalikGroup, MyIterable yevhenGroup) {
        this.sergijGroup = sergijGroup;
        this.vitalikGroup = vitalikGroup;
        this.yevhenGroup = yevhenGroup;
    }

    public void showStudents(){
        System.out.println("Serhij group:");
        showGroup(sergijGroup);
        System.out.println("Vitalik group:");
        showGroup(vitalikGroup);
        System.out.println("Yevhen group:");
        showGroup(yevhenGroup);
    }

    private void showGroup(MyIterable iterable) {
        Iterator iterator = iterable.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    /*public void showStudents() {
        System.out.println("Serhij group:");
        Student[] serhijStudens = sergijGroup.getStudents();
        for (int i = 0; i < serhijStudens.length; i++) {
            System.out.println(serhijStudens[i]);

        }

        System.out.println("Vitalik group:");
        ArrayList<Student> vitalikStudens = vitalikGroup.getStudents();
        for (int i = 0; i < vitalikStudens.size(); i++) {
            System.out.println(vitalikStudens.get(i));
        }

        System.out.println("Yevhen group:");
        MyLinkedList<Student> yevhenStudens = yevhenGroup.getStudents();
        for (int i = 0; i < yevhenStudens.size(); i++) {
            System.out.println(yevhenStudens.get(i));
        }
    }*/
}
