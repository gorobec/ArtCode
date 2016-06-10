package week4.queue.queue_list;

import week4.queue.IMyQueue;


public class MyLinkedQueue{
    Node head;
    Node tail;
    int size;


    public boolean add(Object o){
        if(head == null){
            tail = new Node(o);
            head = tail;
            size++;
            return true;
        }

        tail.next = new Node(o);
        tail = tail.next;
        size++;
        return true;
    }


    public void clear() {
        head = tail = null;
    }


    public Object peek() {
        return head.value;
    }


    public Object poll() {
        if(head == null) return null;
        Node polled = new Node(head.value);
        if(head != tail) head = head.next;
        else head = tail = null;
        size--;
        return polled.value;
    }




    public int size() {
        return this.size;
    }


    public Object[] toArray() {
        Object[] array = new Object[size];
        if (size == 0) return array;
        int i = 0;
        Node iterator = head;
        while (iterator != null){
            array[i] = iterator.value;
            i++;
            iterator = iterator.next;
        }
        return array;
    }

    private class Node{
        Node next;
        Object value;

        public Node(Object value) {
            this.value = value;
        }
    }
}
