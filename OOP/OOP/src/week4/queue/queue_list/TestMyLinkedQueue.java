package week4.queue.queue_list;

import week4.queue.IMyQueue;
import week4.queue.QueueIsFull;

import java.util.Arrays;


public class TestMyLinkedQueue {
    public static void main(String[] args) throws QueueIsFull {
        MyLinkedQueue queue = new MyLinkedQueue();
        System.out.println(queue.add(1));
        System.out.println(queue.add(2));
        System.out.println(queue.add(3));
        System.out.println(queue.add(4));
        System.out.println(queue.add(5));
        System.out.println(queue.size());
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.add(5));
        System.out.println(queue.size());}
}
