package week4.queue.queue_array;

import week4.queue.IMyQueue;
import week4.queue.QueueIsFull;

import java.util.Arrays;
import java.util.concurrent.PriorityBlockingQueue;

public class TestMyArrayQueue {
    public static void main(String[] args) throws QueueIsFull {
        IMyQueue queue = new MyArrayQueue(3);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue.add(1));
        System.out.println(queue.add(null));
        System.out.println(queue.add(3));
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue.add(4));
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(Arrays.toString(queue.toArray()));
    }
}
