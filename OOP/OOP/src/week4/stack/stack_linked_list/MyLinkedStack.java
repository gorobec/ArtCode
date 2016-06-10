package week4.stack.stack_linked_list;

import week4.stack.IMyStack;
import week4.stack.StackIsEmptyException;


public class MyLinkedStack<E> implements IMyStack<E> {
   private Node<E> head;


    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public E peek() throws StackIsEmptyException {
        if(head == null) throw new StackIsEmptyException();
        return head.value;
    }

    @Override
    public E pop() throws StackIsEmptyException {
        if(head == null) throw new StackIsEmptyException();
        Node<E> popped = new Node<>(head);
        this.head = head.next;
        return popped.value;
    }

    @Override
    public E push(E e) throws StackIsEmptyException {
        if(this.isEmpty())
            head = new Node<>(e);
        else
            this.head = new Node<>(head, e);

        return this.peek();
    }

    @Override
    public int search(E e) {
        Node<E> iterator = head;
        int counter = 1;
        while (iterator!= null) {
            if(iterator.value.equals(e)) return counter;
            iterator = iterator.next;
            counter++;
        }
        return -1;
    }

    private class Node<E> {
       Node<E> next;
       E value;

        public Node(E value) {
            this.value = value;
        }

        public Node(Node<E> next) {

            this.next = next;
            this.value = next.value;
        }

        public Node(Node<E> next, E value) {
            this.next = next;
            this.value = value;
        }

    }
}
