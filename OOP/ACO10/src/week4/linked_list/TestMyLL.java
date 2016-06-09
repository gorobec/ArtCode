package week4.linked_list;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestMyLL {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(15);
        list.add(18);
//        list.add("Hello");
        list.add(185);
        list.add(166);
        list.add(17);
        Iterator <Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }






    }
}
